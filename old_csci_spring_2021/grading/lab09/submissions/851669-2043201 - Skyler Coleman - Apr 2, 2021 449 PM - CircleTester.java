/*
 * [CSCI 1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [04/02/2021]
 *
 * Purpose: A program thats tests the methods of class Circle.
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
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0) ;  
		
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
		
		System.out.println();
		System.out.println("circle1="+circle1);
		
		circle2.setRadius(5.3);
		
		System.out.println();
		System.out.println("circle2="+circle2);
		
		System.out.println();
		System.out.println( "Circle 1 diameter: " + circle1.diameter());
		System.out.println( "Circle 1 area: " +circle1.area());
		System.out.println( "Circle 1 perimeter: " + circle1.perimeter());
		System.out.println();
		System.out.println( "Circle 2 diameter: " + circle2.diameter());
		System.out.println( "Circle 2 area: " +circle2.area());
		System.out.println( "Circle 2 perimeter: " + circle2.perimeter());
		
		// print circle1 diameter, area and perimeter
		
		// print circle2 diameter, area and perimeter
		
		System.out.println();
		System.out.println( "Circle 1 is a unit circle: " + circle1.isUnitCircle());
		System.out.println( "Circle 2 is a unit circle: " + circle2.isUnitCircle());

		// display whether circle2 is a unit circle
		
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
				// for each method you write.  It is best to write proper unit tests which print pass, fail for each
				// test instead of just dumping values to the screen.
		
		
		System.out.println();
		System.out.println("Test 1");
		System.out.println();
		
		circle1.setName("Rat");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		circle2.setName("Dog");
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(1);
		
		if(circle1.getName().equals("Rat") && circle2.getName().equals("Dog"))
			System.out.println("PASSED: Set Name");
		else
			System.out.println("FAILED: Set Name");
		
		if(Math.abs(1 - circle1.getRadius()) < THRESHOLD && Math.abs(1 - circle2.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		if(Math.abs(0 - circle1.getX()) < THRESHOLD && Math.abs(0 - circle2.getX()) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");
		
		if(Math.abs(0 - circle1.getY()) < THRESHOLD && Math.abs(0 - circle2.getY()) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");
		
		if((Math.abs(Math.PI - circle1.area()) < THRESHOLD && (Math.abs(Math.PI - circle1.area())) < THRESHOLD))
			System.out.println("PASSED: Area");
		else
			System.out.println("FAILED: Area");
		
		if(Math.abs((2 * Math.PI) - circle1.perimeter()) < THRESHOLD && Math.abs((2 * Math.PI) - circle2.perimeter()) < THRESHOLD)
			System.out.println("PASSED: Perimeter");
		else
			System.out.println("FAILED: Perimeter");
		
		if(Math.abs(2 - circle1.diameter()) < THRESHOLD && Math.abs(2 - circle2.diameter()) < THRESHOLD)
			System.out.println("PASSED: Diameter");
		else
			System.out.println("FAILED: Diameter");
		
		if(circle1.isUnitCircle() == true && circle2.isUnitCircle() == true)
			System.out.println("PASSED: Is Unit Circle");
		else
			System.out.println("FAILED: Is Unit Circle");
		
		if(circle1.equals(circle2) == true && circle1.equals(circle1) == true)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		
		if(Math.abs(0 - circle1.distance(circle2)) < THRESHOLD && Math.abs(0 - circle2.distance(circle1)) < THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");
		
		if(circle1.isSmaller(circle2) == false && circle2.isSmaller(circle1) == false)
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");
		
		if(Math.abs(0 - circle1.compareTo(circle2)) < THRESHOLD &&  Math.abs(0 - circle1.compareTo(circle2)) < THRESHOLD)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		
		if(circle1.intersects(circle2) == true && circle2.intersects(circle1) == true)
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");
		
		if(circle1.toString().equals( "name: " + circle1.getName() + "\n" + "center: (" + circle1.getX() + "," + circle1.getY() 
		+ ")" + "\n" + "radius: " + circle1.getRadius()) && 
		circle2.toString().equals("name: " + circle2.getName() + "\n" + "center: (" + circle2.getX() + "," + circle2.getY() 
		+ ")" + "\n" + "radius: " + circle2.getRadius()))
		System.out.println("PASSED: To String");
	else
		System.out.println("FAILED: To String");
		
		System.out.println();
		System.out.println("Test 2");
		System.out.println();

		circle1.setName("there");
		circle1.setX(8.0);
		circle1.setY(1.0);
		circle1.setRadius(7);
		circle1.setRadius(-10);
		circle2.setName("Here");
		circle2.setX(9.0);
		circle2.setY(3.0);
		circle2.setRadius(6);
		circle2.setRadius(-3);
		
		if(circle1.getName().equals("there") && circle2.getName().equals("Here"))
			System.out.println("PASSED: Set Name");
		else
			System.out.println("FAILED: Set Name");
		
		if(Math.abs(7 - circle1.getRadius()) < THRESHOLD && Math.abs(6 - circle2.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		if(Math.abs(8 - circle1.getX()) < THRESHOLD && Math.abs(9 - circle2.getX()) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");
		
		if(Math.abs(1 - circle1.getY()) < THRESHOLD && Math.abs(3 - circle2.getY()) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");
		
		if((Math.abs((49 * Math.PI) - circle1.area())) < THRESHOLD && (Math.abs((36 *Math.PI) - circle2.area())) < THRESHOLD)
			System.out.println("PASSED: Area");
		else
			System.out.println("FAILED: Area");
		
		if(Math.abs((14 * Math.PI) - circle1.perimeter()) < THRESHOLD && Math.abs((12 * Math.PI) - circle2.perimeter()) < THRESHOLD)
			System.out.println("PASSED: Perimeter");
		else
			System.out.println("FAILED: Perimeter");
		
		if(Math.abs(14 - circle1.diameter()) < THRESHOLD && Math.abs(12 - circle2.diameter()) < THRESHOLD)
			System.out.println("PASSED: Diameter");
		else
			System.out.println("FAILED: Diameter");
		
		if(circle1.isUnitCircle() == false && circle2.isUnitCircle() == false)
			System.out.println("PASSED: Is Unit Circle");
		else
			System.out.println("FAILED: Is Unit Circle");
		
		if(circle1.equals(circle2) == false && circle2.equals(circle1) == false)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		
		if(Math.abs(Math.sqrt(5) - circle1.distance(circle2)) < THRESHOLD && Math.abs(Math.sqrt(5) - circle2.distance(circle1)) < THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");
		
		if(circle1.isSmaller(circle2) == false && circle2.isSmaller(circle1) == true)
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");
		
		if(Math.abs(1 - circle1.compareTo(circle2)) < THRESHOLD && Math.abs(-1 - circle2.compareTo(circle1)) < THRESHOLD)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		
		if(circle1.intersects(circle2) == true  && circle2.intersects(circle1) == true)
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");
		
		if(circle1.toString().equals( "name: " + circle1.getName() + "\n" + "center: (" + circle1.getX() + "," + circle1.getY() 
		+ ")" + "\n" + "radius: " + circle1.getRadius()) && 
		circle2.toString().equals("name: " + circle2.getName() + "\n" + "center: (" + circle2.getX() + "," + circle2.getY() 
		+ ")" + "\n" + "radius: " + circle2.getRadius()))
		System.out.println("PASSED: To String");
	else
		System.out.println("FAILED: To String");
	
		System.out.println();
		System.out.println("Test 3");
		System.out.println();

		circle1.setName("Hot");
		circle1.setX(-20.0);
		circle1.setY(-8.0);
		circle1.setRadius(9);
		circle1.setRadius(-1);
		circle2.setName("dog");
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(1);
		circle2.setRadius(-3);
		
		if(circle1.getName().equals("Hot") && circle2.getName().equals("dog"))
			System.out.println("PASSED: Set Name");
		else
			System.out.println("FAILED: Set Name");
		
		if(Math.abs(9 - circle1.getRadius()) < THRESHOLD && Math.abs(1 - circle2.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		if(Math.abs(-20 - circle1.getX()) < THRESHOLD && Math.abs(0 - circle2.getX()) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");
		
		if(Math.abs(-8 - circle1.getY()) < THRESHOLD && Math.abs(0 - circle2.getY()) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");
		
		if((Math.abs((81 * Math.PI) - circle1.area())) < THRESHOLD && (Math.abs((Math.PI) - circle2.area())) < THRESHOLD)
			System.out.println("PASSED: Area");
		else
			System.out.println("FAILED: Area");
		
		if(Math.abs((18 * Math.PI) - circle1.perimeter()) < THRESHOLD && Math.abs((2 * Math.PI) - circle2.perimeter()) < THRESHOLD)
			System.out.println("PASSED: Perimeter");
		else
			System.out.println("FAILED: Perimeter");
		
		if(Math.abs(18 - circle1.diameter()) < THRESHOLD && Math.abs(2 - circle2.diameter()) < THRESHOLD)
			System.out.println("PASSED: Diameter");
		else
			System.out.println("FAILED: Diameter");
		
		if(circle1.isUnitCircle() == false && circle2.isUnitCircle() == true)
			System.out.println("PASSED: Is Unit Circle");
		else
			System.out.println("FAILED: Is Unit Circle");
		
		if(circle1.equals(circle2) == false && circle2.equals(circle1) == false)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		
		if(Math.abs(Math.sqrt(464) - circle1.distance(circle2)) < THRESHOLD && Math.abs(Math.sqrt(464) - circle2.distance(circle1)) < THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");
		
		if(circle1.isSmaller(circle2) == false && circle2.isSmaller(circle1) == true)
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");
		
		if(Math.abs(1 - circle1.compareTo(circle2)) < THRESHOLD && Math.abs(-1 - circle2.compareTo(circle1)) < THRESHOLD)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		
		if(circle1.intersects(circle2) == false && circle2.intersects(circle1) == false)
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");
		
		if(circle1.toString().equals( "name: " + circle1.getName() + "\n" + "center: (" + circle1.getX() + "," + circle1.getY() 
			+ ")" + "\n" + "radius: " + circle1.getRadius()) && 
			circle2.toString().equals("name: " + circle2.getName() + "\n" + "center: (" + circle2.getX() + "," + circle2.getY() 
			+ ")" + "\n" + "radius: " + circle2.getRadius()))
			System.out.println("PASSED: To String");
		else
			System.out.println("FAILED: To String");
		
	}
	
}