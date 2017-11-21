package Card;

import Player.Player;

/**
 * Created by 18nbenjung on 10/2/2017.
 */
public interface StrikeI {

    void damageDealt(Player playerReceivingDamage, int damage, Player playerDealingDamage);
    void damageHealed(Player playerReceivingHeal);
    void cardsFromDiscardPile(Player effectedPlayer);
    void ifCountered(Player playerCountered, Player playerCountering);
    void setBuff(Player playerBeingBuffed);
    void cardsDrawnFromDeck(Player playerDrawingCards);

}
