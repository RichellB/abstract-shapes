public class Rectangle extends Shape {

    // Class variables
    double width;
    double length;

    // Parameterized constructor method
    public Rectangle(double len, double w) {
        this.length = len;
        this.width = w;
    }

    // Implementation of abstract area method
    double area() {
        double area = this.width * this.length;
        return area;
    }

    // Implementation of abstract perimeter method
    double perimeter() {
        double perimeter = (2 * this.width) + (2 * this.length);
        return perimeter;
    }

    // toString method to display area and perimeter
    public String toString() {
        System.out.println("This rectangle's area is " + area() + "\nIts perimeter is " + perimeter());
        return " ";
    }
}
