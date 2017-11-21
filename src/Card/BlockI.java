package Card;

import Player.Player;

/**
 * Created by 18nbenjung on 10/2/2017.
 */
public interface BlockI {

    void damageBlocked(Player playerReceivingDamage, int blockCapacity, int newDamage);
    void counterCapacityIncrease(Player playerReceivingBuff, int counterBuff);

}
