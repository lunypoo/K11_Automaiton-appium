package lab_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        //<18 || 18-55 || 56+
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int clientAge = scanner.nextInt();

        if (clientAge < 18) {
            System.out.println("Khong ban!!");
            //call them 1 action
            if (clientAge < 14){
                System.out.println("calling 911...");
            }
        } else if ( clientAge <=55) {
            System.out.println("Unlimited");
        } else {
            System.out.println("2 chai");
        }
        // ||: hoac, chi can 1 trong 2 bieu thuc dung thi bieu thuc ben trong dung
        // && : va , bat buoc ca 2 bieu thuc deu phai dung
    }
}
