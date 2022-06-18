package lesson_07;
public class Employee extends Person1 {

    private double Salary;

    public Employee() {
        super();
    }

    public Employee(String nameEmployee) {
        super();
    }

    public Employee(String nameEmployee, double salary) {
        super(nameEmployee);
        this.Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

}
