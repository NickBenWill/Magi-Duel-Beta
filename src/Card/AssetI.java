package Card;
import Player.Player;
/**
 * Created by 18nbenjung on 10/3/2017.
 */
public interface AssetI {

    void canBeUsedInFight(boolean isReflex);
    void strikeDamageModifier(Player playerReceivingMod, int damageModifier);
    void isDiscardedAfterUse(boolean isDiscarded);
    void strikesToDiscard(int strikesToDiscard);
    void shuffleHandToDeck(Player playerShufflingHand);
    void cardsDrawn(Player playerDrawingCards, int cardsToDraw);
    void damageHealed(Player playerReceivingHeal);
}
