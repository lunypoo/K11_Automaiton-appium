package lab_07_2;

import lab_07_1.Employee;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Winnerracing {

    public int getSpeed() {
        return new SecureRandom().nextInt();
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        Animal dog = new Animal("Dog");
        int dogSpeed = new SecureRandom().nextInt(60);
        Animal horse = new Animal("Horse");
        int horseSpeed = new SecureRandom().nextInt(75);
        Animal tiger = new Animal("Tiger");
        int tigerSpeed = new SecureRandom().nextInt(100);

        Winnerracing winnerracing = new Winnerracing();

        if (dogSpeed > horseSpeed) {
            if (dogSpeed > tigerSpeed) {
                System.out.println("Winner is " + dog.getName() + ", with speed " + dogSpeed);
            } else {
                System.out.println("Winner is " + tiger.getName() + ", with speed " + tigerSpeed);
            }
        } else if (horseSpeed > tigerSpeed) {
            System.out.println("Winner is " + horse.getName() + ", with speed " + horseSpeed);
        } else {
            System.out.println("Winner is " + tiger.getName() + ", with speed " + tigerSpeed);
        }
    }
    }
