package Day5;

public class Employee {

    double salary;
    double calculateSalary(){
        System.out.println("calculating Salary of employee in employee class : ");
        return salary;
    }
}

class FullTimeEmployee extends Employee{
    @Override
    double calculateSalary() {
        salary = 50000;
        System.out.println("FullTimeEmployee Salary is : " + salary);
        return salary;
    }
}

class PartTimeEmployee extends Employee{
    @Override
    double calculateSalary() {
        salary = 30000;
        System.out.println("PartTimeEmployee Salary is : " + salary);
        return salary;
    }
}