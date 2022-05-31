/*package Lab_03;

import java.awt.*;
import java.security.SecureRandom;
import java.util.Scanner;

public class WhiteLoopLearning {

    public static void main(String[] args) {
     //khi khong biet so cua vong lap
     boolean isContinuing = true;

     while (isContinuing){

         System.out.println("======Game Menu=====");
         System.out.println("1. Generate radom number (less then 1000");
         System.out.println("0. Exit!");

         Scanner scanner = new Scanner(System.in);
         System.out.print("Please select option: ");
         int option = scanner.nextInt();

         if (option == 0){
             isContinuing = false;
         } else if (option == 1) {
             System.out.println("Your random number: " + new SecureRandom().nextInt(1000));
         } else {
             System.out.println("[ERROR] Input errors");
         }
         System.out.println("See you again!");
         /*
*  =====Game menu=====
*  1. Generate radom number (less then 1000)
*  0. Exit!
*
* */

// 1 phan cua bai l
package lab_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhiteLoopLearning {

    public static void main(String[] args) {
        boolean isContinuing = true;

        while (isContinuing) {
            printSimpleMenu();
            int option = getUserOption();
            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                System.out.println("Your random number: " + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("[ERROR] Input errors");
            }
            //co the thay doi doan tren = switchcase
        }
            System.out.println("See you again!");
        }

        public static void printSimpleMenu(){
            System.out.println("======Game Menu=====");
            System.out.println("1. Generate radom number (less then 1000)");
            System.out.println("0. Exit!");
        }
        private static int getUserOption(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select option: ");
            return scanner.nextInt();
        }
    }
