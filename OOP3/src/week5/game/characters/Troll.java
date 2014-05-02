package week5.game.characters;

import week5.game.characters.figthBehavior.FightClub;
import week5.game.characters.magic.SpellTypes;
import week5.game.characters.weapon.Club;

/**
 * Created by amakogon on 01.05.2014.
 */
public class Troll extends Character {
    public Troll(int health, String name) {
        super(health, name);
        setEnemy(true);
        setFightBehavior( new FightClub());
        setWeapon(new Club(6, "huge club"));
        getMagicBook().addSpell(SpellTypes.FIRE_BALL);
    }
}
