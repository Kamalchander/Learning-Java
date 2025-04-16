import java.util.Scanner;

public class EvenOdd{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = scanner.nextInt();
        if (a % 2 == 0){
            System.out.println("Number is Even = " + a);
        }
        else{
            System.out.println("Number is Odd = " + a);
        }
        scanner.close();
    }
}