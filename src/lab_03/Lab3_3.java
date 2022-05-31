package lab_03;

public class Lab3_3 {
//sort array
    public static void main(String[] args) {
        int temp;
        int [] arrNumber = new int[] {12,34,1,16,28};
        for (int i = 0; i < arrNumber.length -1; i++)
            for (int j = 0; j < arrNumber.length - i - 1; j++) {
                if (arrNumber[j] > arrNumber[j+1]){
                    temp = arrNumber[j];
                    arrNumber[j] = arrNumber[j+1];
                    arrNumber[j+1] = temp;
                }
            }
        System.out.println("Expected result: ");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + "\t");
        }
            }
        }

