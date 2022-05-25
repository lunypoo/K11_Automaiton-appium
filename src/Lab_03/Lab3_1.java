package Lab_03;

public class Lab3_1 {
    //count how many odd,even number
    public static void main(String[] args) {
    int [] intArr = new int[] {1,2,3,4,5};
    int oddNumber = 0;
    int evenNumber = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]%2==0){
                oddNumber = oddNumber + 1;
            } else {
                evenNumber = evenNumber + 1;
            }
        }
        System.out.println("Odd number:" + oddNumber);
        System.out.println("Even number: "+ evenNumber);
    }
}
