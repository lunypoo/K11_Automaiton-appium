package lesson_03;

public class Lab3_2 {
    //find max number
    public static void main(String[] args) {
        int intArr[] = new int[] {1,2,3,4,5};
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < min){
                min = intArr[i];
            }
            if (intArr[i] > max){
                max = intArr[i];
            }
        }
        System.out.println("Minimum: "+ min);
        System.out.println("Maximum: " + max);

    }
}
