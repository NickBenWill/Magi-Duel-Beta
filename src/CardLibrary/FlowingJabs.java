package CardLibrary;

import Card.CardTypeE;
import Card.Strike;
import Card.StrikeI;
import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 11/1/2017.
 */
public class FlowingJabs extends Strike implements StrikeI {

    private int damage;
    private String name;
    /*
    According to the all known laws of aviation bees shouldnt be able to fly,
    their bodies are too large for their wings to comprehend
     */

    public FlowingJabs(String name, String cardClass, CardTypeE cardTypeE, Image cardImage, int damage) {
        super(name, cardClass, cardTypeE, cardImage);
        this.name = "Flowing Jabs";
        this.damage =damage;
        damage = 5;
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

    }

    @Override
    public void cardsDrawnFromDeck(Player playerDrawingCards) {

    }

    @Override
    public void setBuff(Player playerBeingBuffed){
        playerBeingBuffed.setDamageBuff(3);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
