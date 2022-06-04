package lesson_06;

public class Calculator {

    //Method signature


    //Method overloading: dung khi cung 1 logic, khac nhau ve agiment

    public int sum(int num1, int num2){
        return num1 + num2;
    }
    /*
    public int sum(int num1, String num2){
       return num1 + num2;
    }


    //cung so luong parameter khac kieu
    public int sum(int num1fafas, int num2){
        return num1fafas + num2;
    }

     */
    //thay doi pa
    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //Varagrs | Rest Parameters
    //define ham

    //public int sum(int num1, int num2, int ...restNumbers){
    //public int sum(int ...restNumbers){
    public int sum(int initNumber, int ...restNumbers){
        int arrTotal = 0;
        for (int number : restNumbers) {
            arrTotal = arrTotal + number;
        }
        return arrTotal;
    }

    //WHEN over loading happens  | Compile time : hoan thanh chuong trinh
    //WHEN overring happens | tai thoi diem Run time
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1,2);
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(calculator.sum(1, 2, 3));

        //khong co ky thua overloading

    }
}
