package lesson_7_1;

public class RobotDog {

//static method khong the goi non-static metho, nhung non-static method co the goi static method
  //  private static int dogId = 0;  //share value: 1 th thay doi la all thay doi => vi the ma KQ =2
protected static int dogId = 0;  //class member - co static la member
    private String name;
    private int robotId;

    public RobotDog(){
        robotId = dogId + 1; //tinh toan
        dogId++; //thay doi truc tiwp gia tri
    }

    //public static int getDogId() {

    //public static int getDogId() {
        //return dogId;

    public int getDogId() {
        return robotId;
    }

    public static void changeId(){
        dogId++;
    }
}
