package week5.game.characters;

import week5.game.characters.figthBehavior.FightBehavior;
import week5.game.characters.figthBehavior.WeaponUseException;
import week5.game.characters.magic.MagicBook;
import week5.game.characters.magic.Spell;
import week5.game.characters.weapon.Weapon;

import java.io.Serializable;

/**
 * Created by amakogon on 01.05.2014.
 */
public abstract class Character implements Serializable {

    private int health;
    private String name;
    private int strength;
    private int agility;
    private FightBehavior fightBehavior;
    private Weapon weapon;
    private boolean isEnemy;
    private MagicBook magicBook;


    public Character(int health, String name) {
        this.health = health;
        this.name = name;
        magicBook = new MagicBook();
    }

    public void attack(Character enemy) throws WeaponUseException {

        fightBehavior.attack(enemy, weapon);

    }

    public void useMagig(Character character, Spell spell) {
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

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    private String getCharacterType() {
        return getClass().toString().substring(28);
    }

    @Override
    public String toString() {
        return getCharacterType() + "{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
