package lesson_07;

//sub-class, child-class, concrete-class: class con
//extends thua ke all cua robotcat
//use F4 de link sang tab khac
public class BatteryRobotCat extends RobotCat {
//khong co default constructor cua thang cha, goi it nhat 1 constructor cua cha

//    public BatteryRobotCat() {
//        super("Meo");
//    }

    public BatteryRobotCat(String name, String productionDate) {
        super(name.concat(" ,meo meo meo"),productionDate);
        //System.out.println("Hello, my name is " + name);
    }
//trung method cua cha
    @Override
    public String charge(){
        return super.charge() + " with battery";
}

@Override
    public void doSth(){
       // super.doSth();
    System.out.println("Hi");
}
}
