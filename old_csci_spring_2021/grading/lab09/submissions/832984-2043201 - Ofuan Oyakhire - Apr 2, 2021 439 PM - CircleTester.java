/*
 * CircleTester.java
 * Author: Ofuan Oyakhire
 * Submission Date: 04/02/21
 *
 * Purpose: test the function of a cirlce
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.
 */

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

        // If the method setRadius is implemented correctly,
        // a call to setRadius with a negative number
        // will not change the value of the circle's radius.
        //
        circle1.setRadius(-2.0);

        //This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
        //Notice how the double comparison is done
        if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
            System.out.println("PASSED: Set Radius");
        else
            System.out.println("FAILED: Set Radius");

        //
        // Reset the center of circle1 (-3.0,4.0)
        //
        circle1.setX(-3.0);
        circle1.setY(4.0);


        // print circle1 characteristics (center and radius), use a statement similar
        // to the previous println statements. Note that is not necessary to call
        //the method toString, why?
        System.out.println("circle1=" + circle1);

        // set the circle2 radius to 5.3
        circle2.setRadius(5.3);

        // print circle2 characteristics (center and radius), use a statement similar to the first and
        // second println statements
        System.out.println("circle2=" + circle2);


        // print circle1 diameter, area and perimeter
        System.out.println("diameter: " + circle1.diameter());
        System.out.println("area: " + circle1.area());
        System.out.println("perimeter: " + circle1.perimeter());

        // print circle2 diameter, area and perimeter
        System.out.println("diameter: " + circle2.diameter());
        System.out.println("area: " + circle2.area());
        System.out.println("perimeter: " + circle2.perimeter());

        // display whether circle1 is a unit circle
        System.out.println("Is circle1 a unit circle? " + circle1.isUnitCircle());

        // display whether circle2 is a unit circle
        System.out.println("Is circle2 a unit circle? " + circle2.isUnitCircle());

        // your additional tests should be placed below here.  Make sure to include at least 2-3 test cases
        // for each method you write.  It is best to write proper unit tests which print pass, fail for each
        // test instead of just dumping values to the screen.

        /*
        TEST: equals
         */

        System.out.println("----------------------");

        circle1.setX(1);
        circle1.setY(2);
        circle2.setX(3);
        circle2.setY(4);
        circle1.setRadius(2);
        circle2.setRadius(2);

        // TEST: the circles are not equal because the centers are different
        if (circle1.equals(circle2) == false) {
            System.out.println("Test 1 - equals:\tpassed");
        } else {
            System.out.println("Test 1 - equals:\tfailed");
        }
        System.out.println("----------------------");

        circle1.setX(1);
        circle1.setY(1);
        circle2.setX(1);
        circle2.setY(1);
        circle1.setRadius(2);
        circle2.setRadius(1);

        // TEST: the circles are not equal because the radius are different
        if (circle1.equals(circle2) == false) {
            System.out.println("Test 2 - equals:\tpassed");
        } else {
            System.out.println("Test 2 - equals:\tfailed");
        }
        System.out.println("----------------------");

        circle1.setX(2);
        circle1.setY(2);
        circle2.setX(2);
        circle2.setY(2);
        circle1.setRadius(1);
        circle2.setRadius(1);

        // TEST: the circles are equal because the center and radius are equal
        if (circle1.equals(circle2) == true) {
            System.out.println("Test 3 - equals:\tpassed");
        } else {
            System.out.println("Test 3 - equals:\tfailed");
        }

        System.out.println("----------------------");

        /*
        TEST: distance NOTE: for this test, the result are rounded to the second decimal point
         */

        double distance;

        circle1.setX(4);
        circle1.setY(2);
        circle2.setX(3);
        circle2.setY(3);

        distance = Math.round(circle1.distance(circle2) * 100.0) / 100.0;

        // TEST: the distance should be 1.41
        if (new Double(distance).equals(1.41)) {
            System.out.println("Test 1 - distance:\tpassed");
        } else {
            System.out.println("Test 1 - distance:\tfailed");
        }

        System.out.println("----------------------");

        circle1.setX(6);
        circle1.setY(2);
        circle2.setX(2);
        circle2.setY(15);

        distance = Math.round(circle1.distance(circle2) * 100.0) / 100.0;

        // TEST: the distance should be 13.60
        if (new Double(distance).equals(13.60)) {
            System.out.println("Test 2 - distance:\tpassed");
        } else {
            System.out.println("Test 2 - distance:\tfailed");
        }

        System.out.println("----------------------");

        circle1.setX(9);
        circle1.setY(33);
        circle2.setX(10);
        circle2.setY(22);

        distance = Math.round(circle1.distance(circle2) * 100.0) / 100.0;

        // TEST: the distance should be 11.05
        if (new Double(distance).equals(11.05)) {
            System.out.println("Test 3 - distance:\tpassed");
        } else {
            System.out.println("Test 3 - distance:\tfailed");
        }

        System.out.println("----------------------");

        /*
        TEST: isSmaller
         */

        circle1.setRadius(1);
        circle2.setRadius(1);

        // TEST: the diameter are the same therefore circle1 is not smaller than circle2
        if (circle1.isSmaller(circle2) == false) {
            System.out.println("Test 1 - isSmaller:\tpassed");
        } else {
            System.out.println("Test 1 - isSmaller:\tfailed");
        }

        System.out.println("----------------------");

        circle1.setRadius(1);
        circle2.setRadius(2);

        // TEST: the diameter of circle1 is smaller than the diameter of circle 2
        if (circle1.isSmaller(circle2) == true) {
            System.out.println("Test 2 - isSmaller:\tpassed");
        } else {
            System.out.println("Test 2 - isSmaller:\tfailed");
        }

        System.out.println("----------------------");

        circle1.setRadius(11);
        circle2.setRadius(10);

        // TEST: the diameter of circle1 is larger than the diameter of circle2
        if (circle1.isSmaller(circle2) == false) {
            System.out.println("Test 3 - isSmaller:\tpassed");
        } else {
            System.out.println("Test 3 - isSmaller:\tfailed");
        }

        System.out.println("----------------------");

        /*
        TEST: compareTo
         */

        circle1.setRadius(3);
        circle2.setRadius(3);

        // TEST: the diameter are equal so the result should be 0
        if (circle1.compareTo(circle2) == 0) {
            System.out.println("Test 1 - compareTo:\tpassed");
        } else {
            System.out.println("Test 1 - compareTo:\tfailed");
        }

        System.out.println("----------------------");

        circle1.setRadius(4);
        circle2.setRadius(3);

        // TEST: circle 1 has a greater diameter so the result should be 1
        if (circle1.compareTo(circle2) == 1) {
            System.out.println("Test 2 - compareTo:\tpassed");
        } else {
            System.out.println("Test 2 - compareTo:\tfailed");
        }

        System.out.println("----------------------");

        circle1.setRadius(3);
        circle2.setRadius(4);

        // TEST: circle 1 has a smaller diameter so the result should be -1
        if (circle1.compareTo(circle2) == -1) {
            System.out.println("Test 3 - compareTo:\tpassed");
        } else {
            System.out.println("Test 3 - compareTo:\tfailed");
        }

        System.out.println("----------------------");


        /*
        TEST: intersects
         */

        circle1.setX(2);
        circle1.setY(2);
        circle2.setX(2);
        circle2.setY(2);
        circle1.setRadius(1);
        circle2.setRadius(1);

        // TEST: the circles has multiple points that intersects
        if (circle1.intersects(circle2) == true) {
            System.out.println("Test 1 - intersects:\tpassed");
        } else {
            System.out.println("Test 1 - intersect:\tfailed");
        }

        System.out.println("----------------------");

        circle1.setX(30);
        circle1.setY(3);
        circle2.setX(0);
        circle2.setY(0);
        circle1.setRadius(1);
        circle2.setRadius(1);

        // TEST: the circles has no points that intersects
        if (circle1.intersects(circle2) == false) {
            System.out.println("Test 2 - intersects:\tpassed");
        } else {
            System.out.println("Test 2 - intersect:\tfailed");
        }

        System.out.println("----------------------");

        circle1.setX(5);
        circle1.setY(4);
        circle2.setX(2);
        circle2.setY(3);
        circle1.setRadius(2);
        circle2.setRadius(2);

        // TEST: the circles has multiple points that intersects
        if (circle1.intersects(circle2) == true) {
            System.out.println("Test 3 - intersects:\tpassed");
        } else {
            System.out.println("Test 3 - intersect:\tfailed");
        }

        System.out.println("----------------------");

    }


}
