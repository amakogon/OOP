package week5.game.characters.weapon;

import java.io.Serializable;

/**
 * Created by amakogon on 01.05.2014.
 */
public abstract class Weapon implements Serializable{
    private int damage;

    private String name;

    protected Weapon(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weapon weapon = (Weapon) o;

        if (damage != weapon.damage) return false;
        if (name != null ? !name.equals(weapon.name) : weapon.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = damage;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
