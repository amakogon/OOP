package week5.game.characters.magic;

import week5.game.characters.Character;

/**
 * Created by amakogon on 01.05.2014.
 */
public abstract class Spell {
    private String name;

    public Spell(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void castSpell(Character character);
}
