package lab_02;

import java.util.Scanner;

public class ScannerLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number : ");
        //cho 1 con so nguyen nhap vao
        int inputNumber = scanner.nextInt();
        System.out.printf("Your input number is: %d\n", inputNumber);



    }
}
