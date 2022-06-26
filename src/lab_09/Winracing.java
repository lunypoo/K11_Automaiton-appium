package lab_09;

import java.util.ArrayList;
import java.util.List;

public class Winracing {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Winracing winracing = new Winracing();
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);
        winracing.racing(animalList);
    }

    private Animal racing(List<Animal> animalList) {
        Animal animalWin = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).speed() > animalWin.speed()) {
                animalWin = animalList.get(i);
            }
        }
        System.out.println("Winner is " + animalWin.getName() + ", with speed: " + animalWin.speed());
        return animalWin;
    }
}
