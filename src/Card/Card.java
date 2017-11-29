package Card;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by 18nbenjung on 9/25/2017.
 */
public class Card
{
    private String cardName;
    private String cardClass;
    private Image cardImage;
    private CardTypeE cardTypeE;

    public Card(String name, String cardClass, CardTypeE cardTypeE, Image cardImage){
        this.cardName = name;
        this.cardClass = cardClass;
        this.cardImage = cardImage;
        this.cardTypeE = cardTypeE;

    }

    void setName(String x){
        this.cardName = x;
    }
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
}
