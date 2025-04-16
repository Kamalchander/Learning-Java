import java.util.Scanner;

public class StudentGrade{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Grade : ");
        int score = sc.nextInt();

        if (score >= 90){
            System.out.println("Student got Grade A");
        }
        else if (score >= 80) {
            System.out.println("Student got Grade B");
        }
        else if (score >= 70) {
            System.out.println("Student got Grade C");
        }
        else {
            System.out.println("Student Failed");
        }
        sc.close();
    }
}