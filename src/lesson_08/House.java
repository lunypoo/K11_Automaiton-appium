package lesson_08;

import lab_07_2.Horse;

public class House {

    //overloading asc >

    private int doorNumber = 1;
    private String topRoofColor = "read";
    private String color = "white"; //deffault value neu khong co input value

//    public House(int doorNumber, String topRoofColor, String color) {
//        if(doorNumber != 1 && doorNumber > 0){
//            this.doorNumber = doorNumber;
//        }
//        if (topRoofColor != null)
//        this.topRoofColor = topRoofColor;
//
//        if (color != null)
//        this.color = color;
//    }
//
//    public static void main(String[] args) {
//        int doorNum = 1;
//        House house = new House(1,null,"Pink");
//    }

//    public void setDoorNumber(int doorNumber) {
//        this.doorNumber = doorNumber;
//    }
//
//    public void setTopRoofColor(String topRoofColor) {
//        this.topRoofColor = topRoofColor;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    /* tao ra xong khong thay doi > su dung design pattern
    * co 1 object rat nhieu attribute
    * co luc the nay, the khac
    * y/c hinh dang co case set  = default
    * immutable object: khi dc tao ra thi khong the chen attribute value vao nua
     * */




    public static void main(String[] args) {
        House house = new House();
//        house.setDoorNumber(2);
//        house.setTopRoofColor("dark blue"); //thay doi mau, khong can call quan nhieu parammetter se dan den qua nhieu overloading
    }


}
