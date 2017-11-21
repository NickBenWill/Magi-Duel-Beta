package Card;
import Player.Player;
/**
 * Created by 18nbenjung on 10/2/2017.
 */
public interface CounterI
{
    void isDamageCountered(Player playerReceivingDamage, int counterLimit, int incomingDamage);
    void revengeDamage(Player playerReceivingDamage, int damage);
    void isUsable(Player playerReceivingDamage);
}
