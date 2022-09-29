package W07.optimizedgame;

import java.util.Random;

public class wButterflyKnife implements Weapon {
    @Override
    public int attack(int ap) {
        Random random = new Random();

        return random.nextInt(ap / 2 + 1) + random.nextInt(ap / 2 + 1);
    }

    @Override
    public String getWeaponName() {
        return "butterfly knife";
    }
}
