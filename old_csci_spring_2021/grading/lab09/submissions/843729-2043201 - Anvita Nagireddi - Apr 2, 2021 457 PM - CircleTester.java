/**
 * CircleTester.java
 * Author:  Anvita Nagireddi 
 * Submission Date:  Apr-2-2021
 * File name: CircleTester.java
 *
 * This program does the following: to test the methods of Circle.java
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
public class CircleTester{
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
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
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
		System.out.println(circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1 Diameter: " + circle1.diameter());
		System.out.println("Circle 1 Area: " + circle1.area());
		System.out.println("Circle 1 Perimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2 Diameter: " + circle2.diameter());
		System.out.println("Circle 2 Area: " + circle2.area());
		System.out.println("Circle 2 Perimeter: " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Is Circle 1 a unit circle? " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Is Circle 2 a unit circle? " + circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println("\n");
		//Method 1
		//Test Case 1
		System.out.println("Does Circle 1 equal Circle 2? ");
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(1);
		circle2.setX(5);
		circle2.setY(5);
		circle2.setRadius(5);
		System.out.println(circle1);
		System.out.println(circle2);
		if(circle1.equals(circle2)) {
			System.out.println("Failed : Circle 1 does not equal Circle 2");
		}
		else {
			System.out.println("Passed : Circle 1 does not equal Circle 2");
		}
		//Test Case 2
		System.out.println("Does Circle 1 equal Circle 2? ");
		circle2.setX(circle1.getX());
		circle2.setY(circle1.getY());
		circle2.setRadius(circle1.getRadius());
		System.out.println(circle1);
		System.out.println(circle2);
		if(circle1.equals(circle2)) {
			System.out.println("Passed : Circle 1 does equal Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 does equal Circle 2");
		}
		//Test Case 3
		System.out.println("Does Circle 1 equal Circle 2? ");
		circle2.setRadius(5);
		System.out.println(circle1);
		System.out.println(circle2);
		if(circle1.equals(circle2)) {
			System.out.println("Failed : Circle 1 does not equal Circle 2");
		}
		else {
			System.out.println("Passed : Circle 1 does not equal Circle 2");
		}
		System.out.println("\n");
		//Method 2
		//Test Case 1
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(1);
		circle2.setX(5);
		circle2.setY(5);
		circle2.setRadius(5);
		System.out.println("Distance between Circle 1 and Circle 2: ");
		double distance = Math.sqrt(Math.pow(circle1.getX()-circle2.getX(),2) + Math.pow(circle1.getY()-circle2.getY(),2));
		double difference = (circle1.distance(circle2))- distance ;
		System.out.println(circle1);
		System.out.println(circle2);
		if (difference == 0) {
			System.out.println("Passed : Distance is correct");
		}
		else {
			System.out.println("Failed : Distance is incorrect");
		}
		//Test Case 2
		circle2.setX(circle1.getX());
		circle2.setY(circle1.getY());
		circle2.setRadius(circle1.getRadius());
		System.out.println("Distance between Circle 1 and Circle 2: ");
		distance = Math.sqrt(Math.pow(circle1.getX()-circle2.getX(),2) + Math.pow(circle1.getY()-circle2.getY(),2));
		difference = (circle1.distance(circle2))- distance ;
		System.out.println(circle1);
		System.out.println(circle2);
		if (difference == 0) {
			System.out.println("Passed : Distance is correct");
		}
		else {
			System.out.println("Failed : Distance is incorrect");
		}
		//Test Case 3
		circle2.setRadius(circle1.getRadius() + 1);
		System.out.println("Distance between Circle 1 and Circle 2: ");
		distance = Math.sqrt(Math.pow(circle1.getX()-circle2.getX(),2) + Math.pow(circle1.getY()-circle2.getY(),2));
		difference = (circle1.distance(circle2))- distance ;
		System.out.println(circle1);
		System.out.println(circle2);
		if (difference == 0) {
			System.out.println("Passed : Distance is correct");
		}
		else {
			System.out.println("Failed : Distance is incorrect");
		}
		//Test Case 4
		circle2.setX(circle1.getX() - 1);
		circle2.setY(circle1.getY() + 1);
		System.out.println("Distance between Circle 1 and Circle 2: ");
		distance = Math.sqrt(Math.pow(circle1.getX()-circle2.getX(),2) + Math.pow(circle1.getY()-circle2.getY(),2));
		difference = (circle1.distance(circle2))- distance ;
		System.out.println(circle1);
		System.out.println(circle2);
		if (difference == 0) {
			System.out.println("Passed : Distance is correct");
		}
		else {
			System.out.println("Failed : Distance is incorrect");
		}
		System.out.println("\n");
		//Method 3
		//Test Case 1
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(1);
		circle2.setX(5);
		circle2.setY(5);
		circle2.setRadius(5);
		System.out.println("Is Circle 1 smaller than Circle 2? ");
		boolean response = circle1.isSmaller(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(response == true) {
			System.out.println("Passed : Circle 1 is smaller than Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 is smaller than Circle 2");
		}
		//Test Case 2
		circle2.setX(circle1.getX());
		circle2.setY(circle1.getY());
		circle2.setRadius(circle1.getRadius());
		System.out.println("Is Circle 1 smaller than Circle 2? ");
		response = circle1.isSmaller(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(response == false) {
			System.out.println("Passed : Circle 1 is not smaller than Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 is not smaller than Circle 2");
		}
		//Test Case 3
		circle2.setRadius(2);
		System.out.println("Is Circle 1 smaller than Circle 2? ");
		response = circle1.isSmaller(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(response == true) {
			System.out.println("Passed : Circle 1 is smaller than Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 is smaller than Circle 2");
		}
		//Test Case 4
		circle2.setRadius(0);
		System.out.println("Is Circle 1 smaller than Circle 2? ");
		response = circle1.isSmaller(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(response == false) {
			System.out.println("Passed : Circle 1 is not smaller than Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 is not smaller than Circle 2");
		}
		System.out.println("\n");
		//Method 4
		//Test Case 1
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(1);
		circle2.setX(5);
		circle2.setY(5);
		circle2.setRadius(5);
		System.out.println("How does Circle 1 compare to Circle 2? ");
		double compared = circle1.compareTo(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(compared < 0) {
			System.out.println("Passed : Circle 1 is smaller than Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 is smaller than Circle 2");
		}
		//Test Case 2
		circle2.setX(circle1.getX());
		circle2.setY(circle1.getY());
		circle2.setRadius(circle1.getRadius());
		System.out.println("How does Circle 1 compare to Circle 2? ");
		compared = circle1.compareTo(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(compared == 0) {
			System.out.println("Passed : Circle 1 is equal to than Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 is equal to Circle 2");
		}
		//Test Case 3
		circle2.setRadius(2);
		System.out.println("How does Circle 1 compare to Circle 2? ");
		compared = circle1.compareTo(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(compared < 0) {
			System.out.println("Passed : Circle 1 is smaller than Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 is smaller than Circle 2");
		}
		//Test Case 4
		circle2.setRadius(0);
		System.out.println("How does Circle 1 compare to Circle 2? ");
		compared = circle1.compareTo(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(compared > 0) {
			System.out.println("Passed : Circle 1 is bigger than Circle 2");
		}
		else {
			System.out.println("Failed : Circle 1 is bigger than Circle 2");
		}
		System.out.println("\n");
		//Method 5
		//Test Case 1
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(1);
		circle2.setX(5);
		circle2.setY(5);
		circle2.setRadius(1);
		System.out.println("Do Circle 1 and Circle 2 intersect? ");
		boolean intersecting = circle1.intersects(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(intersecting == false) {
			System.out.println("Passed : Circle 1 and Circle 2 do not intersect");
		}
		else {
			System.out.println("Failed : Circle 1 and Circle 2 do not intersect");
		}
		//Test Case 2
		circle2.setX(circle1.getX());
		circle2.setY(circle1.getY());
		circle2.setRadius(circle1.getRadius());
		System.out.println("Do Circle 1 and Circle 2 intersect? ");
		intersecting = circle1.intersects(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(intersecting == true) {
			System.out.println("Passed : Circle 1 and Circle 2 do intersect");
		}
		else {
			System.out.println("Failed : Circle 1 and Circle 2 do intersect");
		}
		//Test Case 3
		circle2.setX(circle1.getX() + circle2.diameter());
		circle2.setY(circle1.getY() + circle2.diameter());
		System.out.println("Do Circle 1 and Circle 2 intersect? ");
		intersecting = circle1.intersects(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(intersecting == false) {
			System.out.println("Passed : Circle 1 and Circle 2 do not intersect");
		}
		else {
			System.out.println("Failed : Circle 1 and Circle 2 do not intersect");
		}
		//Test Case 4
		circle2.setRadius(8);
		System.out.println("Do Circle 1 and Circle 2 intersect? ");
		intersecting = circle1.intersects(circle2);
		System.out.println(circle1);
		System.out.println(circle2);
		if(intersecting == true) {
			System.out.println("Passed : Circle 1 and Circle 2 do intersect");
		}
		else {
			System.out.println("Failed : Circle 1 and Circle 2 do intersect");
		}
	}
	
}