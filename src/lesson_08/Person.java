package lesson_08;

//fullcontrol attribute manipulation

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age cant't be negative number!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age cant't be negative number!");
        }
        this.age = age;
    }

    public void doSth(){
    };

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//read only: tao object va chi co the lay ra du lieu, chu khong duoc phep thay doi
//lay ra cac getter trong attribute

//private only: cho thay doi, khong cho doc ra => setter
