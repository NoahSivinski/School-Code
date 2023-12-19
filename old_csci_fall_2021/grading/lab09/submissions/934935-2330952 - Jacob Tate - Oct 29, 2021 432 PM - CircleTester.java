//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
// 
//*******************************************************
/**
 * CircleTester.java
 * Author:  Jacob Tate 
 * Submission Date:  Friday, October 29th, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * A client to test the functionality of objects of the class
 * Circle. Uses the default constructor in the Circle class to
 * create Circle objects.
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
		System.out.println("Circle 1's radius: " + circle1.getRadius());
		System.out.println("Circle 1's coordinates: (" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println();
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("Circle 2's radius: " + circle2.getRadius());
		System.out.println("Circle 2's coordinates: (" + circle2.getX() + "," + circle2.getY() + ")");
		System.out.println();
		// print circle1 diameter, area and perimeter
		System.out.println(circle1.getName() + "'s diameter: " + circle1.diameter());
		System.out.println(circle1.getName() + "'s area: " + circle1.area());
		System.out.println(circle1.getName() + "'s perimeter: " + circle1.perimeter());
		System.out.println();
		// print circle2 diameter, area and perimeter
		System.out.println(circle2.getName() + "'s diameter: " + circle2.diameter());
		System.out.println(circle2.getName() + "'s area: " + circle2.area());
		System.out.println(circle2.getName() + "'s perimeter: " + circle2.perimeter());
		System.out.println();
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle() == true)
		{
			System.out.println(circle1.getName() + " is a unit circle.");
		}
		else
		{
			System.out.println(circle1.getName() + " is not a unit circle.");
		}
		
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle() == true)
		{
			System.out.println(circle2.getName() + " is a unit circle.");
		}
		else
		{
			System.out.println(circle2.getName() + " is not a unit circle.");
		}
		System.out.println();
		
		
		
		
		
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//I am going to make another circle to better help test.
		//Below code tests getX(), setX(), getY(), and setY(). I took the expected value minus the calculated value and was able to see if it was less than the threshold.
		Circle testCircle = new Circle();
		System.out.println("Tests for getX(), setX(), getY(), and setY():");
		circle1.setX(5.0);
		circle1.setY(5.0);
		circle2.setX(6.0);
		circle2.setY(6.0);
		testCircle.setName("Circle 3");
		testCircle.setX(7.7);
		testCircle.setY(7.7);
		
		if(Math.abs(5.0 - circle1.getX()) < THRESHOLD && Math.abs(5.0 - circle1.getY()) < THRESHOLD)
		{
			System.out.println(circle1.getName() + "'s x: " + circle1.getX());
			System.out.println(circle1.getName() + "'s y: " + circle1.getY());
			System.out.println("Passed: getX(), setX(), getY(), and setY()");
			System.out.println();
		}
		
		if(Math.abs(6.0 - circle2.getX()) < THRESHOLD && Math.abs(6.0 - circle2.getY()) < THRESHOLD)
		{
			System.out.println(circle2.getName() + "'s x: " + circle2.getX());
			System.out.println(circle2.getName() + "'s y: " + circle2.getY());
			System.out.println("Passed: getX(), setX(), getY(), and setY()");
			System.out.println();
		}
		
		if(Math.abs(7.7 - testCircle.getX()) < THRESHOLD && Math.abs(7.7 - testCircle.getY()) < THRESHOLD)
		{
			System.out.println(testCircle.getName() + "'s x: " + testCircle.getX());
			System.out.println(testCircle.getName() + "'s y: " + testCircle.getY());
			System.out.println("Passed: getX(), setX(), getY(), and setY()");
			System.out.println();
		}
		//Below code tests getName() and setName().
		System.out.println("Tests for getName() and setName()");
		
		circle1.setName("Test Circle 1");
		circle2.setName("Test Circle 2");
		testCircle.setName("Test Circle 3");
		
		if(circle1.getName().equals("Test Circle 1"))
		{
			System.out.println("1st circle's name: " + circle1.getName());
			System.out.println("Passed case 1");
		}
		else
		{
			System.out.println("Failed test case");
		}
		
		if(circle2.getName().equals("Test Circle 2"))
		{

			System.out.println("2nd circle's name: " + circle2.getName());
			System.out.println("Passed case 2");
		}
		else
		{
			System.out.println("Failed test case");
		}
		
		if(testCircle.getName().equals("Test Circle 3"))
		{

			System.out.println("3rd circle's name: " + testCircle.getName());
			System.out.println("Passed case 3");
			System.out.println();
		}
		else
		{
			System.out.println("Failed test case");
		}
		//Below code tests getRadius() and setRadius(). I took the expected value minus the calculated value and was able to see if it was less than the threshold.
		System.out.println("Tests for getRadius() and setRadius()");
		circle1.setRadius(6.5);
		circle2.setRadius(1.0);
		testCircle.setRadius(2.0);
		if(Math.abs(6.5 - circle1.getRadius()) < THRESHOLD)
		{
			System.out.println(circle1.getName() + "'s radius: " + circle1.getRadius());
			System.out.println("Passed case 1");
		}
		else
		{
			System.out.println("Failed test case");
		}
		if(Math.abs(1.0-circle2.getRadius()) < THRESHOLD)
		{
			System.out.println(circle2.getName() + "'s radius: " + circle2.getRadius());
			System.out.println("Passed case 2");
		}
		else
		{
			System.out.println("Failed test case");
		}
		
		if(Math.abs(2.0 - testCircle.getRadius()) < THRESHOLD)
		{
			System.out.println(testCircle.getName() + "'s radius: " + testCircle.getRadius());
			System.out.println("Passed case 3");
			System.out.println();
		}
		
		else
		{
			System.out.println("Failed test case");
		}
		//Below code tests area. Using a calculator, I found the areas of the circles and then implemented the number into the if statement, using as many decimal points the calculator gave me.
		System.out.println("Tests for area()");
		if(Math.abs(132.732289614 - circle1.area()) < THRESHOLD)
		{
			System.out.println(circle1.getName() + "'s area: " + circle1.area());
			System.out.println("Passed case 1");
		}

		else
		{
			System.out.println("Failed test case");
		}
		
		if(Math.abs(3.14159265359 - circle2.area()) < THRESHOLD)
		{
			System.out.println(circle2.getName() + "'s area: " + circle2.area());
			System.out.println("Passed case 2");
		}

		else
		{
			System.out.println("Failed test case");
		}
		
		if(Math.abs(12.5663706144 - testCircle.area()) < THRESHOLD)
		{
			System.out.println(testCircle.getName()+ "'s area: " + testCircle.area());
			System.out.println("Passed case 3");
			System.out.println();
		}

		else
		{
			System.out.println("Failed test case");
		}
		//Below code tests perimeters. Using a calculator, I found the perimeters of the circles and then implemented the number into the if statement, using as many decimal points the calculator gave me.
		System.out.println("Tests for perimeter()");
		if(Math.abs(40.8407044967 - circle1.perimeter()) < THRESHOLD)
		{
			System.out.println(circle1.getName() + "'s perimeter: " + circle1.perimeter());
			System.out.println("Passed case 1");
		}

		else
		{
			System.out.println("Failed test case");
		}
		
		if(Math.abs(6.28318530718 - circle2.perimeter()) < THRESHOLD)
		{
			System.out.println(circle2.getName() + "'s perimeter: " + circle2.perimeter());
			System.out.println("Passed case 2");
		}

		else
		{
			System.out.println("Failed test case");
		}
		
		if(Math.abs(12.5663706144 - testCircle.perimeter()) < THRESHOLD)
		{
			System.out.println(testCircle.getName()+ "'s perimeter: " + testCircle.perimeter());
			System.out.println("Passed case 3");
			System.out.println();
		}

		else
		{
			System.out.println("Failed test case");
		}
		//Below code tests diameters. Using a calculator, I found the diameters of the circles and then implemented the number into the if statement, using as many decimal points the calculator gave me.
		System.out.println("Tests for diameter()");
		if(Math.abs(13.0 - circle1.diameter()) < THRESHOLD)
		{
			System.out.println(circle1.getName() + "'s diameter: " + circle1.diameter());
			System.out.println("Passed case 1");
		}

		else
		{
			System.out.println("Failed test case");
		}
		
		if(Math.abs(2.0 - circle2.diameter()) < THRESHOLD)
		{
			System.out.println(circle2.getName() + "'s diameter: " + circle2.diameter());
			System.out.println("Passed case 2");
		}

		else
		{
			System.out.println("Failed test case");
		}
		
		if(Math.abs(4.0 - testCircle.diameter()) < THRESHOLD)
		{
			System.out.println(testCircle.getName()+ "'s diameter: " + testCircle.diameter());
			System.out.println("Passed case 3");
			System.out.println();
		}

		else
		{
			System.out.println("Failed test case");
		}
		System.out.println("Tests for isUnitCircle()");
		testCircle.setX(0.0);
		testCircle.setY(0.0);
		testCircle.setRadius(1.0);
		//Below code tests if circle 1 is a unit circle. Based on the radius of 6.5 and the coordinates at (5.0,5.0), this should be false
		if(circle1.isUnitCircle() == true)
		{
			System.out.println(circle1.getName() + " is a unit circle.");
		}
		else
		{
			System.out.println(circle1.getName() + " is not a unit circle.");
		}
		
		//Below code tests if circle 2 is a unit circle. Based on the radius of 1.0 and the coordinates at (6.0,6.0), this should be false
		if(circle2.isUnitCircle() == true)
		{
			System.out.println(circle2.getName() + " is a unit circle.");
		}
		else
		{
			System.out.println(circle2.toString());
			System.out.println("Based on the values for the center and radius of "+circle2.getName() + ", "+circle2.getName() + " is a unit circle.");
		}
		//Below code tests if testCircle is a unit circle. Based on the radius of 1.0 and the coordinates at (0.0,0.0), this should be true
		if(testCircle.isUnitCircle() == true)
		{
			System.out.println(testCircle.toString());
			System.out.println("Based on the values for the center and radius of "+testCircle.getName() + ", "+testCircle.getName() + " is a unit circle.");
		}
		else
		{
			System.out.println(testCircle.toString());
			System.out.println("Based on the values for the center and radius of "+testCircle.getName() + ", "+testCircle.getName() + " is not a unit circle.");
		}
		System.out.println();
		//Below code tests the equals method. Prints out the toString just to show what values to use and then a statement whether it passed or failed.
		System.out.println("Tests for equals()");
		if(circle1.equals(circle2))
		{
			System.out.println(circle1.toString());
			System.out.println(circle2.toString());
			System.out.println("Based on the values for the center and radius for both circles, " +circle1.getName() + " and " + circle2.getName() + " are equal.");
		}
		
		else
		{
			System.out.println(circle1.toString());
			System.out.println(circle2.toString());
			System.out.println("Based on the values for the center and radius for both circles, " +circle1.getName() + " and " + circle2.getName() + " are not equal.");
		}
		
		if(circle2.equals(testCircle))
		{
			System.out.println(circle2.toString());
			System.out.println(testCircle.toString());
			System.out.println("Based on the values for the center and radius for both circles, " +circle2.getName() + " and " + testCircle.getName() + " are equal.");
		}
		else
		{
			System.out.println(circle2.toString());
			System.out.println(testCircle.toString());
			System.out.println("Based on the values for the center and radius for both circles, " +circle2.getName() + " and " + testCircle.getName() + " are not equal.");
		}
		circle1.setRadius(1.0);
		circle1.setX(6.0);
		circle1.setY(6.0);
		if(circle1.equals(circle2))
		{
			System.out.println(circle1.toString());
			System.out.println(circle2.toString());
			System.out.println("Based on the values for the center and radius for both circles, " +circle1.getName() + " and " + circle2.getName() + " are equal.");
		}
		
		else
		{
			System.out.println(circle1.toString());
			System.out.println(circle2.toString());
			System.out.println("Based on the values for the center and radius for both circles, " +circle1.getName() + " and " + circle2.getName() + " are not equal.");
		}
		
		System.out.println();
		//Below code tests the distance method. It prints out a statement showing the distance and then whether it passed or failed the condition
		System.out.println("Tests for distance()");
		if(Math.abs(0.0 - circle1.distance(circle2)) < THRESHOLD)
		{
			System.out.println("The distance between " + circle1.getName() + " and " + circle2.getName() + ": " + circle1.distance(circle2));
			System.out.println("Pass case 1");
		}
		else
		{
			System.out.println("Fail case 1");
		}
		if(Math.abs(8.48528137424 - circle2.distance(testCircle)) < THRESHOLD)
		{
			System.out.println("The distance between " + circle2.getName() + " and " + testCircle.getName() + ": " + circle2.distance(testCircle));
			System.out.println("Pass case 2");
		}
		else
		{
			System.out.println("Fail case 2");
		}
		circle1.setX(5.0);
		circle1.setY(5.0);
		if(Math.abs(7.07106781187 - circle1.distance(testCircle)) < THRESHOLD)
		{
			System.out.println("The distance between " + circle1.getName() + " and " + testCircle.getName() + ": " + circle1.distance(testCircle));
			System.out.println("Pass case 3");
		}
		else
		{
			System.out.println("Fail case 3");
		}
		circle1.setRadius(2.5);
		circle2.setRadius(0.9);
		System.out.println();
		//Below code tests the isSmaller method. It prints out the diameters for both circles to show what the method takes, then it prints out whether it passed or failed the condition.
		System.out.println("Tests for isSmaller()");
		if(circle1.isSmaller(circle2) == true)
		{
			System.out.println(circle1.getName() +"'s diameter: " + circle1.diameter());
			System.out.println(circle2.getName() +"'s diameter: " + circle2.diameter());
			System.out.println("Based on the value of the diameter of the two circles, "+ circle1.getName() + " is smaller than " + circle2.getName());
			System.out.println();
		}
		else
		{
			System.out.println(circle1.getName() +"'s diameter: " + circle1.diameter());
			System.out.println(circle2.getName() +"'s diameter: " + circle2.diameter());
			System.out.println("Based on the value of the diameter of the two circles, "+ circle1.getName() + " is larger than " + circle2.getName());
			System.out.println();
		}
		
		if(circle2.isSmaller(testCircle) == true)
		{
			System.out.println(circle2.getName() +"'s diameter: " + circle2.diameter());
			System.out.println(testCircle.getName() +"'s diameter: " + testCircle.diameter());
			System.out.println("Based on the value of the diameter of the two circles, "+ circle2.getName() + " is smaller than " + testCircle.getName());
			System.out.println();
		}
		else
		{
			System.out.println(circle2.getName() +"'s diameter: " + circle2.diameter());
			System.out.println(testCircle.getName() +"'s diameter: " + testCircle.diameter());
			System.out.println("Based on the value of the diameter of the two circles, "+ circle2.getName() + " is larger than " + testCircle.getName());
			System.out.println();
		}
		if(circle1.isSmaller(testCircle) == true)
		{
			System.out.println(circle1.getName() +"'s diameter: " + circle1.diameter());
			System.out.println(testCircle.getName() +"'s diameter: " + testCircle.diameter());
			System.out.println("Based on the value of the diameter of the two circles, "+ circle1.getName() + " is smaller than " + testCircle.getName());
			System.out.println();
		}
		else
		{
			System.out.println(circle1.getName() +"'s diameter: " + circle1.diameter());
			System.out.println(testCircle.getName() +"'s diameter: " + testCircle.diameter());
			System.out.println("Based on the value of the diameter of the two circles, "+ circle1.getName() + " is larger than " + testCircle.getName());
			System.out.println();
		}
		//Below code tests the compareTo method. It uses the isSmaller method as input, which is defined above then prints out a statement of whether it passed or failed.
		System.out.println("Tests for compareTo");
		if(circle1.compareTo(circle2) == 1)
		{
			System.out.println("Based on the isSmaller method, " +circle1.getName() + " is larger than " + circle2.getName());
		}
		else if(circle1.compareTo(circle2) == -1)
		{
			System.out.println("Based on the isSmaller method, " +circle1.getName() + " is smaller than " + circle2.getName());
		}
		else
		{
			System.out.println("Based on the isSmaller method, " +circle1.getName() + " is equal to " + circle2.getName());
		}
		
		if(circle2.compareTo(testCircle) == 1)
		{
			System.out.println( "Based on the isSmaller method, " +circle2.getName() + " is larger than " + testCircle.getName());
		}
		else if(circle2.compareTo(testCircle) == -1)
		{
			System.out.println("Based on the isSmaller method, " +circle2.getName() + " is smaller than " + testCircle.getName());
		}
		else
		{
			System.out.println("Based on the isSmaller method, " +circle2.getName() + " is equal than " + testCircle.getName());
		}
		if(circle1.compareTo(testCircle) == 1)
		{
			System.out.println("Based on the isSmaller method, " +circle1.getName() + " is larger than " + testCircle.getName());
		}
		else if(circle1.compareTo(testCircle) == -1)
		{
			System.out.println("Based on the isSmaller method, " +circle1.getName() + " is smaller than " + testCircle.getName());
		}
		else
		{
			System.out.println("Based on the isSmaller method, " +circle1.getName() + " is equal than " + testCircle.getName());
		}
		System.out.println();
		
		
		//Below code tests the intersects method. It prints the distance between the two circles and then it prints the sum of both radii of the two circles. 
		//Finally, it prints out the statement whether or not they do intersect.
		System.out.println("Tests for intersects()");
		if(circle1.intersects(circle2))
		{
			System.out.println("Distance between " + circle1.getName() + " and " + circle2.getName() + ": " + circle1.distance(circle2));
			System.out.println("Sum of both radii: " + (circle1.getRadius() + circle2.getRadius()));
			System.out.println("Based on the values above, "+circle1.getName() + " and " + circle2.getName() + " intersect");
			System.out.println();
		}
		else
		{
			System.out.println("Distance between " + circle1.getName() + " and " + circle2.getName() + ": " + circle1.distance(circle2));
			System.out.println("Sum of both radii: " + (circle1.getRadius() + circle2.getRadius()));
			System.out.println("Based on the values above, " +circle1.getName() + " and " + circle2.getName() + " do not intersect");
			System.out.println();
		}
		
		if(circle2.intersects(testCircle))
		{
			System.out.println("Distance between " + circle2.getName() + " and " + testCircle.getName() + ": " + circle2.distance(testCircle));
			System.out.println("Sum of both radii: " + (circle2.getRadius() + testCircle.getRadius()));
			System.out.println("Based on the values above, " +circle2.getName() + " and " + testCircle.getName() + " intersect");
			System.out.println();
		}
		else
		{
			System.out.println("Distance between " + circle2.getName() + " and " + testCircle.getName() + ": " + circle2.distance(testCircle));
			System.out.println("Sum of both radii: " + (circle2.getRadius() + testCircle.getRadius()));
			System.out.println("Based on the values above, " + circle2.getName() + " and " + testCircle.getName() + " do not intersect");
			System.out.println();
		}
		
		if(circle1.intersects(testCircle))
		{
			System.out.println("Distance between " + circle1.getName() + " and " + testCircle.getName() + ": " + circle1.distance(testCircle));
			System.out.println("Sum of both radii: " + (circle1.getRadius() + testCircle.getRadius()));
			System.out.println("Based on the values above, " +circle1.getName() + " and " + testCircle.getName() + " intersect");
			System.out.println();
		}
		else
		{
			System.out.println("Distance between " + circle1.getName() + " and " + testCircle.getName() + ": " + circle1.distance(testCircle));
			System.out.println("Sum of both radii: " + (circle1.getRadius() + testCircle.getRadius()));
			System.out.println("Based on the values above, " + circle1.getName() + " and " + testCircle.getName() + " do not intersect");
			System.out.println();
		}
		
	}
	
}
