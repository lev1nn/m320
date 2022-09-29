package W07.optimizedgame;

import java.util.Random;

public class wAK47 implements Weapon {
    @Override
    public int attack(int ap) {
        Random random = new Random();

        return random.nextInt(ap + 1);
    }

    @Override
    public String getWeaponName() {
        return "AK47";
    }
}
