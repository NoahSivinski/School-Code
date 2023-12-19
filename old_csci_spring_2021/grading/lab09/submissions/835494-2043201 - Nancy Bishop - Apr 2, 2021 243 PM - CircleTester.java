//*******************************************************
// CircleTester.java
//
//
// test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester {
    public static final double THRESHOLD = 0.000000001;

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.setName("Circle 1");
        circle1.setX(0.0);
        circle1.setY(0.0);
        circle1.setRadius(2);
        circle2.setName("Circle 2");
        circle2.setX(2.0);
        circle2.setY(1.0);
        circle2.setRadius(1);
        System.out.println("circle1=" + circle1);
        System.out.println("circle2=" + circle2);

        circle1.setRadius(-2.0);
        if(circle1.getRadius() < THRESHOLD)
            System.out.println("PASSED: Set Radius");
        else
            System.out.println("FAILED: Set Radius");

        circle1.setX(-3.0);
        circle1.setY(4.0);
        System.out.println("circle1=" + circle1);

        circle2.setRadius(5.3);
        System.out.println("circle2=" + circle2);

        // print circle1 diameter, area and perimeter
        System.out.println("diameter: "+ circle1.diameter() + " , " + "area: " + circle1.area() + " , " + "perimeter: " + circle1.perimeter());

        // print circle2 diameter, area and perimeter
        System.out.println("diameter: "+ circle2.diameter() + " , " + "area: " + circle2.area() + " , " + "perimeter: " + circle2.perimeter());

        // display whether circle1 is a unit circle
        System.out.println("Circle 1 is "+ circle1.isUnitCircle());

        // display whether circle2 is a unit circle
        System.out.println("Circle 1 is "+ circle1.isUnitCircle());
    }
}
