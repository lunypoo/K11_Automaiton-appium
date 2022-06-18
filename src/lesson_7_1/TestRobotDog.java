package lesson_7_1;

public class TestRobotDog {

    public static void main(String[] args) {
       // SolarRobotDog dog = new SolarRobotDog();
        RobotDog dog = new SolarRobotDog();
      //  RobotDog.changeId();  //class method
       // System.out.println(RobotDog.dogId);
        WindRobotDog dog1 = new WindRobotDog();

        System.out.println(dog.getDogId());
        System.out.println(dog1.getDogId());
    }
}
