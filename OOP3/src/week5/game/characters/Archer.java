package week5.game.characters;


import week5.game.characters.figthBehavior.FightBow;
import week5.game.characters.weapon.Bow;

/**
 * Created by amakogon on 01.05.2014.
 */
public class Archer extends Character {

    public Archer(int health, String name) {
        super(health, name);
        fightBehavior = new FightBow();
        weapon = new Bow(3, "short bow");
    }


}
