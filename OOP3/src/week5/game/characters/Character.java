package week5.game.characters;

import week5.game.characters.figthBehavior.FightBehavior;
import week5.game.characters.figthBehavior.WeaponUseException;
import week5.game.characters.magic.MagicBook;
import week5.game.characters.magic.Spell;
import week5.game.characters.weapon.Weapon;

/**
 * Created by amakogon on 01.05.2014.
 */
public abstract class Character {

    private int health;
    private String name;
    private int strength;
    FightBehavior fightBehavior;
    Weapon weapon;
    private boolean isEnemy;
    private MagicBook magicBook;


    public Character(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void attack(Character enemy) {
        try {
            fightBehavior.attack(enemy, weapon);
        } catch (WeaponUseException e) {
            System.err.println(e.getMessage());
        }
    }

    public void useMagig(Character character, Spell spell){
        spell.castSpell(character);
    }

    public void takeDamage(Character enemy, Weapon weapon) {
        setHealth((int) (health - (enemy.strength * 0.1 + weapon.getDamage())));
    }

    public FightBehavior getFightBehavior() {
        return fightBehavior;
    }

    public void setFightBehavior(FightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public void setEnemy(boolean isEnemy) {
        this.isEnemy = isEnemy;
    }

    public MagicBook getMagicBook() {
        return magicBook;
    }

    public void setMagicBook(MagicBook magicBook) {
        this.magicBook = magicBook;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
