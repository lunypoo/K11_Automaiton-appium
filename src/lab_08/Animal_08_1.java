package lab_08;

import java.security.SecureRandom;

public class Animal_08_1 {

    boolean flyable;
    int speed;

    public Animal_08_1(AnimalBuilder animalBuilder) {
        this.flyable = animalBuilder.flyable;
        this.speed = animalBuilder.speed;
    }


    public int speed() {
        return (new SecureRandom().nextInt());
    }

    public static class AnimalBuilder {
        private boolean flyable;
        private int speed;

        public AnimalBuilder(boolean flyable) {
            this.withFlyable(flyable);
        }

        public AnimalBuilder() {
        }

        public AnimalBuilder withFlyable(boolean withFlyable) {
            this.flyable = withFlyable;
            return this;
        }

        public Animal_08_1 build() {
            return new Animal_08_1(this);
        }

        public static void main(String[] args) {

            Animal_08_1 Eagle = new AnimalBuilder().withFlyable(true).build();
            System.out.println("Eagle with flyable: " + Eagle.flyable);
            System.out.println("Eagle speed: " + new SecureRandom().nextInt(320));

            Animal_08_1 Falcon = new AnimalBuilder(true).build();
            System.out.println("Falcon with flyable: " + Falcon.flyable);
            System.out.println("Falcon speed: " + new SecureRandom().nextInt(240));

            Animal_08_1 Tiger = new AnimalBuilder(false).build();
            System.out.println("Tiger with flyable: " + Tiger.flyable);
            System.out.println("Tiger speed: " + new SecureRandom().nextInt(100));

            Animal_08_1 Snake = new AnimalBuilder(false).build();
            System.out.println("Snake with flyable: " + Snake.flyable);
            System.out.println("Snake speed: " + new SecureRandom().nextInt(19));
        }
    }
}