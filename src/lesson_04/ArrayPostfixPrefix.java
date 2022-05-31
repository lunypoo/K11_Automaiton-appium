package lesson_04;

public class ArrayPostfixPrefix {

    public static void main(String[] args) {
        //postfix ben phai thuc thi truoc va assgin cho ben trai va thuc hien cai postfix sau cung
        int a =1;
        int b =2;
        int c = ++a + b;
        //int[] myIntArray = new int[5];
        int [] myIntArray = {9,9,9,9,9};

// thuc thi index trong vong lap for dau tien=> lay duoc gia tri index dau tien
       /* for (int index = 0; index < 5; index++) {
            //i++ thay doi gia tri index; i+1:
            myIntArray[index] = index++;
            /* gia tri dau tien index duoc gan = 0 => i++ = 0+0 =1=> chay tiep vao vong lap for: 1++ = 2
            index = 2 => 2++ = 3=> chay tiep vong lap for: 3++ =4
            chay tiep so tiep theo =6 => 6 > 5 => khong phu hop condition index < 5 => thoat ra
*/

            /*vd: for (int index = 0; index < 5;) {
            myIntArray[index++] = index +1;
            => index 0, index++ => tang them 1dv => index + 1=1+1 =2
            lay 2 gan sang index 0 => gtri t1 = 2
            - index = 0, index++ =0++ = 1 => chay tiep vong lap tiep
            => index 1, index++ => tang them 1dv => index + 1 = 2+1 = 3
            lay 3 gan sang index 1 => gtri t2 = 4
             */

        for (int index = 0; index < 5;) {
            myIntArray[index++] = index;
        }
        for (int value : myIntArray){
            System.out.println(value);
        }
    }
}
