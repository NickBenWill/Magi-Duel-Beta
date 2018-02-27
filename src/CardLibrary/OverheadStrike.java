package CardLibrary;

import Card.CardTypeE;
import Card.Strike;
import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 10/2/2017.
 */
public class OverheadStrike extends Strike{
    private int damage;
    private String name;

    public OverheadStrike(String name, String cardClass, CardTypeE cardTypeE, Image cardImage, int damage) {
        super(name, cardClass, cardTypeE, cardImage);
        this.name = "Overhead Strike";
        this.damage =damage;
        damage = 8;
    }


    public void damageDealt(Player playerReceivingDamage, int damage, Player playerDealingDamage) {
        playerReceivingDamage.setPlayerHealth(playerReceivingDamage.getPlayerHealth() -this.damage - playerDealingDamage.getDamageBuff());
        System.out.println("End my suffering :)");

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void callAll(Player user, Player Opponent){
        damageDealt(Opponent, this.damage, user);
    }
}
