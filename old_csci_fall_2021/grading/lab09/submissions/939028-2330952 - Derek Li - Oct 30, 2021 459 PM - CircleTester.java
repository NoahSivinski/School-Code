/*
 * CircleTester.java
 * Author:  Derek Li 
 * Submission Date:  10/30/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * A client to test the functionality of objects of the class
 * Circle. Use the default constructor in the Circle class to
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
		System.out.println("circle1="+circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("diameter=" + circle1.diameter());
		System.out.println("area=" + circle1.area());
		System.out.println("perimeter=" + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("diameter=" + circle1.diameter());
		System.out.println("area=" + circle1.area());
		System.out.println("perimeter=" + circle1.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("is circle1 a unit circle: " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("is circle2 a unit circle: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		circle2.setRadius(2.0);
		circle2.setX(-3.0);
		circle2.setY(4.0);
		//dispalys whether circle1 is equal to circle2
		System.out.println("circle2="+circle2);
		System.out.println("is circle1 equal to circle2: " + circle1.equals(circle2));
		
		
		circle2.setRadius(3.0);
		System.out.println("circle2="+circle2);
		System.out.println("is circle1 equal to circle2: " + circle1.equals(circle2));
		
		//displays the distance between the centers of circle1 and circle2
		System.out.println("Distance: " + circle1.distance(circle2));
		
		
		//displays whether circle1 is larger, smaller, or equal to circle2
		if(circle1.compareTo(circle2) == -1)
			//tests isSmaller as well
			System.out.println("circle1 is smaller than circle2:");
		else if (circle1.compareTo(circle2) == 1)
			System.out.println("circle1 is larger than circle2");
		else
			System.out.println("circle1 is equal to circle2");
		
		circle1.setRadius(4.0);
		System.out.println("circle1 = " + circle1);
		if(circle1.compareTo(circle2) == -1)
			//tests isSmaller as well
			System.out.println("circle1 is smaller than circle2:");
		else if (circle1.compareTo(circle2) == 1)
			System.out.println("circle1 is larger than circle2");
		else
			System.out.println("circle1 is equal to circle2");
		
		circle1.setRadius(3.0);
		System.out.println("circle1 = " + circle1);
		if(circle1.compareTo(circle2) == -1)
			//tests isSmaller as well
			System.out.println("circle1 is smaller than circle2:");
		else if (circle1.compareTo(circle2) == 1)
			System.out.println("circle1 is larger than circle2");
		else
			System.out.println("circle1 is equal to circle2");
				
		//displays whether or not circle1 and circle2 intersect
		System.out.println("circle1 and circle2 intersect: " + circle1.intersects(circle2));
	}
	
}