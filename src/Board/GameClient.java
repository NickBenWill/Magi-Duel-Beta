package Board;
import Player.Player;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import Card.*;

// the mega-ton import for every card in CardLibrary. Luna help us all
import CardLibrary.*;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Created by 18nbenjung on 9/26/2017.
 */
public class GameClient {

    static Player player1 = new Player();
    static Player player2 = new Player();
    public static GameClient gc = new GameClient(); //this is the instant that everything should be referencing "gc";
    static Board board = new Board(gc);
    public static boolean player1Deciding = true;
    public static boolean player2Blocking = false;
    public static boolean player2Deciding = false;
    public static boolean player1Blocking = false;
    public static boolean player1Fighting = true;
    public static boolean player2Fighting = false;
    public static int StrikeLimit = 1;
    public static int StrikesPlayed = 0;
    public static int player1AssetsInPlay = 1;
    public static int player2AssetsInPlay = 1;
    public static ArrayList<JButton> userCards = new ArrayList<>();
    public static ArrayList<JButton> opCards = new ArrayList<>();
    public static ArrayList<JButton> userAssets = new ArrayList<>();
    public static ArrayList<JButton> opAssets = new ArrayList<>();

    public static void main(String args[]){

        boolean isWon = false;
        int currentTurnCount = 1;
        gc.assignDecks(player1, 1);
        gc.assignDecks(player2, 1);
        player1.getDeck().shuffleDeck();
        player2.getDeck().shuffleDeck();
        // thick arrays bro
            userCards.add(board.getUserCard1());
            userCards.add(board.getUserCard2());
            userCards.add(board.getUserCard3());
            userCards.add(board.getUserCard4());
            userCards.add(board.getUserCard5());
            userCards.add(board.getUserCard6());
            userCards.add(board.getUserCard7());
            userCards.add(board.getUserCard8());
            userCards.add(board.getUserCard9());
            userCards.add(board.getUserCard10());
            opCards.add(board.getOpCard1());
            opCards.add(board.getOpCard2());
            opCards.add(board.getOpCard3());
            opCards.add(board.getOpCard4());
            opCards.add(board.getOpCard5());
            opCards.add(board.getOpCard6());
            opCards.add(board.getOpCard7());
            opCards.add(board.getOpCard8());
            opCards.add(board.getOpCard9());
            opCards.add(board.getOpCard10());
            userAssets.add(board.getUserAsset1());
            userAssets.add(board.getUserAsset2());
            userAssets.add(board.getUserAsset3());
            userAssets.add(board.getUserAsset4());
            userAssets.add(board.getUserAsset5());
            opAssets.add(board.getOpAsset1Button());
            opAssets.add(board.getOpAsset2Button());
            opAssets.add(board.getOpAsset3Button());
            opAssets.add(board.getOpAsset4Button());
            opAssets.add(board.getOpAsset5Button());
        //
        for (int i = 0; i < 10; i ++){
            player1.getDeck().drawCard();
            player2.getDeck().drawCard();
        }

        gc.refreshBoard();
        while (!isWon){
            while (player1Deciding){
                    try{Thread.sleep(1000);}
                    catch(InterruptedException ex) {Thread.currentThread().interrupt();}

            }
            while (player2Deciding){

            }

        }
    }

    public void cycleDownTurns(){
        while(player1Fighting) {
            if (player1Deciding) {
                player1Deciding = false;
                player2Blocking = true;
                refreshBoard();
            } else if (player2Blocking) {
                player2Blocking = false;
                player2Deciding = true;
                player2.getDeck().drawCard();
                refreshBoard();
            }
        }
        while(player2Fighting) {
            if (player2Deciding) {
                player2Deciding = false;
                player1Blocking = true;
                refreshBoard();
            } else if (player1Blocking) {
                player1Blocking = false;
                player1Deciding = true;
                player1.getDeck().drawCard();
                refreshBoard();
            }
        }
    }

    public void refreshBoard(){


        // refresh health labels
        board.getUserHealth().setText("Your Health: " + player1.getPlayerHealth());
        board.getOpHealth().setText("Opponent's Health: " + player2.getPlayerHealth());

        // refresh names/images of Player 1's cards and clears empty buttons
        for (int i = 0; i < player1.getDeck().getCardsInHand().size(); i++){
            userCards.get(i).setText(/*player1.getDeck().getCardsInHand().get(i).getName()*/ null);
            userCards.get(i).setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(i).getCardImage().getScaledInstance(157, 220, Image.SCALE_DEFAULT)));
        }

        for (int i = 9; i > (9 - (userCards.size() - player1.getDeck().getCardsInHand().size())); i--){
            //userCards.get(i).setText("  ");
            userCards.get(i).setIcon(null);
            userCards.get(i).setEnabled(false);
        }

        // refresh names/images of Player 2's cards and clears empty buttons
        for (int i = 0; i < player2.getDeck().getCardsInHand().size(); i++){
            opCards.get(i).setText(/*player2.getDeck().getCardsInHand().get(i).getName()*/ null);
            opCards.get(i).setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(i).getCardImage().getScaledInstance(157, 220, Image.SCALE_DEFAULT)));
        }

        for (int i = 9; i > (9 - (opCards.size() - player2.getDeck().getCardsInHand().size())); i--){
            opCards.get(i).setText("  ");
            opCards.get(i).setIcon(null);
            opCards.get(i).setEnabled(false);
        }


        // Turn logic let's go
        if (player1Deciding){
            for (int i = 0; i < opCards.size(); i++){opCards.get(i).setEnabled(false);}
            for (int i = 0; i <opAssets.size(); i++){opAssets.get(i).setEnabled(false);}
            board.getOpPass().setEnabled(false);
            for (int i = 0; i < player1.getDeck().getCardsInHand().size(); i++){
                if (((player1.getDeck().getCardsInHand().get(0).getCardTypeE() == CardTypeE.ASSET) && (GameClient.player1AssetsInPlay < 5))) {
                    userCards.get(i).setEnabled(true);
                } else if ((player1.getDeck().getCardsInHand().get(0).getCardTypeE() == CardTypeE.STRIKE) && (GameClient.StrikesPlayed < GameClient.StrikeLimit)) {
                    userCards.get(i).setEnabled(true);
                } else {
                    userCards.get(i).setEnabled(false);
                }

            }

        }
        if (player2Blocking){

        }
        if (player2Deciding){
            for (int i = 0; i < userCards.size(); i++){userCards.get(i).setEnabled(false);}
            for (int i = 0; i < userAssets.size(); i++){userAssets.get(i).setEnabled(false);}
            board.getPass().setEnabled(false);
            for (int i = 0; i < player2.getDeck().getCardsInHand().size(); i++){
                if (((player2.getDeck().getCardsInHand().get(0).getCardTypeE() == CardTypeE.ASSET) && (GameClient.player2AssetsInPlay < 5))) {
                    opCards.get(i).setEnabled(true);
                } else if ((player2.getDeck().getCardsInHand().get(0).getCardTypeE() == CardTypeE.STRIKE) && (GameClient.StrikesPlayed < GameClient.StrikeLimit)) {
                    opCards.get(i).setEnabled(true);
                } else {
                    opCards.get(i).setEnabled(true);
                }
            }
        }
        if (player1Blocking){

        }
    }

    public void assignDecks(Player playerToAssign, int deckNum) {

        switch(deckNum){
            case 1:
                BufferedImage i=null;
                ArrayList<Card> temp = new ArrayList<Card>();
                try {
                    i = ImageIO.read(GameClient.class.getResourceAsStream("/Resources/art_storm_surge.jpg"));
                }
                catch(IOException ie){
                    ie.printStackTrace();
                }
                Card StormSurge = new StormSurge("Storm Surge", "Swordsman", CardTypeE.COUNTER, i);

                try {
                    i = ImageIO.read(GameClient.class.getResourceAsStream("/Resources/art_overhead_strike.jpg"));
                }
                catch(IOException ie){
                    ie.printStackTrace();
                }
                Card OverheadStrike = new OverheadStrike("Overhead Strike", "Swordsman", CardTypeE.STRIKE, i, 8);
                temp.add(StormSurge);
                for (int k = 1; k < 39; k++){
                    temp.add(OverheadStrike);
                }
                Deck TropicalMeme = new Deck(temp);
                playerToAssign.setDeck(TropicalMeme);
                break;
            case 2:

                break;
            default: break;
        }


    }

    public void setPlayer1Deciding(boolean set){
        player1Deciding = set;
    }

    public boolean getPlayer1Deciding(){
        return player1Deciding;
    }

}

