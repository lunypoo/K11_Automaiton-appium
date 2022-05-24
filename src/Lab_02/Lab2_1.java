package Lab_02;

import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("height: ");
        float height = scanner.nextFloat();
        System.out.println("weight: ");
        float weight = scanner.nextFloat();

        float BMI;
        BMI = weight / (height * 2);
        System.out.println("Your BMI is: "+BMI+"");

        if (BMI < 18.5f){
            System.out.println("Underweight");
            float a;
            a =  (18.5f - BMI);
            System.out.println("Ban can tang:"+a+"kg");
        } else if (BMI <= 24.9f) {
            System.out.println("Normal weight");
        } else if (BMI <= 29.9f) {
            System.out.println("Overweight");
            float b;
            b = (BMI - 24.9f);
            System.out.println("Ban can phai giam:"+b+"kg");
        } else{
            System.out.println("Obesity");
            float c;
            c = (BMI - 24.9f);
            System.out.println("Ban can phai giam :"+c+"kg");
        }
    }
}
