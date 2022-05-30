package Lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
//vong lap do-while bat ke dk gi cung chay it nhat duoc 1 lan
        //BT: user doan tu 1->5, duoc doan toi da 3 lan=> doan dung => true, thoat khoi vong lap va chuc mung user
        // doan sai => false, guessingTimer tang len de lan sau vao choi
        //vao lan dau, gan guessingtime =0
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(5);
        //in so random number
        System.out.println("randomNumber: " + randomNumber);

        do {
            //Guessing number
            //ham scanner la lay du lieu tu ban phim
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your guessing number: ");
            int userInput = sc.nextInt();

            //userInput = dung randomNumber => in ra chuc mung
            if (userInput == randomNumber){
                System.out.println("Horray! It's correct!");
                // user doan dung => thoat khoi vong lap
                break;
                // user doan false => chay lai vong lap, chay den lan t3 => thoat khoi vong lap

            }

            guessingTime++;

        }while (guessingTime < 3);
        System.out.println("See you again");

    }
}
