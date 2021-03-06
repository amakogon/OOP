package week5.game.characters.figthBehavior;

import week5.game.characters.Character;
import week5.game.characters.weapon.Axe;
import week5.game.characters.weapon.Weapon;

/**
 * Created by amakogon on 01.05.2014.
 */
public class FightAxe implements FightBehavior {

    @Override
    public void attack(Character enemy, Weapon weapon) throws WeaponUseException {
        if( !(weapon instanceof Axe)) {
            throw new WeaponUseException("Can't use weapon - " + weapon.getName());
        }
        System.out.println("Attack " + enemy.getName() + " with " + weapon.getName());
    }
}
