package week5.game.characters;

import week5.game.characters.figthBehavior.FightAxe;
import week5.game.characters.figthBehavior.FightSword;
import week5.game.characters.weapon.Axe;

/**
 * Created by amakogon on 01.05.2014.
 */
public class Ork extends Character {
    public Ork(int health, String name) {
        super(health, name);
        setEnemy(true);
        fightBehavior = new FightAxe();
        weapon = new Axe(5, "great axe");
    }
}
