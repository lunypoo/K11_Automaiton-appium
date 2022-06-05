package lab_exercises;
//String myStr = "100 minutes";
//extract digit character from that String

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab6_3 {

    public static void main(String[] args) {

        String myStr = "100 minutes";

        //cach 1:
        //using String split function
        String[] word = myStr.split(" ");
        //System.out.println(word);

        //chuyen mang thanh arraylist
        List<String> arrList = new ArrayList<>(Arrays.asList(word));
        //xoa phan tu
        arrList.remove("minutes");
        //in lai mang sau khi xoa
        System.out.println(arrList);


        //Cach 2: using regex
        Pattern pattern = Pattern.compile(" ");
        word = pattern.split(myStr);
        System.out.println(word);


        //Cach 3: tao 1 chuoi con tu chuoi cho truoc
        System.out.println(myStr.substring(0,3));



        //Ex2

        String myStr2 = "12345nabc678";
        //Dung ham substring
        //gtri can loai bo
        System.out.println("String: " + myStr2.substring(5,9));
        //gtri can tim
        System.out.println("Expected " + myStr2.substring(0,5) + myStr2.substring(9,12));


    }

}
