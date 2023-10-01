package kick;

import lotr.Character;

public class Elfkick {
    public void kick(Character whokick, Character oponent) {
        if (oponent.getPower() < whokick.getPower()) {
            oponent.setHp(0);
        } else {
            oponent.setPower(oponent.getPower() - 1);
        }
    }
}
