package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {

    public static void main(String[] args) {
        //look over values = other thi update = something else
        Map<Integer,String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Canh sat"); // khong chap nhan 2 key trung nhau
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Other");
        emergencyList.put(117, "Other");

        for (Integer key : emergencyList.keySet()) {
            if (emergencyList.get(key).equals("Other")){
               // emergencyList.remove(key); // case loi
                emergencyList.replace(key, "Something else");
            }

        }
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));

        }
    }
}
