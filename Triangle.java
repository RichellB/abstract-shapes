public class Triangle extends Shape {

    // Class variables
    double sideA;
    double sideB;
    double sideC;
    double height;


    // Parameterized constructor method
    public Triangle(double side1, double side2, double side3, double h) {
        this.sideA = side1;
        this.sideB = side2;
        this.sideC = side3;
        this.height = h;
    }

    // Implementation of abstract area method
    double area() {
        double area = 0.5 * (this.sideC * this.height);
        return area;
    }

    // Implementation of abstract perimeter method
    double perimeter() {
        double perimeter = this.sideA + this.sideB + this.sideC;
        return perimeter;
    }

    // toString method to display area and perimeter
    public String toString() {
        System.out.println("This triangle's area is " + area() + "\nIts perimeter is " + perimeter());
        return " ";
    }
}
