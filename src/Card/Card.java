package Card;

import java.awt.*;
import java.util.ArrayList;
import Player.*;

/**
 * Created by 18nbenjung on 9/25/2017.
 */
public abstract class Card
{
    private String cardName;
    private String cardClass;
    private Image cardImage;
    private CardTypeE cardTypeE;
    private int cardDamage;

    public Card(String name, String cardClass, CardTypeE cardTypeE, Image cardImage){
        this.cardName = name;
        this.cardClass = cardClass;
        this.cardImage = cardImage;
        this.cardTypeE = cardTypeE;
    }

    void setName(String x){this.cardName = x;}
    public String getName(){
        return this.cardName;
    }
    void setCardClass(String x){
        this.cardClass = x;
    }
    String getCardClass(){
        return this.cardClass;
    }
    public Image getCardImage() {return cardImage;}
    public void setCardImage(Image cardImage) {this.cardImage = cardImage;}
    public CardTypeE getCardTypeE() {
        return cardTypeE;
    }
    public void setCardTypeE(CardTypeE cardTypeE) {
        this.cardTypeE = cardTypeE;
    }
    public int getCardDamage() {return cardDamage;}
    public void setCardDamage(int cardDamage) {this.cardDamage = cardDamage;}
    public abstract void callAll(Player user, Player opponent);
}
