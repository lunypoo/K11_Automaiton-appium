package Lesson_04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {

        // <> de cap ngoac nhon la khai bao type, remove <> thi se khong bao loi
        // nen khai bao loai du lieu => de clean init thi nen khai bao
        //khai bao LIST dau tien, cho toi 1 cai list de khai bao integer va dat ten la myArraylist
        // toi se khoi tao cai list  = new .....
        /*
        ArrayList<Integer> myArrayList = new ArrayList();
        //add
        myArrayList(0);
        //khac integer thi errors
        myArrayList(false);
        myArrayList("Teo");
        myArrayList(1.8f);
        myArrayList(1.8d);
        myArrayList(100L);

         */

        List<Integer> myArrayList = new ArrayList<>();

        //CRUD, add
        myArrayList.add(1); //index 0
        myArrayList.add(2); //index 1
        // insert 1 con so 3 o index so 0
        //ptu dau tien start = index so 0, end = length -1
        myArrayList.add(0,3); //chi dinh input so 3 o index 0 => day so 1 sang index #

        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(myArrayList.get(index));
            
        }
       /*
        for (int integer : myArrayList) {

            System.out.println(integer);
        }

        */
    }
}
