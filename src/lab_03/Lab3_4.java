package lab_03;

import java.util.Arrays;

public class Lab3_4 {

    public static void main(String[] args) {
        int[] arr1 = {1, 12, 16, 28, 34};
        int[] arr2 = {1, 13, 16, 27, 99};
        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int pos = 0;
        for (int element : arr1) {
            result[pos] = element;
            pos++;
        }
        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[j];
                    result[j] = result[i];
                    result[i] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(result));
    }
}