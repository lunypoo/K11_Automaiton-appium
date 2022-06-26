package lab_08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Winracing {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        Winracing winracing = new Winracing();
        Animal.Builder animalBuilder = new Animal.Builder();

        Animal anm1 = animalBuilder.setName("Eagle")
                .setSpeed((new SecureRandom()).nextInt(320))
                .setFlyable(true)
                .build();

        Animal anm2 = animalBuilder.setName("Falcon")
                .setSpeed((new SecureRandom()).nextInt(240))
                .setFlyable(true)
                .build();

        Animal anm3 = animalBuilder.setName("Tiger")
                .setSpeed((new SecureRandom()).nextInt(100))
                .setFlyable(false)
                .build();

        Animal anm4 = animalBuilder.setName("Snake")
                .setSpeed((new SecureRandom()).nextInt(19))
                .setFlyable(false)
                .build();

        animalList.add(anm1);
        animalList.add(anm2);
        animalList.add(anm3);
        animalList.add(anm4);

        List<Animal> racingList = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!(animal.isFlyable())){
                racingList.add(animal);
            }
        }
        winracing.racing(racingList);
        }

        public Animal racing(List<Animal> animalList){
        Animal winAnimal = animalList.get(0);
            for (int i = 0; i < animalList.size(); i++) {
                if (animalList.get(i).getSpeed() > winAnimal.getSpeed()){
                    winAnimal = animalList.get(i);
                }
            }
            System.out.println("Winner is " + winAnimal.getName() + " with speed: " + winAnimal.getSpeed());
            return winAnimal;
        }
    }

    
