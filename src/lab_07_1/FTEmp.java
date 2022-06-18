package lab_07_1;

public class FTEmp extends Employee {

    private static int FTE_SALARY = 5000;

    public FTEmp() {
        super();
    }

    @Override
    public int getSalary() {
        return FTE_SALARY;
    }
}
