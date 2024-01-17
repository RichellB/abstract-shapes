public class Circle extends Shape {

    // Class variables
    double radius;

    // Parameterized constructor method
    public Circle(double radiusValue) {
        this.radius = radiusValue;
    }

    // Implementation of abstract area method
    double area() {
        double area = 3.14 * (radius * radius);
        return area;
    }

    // Implementation of abstract perimeter method
    double perimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    // toString method to display area and perimeter
    public String toString() {
        System.out.println("This circle's area is " + area() + "\nIts perimeter is " + perimeter());
        return " ";
    }

}
