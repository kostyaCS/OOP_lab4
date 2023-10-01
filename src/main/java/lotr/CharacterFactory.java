package lotr;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        if (randomNumber == 1) { return new Elf(); }
        else if (randomNumber == 2) { return new Hobbit(); }
        else if (randomNumber == 3) { return new Knight(); }
        else { return new King(); }
    }
}
