package Day4;

public class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary){
        this.salary = salary;
        this.employeeId = employeeId;
        this.name = name;
    }
    public void displayInfo(){
        System.out.println("Employee Name is : " + name);
        System.out.println("Id is : " + employeeId);
        System.out.println("Salary is : " + salary);
        System.out.println("-----------------------------");
    }
    public static void main (String[] args){
        Employee emp1 = new Employee("Kamal",101, 20000);
        emp1.displayInfo();

        Employee emp2 = new Employee("Manav",102, 30000);
        emp2.displayInfo();


    }
}
