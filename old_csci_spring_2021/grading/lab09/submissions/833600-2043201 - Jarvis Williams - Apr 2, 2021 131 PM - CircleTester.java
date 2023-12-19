/*
 * CircleTester.java
 * Author: Jarvis Williams
 * Submission Date:  4/2/2021
 *
 * Purpose: The purpose of this program is to call methods from other
 * classes in order to compare two different circle objects.
 * * Statement of Academic Honesty:
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
		
		Circle anotherCircle = new Circle ();
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
		System.out.println("\nCircle 1" +
				"\ndiameter: " + circle1.diameter() +
				"\narea: " + circle1.area() +
				"\nperimeter: " + circle1.perimeter());

		
		// print circle2 diameter, area and perimeter
		System.out.println("\nCircle 2" +
				"\ndiameter: " + circle2.diameter() +
				"\narea: " + circle2.area() +
				"\nperimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("\ncircle 1 is unit circle: " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("circle 2 is unit circle: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//equals Method
		//Test case 1: Center of Circle 1 (-3,4) and Circle 2 (2,1) plus radius of Circle 1 (2) and Circle 2 (5.3) are not equal
		
		circle1.setX(-3);
		circle1.setY(4);
		circle1.setRadius(2);
		circle2.setX(2);
		circle2.setY(1);
		circle2.setRadius(5.3);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("\nThe Circles are equal (True/False): " + circle1.equals(anotherCircle));
		
		//Test case 2: Center of Circle 1 (-3,4) and center of Circle 2 (-3,4) are equal but radius of Circle 1 (2) and Circle 2 (5.3) are not equal
		
		circle1.setX(-3);
		circle1.setY(4);
		circle1.setRadius(2);
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(5.3);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("The Circles are equal (True/False): " + circle1.equals(anotherCircle));
		
		//Test case 3: Center of Circle 1 (-3,4) and Circle 2 (-3,4) plus radius of Circle 1 () and Circle 2 () are equal
		
		circle1.setX(-3);
		circle1.setY(4);
		circle1.setRadius(2);
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(2.0);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("The Circles are equal (True/False): " + circle1.equals(anotherCircle));
		
		//distance Method
		//Test case 1: Distance from Circle 1 (-3,4) to Circle 2 (-3,4)
		
		circle1.setX(-3);
		circle1.setY(4);
		circle2.setX(-3);
		circle2.setY(4);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		
		//If the distance is 0, method passes. if else, method fails
		if (Math.abs(circle1.distance(anotherCircle) - 0) < THRESHOLD) {
			System.out.println("\nPASSED: The distance from Circle 1 to Circle 2 is " + circle1.distance(anotherCircle));
		} else {
			System.out.println("\nFAILED: The distance from Circle 1 to Circle 2 is " + circle1.distance(anotherCircle));
		}		
		//Test case 2: Distance from Circle 1 (0,0) to Circle 2 (-3,4)
		
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(-3);
		circle2.setY(4);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		
		//If the distance is 5, method passes. if else, method fails
		if (Math.abs(circle1.distance(anotherCircle) - 5) < THRESHOLD) {
			System.out.println("PASSED: The distance from Circle 1 to Circle 2 is " + circle1.distance(anotherCircle));
		} else {
			System.out.println("FAILED: The distance from Circle 1 to Circle 2 is " + circle1.distance(anotherCircle));
		}
		//Test case 3: Distance from Circle 1 (0,0) to Circle 2 (6,6)
		
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(6);
		circle2.setY(6);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		
		//If the distance is 0, method passes. if else, method fails
				if (Math.abs(circle1.distance(anotherCircle) - 8.48528137423857) < THRESHOLD) {
					System.out.println("PASSED: The distance from Circle 1 to Circle 2 is " + circle1.distance(anotherCircle));
				} else {
					System.out.println("FAILED: The distance from Circle 1 to Circle 2 is " + circle1.distance(anotherCircle));
				}
				
		//isSmaller method
		//Test case 1: The diameter of Circle 1 (8) and Circle 2 (8) are equal
		
		circle1.setRadius(4);
		circle2.setRadius(4);
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("\nCircle 1 is smaller than Circle 2 (True/False): " + circle1.isSmaller(anotherCircle));
		
		//Test case 2: The diameter of Circle 2 (1) is smaller than Circle 1 (4)
		
		circle1.setRadius(4);
		circle2.setRadius(1);
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("Circle 1 is smaller than Circle 2 (True/False): " + circle1.isSmaller(anotherCircle));
		
		//Test case 3: The diameter of Circle 1 (1) is smaller than Circle 2 (4)
		
		circle1.setRadius(1);
		circle2.setRadius(4);
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("Circle 1 is smaller than Circle 2 (True/False): " + circle1.isSmaller(anotherCircle));
		
		//compareTo Method
		//Test case 1: Circle 2 (8) is larger than Circle 1 (2)
		
		circle1.setRadius(1);
		circle2.setRadius(4);
		anotherCircle.setRadius(circle2.getRadius());

		System.out.println("\nCircle 1 is larger than Circle 2 (True/False): " + circle1.compareTo(anotherCircle));
		
		//Test case 2: Circle 1 (8) and Circle 2 (8) are equal
		
		circle1.setRadius(4);
		circle2.setRadius(4);
		anotherCircle.setRadius(circle2.getRadius());

		System.out.println("Circle 1 is larger than Circle 2 (True/False): " + circle1.compareTo(anotherCircle));
		
		//Test case 3: Circle 1 (8) is larger than Circle 2 (2) 
		
		circle1.setRadius(4);
		circle2.setRadius(1);
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("Circle 1 is larger than Circle 2 (True/False): " + circle1.compareTo(anotherCircle));

		//intersect Method
		//Test case 1: Circle 1 and Circle 2 do not intersect
		
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(-3);
		circle2.setY(4);
		circle1.setRadius(1);
		circle2.setRadius(1);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		anotherCircle.setRadius(circle2.getRadius());	
		
		System.out.println("\nCircle 1 and Circle 2 Intersect (True/False): " + circle1.intersects(anotherCircle));
		
		//Test case 2: Circle 1 and Circle 2 touch (Do not intersect)
		
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(-3);
		circle2.setY(4);
		circle1.setRadius(2.5);
		circle2.setRadius(2.5);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("Circle 1 and Circle 2 Intersect (True/False): " + circle1.intersects(anotherCircle));
		
		//Test case 3: Circle 1 and Circle 2 intersect
		
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(-3);
		circle2.setY(4);
		circle1.setRadius(5);
		circle2.setRadius(5);
		anotherCircle.setX(circle2.getX());
		anotherCircle.setY(circle2.getY());
		anotherCircle.setRadius(circle2.getRadius());
		
		System.out.println("Circle 1 and Circle 2 Intersect (True/False): " + circle1.intersects(anotherCircle));
	}
}