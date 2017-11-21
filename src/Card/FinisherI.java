package Card;
import Player.Player;

/**
 * Created by 18nbenjung on 10/3/2017.
 */
public interface FinisherI {

    void damageDealt(Player playerReceivingDamage, int damage);
    void damageHealed(Player playerReceivingHeal);
    void cardsDrawn(Player playerDrawingCards, int cardsToDraw);
}
