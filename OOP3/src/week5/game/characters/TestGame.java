package week5.game.characters;

import week5.game.characters.figthBehavior.WeaponUseException;
import week5.game.characters.magic.SpellTypes;

import java.util.Scanner;


/**
 * Created by amakogon on 01.05.2014.
 */
public class TestGame {

    public static void main(String[] args) {
        Character player = initPlayer();
        while (true) {
            game(player);
        }

    }

     static Character initPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Create new player" + "\n2. Continue last game");
        Character player = null;
        int answer = 0;
        while (answer != 1 && answer != 2) {
            answer = scanner.nextInt();
            if (answer == 1) {
                player = createNewPlayer();
            } else if (answer == 2) {
                player = new Warrior(100, "Artem");
            }
        }
        return player;
    }

     static void fight(Character attacker, Character enemy) {
        try {
            attacker.attack(enemy);
            if ((attacker.getAgility() > enemy.getAgility()) || takeDamage()) {
                enemy.takeDamage(attacker, attacker.getWeapon());
            }
            System.out.println(enemy);
        } catch (WeaponUseException e) {
            System.err.println(e.getMessage());
        }
    }

     static void fightMagic(Character attacker, Character enemy) {
        attacker.useMagig(enemy, SpellTypes.FIRE_BALL.getSpell());
        System.out.println(enemy);
    }

     static boolean takeDamage() {
        return (Math.random() > 0.5);
    }

     static Character getRandomEnemy() {
        double rand = Math.random() * 3;
        if (rand < 1) {
            return new Ork(100, "Katia");
        } else if (rand < 2) {
            return new Troll(100, "Katia");
        } else {
            return new Ork(200, "Katia");
        }
    }

     static Character createNewPlayer() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Chose character type:" + "\n 1. Warrior" + "\n 2. Knight" + "\n 3. Archer");
        int choose = scanner.nextInt();
        while (true) {
            if (choose == 1) {
                return new Warrior(100, name);

            } else if (choose == 2) {
                return new Knight(100, name);

            } else if (choose == 3) {
                return new Archer(100, name);
            }
        }
    }

     static void game(Character player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Go fight" + "\n2. exit");
        int val = scanner.nextInt();
        if (val == 1) {
            fightMode(player);
        } else if (val == 2) {
            System.exit(0);
        }
    }

     static void fightMode(Character player) {
        Character enemy = getRandomEnemy();
        Scanner scanner = new Scanner(System.in);
        boolean fightMode = true;
        int val;
        while (fightMode) {
            System.out.println("1. Punch" + "\n2. Fire ball");
            val = scanner.nextInt();
            if (val == 1) {
                fight(player, enemy);
            } else if (val == 2) {
                fightMagic(player, enemy);
            }

            if (enemy.getHealth() < 0) {
                System.out.println(enemy.getName() + " dead");
                fightMode = false;
            }
        }
    }
}
