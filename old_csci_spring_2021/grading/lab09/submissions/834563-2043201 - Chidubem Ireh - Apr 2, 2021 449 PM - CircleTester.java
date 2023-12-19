
/*
 * CircleTester.java
 * Author: Chidubem Ireh		
 * Submission Date:  4/2/2021
 *
 * Purpose: The purpose of this program is to characterize and evaluate circles.
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
			        circle2.setRadius(5.3);
			        System.out.println("circle1:\n" + circle1);
			        System.out.println();
			        System.out.println("circle2:\n" + circle2);

			        circle1.setRadius(-2.0);
			        if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			            System.out.println("PASSED: Set Radius");
			        else
			            System.out.println("FAILED: Set Radius");
			        System.out.println();
			        
			        circle1.setX(-3.0);
			        circle1.setY(4.0);
			        System.out.println("circle1:\n" + circle1);
			        System.out.println();

			        circle2.setRadius(5.3);
			        System.out.println("circle2:\n" + circle2);
			        System.out.println();

			        // circle1 diameter, area and perimeter
			        System.out.println("diameter: "+ circle1.diameter() + " , " + "area: " + circle1.area() + " , " + "perimeter: " + circle1.perimeter());

			        // print circle2 diameter, area and perimeter
			        System.out.println("diameter: "+ circle2.diameter() + " , " + "area: " + circle2.area() + " , " + "perimeter: " + circle2.perimeter());
			        System.out.println();
			        // is circle1 a unit circle?
			        
			        System.out.println("Circle 1 is "+ circle1.isUnitCircle());

			        // is circle2 a unit circle
			        System.out.println("Circle 2 is "+ circle2.isUnitCircle());
			        System.out.println();
			        
			        System.out.println("The two circles are equal: \n"+circle1.equals(circle2));
			        System.out.println();
			        System.out.println("The two circles intersects:\n"+circle1.intersects(circle2));
			        System.out.println();
			        System.out.println("Distance between circles:\n"+circle1.distance(circle2));
			        System.out.println();
			        
     }


			    }
			