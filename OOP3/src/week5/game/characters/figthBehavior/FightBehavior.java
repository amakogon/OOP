package week5.game.characters.figthBehavior;


import week5.game.characters.Character;
import week5.game.characters.weapon.Weapon;

import java.io.Serializable;

/**
 * Created by amakogon on 01.05.2014.
 */
public interface FightBehavior extends Serializable{

    void attack(Character enemy, Weapon weapon) throws WeaponUseException;
}
