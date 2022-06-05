package lab_exercises;

//String url = "https://google.com";
//Check http OR https; domain name, .com OR .net

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab6_4 {

    public static void main(String[] args) {

        String url = "https://google.com";

        System.out.println(url.contains("http"));
        System.out.println(url.contains("https"));
        System.out.println(url.contains("google.com"));
        System.out.println(url.contains(".com"));
        System.out.println(url.contains(".net"));

    }
}
