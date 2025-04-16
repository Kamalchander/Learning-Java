package Day4;

public class Teacher extends Person {
    String subject = "English";

    public void showTeacherInfo(){
        System.out.println("Teacher subject is : " + subject);
    }

    public static void main (String[] args){
        Teacher teach = new Teacher();
        teach.showTeacherInfo();
        teach.showInfo();
    }
}
