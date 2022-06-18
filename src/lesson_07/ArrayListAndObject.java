package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {

    public static void main(String[] args) {

        // tao ra 1 array list chua danh sach cua person

        List<Person> personList = new ArrayList<>();
        Person teo = new Person();
        Person teo2 = new Person();
        //tao ra 1 object minh co quyen thay doi attributes ben trong no = setter => ben trong se thay doi
        teo.setName("Teo");
        teo.setAge(18);

        personList.add(teo);
        personList.add(teo2);

        System.out.println(personList);

//        for (Person person : personList) {
//            System.out.println(person.getName());
//            System.out.println(person.getAge());

        personList.get(1).setName("Ti");
        System.out.println(personList);


        }

    }
