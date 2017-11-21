package Player;

import Card.Deck;
import java.util.ArrayList;
import Card.Card;
/**
 * Created by 18nbenjung on 9/25/2017.
 */
public class Player {

    private int playerHealth = 40;
    private Deck deck;
    private int damageBuff = 0;

    public Player(){
        //deck instantiation or whatever from gui i dont care
    }


    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public int getDamageBuff() {
        return damageBuff;
    }

    public void setDamageBuff(int buffValue) {
        this.damageBuff = buffValue;
    }
}
