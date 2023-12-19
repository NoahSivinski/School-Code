/* CircleTester.java
 * Author:  Tenacity Murdie 
 * Submission Date:  10-25-2021
 *
 * Purpose: This program tests the functionality of objects of the class Circle
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
		System.out.println("circle1 diameter= "+circle1.diameter());
		System.out.println("circle1 area= "+circle1.area());
		System.out.println("circle1 perimeter= "+circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter= "+circle2.diameter());
		System.out.println("circle2 area= "+circle2.area());
		System.out.println("circle2 perimeter= "+circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("circle1 is a unit circle: " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("circle2 is a unit circle: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//test getName (and by default, tests setName)
		circle1.setName("Circle 1 test");
		if(circle1.getName().equals("Circle 1 test"))
			System.out.println("PASSED: getName test 1");
		else
			System.out.println("FAILED: getName test 1");
		
		circle1.setName("Circle 2 test");
		if(!circle1.getName().equals("Circle 1 test"))
			System.out.println("PASSED: getName test 2");
		else
			System.out.println("FAILED: getName test 2");
		
		circle1.setName("Circle 3 test");
		if(circle1.getName().equals("Circle 3 test"))
			System.out.println("PASSED: getName test 3");
		else
			System.out.println("FAILED: getName test 3");
		
		circle1.setName("Circle 1");
		
		//test getX (and by default, tests setX)
		circle1.setX(0);
		if(Math.abs(0-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: getX test 1");
		else
			System.out.println("FAILED: getX test 1");
		
		circle1.setX(7);
		if(Math.abs(7-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: getX test 2");
		else
			System.out.println("FAILED: getX test 2");
		
		circle1.setX(8);
		if(Math.abs(8-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: getX test 3");
		else
			System.out.println("FAILED: getX test 3");
		
		//test getY (and by default, tests setY)
		circle1.setY(0);
		if(Math.abs(0-circle1.getY()) < THRESHOLD)
			System.out.println("PASSED: getY test 1");
		else
			System.out.println("FAILED: getY test 1");
		
		circle1.setY(7);
		if(Math.abs(7-circle1.getY()) < THRESHOLD)
			System.out.println("PASSED: getY test 2");
		else
			System.out.println("FAILED: getY test 2");
		
		circle1.setY(8);
		if(Math.abs(8-circle1.getY()) < THRESHOLD)
			System.out.println("PASSED: getY test 3");
		else
			System.out.println("FAILED: getY test 3");
		
		//test getRadius
		circle1.setRadius(0);
		if(Math.abs(0-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: getRadius test 1");
		else
			System.out.println("FAILED: getRadius test 1");
		
		circle1.setRadius(7);
		if(Math.abs(7-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: getRadius test 2");
		else
			System.out.println("FAILED: getRadius test 2");
		
		circle1.setRadius(8);
		if(Math.abs(8-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: getRadius test 3");
		else
			System.out.println("FAILED: getRadius test 3");
		
		//test setName
		circle1.setName("xyz");
		if(circle1.getName().equals("xyz"))
			System.out.println("PASSED: setName test 1");
		else
			System.out.println("FAILED: setName test 1");
		
		circle1.setName("-34567");
		if(!circle1.getName().equals("-3456"))
			System.out.println("PASSED: setName test 2");
		else
			System.out.println("FAILED: setName test 2");
		
		circle1.setName("%testing names");
		if(circle1.getName().equals("%testing names"))
			System.out.println("PASSED: setName test 3");
		else
			System.out.println("FAILED: setName test 3");
		
		circle1.setName("Circle 1");
		
		//test setX
		circle1.setX(-54);
		if(Math.abs(-54-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: setX test 1");
		else
			System.out.println("FAILED: setX test 1");
		
		circle1.setX(789);
		if(Math.abs(789-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: setX test 2");
		else
			System.out.println("FAILED: setX test 2");
		
		circle1.setX(89-5);
		if(Math.abs(84-circle1.getX()) < THRESHOLD)
			System.out.println("PASSED: setX test 3");
		else
			System.out.println("FAILED: setX test 3");
		
		//test setY
		circle1.setY(-68);
		if(Math.abs(-68-circle1.getY()) < THRESHOLD)
			System.out.println("PASSED: setY test 1");
		else
			System.out.println("FAILED: setY test 1");
		
		circle1.setY(78);
		if(Math.abs(78-circle1.getY()) < THRESHOLD)
			System.out.println("PASSED: setY test 2");
		else
			System.out.println("FAILED: setY test 2");
		
		circle1.setY(4*2);
		if(Math.abs(8-circle1.getY()) < THRESHOLD)
			System.out.println("PASSED: setY test 3");
		else
			System.out.println("FAILED: setY test 3");
		
		//test setRadius
		circle1.setRadius(3);
		if(Math.abs(3-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: setRadius test 1");
		else
			System.out.println("FAILED: setRadius test 1");
		
		circle1.setRadius(-64);
		if(Math.abs(3-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: setRadius test 2");
		else
			System.out.println("FAILED: setRadius test 2");
		
		circle1.setRadius(0);
		if(Math.abs(0-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: setRadius test 3");
		else
			System.out.println("FAILED: setRadius test 3");
		
		//test area
		circle1.setRadius(1.0);
		if(Math.abs((Math.PI)-circle1.area()) < THRESHOLD)
			System.out.println("PASSED: area test 1");
		else
			System.out.println("FAILED: area test 1");
		
		circle1.setRadius(2.0);
		if(Math.abs((4 * Math.PI)-circle1.area()) < THRESHOLD)
			System.out.println("PASSED: area test 2");
		else
			System.out.println("FAILED: area test 2");
		
		circle1.setRadius(3.0);
		if(Math.abs((9 * Math.PI)-circle1.area()) < THRESHOLD)
			System.out.println("PASSED: area test 3");
		else
			System.out.println("FAILED: area test 3");
		
		//test perimeter
		circle1.setRadius(1.0);
		if(Math.abs((2*Math.PI)-circle1.perimeter()) < THRESHOLD)
			System.out.println("PASSED: perimeter test 1");
		else
			System.out.println("FAILED: perimeter test 1");
		
		circle1.setRadius(2.0);
		if(Math.abs((4 * Math.PI)-circle1.perimeter()) < THRESHOLD)
			System.out.println("PASSED: perimeter test 2");
		else
			System.out.println("FAILED: perimeter test 2");
		
		circle1.setRadius(3.0);
		if(Math.abs((6 * Math.PI)-circle1.perimeter()) < THRESHOLD)
			System.out.println("PASSED: perimeter test 3");
		else
			System.out.println("FAILED: perimeter test 3");
		
		//test diameter
		circle1.setRadius(1.0);
		if(Math.abs(2-circle1.diameter()) < THRESHOLD)
			System.out.println("PASSED: diameter test 1");
		else
			System.out.println("FAILED: diameter test 1");
		
		circle1.setRadius(2.0);
		if(Math.abs(4-circle1.diameter()) < THRESHOLD)
			System.out.println("PASSED: diameter test 2");
		else
			System.out.println("FAILED: diameter test 2");
		
		circle1.setRadius(3.0);
		if(Math.abs(6-circle1.diameter()) < THRESHOLD)
			System.out.println("PASSED: diameter test 3");
		else
			System.out.println("FAILED: diameter test 3");
		
		//test isUnitCircle
		circle1.setX(0);
		circle1.setY(0);
		circle1.setRadius(1);
		if(circle1.isUnitCircle() == true)
			System.out.println("PASSED: UnitCircle test 1");
		else
			System.out.println("FAILED: UnitCircle test 1");
		
		circle1.setX(3);
		circle1.setRadius(1);
		if(circle1.isUnitCircle() == false)
			System.out.println("PASSED: UnitCircle test 2");
		else
			System.out.println("FAILED: UnitCircle test 2");
		
		circle1.setX(0);
		circle1.setRadius(1.3);
		if(circle1.isUnitCircle() == false)
			System.out.println("PASSED: UnitCircle test 3");
		else
			System.out.println("FAILED: UnitCircle test 3");
		
		
		//test equals
		circle1.setX(1);
		circle1.setY(1);
		circle1.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);
		circle2.setRadius(1);
		if(circle1.equals(circle2) == true)
			System.out.println("PASSED: equals test 1");
		else
			System.out.println("FAILED: equals test 1");
		
		circle1.setX(3);
		if(circle1.equals(circle2) == false)
			System.out.println("PASSED: equals test 2");
		else
			System.out.println("FAILED: equals test 2");
		
		circle1.setX(1);
		circle2.setY(3);
		if(circle1.equals(circle2) == false)
			System.out.println("PASSED: equals test 3");
		else
			System.out.println("FAILED: equals test 3");
		
		//test distance
		circle1.setX(1);
		circle1.setY(1);
		circle2.setX(1);
		circle2.setY(1);
		if(Math.abs(0-circle1.distance(circle2)) < THRESHOLD)
			System.out.println("PASSED: distance test 1");
		else
			System.out.println("FAILED: distance test 1");
		
		circle1.setX(3);
		circle1.setY(2);
		circle2.setX(4);
		circle2.setY(3);
		if(Math.abs(Math.sqrt(2)-circle1.distance(circle2)) < THRESHOLD)
			System.out.println("PASSED: distance test 2");
		else
			System.out.println("FAILED: distance test 2");
		
		circle1.setX(-3);
		circle1.setY(6);
		circle2.setX(3);
		circle2.setY(-5);
		if(Math.abs(Math.sqrt(157)-circle1.distance(circle2)) < THRESHOLD)
			System.out.println("PASSED: distance test 3");
		else
			System.out.println("FAILED: distance test 3");
		
		//test isSmaller
		circle1.setRadius(0);
		circle2.setRadius(1);
		if(circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: isSmaller test 1");
		else
			System.out.println("FAILED: isSmaller test 1");
		
		circle1.setRadius(3);
		if(circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller test 2");
		else
			System.out.println("FAILED: isSmaller test 2");
		
		circle2.setRadius(3);
		if(circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller test 3");
		else
			System.out.println("FAILED: isSmaller test 3");
		
		//test compareTo
		circle1.setRadius(0);
		circle2.setRadius(1);
		if(circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: compareTo test 1");
		else
			System.out.println("FAILED: compareTo test 1");
		
		circle1.setRadius(2);
		circle2.setRadius(1);
		if(circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: compareTo test 2");
		else
			System.out.println("FAILED: compareTo test 2");
		
		circle1.setRadius(3);
		circle2.setRadius(3);
		if(circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: compareTo test 3");
		else
			System.out.println("FAILED: compareTo test 3");
		
		//test intersects
		circle1.setRadius(2);
		circle1.setX(0);
		circle1.setY(0);
		circle2.setRadius(4);
		circle2.setX(3);
		circle2.setY(3);
		if(circle1.intersects(circle2) == true)
			System.out.println("PASSED: intersects test 1");
		else
			System.out.println("FAILED: intersects test 1");
		
		circle1.setRadius(2);
		circle1.setX(-4);
		circle1.setY(-2);
		circle2.setRadius(4);
		circle2.setX(3);
		circle2.setY(3);
		if(circle1.intersects(circle2) == false)
			System.out.println("PASSED: intersects test 2");
		else
			System.out.println("FAILED: intersects test 2");
		
		circle1.setRadius(5);
		if(circle1.intersects(circle2) == true)
			System.out.println("PASSED: intersects test 3");
		else
			System.out.println("FAILED: intersects test 3");
	}
	
}

