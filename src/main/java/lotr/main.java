package lotr;

import lotr.GameManager;
import lotr.CharacterFactory;

public class main {
    public static void main(String[] args) {
        CharacterFactory c = new CharacterFactory();
        GameManager g = new GameManager();
        g.fight(c.createCharacter(), c.createCharacter());
    }
}
