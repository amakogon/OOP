package week5.game.characters;

import week5.game.characters.figthBehavior.FightAxe;
import week5.game.characters.weapon.Axe;

/**
 * Created by amakogon on 01.05.2014.
 */
public class Warrior extends Character {


    public Warrior(int health, String name) {
        super(health, name);
        fightBehavior = new FightAxe();
        weapon = new Axe(5, "default axe");
    }


}
