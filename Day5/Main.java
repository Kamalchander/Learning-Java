package Day5;

public class Main {
    public static void main (String[] args){

        // BankAccount Program
        BankAccount account = new BankAccount();
        account.setAccountNumber("1234567890");
        account.setAccountHolderName("Kamal Chander");
        account.setBalance(50000);
        account.displayAccountInfo();

        System.out.println();
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


    }
}
