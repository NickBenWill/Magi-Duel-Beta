package Card;

import Player.Player;

import java.awt.*;

/**
 * Created by 18nbenjung on 9/25/2017.
 */
public class Strike extends Card{

    public Strike(String name, String cardClass, CardTypeE cardTypeE, Image cardImage, int damage) {
        super(name, cardClass, cardTypeE, cardImage, damage);
    }

    public void callAll(StrikeI strikeI, Player user, Player opponent){

        strikeI.damageDealt(opponent, this.getCardDamage(), user);
        strikeI.damageHealed(user);
        strikeI.cardsFromDiscardPile(user);
        strikeI.ifCountered(opponent, user);
        strikeI.setBuff(user);
        strikeI.cardsDrawnFromDeck(user);
    }

}
