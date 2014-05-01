package week5.game.characters.magic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by amakogon on 01.05.2014.
 */
public class MagicBook {

    private Set<SpellTypes> spells;

    public MagicBook() {
        this.spells = new HashSet<SpellTypes>();
    }

    public Set<SpellTypes> getSpells() {
        return spells;
    }

    public void addSpell(SpellTypes spell) {
        spells.add(spell);
    }
}
