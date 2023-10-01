package lotr;

import java.util.Random;

import kick.NobleKick;

public abstract class Noble extends Character {
    private static Random random = new Random();

    public Noble(int min, int max) {
        super(random.nextInt(max - min) + min + 1, random.nextInt(max - min) + min + 1, new NobleKick());
    }
}
