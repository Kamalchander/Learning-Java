package Day5;

abstract class Shape {

    abstract double area();

    void displayType(){
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

