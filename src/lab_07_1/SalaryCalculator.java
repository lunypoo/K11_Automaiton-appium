package lab_07_1;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee emp_1 = new FTEmp();
        Employee emp_2 = new FTEmp();
        Employee emp_3 = new FTEmp();
        Employee emp_4 = new ContEmp();
        Employee emp_5 = new ContEmp();

        employeeList.add(emp_1);
        employeeList.add(emp_2);
        employeeList.add(emp_3);
        employeeList.add(emp_4);
        employeeList.add(emp_5);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println("Total salary is: " + salaryCalculator.getTotalSalary(employeeList));
    }

    public int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0; //chua tinh thi tong luong =0
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary(); // totalSalary +=employee.getSalary
        }
        return totalSalary;
    }
}
