package Lab_02;

import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input height: ");
        float height = scanner.nextFloat();
        System.out.println("Please input weight: ");
        float weight = scanner.nextFloat();

        float BMI = weight / (height * 2);
        System.out.printf("Your BMI is: %f\n ", BMI);

        if (BMI <= 18.5){
            System.out.println("Underweight");
            float a;
            a = (float) (18.5 - BMI);
            System.out.println("Ban can tang them: "+a+"kg");
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (BMI < 29.9) {
            System.out.println("Overweight");
            float b;
            b = (float) (BMI - 24.9);
            System.out.println("Ban can giam: "+b+"kg");
        } else {
            System.out.println("Obesity");
            float c;
            c =  (float) (BMI - 24.9);
            System.out.println("Ban can phai giam: "+c+"kg");
        }
    }
}
