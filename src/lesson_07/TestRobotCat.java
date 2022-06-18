package lesson_07;

public class TestRobotCat{

    public static void main(String[] args) {
        //co 2 cach tao
        //tao ra 1 con robot ten la meo
//        RobotCat meo = new BatteryRobotCat("Meo","07/06/2022");
//      meo.setName("Meo");
//       meo.setProductionDate("07/06/2022");
//        System.out.println(meo);
//
        RobotCat batteryRobotCat = new BatteryRobotCat("batteryRobotCat","07/06/2022");
        RobotCat windRobotCat = new WindRobotCat("windRobotCat","07/06/2022");
        RobotCat solarRobotCat = new SolarRobotCat("solarRobotCat","07/06/2022");

//        System.out.println(batteryRobotCat);
//        System.out.println(solarRobotCat);


        System.out.println(batteryRobotCat.charge());
        batteryRobotCat.doSth();
        System.out.println(solarRobotCat.charge());
        System.out.println(windRobotCat.charge());
    }
}

/**
 * overriding : ngu canh phai giong nhau 100%, thay doi logic cua cha
 * overloading
 */
