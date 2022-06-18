package lab_07_1;

public class ContEmp extends Employee {

    private static int CTTE_SALARY = 4000;

    public ContEmp() {
        super();
    }

    @Override
    public int getSalary() {
        return CTTE_SALARY;
    }
}
