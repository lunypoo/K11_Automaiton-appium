package lesson_08;

public class TestPerson {

    public static void main(String[] args) {

//        case tuoi < 0 thi se bao loi
//        Person teo = new Person("Teo", -18);
//        teo.doSth();

        //case chi khi nhap tuoi > 0 thi se nhan
        Person teo = new Person("Teo", 18);
        teo.doSth();

        System.out.println(teo);
    }

    //Builder Design Pattern:

    /*
     * bug leakage = user's bug / (QA's bug - Invailid bug) *100
     * QA's = 0 => cong thuc se bi loi > vi the nen dung private thi se chan loi duoc o cac class #
     *
     * */
}
