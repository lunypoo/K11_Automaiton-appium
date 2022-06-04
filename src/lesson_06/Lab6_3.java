package lesson_06;
//String myStr = "100 minutes";
//extract digit character from that String

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

public class Lab6_3 {

    public static void main(String[] args) {

        String myStr = "100 minutes";

        //dung split de tach phan tu
        String[] numberTime = myStr.split(" ");
        //chuyen mang thanh arraylist
        List<String> arrList = new ArrayList<>(Arrays.asList(numberTime));
        //xoa phan tu
        arrList.remove("minutes");
        //in lai mang sau khi xoa
        System.out.println(arrList);



        //tao 1 chuoi con tu chuoi cho truoc
        System.out.println(myStr.substring(0,3));
    }

}
