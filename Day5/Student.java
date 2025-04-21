package Day5;

public class Student {
    private String name;
    private int rollNo;
    private double marks;

// getter and setter for Name
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // getter and setter for rollNo
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
// getter and setter for marks
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if(marks>=0 && marks<=100) {
            this.marks = marks;
        }else {
            System.out.println("Marks assigned are not valid marks");
        }
    }

    public String getGrade(){
        if (marks>=80){
            return "A";
        } else if (marks>=60) {
            return "B";
        } else if (marks>=40) {
            return "C";
        } else if (marks>=30){
            return "D";
        } else {
            return "F";
        }
    }
}
