package Board;

import Player.Player;
import Card.Card;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import Card.Deck;
import Card.CardTypeE;
import CardLibrary.OverheadStrike;
import CardLibrary.StormSurge;

import javax.imageio.ImageIO;

/**
 * Created by 18nbenjung on 9/26/2017.
 */
public class GameClient {


    static Player player1 = new Player();
    static Player player2 = new Player();
    public static GameClient gc = new GameClient(); //this is the instant that everything should be referencing "gc";
    static Board board = new Board(gc);
    private static boolean player1turn = true;



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
    while (isWon = false){
        if (player1turn = true){
            while (Board.playerDeciding == true){
                try{Thread.sleep(1000);}
                catch(InterruptedException ex) {Thread.currentThread().interrupt();}
            }

        }
        else{


        }
    }
    }

    public void refreshBoard(){
        board.getUserHealth().setText("Your Health: " + player1.getPlayerHealth());
        board.getOpHealth().setText("Opponent's Health: " + player2.getPlayerHealth());
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
    }

    public void assignDecks(Player playerToAssign, int deckNum) {

        switch(deckNum){
            case 1:
                Image i=null;
                ArrayList<Card> temp = new ArrayList<Card>();
                try {
                    i = ImageIO.read(getClass().getResource("resources/2C.png"));
                }
                catch(IOException ie){
                    ie.printStackTrace();
                }
                Card StormSurge = new StormSurge("Storm Surge", "Pirateboi", CardTypeE.COUNTER, i);
                try {
                    i = ImageIO.read(getClass().getResource("resources/2D.png"));
                }
                catch(IOException ie){
                    ie.printStackTrace();
                }
                Card OverheadStrike = new OverheadStrike("Overhead Strike", "Pirateboi", CardTypeE.STRIKE, i, 8);
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
    public void setPlayer1turn(boolean set){
        player1turn = set;
    }

    public boolean getPlayer1turn(){
        return player1turn;
    }


}

