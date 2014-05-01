package week5.game.characters.magic;

import week5.game.characters.Character;

/**
 * Created by amakogon on 01.05.2014.
 */
public class FireBall extends Spell {
    private static final int FIRE_DAMAGE = 20;

    public FireBall() {
        super("Fire ball");
    }

    @Override
    public void castSpell(Character character) {
        character.setHealth(character.getHealth() - FIRE_DAMAGE);
    }
}
