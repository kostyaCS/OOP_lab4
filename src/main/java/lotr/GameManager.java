package lotr;

import java.util.Random;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Toddaay two enemies are fighting!");
        System.out.println(c1);
        System.out.println(c2);
        Random random = new Random();
        while (c1.isAlive() && c2.isAlive()) {
            int randomNumber = random.nextInt(1) + 1;
            if (randomNumber == 0) {
                System.out.println("First character is hitting another one!");
                c1.kick(c2);
                System.out.println(c1.getHp());
                System.out.println(c2.getHp());
            } else {
                System.out.println("Second character is hitting another one!");
                c2.kick(c1);
                System.out.println(c1.getHp());
                System.out.println(c2.getHp());
            }
        }
    }
}
