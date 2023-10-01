package lotr;

import kick.Elfkick;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new Elfkick());
    }

    public String toString() {
        return "Elf{hp=" + getHp() +", power="+getPower() + "}";
    }

}
