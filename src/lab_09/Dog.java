package lab_09;

import java.security.SecureRandom;

public class Dog extends Animal {

    private static int MAX_SPEED = 60;

    public Dog() {
        super(Dog.class.getSimpleName());

    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
