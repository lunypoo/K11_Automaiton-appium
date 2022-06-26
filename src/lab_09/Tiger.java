package lab_09;

import java.security.SecureRandom;

public class Tiger extends Animal{

    private static int MAX_SPEED = 100;

    public Tiger() {
        super(Tiger.class.getSimpleName());

    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
