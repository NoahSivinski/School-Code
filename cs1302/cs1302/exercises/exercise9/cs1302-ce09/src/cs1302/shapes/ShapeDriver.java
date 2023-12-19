package cs1302.shapes;

/**
 * Driver for Shape.
 */
public class ShapeDriver {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Ellipse(1.1, 2.5),
            new Circle(1.5),
            new Ellipse(2.4, 1.5),
            new Circle(8.5),
            new Rectangle(2.3, 4.5),
            new Rectangle(1.2, 8.8),
            new Square(2.5),
            new Square(6.7)
        };
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getName());
            System.out.println(shapes[i].getArea());
            System.out.println(shapes[i].getPerimeter());
        } //for
    } //main
} //ShapeDriver
