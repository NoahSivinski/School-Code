/*
 * [Circle tester].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [4/2/21]
 *
 * Purpose: CircleTester
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
		System.out.println("circle1 diameter="+circle1.diameter());
		System.out.println("circle1 area="+circle1.area());
		System.out.println("circle1 perimeter="+circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter="+circle2.diameter());
		System.out.println("circle2 area="+circle2.area());
		System.out.println("circle2 perimeter="+circle2.perimeter());
		
		// display whether circle1 is a unit circle
		 System.out.println("Unit Circle Circle 1:"+circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		 System.out.println("Unit Circle Circle 2:"+circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		 System.out.println("Circle1 equals Circle2:"+ circle1.equals(circle2));
		 
		 circle1.setRadius(4.5); //set new radius for circle 1
		
		 if( Math.abs( circle1.getRadius() - circle2.getRadius() ) < THRESHOLD ) { // test case 1 for equals
			 System.out.println("FAILED: Equals");
		 }
		 else
			System.out.println("PASSED: Equals");	 
		 
		 
		 circle1.setRadius(5.4);//set new radius for circle 1
		
		 if( Math.abs( circle1.getRadius() - circle2.getRadius() ) < THRESHOLD ) { //test case 2 for equals
			 System.out.println("FAILED: Equals");
		 }
		 else
			System.out.println("PASSED: Equals"); 
		
		
		 circle2.setRadius(5.4);//set new radius for circle 1
		 
		 if( Math.abs( circle1.getRadius() - circle2.getRadius() ) < THRESHOLD ) { //test case 3 for equals
			 System.out.println("PASSED: Equals");
		 }
		 else
			System.out.println("FAILED: Equals");
		 
		 //test case 1 for distance
		 System.out.println("Circle1 distance from Circle2:"+ circle1.distance(circle2));
		
		 if ( (circle1.distance(circle2) - 5.830951894845301) < THRESHOLD) {//test case 1
			 System.out.println("PASSED: Distance");

		 }
		 else
			 System.out.println("FAILED: Distance");
		 
		 circle1.setX(-1.0); //setting new x for circle1

		 if ( (circle1.distance(circle2) -4.242640687119285 ) < THRESHOLD) { // test case 2
			 System.out.println("PASSED: Distance");

		 }
		 else
			 System.out.println("FAILED: Distance");
		 
		 circle2.setY(3.0); //new setY for circle2
		 
		 if ( (circle1.distance(circle2) -3.1622776601683795 ) < THRESHOLD) { // test case 3
			 System.out.println("PASSED: Distance");

		 }
		 else
			 System.out.println("FAILED: Distance");
		 
		 
		 System.out.println("Circle1 smaller than Circle2:"+ circle1.isSmaller(circle2));
		 
		 if(circle1.isSmaller(circle2)) {
			 System.out.println("PASSED: isSmaller"); //test case 1

		 }
		 else 
			 System.out.println("FAILED: isSmaller");
		 
		 circle1.setRadius(6.0); //set new radius for circle 1
		 
		 if(circle1.isSmaller(circle2)) {
			 System.out.println("FAILED: isSmaller"); //test case 2

		 }
		 else 
			 System.out.println("PASSED: isSmaller");
		 
		 circle2.setRadius(7.0); //new radius for circle 2
		 
		 if(circle1.isSmaller(circle2)) {
			 System.out.println("PASSED: isSmaller"); //test case 3

		 }
		 else 
			 System.out.println("FAILED: isSmaller"); 

		 
		 System.out.println("Circle1 comparison to circle2:" + circle1.compareTo(circle2));
		 
		 if(circle1.compareTo(circle2) == -1) {
			 System.out.println("PASSED: compareTo"); //test case 1

		 }
		 else
			 System.out.println("FAILED: compareTo"); 
		 
		 circle2.setRadius(2.0);

		 if(circle1.compareTo(circle2) == 1) {
			 System.out.println("PASSED: compareTo"); //test case 2

		 }
		 else
			 System.out.println("FAILED: compareTo"); 
		 
		 
		 circle1.setRadius(1.0);

		 if(circle1.compareTo(circle2) == -1) {
			 System.out.println("PASSED: compareTo"); //test case 3

		 }
		 else
			 System.out.println("FAILED: compareTo");
		 
		 System.out.println("Circle1 intersects circle2:" + circle1.intersects(circle2));
		 
		 if(circle1.intersects(circle2)) {
			 System.out.println("PASSED: intersect"); //test case 1

		 }
		 else
			 System.out.println("FAILED: intersect"); 
		 
		 circle2.setRadius(3.0);

		 if(circle1.intersects(circle2)) {
			 System.out.println("PASSED: intersect"); //test case 1

		 }
		 else
			 System.out.println("FAILED: intersect"); 
		 
		 circle1.setRadius(0.5);
		 circle2.setRadius(0.5);
		 
		 if(circle1.intersects(circle2)) {
			 System.out.println("PASSED: intersect"); //test case 1

		 }
		 else
			 System.out.println("FAILED: intersect"); 
		 

		 
	}
	
}
