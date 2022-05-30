package Lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {

    public static void main(String[] args) {
    /*    //de () la biet dang goi 1 function nao do
        //parameter(s) la aliat o trong 1 function dai dien cho 1 du lieu nao do noi dung cung cap (name la parameter)
        //argument(s) : Teo, Ti, Tun
        getARandomNumber("Teo");  //"teo" : argument - loai du lieu nao do thuc, provide(cung cap) 1 cai argument cho 1 parameter name
        getARandomNumber("Ti");
        getARandomNumber("Tun");
    }
    //void: function khong tra ve cai gi het
    //VD: khi thay doi thong tin cua 10 to bao => chi can thay doi 1 cau lenh function la thay doi
    //ca 10 to bao, khong phai thay doi thong tin tung to
    // thay doi getARandomNumber khong duoc copy ma phai refactor: right click > refactor> rename
    //parameter : name
    //varargs, rest parameters
   // public static void getARandomNumber(String name){ //=> truyen 1 parameter loai la string co ten la name
// System.out.println("Hi,"+ name);

     */
        /*
        System.out.println(getARandomNumber(2));
        System.out.println(getARandomNumber(10));
    }
    //Exclusive
    public static int getARandomNumber(int boundary){
        int randomNumber = new SecureRandom().nextInt(boundary);
             return randomNumber;
       */

    /* lay random so lon nhat
     System.out.println(getARandomNumber());
        System.out.println(getARandomNumber());
    }
    public static int getARandomNumber(){
        int randomNumber = new SecureRandom().nextInt(Integer.MAX_VALUE);
             return randomNumber;
     */
// Vd: return dung 1 minh - print 1 chuoi tu 0 -> 10 , gap so 8 thi dung laI

        printNumber();
        System.out.println("bkcsjdfhds");
    }
    //break: turn melay vong lap do, thoat ra khoi vong lap do > chay tiep vong khac
    //return: thoat ra khoi method > gap return khong care nhung doan duoi
    /*nguyen tac:
    - DRY : Don't repeat yourself
    - SOLID :
    S: Single Responsibility - don nhiem
    - arraylist duoc element tu interface list
     */
    public static int getARandomNumber(){
        int randomNumber = new SecureRandom().nextInt(Integer.MAX_VALUE);
        return randomNumber;
    }
        public static void printNumber(){
            for (int i = 0; i < 10; i++) {
                if (i == 8) { //return;
                    System.out.println("You have reached the magic number...");
                }
                else System.out.println(i);
            }
            System.out.println("End the program");
        }
    }
