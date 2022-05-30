package Lesson_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Lab4 {

    public static void printSimpleMenu() {
        System.out.println("----MENU----");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print number");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
    }

    public static int getUserOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select option: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {

        int options = getUserOption();
            printSimpleMenu();
            List<Integer> arrNumber = new ArrayList<>();
            arrNumber.add(4);
            arrNumber.add(7);
            arrNumber.add(14);
            arrNumber.add(22);
            System.out.println("A Number Arraylist: "+ arrNumber);

            switch (options) {
                case 1:
                    arrNumber.add(3, 9);
                    System.out.println("Phan tu them moi: " + arrNumber.get(1));
                    break;

                case 2:
                    System.out.println("2. Print number");
                    int index;
                    for (index = 0; index < arrNumber.size(); index++) {

                        arrNumber.get(index);
                        System.out.println(arrNumber.get(index));
                    }
                    break;

                case 3:
                    System.out.println("3. Get maximum number");
                    int maxArray;
                    maxArray = arrNumber.get(0);
                    for (int i = 0; i < arrNumber.size(); i++) {
                        if (arrNumber.get(i) > maxArray) {
                            maxArray = arrNumber.get(i);
                        }
                    }
                    System.out.println("MaxArray: " + maxArray);
                    break;

                case 4:
                    System.out.println("4. Get minimun number");
                    int minArray;
                    minArray = arrNumber.get(0);
                    for (int i = 0; i < arrNumber.size(); i++) {
                        if (arrNumber.get(i) < minArray) {
                            minArray = arrNumber.get(i);
                        }
                    }
                    System.out.println("MinArray: " + minArray);
                    break;

                default:
                    System.out.println("Invalid date");

            }


        }


    }


