package week5.game.characters.figthBehavior;


import week5.game.characters.Character;
import week5.game.characters.weapon.Weapon;

/**
 * Created by amakogon on 01.05.2014.
 */
public interface FightBehavior {

    void attack(Character enemy, Weapon weapon) throws WeaponUseException;
}
