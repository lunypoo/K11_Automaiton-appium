package lab_07_2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Winracing {

    private int getSpeed(){
        return new SecureRandom().nextInt();
    }

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);

        Winracing winracing = new Winracing();
        winracing.racing(animalList);
    }

    private Animal racing(List<Animal> animalList){
        Animal winAnimal = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > winAnimal.getSpeed()){
                winAnimal = animalList.get(i);
            }
        }
        System.out.println("Winner is " + winAnimal.getName() + " with speed: " + winAnimal.getSpeed());
        return winAnimal;
    }
}
