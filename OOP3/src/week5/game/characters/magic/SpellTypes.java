package week5.game.characters.magic;

/**
 * Created by amakogon on 01.05.2014.
 */
public enum SpellTypes {
    FIRE_BALL(new FireBall()), HEAL_SPELL(new HealSpell());

    private Spell spell;

    SpellTypes(Spell spell) {
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }
}
