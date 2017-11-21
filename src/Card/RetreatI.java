package Card;

import  Player.Player;

/**
 * Created by 18nbenjung on 10/3/2017.
 */
public interface RetreatI {

    void cardsToDiscard(Player playerDiscardingCards, int cardsToDiscard);
    void damageReduction(Player playerTakingDamage, int damageNegation);
}
