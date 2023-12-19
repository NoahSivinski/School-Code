/*
 * CircleTester.java
 * Author:  Nnamdi Obichi
 * Submission Date: October 29th, 2021
 *
 * Purpose: 
 * 
 * Tests the methods in circle.java to 
 * see if they work as intended.
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
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
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
		
		System.out.println("circle1="+circle1);
		
		// set the circle2 radius to 5.3
		
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		
		System.out.println("circle1=");
		System.out.println("diameter: " + circle1.diameter() + "\n" + "area: " + circle1.area() +
													"\n" + "perimeter: " + circle1.perimeter()); 
		
		
		// print circle2 diameter, area and perimeter
		
		System.out.println("circle2=");
		System.out.println("diameter: " + circle2.diameter() + "\n" + "area: " + circle2.area() +
													"\n" + "perimeter: " + circle2.perimeter()); 

		
		// display whether circle1 is a unit circle
		
		System.out.println("Circle 1 is a unit circle: " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		
		System.out.println("Circle 2 is a unit circle: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//-------------------------------------
		// Unit TEST Series #1:
		//-------------------------------------
		
		circle1.setName("shape1");
		circle1.setX(0.9);
		circle1.setY(0.25);
		circle1.setRadius(1.57);

		circle2.setName("shape2");
		circle2.setX(0.535);
		circle2.setY(0.467);
		circle2.setRadius(1);
		
		// setName Test 
		if(circle1.getName().equals("shape1"))
			System.out.println("PASSED: Set Name");
		else
			System.out.println("FAILED: Set Name");
		
		// setX Test
		if(Math.abs(0.9-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: Set x");
		else
			System.out.println("FAILED: Set x");
		
		// setY Test
		if(Math.abs(0.467-circle2.getY()) < THRESHOLD)
			System.out.println("PASSED: Set y");
		else
			System.out.println("FAILED: Set y");
		
		// setRadius Test
		if(Math.abs(1.57-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		// area Test
		if(Math.abs((Math.PI * (1.57*1.57))-circle1.area()) < THRESHOLD)
			System.out.println("PASSED: area");
		else
			System.out.println("FAILED: area");
		
		// perimeter Test
		if(Math.abs((2 * Math.PI * 1)-circle2.perimeter()) < THRESHOLD)
			System.out.println("PASSED: perimeter");
		else
			System.out.println("FAILED: perimeter");
		
		// diameter Test
		if(Math.abs((1.57 * 2)-circle1.diameter()) < THRESHOLD)
			System.out.println("PASSED: diameter");
		else
			System.out.println("FAILED: diameter");
		
		// isUnitCircle Test
		if(circle1.isUnitCircle() == false)
			System.out.println("PASSED: isUnitCircle");
		else
			System.out.println("FAILED: isUnitCircle");
		
		// toString Test		
		if(circle1.toString().equals("name: shape1\ncenter: (0.9,0.25)\nradius: 1.57"))
			System.out.println("PASSED: toString");
		else
			System.out.println("FAILED: toString");
		
		// equals Test
		if(circle1.equals(circle2) == false)
			System.out.println("PASSED: equals");
		else
			System.out.println("FAILED: equals");
		
		// distance Test
		if(Math.abs(0.42463396001 - circle2.distance(circle1)) < THRESHOLD)
			System.out.println("PASSED: distance");
		else
			System.out.println("FAILED: distance");
		
		// isSmaller Test
		if(circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller");
		else
			System.out.println("FAILED: isSmaller");
		
		// compareTo Test
		if(circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: compareTo");
		else
			System.out.println("FAILED: compareTo");
		
		// intersects Test
		if(circle1.distance(circle2) < 2.57 == circle1.intersects(circle2))
			System.out.println("PASSED: intersects");
		else
			System.out.println("FAILED: intersects");
		
		
		//-------------------------------------
		// Unit TEST Series #2:
		//-------------------------------------
				
		circle1.setName("Perfect Ellipse1");
		circle1.setX(0);
		circle1.setY(0);
		circle1.setRadius(1);

		circle2.setName("Perfect Ellipse2");
		circle2.setX(0);
		circle2.setY(0);
		circle2.setRadius(1);
		
		// setName Test 
		if(circle2.getName().equals("Perfect Ellipse2"))
			System.out.println("PASSED: Set Name");
		else
			System.out.println("FAILED: Set Name");
		
		// setX Test
		if(Math.abs(0-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: Set x");
		else
			System.out.println("FAILED: Set x");
		
		// setY Test
		if(Math.abs(0-circle2.getY()) < THRESHOLD)
			System.out.println("PASSED: Set y");
		else
			System.out.println("FAILED: Set y");
		
		// setRadius Test
		if(Math.abs(1-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		// area Test
		if(Math.abs((Math.PI * 1*1)-circle1.area()) < THRESHOLD)
			System.out.println("PASSED: area");
		else
			System.out.println("FAILED: area");
		
		// perimeter Test
		if(Math.abs((2 * Math.PI * 1)-circle2.perimeter()) < THRESHOLD)
			System.out.println("PASSED: perimeter");
		else
			System.out.println("FAILED: perimeter");
		
		// diameter Test
		if(Math.abs((1 * 2)-circle1.diameter()) < THRESHOLD)
			System.out.println("PASSED: diameter");
		else
			System.out.println("FAILED: diameter");
		
		// isUnitCircle Test
		if(circle1.isUnitCircle() == true)
			System.out.println("PASSED: isUnitCircle");
		else
			System.out.println("FAILED: isUnitCircle");
		
		// toString Test		
		if(circle1.toString().equals("name: Perfect Ellipse1\ncenter: (0.0,0.0)\nradius: 1.0"))
			System.out.println("PASSED: toString");
		else
			System.out.println("FAILED: toString");
		
		// equals Test
		if(circle1.equals(circle2) == true)
			System.out.println("PASSED: equals");
		else
			System.out.println("FAILED: equals");
		
		// distance Test
		if(Math.abs(0-circle2.distance(circle1)) < THRESHOLD)
			System.out.println("PASSED: distance");
		else
			System.out.println("FAILED: distance");
		
		// isSmaller Test
		if(circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller");
		else
			System.out.println("FAILED: isSmaller");
		
		// compareTo Test
		if(circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: compareTo");
		else
			System.out.println("FAILED: compareTo");
		
		// intersects Test
		if(circle1.distance(circle2) < 2 == circle1.intersects(circle2))
			System.out.println("PASSED: intersects");
		else
			System.out.println("FAILED: intersects");
		
		//-------------------------------------
		// Unit TEST Series #3:
		//-------------------------------------
		
		circle1.setName("spiral1");
		circle1.setX(0.5);
		circle1.setY(7.4);
		circle1.setRadius(9.5);

		circle2.setName("spiral2");
		circle2.setX(4.2);
		circle2.setY(6.5);
		circle2.setRadius(5);
		
		// setName Test 
		if(circle2.getName().equals("spiral2"))
			System.out.println("PASSED: Set Name");
		else
			System.out.println("FAILED: Set Name");
		
		// setX Test
		if(Math.abs(0.5-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: Set x");
		else
			System.out.println("FAILED: Set x");
		
		// setY Test
		if(Math.abs(6.5-circle2.getY()) < THRESHOLD)
			System.out.println("PASSED: Set y");
		else
			System.out.println("FAILED: Set y");
		
		// setRadius Test
		if(Math.abs(9.5-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		// area Test
		if(Math.abs((Math.PI * (9.5*9.5))-circle1.area()) < THRESHOLD)
			System.out.println("PASSED: area");
		else
			System.out.println("FAILED: area");
		
		// perimeter Test
		if(Math.abs((2 * Math.PI * 5)-circle2.perimeter()) < THRESHOLD)
			System.out.println("PASSED: perimeter");
		else
			System.out.println("FAILED: perimeter");
		
		// diameter Test
		if(Math.abs((9.5 * 2)-circle1.diameter()) < THRESHOLD)
			System.out.println("PASSED: diameter");
		else
			System.out.println("FAILED: diameter");
		
		// isUnitCircle Test
		if(circle1.isUnitCircle() == false)
			System.out.println("PASSED: isUnitCircle");
		else
			System.out.println("FAILED: isUnitCircle");
		
		// toString Test		
		if(circle2.toString().equals("name: spiral2\ncenter: (4.2,6.5)\nradius: 5.0"))
			System.out.println("PASSED: toString");
		else
			System.out.println("FAILED: toString");
		
		// equals Test
		if(circle1.equals(circle2) == false)
			System.out.println("PASSED: equals");
		else
			System.out.println("FAILED: equals");
		
		// distance Test
		if(Math.abs(3.807886552931-circle2.distance(circle1)) < THRESHOLD)
			System.out.println("PASSED: distance");
		else
			System.out.println("FAILED: distance");
		
		// isSmaller Test
		if(circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller");
		else
			System.out.println("FAILED: isSmaller");
		
		// compareTo Test
		if(circle2.compareTo(circle1) == -1)
			System.out.println("PASSED: compareTo");
		else
			System.out.println("FAILED: compareTo");
		
		// intersects Test
		if(circle1.distance(circle2) < 14.5 == circle1.intersects(circle2))
			System.out.println("PASSED: intersects");
		else
			System.out.println("FAILED: intersects");
	}
	
}