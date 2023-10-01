package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor @Setter @ToString
public abstract class Character {
    @Getter
    private int hp;
    @Getter
    private int power;

    private KickStrategy kickStrategy;

    public void kick(Character oponent) {
        kickStrategy.kick(this, oponent);
    } 

    public boolean isAlive() { 
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = (hp > 0)? hp : 0;
    }
}
