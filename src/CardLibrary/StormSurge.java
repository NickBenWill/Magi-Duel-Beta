package CardLibrary;
import Card.CardTypeE;
import Card.Counter;
import Card.CounterI;
import Player.Player;

import java.awt.*;
/**
 * Created by 18nbenjung on 10/6/2017.
 */
public class StormSurge extends Counter implements CounterI{
    private int limit;
    public StormSurge(String name, String cardClass, CardTypeE cardTypeE, Image cardImage) {
        super(name, cardClass, cardTypeE, cardImage);
        this.limit = limit;
        limit = 4;
    }

    @Override
    public void isDamageCountered(Player playerReceivingDamage, int counterLimit, int incomingDamage) {

    }

    @Override
    public void revengeDamage(Player playerReceivingDamage, int damage) {

    }

    @Override
    public void isUsable(Player playerReceivingDamage) {

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
/****
 And after the drugs stopped giving him the high he needed, the sex became more violent.
 *****/