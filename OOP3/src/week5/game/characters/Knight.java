package week5.game.characters;

import week5.game.characters.figthBehavior.FightSword;
import week5.game.characters.magic.SpellTypes;
import week5.game.characters.weapon.Sword;

/**
 * Created by amakogon on 01.05.2014.
 */
public class Knight extends Character {
    public Knight(int health, String name) {
        super(health, name);
        setFightBehavior(new FightSword());
        setWeapon(new Sword(4, "sword of destiny"));
        getMagicBook().addSpell(SpellTypes.HEAL_SPELL);
    }
}
