package CardLibrary;

import Card.CardTypeE;
import Card.Strike;
import Card.StrikeI;
import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 11/1/2017.
 */
public class WickedFandango extends Strike implements StrikeI {

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

    @Override
    public void damageDealt(Player playerReceivingDamage, int damage, Player playerDealingDamage) {
        playerReceivingDamage.setPlayerHealth(playerReceivingDamage.getPlayerHealth() -damage - playerDealingDamage.getDamageBuff());
    }

    @Override
    public void damageHealed(Player playerReceivingHeal) {

    }

    @Override
    public void cardsFromDiscardPile(Player effectedPlayer) {

    }

    @Override
    public void ifCountered(Player playerCountered, Player playerCountering){
        damage = 5;
        this.damageDealt(playerCountered, damage, playerCountering);

    }

    @Override
    public void cardsDrawnFromDeck(Player playerDrawingCards) {

    }

    @Override
    public void setBuff(Player playerBeingBuffed) {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}


