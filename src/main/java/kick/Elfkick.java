package kick;

import lotr.Character;

public class Elfkick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character oponent) {
        if (oponent.getPower() < whoKick.getPower()) {
            oponent.setHp(0);
        } else {
            oponent.setPower(oponent.getPower() - 1);
        }
    }
}
