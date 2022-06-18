package lesson_07;

public class Person {

    private String name;
    private int age;

    //hàm gọi constructor không có đối số : alt + Ins > constructor > select none


    public Person() {
    }

    // hàm gọi constructor có đối số: alt+Ins > bôi đen 2 gtri > OK
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setter: bôi đen lấy cả 2 gtri
    // cau lenh ben duoi goi la method
    // cai gi ma chen astribult value goi la setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //cai gi ma tra ve astribuilt hien tai cua object thi goi la getter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
