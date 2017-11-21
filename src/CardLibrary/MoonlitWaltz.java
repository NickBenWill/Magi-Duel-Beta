package CardLibrary;

import Card.CardTypeE;
import Card.Strike;
import Card.StrikeI;
import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 11/3/2017.
 */
public class MoonlitWaltz extends Strike implements StrikeI {

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

    @Override
    public void damageDealt(Player playerReceivingDamage, int damage, Player playerDealingDamage) {
        playerReceivingDamage.setPlayerHealth(playerReceivingDamage.getPlayerHealth() -damage - playerDealingDamage.getDamageBuff());
    }

    @Override
    public void damageHealed(Player playerReceivingHeal) {
        playerReceivingHeal.setPlayerHealth(playerReceivingHeal.getPlayerHealth() + 3);
    }

    @Override
    public void cardsFromDiscardPile(Player effectedPlayer) {

    }

    @Override
    public void ifCountered(Player playerCountered, Player playerCountering){

    }

    @Override
    public void setBuff(Player playerBeingBuffed) {

    }

    @Override
    public void cardsDrawnFromDeck(Player playerDrawingCards) {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
