package lotr;

import kick.Cry;

public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0, new Cry());
    }

    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}