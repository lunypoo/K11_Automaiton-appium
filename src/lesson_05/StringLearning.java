package lesson_05;

import java.util.Arrays;

public class StringLearning {
// declear: khai bao kieu tuong van
    public static void main(String[] args) {
        /*
        String myName1 = "Teo"; // Literal declaration
        String myName2 = "Teo"; // Literal declaration
        String myName3 = new String("Teo"); //Via string object

        System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
        System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));

        //Check lowercase, uppercase...
        String myPass = "123ayPass";
        //check co chu hoa, thuong, so
        /*
        * number: +1dv
        * hoa: +1dv
        * thuong: + 1dv
         */
        /*
        char[] myCharacters = myPass.toCharArray();
        int totalDigital = 0;
        int totalUpperCase = 0;
        int totalLowerCase = 0;
        for (char character : myCharacters) {
            if (Character.isDigit(character)) totalDigital++;
            else if (Character.isUpperCase(character)) totalUpperCase++;
            else if (Character.isLowerCase(character)) totalLowerCase++;

            }
        if (totalDigital > 0 && totalUpperCase > 0 && totalLowerCase > 0){
            System.out.println("You are all set!");
        }else {
            System.out.println("Password format is wrong");
        }

        //Immutable | Replacement
        //Immutable: khong xu ly truc tiep tren chuoi ma xu ly tren 1 chuoi khac
        //vd: tu khoa nao do thanh ***
        String badWordContainer = "       bad, very bad, sth else,bad";
        String filteredStr = badWordContainer.replace("bad","b**");
        //tao 1 chuoi moi, khong update tren chuoi cu
        System.out.println(badWordContainer);
        System.out.println(filteredStr);


        //Trim : remove space dau, cuoi
        System.out.println(badWordContainer);
        System.out.println(badWordContainer.trim());

        */


        //Substring, index0f, split
        // >= 0 ton tai trong
        String url = "https://google.com";
        System.out.println(url.length());  //do dai cua chuoi
        System.out.println(url.indexOf("h"));  //kq tra ra vi tri cua gtri can tim
        System.out.println(url.indexOf("https"));

        // di tu 0 la diem bd, 3 la diem can cat
        System.out.println(url.substring(0, 3));
        System.out.println(url.substring(2, url.length()));

        //split cat rieng tung gtri
        String[] splitStr = url.split("://");
        System.out.println(Arrays.toString(splitStr));


        //Regex | Regular Expression
        //vd:
        String myCookingTimes = "    105 mins    ";
        //TODO : Patten and Matcher
        //lay ra chuoi chi chua nhung con so
        //^ - khong phai nhung [^] - khong phai tu x den y

        String cookingTimesNumStr = myCookingTimes.replaceAll("[^0-9]","");
        int cookingTimes = Integer.valueOf(cookingTimesNumStr);
        System.out.println("Cooking time is: " + cookingTimes + 1); //khong them cap ngoac tron thi co tac dung noi chuoi
        System.out.println("Cooking time is: " + (cookingTimes + 1));  //them cap ngoac tron thi se tinh tong chuoi

        //Concatenation
        String s1 = "Hello!, "; //muon kq tra ra co space thi phai them gtri
        String s2 = "Teo";
        System.out.println(s1.concat(s2)); //noi chuoi
        System.out.println(s1 + s2); //noi chuoi thu cong

        // TODO: stringBuilder


    }
}
