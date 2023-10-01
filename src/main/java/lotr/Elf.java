package lotr;


public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    public void kick(Character oponent) {
        if (oponent.getPower() < this.getPower()) {
            oponent.setHp(0);
        } else {
            oponent.setPower(oponent.getPower() - 1);
        }
    }

    public String toString() {
        return "Elf{hp=" + getHp() +", power="+getPower() + "}";
    }

}
