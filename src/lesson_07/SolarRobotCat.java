package lesson_07;

//sub-class, child-class, concrete-class: class con
//extends thua ke all cua robotcat
//use F4 de link sang tab khac
public class SolarRobotCat extends RobotCat {

    public SolarRobotCat(String name, String productionDate) {
        super(name,productionDate);
    }

    @Override
    public String charge(){
        return super.charge() + " with solar energy";
    }

}
