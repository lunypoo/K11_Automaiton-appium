package lab_02;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        //gan hang so
        final int EXPECTED_TIME = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time(hr): ");
        int arrivalTtime = scanner.nextInt();

        boolean isHeOnTime = arrivalTtime == EXPECTED_TIME; // >= , <= , = , != : khac
        //boolean isHeOnTime = true; //true: chay lenh dung , false: chay lenh sai

        System.out.println("1. Going to the shop");

 //       if (isHeOnTime) {
 //       System.out.println("Let's talks!");
 //       } else {
 //           System.out.println("Write a letter");
        /*
        cach 2: tach 2 if, dao nguoc lenh thi them dau ! truoc cau lenh dung
        if (!isHeOnTime){
            System.out.println("Write a letter");
         */
//        }

    //Ternary operator
        String outputMag = isHeOnTime ? "Let's talk!" : "Write a letter";
        System.out.println(outputMag);

        System.out.println("Going home");
    }
}
