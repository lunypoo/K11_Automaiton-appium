package lesson_05;

public class StringLearning {
// declear: khai bao kieu tuong van
    public static void main(String[] args) {
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
        //vd: tu khoa nao do thanh ***
        String badWordContainer = "bad, very bad, sth else,bad";
String filteredStr = badWordContainer.replace("bad","b**");
//tao 1 chuoi moi, khong update tren chuoi cu
        System.out.println(badWordContainer);
        System.out.println(filteredStr);

    }
}
