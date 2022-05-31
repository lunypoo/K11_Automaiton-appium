package lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {

    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(7);
        myArrList.add(1);
        myArrList.add(5);
        myArrList.add(2);
        myArrList.add(3);

        /*
        * Lay 3 gtri nho nhat cua arraylist
        * remove duplicate
        * sort tung thang
        * lay 3 gtri nho nhat
         */
        //lay 1 ro moi co cung 1 gtri
        List<Integer> withoutDuplicatedValues = new ArrayList<>();
        for (Integer number : myArrList) {
            if (!withoutDuplicatedValues.contains(number)){
                withoutDuplicatedValues.add(number);
            }

        }
        System.out.println(myArrList);
        //sort tung con so tu nho den lon
        Collections.sort(withoutDuplicatedValues);
        System.out.println(withoutDuplicatedValues);
/*
        // remove duplicate
        Set<Integer> set = new HashSet<>(myArrList);
        myArrList = new ArrayList<>(set);
        System.out.println(myArrList);

 */

        //Sublist
        //from 0 > lay 1,2,3 >
        List<Integer> first3minValues = withoutDuplicatedValues.subList(0,3);  //Exclusive
        System.out.println(first3minValues);
    }
}
