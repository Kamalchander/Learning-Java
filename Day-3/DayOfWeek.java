import java.util.Scanner;

public class DayOfWeek{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day Number (1-7): ");
        byte a = sc.nextByte();

        switch(a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Entered Wrong Day Number");
        }

        System.out.print("Using If-else Day Of Number, Enter Day Number (1-7): ");
        a = sc.nextByte();
        if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else if (a == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Entered wrong Day Number");
        }
        sc.close();
    }
}
