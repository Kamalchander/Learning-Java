import java.util.Scanner;

public class CompareAge {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your Age : ");
        byte age = sc.nextByte();

        if (age<18){
            System.out.println("You are minor");
        } else if (age<=60) {
            System.out.println("You are Adult");
        } else {
            System.out.println("You are senior");
        }
    }
}