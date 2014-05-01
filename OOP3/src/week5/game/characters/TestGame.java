package week5.game.characters;

import week5.game.characters.figthBehavior.FightBow;
import week5.game.characters.magic.SpellTypes;

/**
 * Created by amakogon on 01.05.2014.
 */
public class TestGame {

    public static void main(String[] args) {
        Character warrior = new Warrior(100, "Artem");
        Character ork = new Ork(100, "Katia");
        warrior.attack(ork);
        System.out.println(ork);
        ork.takeDamage(warrior, warrior.getWeapon());
        System.out.println(ork);
        warrior.setFightBehavior(new FightBow());
        warrior.attack(ork);
        ork.useMagig(warrior, SpellTypes.FIRE_BALL.getSpell());
        System.out.println(warrior);
    }
}
