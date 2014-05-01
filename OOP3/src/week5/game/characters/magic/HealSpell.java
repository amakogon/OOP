package week5.game.characters.magic;

import week5.game.characters.Character;

/**
 * Created by amakogon on 01.05.2014.
 */
public class HealSpell extends Spell{

    private static final int HEAL_VALUE = 15;
    public HealSpell() {
        super("Heal spell");
    }

    @Override
    public void castSpell(Character character) {
        character.setHealth(character.getHealth() + HEAL_VALUE);
    }
}
