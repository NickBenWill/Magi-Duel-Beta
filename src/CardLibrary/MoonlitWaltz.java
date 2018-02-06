package CardLibrary;

import Card.CardTypeE;
import Card.Strike;
import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 11/3/2017.
 */
public class MoonlitWaltz extends Strike {

    private int damage;
    private String name;
    /*
    According to the all known laws of aviation bees shouldnt be able to fly,
    their bodies are too large for their wings to comprehend
     */

    public MoonlitWaltz(String name, String cardClass, CardTypeE cardTypeE, Image cardImage, int damage) {
        super(name, cardClass, cardTypeE, cardImage);
        this.name = "Moonlit Waltz";
        this.damage =damage;
        damage = 3;
    }


    public void damageDealt(Player playerReceivingDamage, int damage, Player playerDealingDamage) {
        playerReceivingDamage.setPlayerHealth(playerReceivingDamage.getPlayerHealth() -damage - playerDealingDamage.getDamageBuff());
    }


    public void damageHealed(Player playerReceivingHeal) {
        playerReceivingHeal.setPlayerHealth(playerReceivingHeal.getPlayerHealth() + 3);
    }


    public void cardsFromDiscardPile(Player effectedPlayer) {

    }


    public void ifCountered(Player playerCountered, Player playerCountering){

    }


    public void setBuff(Player playerBeingBuffed) {

    }


    public void cardsDrawnFromDeck(Player playerDrawingCards) {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
