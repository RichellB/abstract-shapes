public class ShapeArray {
    public static void main(String[] args) {

        // Creating instances of Rectangle, Circle and Triangle classes
        Rectangle rectangle = new Rectangle(25.9, 10.2);
        Circle oval = new Circle(44.7);
        Triangle equalateral = new Triangle(15, 25.5, 35, 13);

        // Storing instances in Shape array
        Shape[] shapeArray = {rectangle, oval, equalateral};
        
        // Printing out each instance
        for ( int i = 0; i < shapeArray.length; i++) {
            System.out.println(shapeArray[i].toString());
        }
        
    }
}