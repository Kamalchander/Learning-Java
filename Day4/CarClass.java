package Day4;

public class CarClass{
    String brand;
    int year;
    double price;

    public void displayDetails(){
        System.out.println("The Car Brand is:" + brand);
        System.out.println("Year: "+ year);
        System.out.println("Price is: "+price);
        System.out.println("--------------------------");
    }
    public static void main(String[] args){
        CarClass car1 = new CarClass();
        car1.brand = "Toyota";
        car1.price = 2000000;
        car1.year = 2024;

        CarClass car2 = new CarClass();
        car2.brand = "Honda";
        car2.year = 2024;
        car2.price = 3000000;

        System.out.println("Car 1 Details are: ");
        car1.displayDetails();

        System.out.println("Car 2 Details are: ");
        car2.displayDetails();
    }
}
