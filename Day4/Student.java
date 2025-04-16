package Day4;

public class Student {
    String name;
    int rollNumber;
    float marks;

    public void showResult(){
        System.out.println("Student Name is: " +name);
        System.out.println("Roll no.: " + rollNumber);
        if(marks>=35){
            System.out.println("Student is passed with marks: " + marks);
        }
        else {
            System.out.println("Student is Failed with marks: " + marks);
        }
        System.out.println("-------------------------------------------------");
    }
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.name = "Kamal Chander";
        stu1.rollNumber = 101;
        stu1.marks = 85;

        Student stu2 = new Student();
        stu2.name = "Manav mattu";
        stu2.rollNumber = 102;
        stu2.marks = 50;

        Student stu3 = new Student();
        stu3.name = "Vishal";
        stu3.rollNumber = 103;
        stu3.marks = 30;

        stu1.showResult();
        stu2.showResult();
        stu3.showResult();
    }
}