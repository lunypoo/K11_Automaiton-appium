package Lesson_04;
//Dieu kien re nhanh
//dung switchcase khi set 1 cap du lieu nao do cung 1 loai du lieu

import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = sc.nextInt();
/*
        if (userInput == 1){
            System.out.println("Giai nhat");
        } else if (userInput == 2) {
            System.out.println("Giai nhi");
        } else if (userInput == 3) {
            System.out.println("Giai ba");
        } else {
            System.out.println("Chuc ban may man lan sau!");
        }
*/

    /*
        switch (userInput){
            //user input co gtri la con so 1, khong phai TH1
            case 1:
                System.out.println("Giai nhat");
                break;
            case 2:
                System.out.println("Giai nhi");
                break;
            case 3:
                System.out.println("Giai ba");
                break;
            default:
                System.out.println("Chuc ban may man lan sau");
     */

       // VD: input ngay trong tuan
                switch (userInput){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        System.out.println("Weekdays");
                        break;
                    case 7:
                    case 8:
                        System.out.println("Weekends");
                    default:
                        System.out.println("Invalid date!");
                }


        }



    }
