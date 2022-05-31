package lesson_02;

public class OpenratorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

       /*
        int total = myNum1 + myNum2;
        int mutiple = myNum1 * myNum2;

        System.out.println(5/2); // lay phan nguyen
        System.out.println(5%2); //lay phan du
        */

        int x = ++myNum1 + myNum2++;
        /*
        * prefix first > right operand > assign value to left operand > postfix
        * myNum1: 2
        * myNum2: 3
        * x: 4
        * ++myNum1 =2 > ++myNum1 + myNum2=4 > gan cho x > chay tiep myNum2++ = 2+1 =3
        */
        //System.out.println(x + "\n"); //de xuong dong
        //System.out.println(x);
        System.out.printf("\t\t%b + %d = %d\n", true, 2, 3);
        //%d - so nguyen, %f - so thuc, %b -
    }
}
