package lab_03;

public class ForLoopLearning {
    public static void main(String[] args) {
        //thoat ra khoi vong lap khi i= 10
        //for (int i = 0; i < 10; i++) {
        //   System.out.println(i);
        int maxNumber = 10;
        //infinitive loop
       /* for (;;){
            System.out.println(maxNumber);*/

        /*for (int i = 0; i < maxNumber; i++) {
           System.out.println(i);
         */
        int i = 0;
        for (; i < maxNumber; ) {
            System.out.println(i);
            i++;
            //unreachable statement
            System.out.println("hello");
        }
    }
}