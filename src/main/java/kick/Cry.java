package kick;

import lotr.Character;

public class Cry implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character oponent) {
        System.out.println("I'm crying!");
    }
}
