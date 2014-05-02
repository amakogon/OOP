package week5.game.characters;

import week5.game.characters.figthBehavior.FightAxe;
import week5.game.characters.weapon.Axe;

/**
 * Created by amakogon on 01.05.2014.
 */
public class Warrior extends Character {

    private static final int DEFAULT_STRENGTH_WARRIOR = 20;
    private static final int DEFAULT_AGILITY_WARRIOR = 15;
    private static final int DEFAULT_HEALTH_VALUE = 100;

    public Warrior(int health, String name) {
        super(health, name);
        setFightBehavior(new FightAxe());
        setWeapon(new Axe(5, "default axe"));
        setStrength(DEFAULT_STRENGTH_WARRIOR);
        setAgility(DEFAULT_AGILITY_WARRIOR);

    }


}
