package CardLibrary;

import Card.CardTypeE;
import Card.Strike;
import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 11/1/2017.
 */
public class WickedFandango extends Strike {

    private int damage;
    private String name;
    /*
    According to the all known laws of aviation bees shouldnt be able to fly,
    their bodies are too large for their wings to comprehend
     */

    public WickedFandango(String name, String cardClass, CardTypeE cardTypeE, Image cardImage, int damage) {
        super(name, cardClass, cardTypeE, cardImage);
        this.name = "Wicked Fandango";
        this.damage =damage;
        damage = 4;
    }


    public void damageDealt(Player playerReceivingDamage, int damage, Player playerDealingDamage) {
        playerReceivingDamage.setPlayerHealth(playerReceivingDamage.getPlayerHealth() -damage - playerDealingDamage.getDamageBuff());
    }

    public void ifCountered(Player playerCountered, Player playerCountering){
        damage = 5;
        this.damageDealt(playerCountered, damage, playerCountering);

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


