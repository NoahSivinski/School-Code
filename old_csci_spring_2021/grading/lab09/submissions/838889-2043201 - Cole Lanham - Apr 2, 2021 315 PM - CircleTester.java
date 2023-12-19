/*
 * CircleTester.java
 * Author:  Cole Lanham
 * Submission Date:  4/2/2021
 *
 * Purpose: This program is an example of the process which goes into
 * creating classes, creating methods, and the testing process for 
 * said classes and methods. Pre-formatted classes were provided
 * for us to test our understanding with. This program creates
 * objects of class Circle, sets values to them, gets those values,
 * produces an output, and provides extra comparisons between the objects.
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

//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
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
		System.out.println("circle1="+circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter: "+circle1.diameter());
		System.out.println("circle1 area:"+ circle1.area());
		System.out.println("circle1 perimeter: "+circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter: "+circle2.diameter());
		System.out.println("circle2 area: "+circle2.area());
		System.out.println("circle2 perimeter: "+circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("Is circle 1 a unit circle?:" + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("Is circle 2 a unit circle?:" + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//Creating Objects bigCircle, smallCircle, and unitCircle:
		Circle bigCircle = new Circle();
		Circle smallCircle = new Circle();
		Circle unitCircle = new Circle();

		//Creating bigCircle
		bigCircle.setName("Big Circle");
		bigCircle.setX(10);
		bigCircle.setY(0);
		bigCircle.setRadius(10);
		
		//Creating smallCircle
		smallCircle.setName("Small Circle");
		smallCircle.setX(-5);
		smallCircle.setY(0);
		smallCircle.setRadius(5);
		
		//Creating unitCircle
		unitCircle.setName("Unit Circle");
		unitCircle.setX(0);
		unitCircle.setY(0);
		unitCircle.setRadius(1);
		
		//Outputs for testing:
		//bigCircle:
		System.out.println("\n"
				+ "***********************"
				+ "\n");
		System.out.println("Big Circle: " + bigCircle);
		System.out.println("diameter: " + bigCircle.diameter());
		System.out.println("area: " + bigCircle.area());
		System.out.println("perimeter: " + bigCircle.perimeter());
		System.out.println("unit circle: " + bigCircle.isUnitCircle());
		
		//smallCircle:
		System.out.println("\n"
				+ "***********************"
				+ "\n");
		System.out.println("Small Circle: " + smallCircle);
		System.out.println("diameter: " + smallCircle.diameter());
		System.out.println("area: " + smallCircle.area());
		System.out.println("perimeter: " + smallCircle.perimeter());
		System.out.println("unit circle: " + smallCircle.isUnitCircle());
		
		//unitCircle:
		System.out.println("\n"
				+ "***********************"
				+ "\n");
		System.out.println("Unit Circle: " + unitCircle);
		System.out.println("diameter: " + unitCircle.diameter());
		System.out.println("area: " + unitCircle.area());
		System.out.println("perimeter: " + unitCircle.perimeter());
		System.out.println("unit circle: " + unitCircle.isUnitCircle());
		
		
		//Comparisons between objects utilizing self-made methods as designated in lab:
		//bigCircle to smallCircle methods check:
		System.out.println("\n"
				+ "***********************"
				+ "\n");
		System.out.println("Circles of comparison test: bigCircle to smallCircle");
		System.out.println(".equals check: " + bigCircle.equals(smallCircle));
		System.out.println(".distance check: " + bigCircle.distance(smallCircle));
		System.out.println(".isSmaller check: " + bigCircle.isSmaller(smallCircle));
		System.out.println(".compareTo check: " + bigCircle.compareTo(smallCircle));
		System.out.println(".intersects check: " + bigCircle.intersects(smallCircle));
		
		//bigCircle to unitCircle methods check:
		System.out.println("\n"
				+ "***********************"
				+ "\n");
		System.out.println("Circles of comparison test: bigCircle to unitCircle");
		System.out.println(".equals check: " + bigCircle.equals(unitCircle));
		System.out.println(".distance check: " + bigCircle.distance(unitCircle));
		System.out.println(".isSmaller check: " + bigCircle.isSmaller(unitCircle));
		System.out.println(".compareTo check: " + bigCircle.compareTo(unitCircle));
		System.out.println(".intersects check: " + bigCircle.intersects(unitCircle));
		
		//smallCircle to unitCircle methods check:
		System.out.println("\n"
				+ "***********************"
				+ "\n");
		System.out.println("Circles of comparison test: smallCircle to unitCircle");
		System.out.println(".equals check: " + smallCircle.equals(unitCircle));
		System.out.println(".distance check: " + smallCircle.distance(unitCircle));
		System.out.println(".isSmaller check: " + smallCircle.isSmaller(unitCircle));
		System.out.println(".compareTo check: " + smallCircle.compareTo(unitCircle));
		System.out.println(".intersects check: " + smallCircle.intersects(unitCircle));
		
		//smallCircle to bigCircle methods check:
		System.out.println("\n"
				+ "***********************"
				+ "\n");
		System.out.println("Circles of comparison test: smallCircle to bigCircle");
		System.out.println(".equals check: " + smallCircle.equals(bigCircle));
		System.out.println(".distance check: " + smallCircle.distance(bigCircle));
		System.out.println(".isSmaller check: " + smallCircle.isSmaller(bigCircle));
		System.out.println(".compareTo check: " + smallCircle.compareTo(bigCircle));
		System.out.println(".intersects check: " + smallCircle.intersects(bigCircle));
		
		
		
		
		
		
		
		
				
	}
	
}