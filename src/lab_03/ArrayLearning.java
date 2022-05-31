package lab_03;

public class ArrayLearning {
    public static void main(String[] args) {
        /*int arrayLenght = 5;
        int[] myIntArray = new int[5];
        //gan gtri ben phai cho gtri ben trai
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;


        for (int index = 0; index < arrayLenght; index++) {
            System.out.printf("Element at the index %d has value %d\n",index,myIntArray[index]);
           // System.out.println(myIntArray[index]);
         */
// do so tang dan
        int arrayLenghth1 = 5;
        int [] myintArray = new int[arrayLenghth1];

    /*        for (int i = 0; i < arrayLenghth1; i++) {
                myintArray[i] = i + 1;

            }
            myintArray[arrayLenghth1 - 1] = 10;

            for (int i = 0; i < arrayLenghth1; i++) {
                System.out.printf("Element at the index %d has value %d\n", i , myintArray[i]);

            int[] myintarray = {1,2,3,4,5};

            int arraylength = myintarray.length;

                for (int i1 = 0; i1 < arraylength; i1++) {
                    myintarray[i1] = i1 + 1;
                }
                myintarray[arraylength - 1] = 10;

                for (int i1 = 0; i1 < arraylength; i1++) {
                    System.out.printf("Element at the index %d has value %d\n",i1,myintarray);
  */
        //Enhanced for loop, quet tung thang 1 khong can lay theo index,
        // khong can thay doi gtri chi can lay ra thi dung cau lenh nay
        for (int i : myintArray) {
            System.out.println(i);

        }
                }
            }
