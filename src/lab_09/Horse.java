package lab_09;

import java.security.SecureRandom;

public class Horse extends Animal {

    private static int MAX_SPEED = 75;

    public Horse() {
        super(Horse.class.getSimpleName());

    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
