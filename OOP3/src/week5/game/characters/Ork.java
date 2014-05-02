package week5.game.characters;

import week5.game.characters.figthBehavior.FightAxe;
import week5.game.characters.figthBehavior.FightSword;
import week5.game.characters.weapon.Axe;

/**
 * Created by amakogon on 01.05.2014.
 */
public class Ork extends Character {
    private static final int DEFAULT_STRENGTH_ORK = 25;
    private static final int DEFAULT_AGILITY_ORK = 10;

    public Ork(int health, String name) {
        super(health, name);
        setEnemy(true);
        setFightBehavior(new FightAxe());
        setWeapon(new Axe(5, "great axe"));
        setStrength(DEFAULT_STRENGTH_ORK);
        setAgility(DEFAULT_AGILITY_ORK);
    }
}
