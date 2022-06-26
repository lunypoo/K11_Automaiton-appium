package lab_07_2;

public class Horse extends Animal {

    private static int HORSE_MAX_SPEED = 75;

    public Horse() {
        super(HORSE_MAX_SPEED);
    }

    @Override
    public String getName() {
        return Horse.class.getName();
    }
}
