package lab_06;
//https://github.com/sdetpro-blog/java-oop-exercises/blob/main/appium-k9/LAB_06.md

import java.util.Scanner;

public class Lab6_1 {

    protected int hrs,m;
    public static double minutes(double hrs, double m){
        // 1h =60'
        return hrs * 60 + m;
    }

    public static void main(String[] args) {
        int hrs,m,sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input hrs: ");
        hrs = scanner.nextInt();
        System.out.print("Input minutes: ");
        m = scanner.nextInt();
        System.out.println("Tong so phut la: " +minutes(hrs,m));

    }
}
