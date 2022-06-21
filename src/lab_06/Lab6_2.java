package lab_06;

//String myPassword = "password123";
//Allow user to input maximum 3 times

import java.util.Scanner;

public class Lab6_2 {

    public static void main(String[] args) {

        int guessingTime = 0;
        String myPass = "password123" ;
        String guessPass;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter password: ");
            guessPass = scanner.nextLine();

            if (guessPass.equals(myPass)){
                System.out.println("Login successfully");
                break;
            }else{
               System.out.println("Enter the wrong password more than 3 times!");
            }
            guessingTime++;

        } while (guessingTime < 3);
        System.out.println("See you again!");
    }


    }

