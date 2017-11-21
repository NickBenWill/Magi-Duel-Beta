package CardLibrary;

import Card.CardTypeE;
import Card.Strike;
import Card.StrikeI;
import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 10/2/2017.
 */
public class OverheadStrike extends Strike implements StrikeI{
    private int damage;
    private String name;

    public OverheadStrike(String name, String cardClass, CardTypeE cardTypeE, Image cardImage, int damage) {
        super(name, cardClass, cardTypeE, cardImage);
        this.name = "Overhead Strike";
        this.damage =damage;
        damage = 8;
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
    public void ifCountered(Player playercountered, Player playerCountering) {

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
