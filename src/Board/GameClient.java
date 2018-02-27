package Board;
import Player.Player;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import Card.*;

// the mega-ton import for every card in CardLibrary. Luna help us all
import CardLibrary.*;

import javax.imageio.ImageIO;

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

    public static void main(String args[]){

        boolean isWon = false;
        int currentTurnCount = 1;
        gc.assignDecks(player1, 1);
        gc.assignDecks(player2, 1);
        player1.getDeck().shuffleDeck();
        player2.getDeck().shuffleDeck();
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
        // refresh names of Player 1's cards
        board.getUserCard1().setText(player1.getDeck().getCardsInHand().get(0).getName());
        board.getUserCard2().setText(player1.getDeck().getCardsInHand().get(1).getName());
        board.getUserCard3().setText(player1.getDeck().getCardsInHand().get(2).getName());
        board.getUserCard4().setText(player1.getDeck().getCardsInHand().get(3).getName());
        board.getUserCard5().setText(player1.getDeck().getCardsInHand().get(4).getName());
        board.getUserCard6().setText(player1.getDeck().getCardsInHand().get(5).getName());
        board.getUserCard7().setText(player1.getDeck().getCardsInHand().get(6).getName());
        board.getUserCard8().setText(player1.getDeck().getCardsInHand().get(7).getName());
        board.getUserCard9().setText(player1.getDeck().getCardsInHand().get(8).getName());
        board.getUserCard10().setText(player1.getDeck().getCardsInHand().get(9).getName());
        // refresh names of Player 2's cards
        board.getOpCard1().setText(player2.getDeck().getCardsInHand().get(0).getName());
        board.getOpCard2().setText(player2.getDeck().getCardsInHand().get(1).getName());
        board.getOpCard3().setText(player2.getDeck().getCardsInHand().get(2).getName());
        board.getOpCard4().setText(player2.getDeck().getCardsInHand().get(3).getName());
        board.getOpCard5().setText(player2.getDeck().getCardsInHand().get(4).getName());
        board.getOpCard6().setText(player2.getDeck().getCardsInHand().get(5).getName());
        board.getOpCard7().setText(player2.getDeck().getCardsInHand().get(6).getName());
        board.getOpCard8().setText(player2.getDeck().getCardsInHand().get(7).getName());
        board.getOpCard9().setText(player2.getDeck().getCardsInHand().get(8).getName());
        board.getOpCard10().setText(player2.getDeck().getCardsInHand().get(9).getName());
        // refresh imageIcons for Player 1's cards
        /*board.getUserCard1().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(0).getCardImage()));
        board.getUserCard2().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(1).getCardImage()));
        board.getUserCard3().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(2).getCardImage()));
        board.getUserCard4().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(3).getCardImage()));
        board.getUserCard5().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(4).getCardImage()));
        board.getUserCard6().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(5).getCardImage()));
        board.getUserCard7().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(6).getCardImage()));
        board.getUserCard8().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(7).getCardImage()));
        board.getUserCard9().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(8).getCardImage()));
        board.getUserCard10().setIcon(new ImageIcon(player1.getDeck().getCardsInHand().get(9).getCardImage()));
        // refresh imageIcons for Player 2's cards
        board.getOpCard1().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(0).getCardImage()));
        board.getOpCard2().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(1).getCardImage()));
        board.getOpCard3().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(2).getCardImage()));
        board.getOpCard4().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(3).getCardImage()));
        board.getOpCard5().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(4).getCardImage()));
        board.getOpCard6().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(5).getCardImage()));
        board.getOpCard7().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(6).getCardImage()));
        board.getOpCard8().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(7).getCardImage()));
        board.getOpCard9().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(8).getCardImage()));
        board.getOpCard10().setIcon(new ImageIcon(player2.getDeck().getCardsInHand().get(9).getCardImage())); */
        if (player1Deciding){
            board.getOpCard1().setEnabled(false);
            board.getOpCard2().setEnabled(false);
            board.getOpCard3().setEnabled(false);
            board.getOpCard4().setEnabled(false);
            board.getOpCard5().setEnabled(false);
            board.getOpCard6().setEnabled(false);
            board.getOpCard7().setEnabled(false);
            board.getOpCard8().setEnabled(false);
            board.getOpCard9().setEnabled(false);
            board.getOpCard10().setEnabled(false);
            board.getOpAsset1Button().setEnabled(false);
            board.getOpAsset2Button().setEnabled(false);
            board.getOpAsset3Button().setEnabled(false);
            board.getOpAsset4Button().setEnabled(false);
            board.getOpAsset5Button().setEnabled(false);
            board.getOpPass().setEnabled(false);
            if (player1.getDeck().getCardsInHand().get(0).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(0).getCardTypeE() == CardTypeE.ASSET){board.getUserCard1().setEnabled(true);} else{board.getUserCard1().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(1).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(1).getCardTypeE() == CardTypeE.ASSET){board.getUserCard2().setEnabled(true);} else{board.getUserCard2().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(2).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(2).getCardTypeE() == CardTypeE.ASSET){board.getUserCard3().setEnabled(true);} else{board.getUserCard3().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(3).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(3).getCardTypeE() == CardTypeE.ASSET){board.getUserCard4().setEnabled(true);} else{board.getUserCard4().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(4).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(4).getCardTypeE() == CardTypeE.ASSET){board.getUserCard5().setEnabled(true);} else{board.getUserCard5().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(5).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(5).getCardTypeE() == CardTypeE.ASSET){board.getUserCard6().setEnabled(true);} else{board.getUserCard6().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(6).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(6).getCardTypeE() == CardTypeE.ASSET){board.getUserCard7().setEnabled(true);} else{board.getUserCard7().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(7).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(7).getCardTypeE() == CardTypeE.ASSET){board.getUserCard8().setEnabled(true);} else{board.getUserCard8().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(8).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(8).getCardTypeE() == CardTypeE.ASSET){board.getUserCard9().setEnabled(true);} else{board.getUserCard9().setEnabled(false);}
            if (player1.getDeck().getCardsInHand().get(9).getCardTypeE() == CardTypeE.STRIKE || player1.getDeck().getCardsInHand().get(9).getCardTypeE() == CardTypeE.ASSET){board.getUserCard10().setEnabled(true);} else{board.getUserCard10().setEnabled(false);}


        }
        if (player2Blocking){

        }
        if (player2Deciding){
            board.getUserCard1().setEnabled(false);
            board.getUserCard2().setEnabled(false);
            board.getUserCard3().setEnabled(false);
            board.getUserCard4().setEnabled(false);
            board.getUserCard5().setEnabled(false);
            board.getUserCard6().setEnabled(false);
            board.getUserCard7().setEnabled(false);
            board.getUserCard8().setEnabled(false);
            board.getUserCard9().setEnabled(false);
            board.getUserCard10().setEnabled(false);
            board.getUserAsset1().setEnabled(false);
            board.getUserAsset2().setEnabled(false);
            board.getUserAsset3().setEnabled(false);
            board.getUserAsset4().setEnabled(false);
            board.getUserAsset5().setEnabled(false);
            board.getPass().setEnabled(false);
            if (((player2.getDeck().getCardsInHand().get(0).getCardTypeE() == CardTypeE.ASSET) && (GameClient.player2AssetsInPlay < 5))) {
                board.getOpCard1().setEnabled(true);
            } else if ((player2.getDeck().getCardsInHand().get(0).getCardTypeE() == CardTypeE.STRIKE) && (GameClient.StrikesPlayed < GameClient.StrikeLimit)) {
                board.getOpCard1().setEnabled(true);
            } else {
                board.getOpCard1().setEnabled(false);
            }

            if (player2.getDeck().getCardsInHand().get(1).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(1).getCardTypeE() == CardTypeE.ASSET){board.getOpCard2().setEnabled(true);} else{board.getOpCard2().setEnabled(false);}
            if (player2.getDeck().getCardsInHand().get(2).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(2).getCardTypeE() == CardTypeE.ASSET){board.getOpCard3().setEnabled(true);} else{board.getOpCard3().setEnabled(false);}
            if (player2.getDeck().getCardsInHand().get(3).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(3).getCardTypeE() == CardTypeE.ASSET){board.getOpCard4().setEnabled(true);} else{board.getOpCard4().setEnabled(false);}
            if (player2.getDeck().getCardsInHand().get(4).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(4).getCardTypeE() == CardTypeE.ASSET){board.getOpCard5().setEnabled(true);} else{board.getOpCard5().setEnabled(false);}
            if (player2.getDeck().getCardsInHand().get(5).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(5).getCardTypeE() == CardTypeE.ASSET){board.getOpCard6().setEnabled(true);} else{board.getOpCard6().setEnabled(false);}
            if (player2.getDeck().getCardsInHand().get(6).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(6).getCardTypeE() == CardTypeE.ASSET){board.getOpCard7().setEnabled(true);} else{board.getOpCard7().setEnabled(false);}
            if (player2.getDeck().getCardsInHand().get(7).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(7).getCardTypeE() == CardTypeE.ASSET){board.getOpCard8().setEnabled(true);} else{board.getOpCard8().setEnabled(false);}
            if (player2.getDeck().getCardsInHand().get(8).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(8).getCardTypeE() == CardTypeE.ASSET){board.getOpCard9().setEnabled(true);} else{board.getOpCard9().setEnabled(false);}
            if (player2.getDeck().getCardsInHand().get(9).getCardTypeE() == CardTypeE.STRIKE || player2.getDeck().getCardsInHand().get(9).getCardTypeE() == CardTypeE.ASSET){board.getOpCard10().setEnabled(true);} else{board.getOpCard10().setEnabled(false);}
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
                    i = ImageIO.read(GameClient.class.getResourceAsStream("/Resources/2C.png"));
                }
                catch(IOException ie){
                    ie.printStackTrace();
                }
                Card StormSurge = new StormSurge("Storm Surge", "Swordsman", CardTypeE.COUNTER, i);

                try {
                    i = ImageIO.read(GameClient.class.getResourceAsStream("/Resources/2D.png"));
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

