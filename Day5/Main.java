package Day5;

public class Main {
    public static void main (String[] args){

        // BankAccount Program
        BankAccount account = new BankAccount();
        account.setAccountNumber("1234567890");
        account.setAccountHolderName("Kamal Chander");
        account.setBalance(50000);
        account.displayAccountInfo();

        System.out.println("-------------------------------------");
        System.out.println();

        // Student Program
        Student stu = new Student();
        stu.setName("Kamal Chander");
        stu.setRollNo(1001);
        stu.setMarks(88);

        System.out.println("Student Name is: "+ stu.getName());
        System.out.println("Student RollNumber is: "+ stu.getRollNo());
        System.out.println("Student Marks is: " + stu.getMarks());
        System.out.println("Student Grade is: " + stu.getGrade());

        System.out.println("-------------------------------------");
        System.out.println();

        Calculator calc = new Calculator();
        System.out.println("Add two number : " + calc.add(10,19));
        System.out.println("Add double number : " + calc.add(10.8,19.7));
        System.out.println("Add three number : " + calc.add(10,19, 8));

        System.out.println("-------------------------------------");
        System.out.println();

        Employee emp1 = new FullTimeEmployee();
        emp1.calculateSalary();

        Employee emp2 = new PartTimeEmployee();
        emp2.calculateSalary();

        System.out.println("-------------------------------------");
        System.out.println();

        Shape Circle = new Circle(5.0);
        Circle.displayType();
        System.out.println("Area of circle : " + Circle.area());

        Shape Rectangle = new Rectangle(3,5);
        Rectangle.displayType();
        System.out.println("Area of Rectangle : " + Rectangle.area());

        System.out.println("-------------------------------------");
        System.out.println();

        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.playMusic();
    }
}
