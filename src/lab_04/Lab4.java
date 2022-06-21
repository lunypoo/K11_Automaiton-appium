package lab_04;

import java.util.*;

public class Lab4 {

    private static int myArr, newArr[];

    public static void Addnumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter arraylist: ");
        Lab4.myArr = scanner.nextInt();
        Lab4.newArr = new int[myArr];
        for (int i = 0; i < myArr; i++) {

            System.out.print("newArr[" + i + "]=");
            newArr[i] = scanner.nextInt();
        }
    }

    public static void Print() {
        System.out.println("New array list: ");
        for (int i = 0; i < myArr; i++) {
            //in cac ptu tren cung 1 dong
            System.out.print(Lab4.newArr[i] + "\t");
        }
    }

    public static void Maximum() {
        System.out.printf("Original array: " + Arrays.toString(Lab4.newArr) + "\t");
        Arrays.sort(Lab4.newArr);
        System.out.println("\nArray ascending: " + Arrays.toString(Lab4.newArr) + "\t");

    }

    public static void Minium() {
        System.out.printf("Original array: " + Arrays.toString(Lab4.newArr) + "\t");
        Arrays.sort(new int[][]{Lab4.newArr}, Collections.reverseOrder());
        System.out.println("\nArray descending: " + Arrays.toString(Lab4.newArr) + "\t");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("\n1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. search number");
            System.out.println("--------------------------------");

            System.out.print("user input: ");

            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    Addnumber();
                    break;

                case 2:
                    Print();
                    break;

                case 3:
                    Maximum();
                    break;
                case 4:
                    Minium();
                    break;
                default:
                    System.out.println("Error value!");
                    System.exit(0);
            }
        } while (userInput != 0);
    }
}
