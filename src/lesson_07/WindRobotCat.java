package lesson_07;

public class WindRobotCat extends RobotCat {

    public WindRobotCat(String name, String productionDate) {
        super(name,productionDate);
    }

    @Override
    public String charge(){

        return super.charge() + " with wind";
    }

}
