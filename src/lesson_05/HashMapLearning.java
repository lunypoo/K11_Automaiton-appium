package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer,String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Canh sat"); // khong chap nhan 2 key trung nhau
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Other");
        System.out.println(emergencyList.get(116));

        emergencyList.put(116, "Something else!");
        System.out.println(emergencyList.get(116));

        System.out.println(emergencyList.get(117));

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
        /*
        //content key > tra ve dung hay sai
        System.out.println("Has 113 key: " + emergencyList.containsKey(113));
        System.out.println("Has 117 key: " + emergencyList.containsKey(117));
        System.out.println("Has key: " + emergencyList.containsKey("Canh sat"));
        System.out.println("Has key: " + emergencyList.containsKey("Canh sat"));

         */

        //Update
        emergencyList.replace(116,"116");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116,"116","Something else!");
        System.out.println(emergencyList.get(116));

        //remove
        //method over loading > 2 method trung nhau


    }
}
