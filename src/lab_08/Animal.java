package lab_08;

import java.security.SecureRandom;

public class Animal {

    private String name;
    private int speed;
    private boolean flyable;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isFlyable() {
        return this.flyable;
    }

    public String toString() {
        return "Animal_08_1{name= '" + this.name + '\'' + ", speed = " + this.speed + ", flyable = " + this.flyable + '}';
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        public Builder() {
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setFlyable(boolean flyable) {
            this.flyable = flyable;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    public static void main(String[] args) {

        Builder animalBuilder = new Builder();
        animalBuilder.setName("Eagle");
        animalBuilder.setSpeed((new SecureRandom()).nextInt(320));
        animalBuilder.setFlyable(true);
        Animal Eagle = animalBuilder.build();
        System.out.println(Eagle);

        animalBuilder.setName("Falcon");
        animalBuilder.setSpeed((new SecureRandom()).nextInt(240));
        animalBuilder.setFlyable(true);
        Animal Falcon = animalBuilder.build();
        System.out.println(Falcon);

        animalBuilder.setName("Tiger");
        animalBuilder.setSpeed((new SecureRandom()).nextInt(100));
        animalBuilder.setFlyable(false);
        Animal Tiger = animalBuilder.build();
        System.out.println(Tiger);

        animalBuilder.setName("Snake");
        animalBuilder.setSpeed((new SecureRandom()).nextInt(19));
        animalBuilder.setFlyable(false);
        Animal Snake = animalBuilder.build();
        System.out.println(Snake);
    }
}
