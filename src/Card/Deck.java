package Card;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by 18nbenjung on 9/27/2017.
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();
    private ArrayList<Card> discardPile = new ArrayList<>();
    private ArrayList<Card> cardsInHand = new ArrayList<>();
    private ArrayList<Card> assetsInPlay = new ArrayList<>();

    public Deck(ArrayList<Card> deck){
        //instantiate this in player or board or gui or whereever i dont give 2 phucks
        this.deck = deck;


    }

    void addtoDeck(Deck deckToAdd, Card cardToAdd){
        deckToAdd.deck.add(cardToAdd);
    }

    public void drawCard(){
        cardsInHand.add(deck.get(0));
        deck.remove(0);
    }

    //romans god tier arraylist shuffle algo
    public void shuffleDeck(){
        ArrayList<Card> cardsToShuffle = this.deck;
        ArrayList<Card> tempArray = new ArrayList<>();
        ArrayList<Integer> allCurrentIntegers = new ArrayList<>();
        for(int i=0; i<cardsToShuffle.size();i++){
            Random random = new Random();
            boolean needLoop = false;
            while(needLoop == false){
                int test = random.nextInt((cardsToShuffle.size()));
                if(allCurrentIntegers.contains(test)){
                    needLoop = true;
                }else if(!allCurrentIntegers.contains(test)){
                    allCurrentIntegers.add(test);
                    tempArray.add(cardsToShuffle.get(test));
                    cardsToShuffle.remove(test);
                    needLoop = false;
                }
            }
        }
        setDeck(tempArray);
    }

    public ArrayList<Card> getDeck(Deck currentDeck) {
        return currentDeck.deck;
    }

    public void setDeck (ArrayList<Card> newdeck) {
        this.deck = newdeck;
    }

    public ArrayList<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(ArrayList<Card> discardPile) {
        this.discardPile = discardPile;
    }

    public ArrayList<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(ArrayList<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public ArrayList<Card> getAssetsInPlay() {
        return assetsInPlay;
    }

    public void setAssetsInPlay(ArrayList<Card> assetsInPlay) {
        this.assetsInPlay = assetsInPlay;
    }
}
