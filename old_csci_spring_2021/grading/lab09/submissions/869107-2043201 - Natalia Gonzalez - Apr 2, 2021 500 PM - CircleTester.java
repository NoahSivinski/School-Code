/*
 * CircleTester.java
 * Author: Natalia Gonzqlez
 * Submission Date:  04-02-21
 *
 * Purpose: computes teh radius and center of a circle the user enters and compares the two to see if its equal.
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
		circle2.setRadius(5.3);
		System.out.println(circle1);
		System.out.println(circle2);
		
		circle1.setRadius(-2.0); 
                
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
                    System.out.println("PASSED: Set Radius");
		else
                    System.out.println("FAILED: Set Radius");
		
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
                double diameter = circle1.diameter();
		System.out.println(diameter);
		
		double area = circle1.area();
		System.out.println(area);
		
		double perimeter = circle1.perimeter();
		System.out.println(perimeter);
		
		double diameter2 = circle2.diameter();
		System.out.println(diameter2);
		
		double area2 = circle2.area();
		System.out.println(area2);
		
		double perimeter2 = circle2.perimeter();
		System.out.println(perimeter2);
		
		if(circle1.isUnitCircle())
                    System.out.println("Failed: isUnitCircle");
                else
                    System.out.println("Passed: isUnitCircle");
		
                if(circle2.isUnitCircle())
                    System.out.println("Failed: isUnitCircle");
                else
                    System.out.println("Passed: isUnitCircle");	
                
                
               //Test Cases for later implemented methods
                
                //For equals method
                
                if(circle1.equals(circle2))
                    System.out.println("Failed: equals");
                else
                    System.out.println("Passed: equals");
                
                if(circle2.equals(circle1))
                    System.out.println("Failed: equals");
                else
                    System.out.println("Passed: equals");
                
                if(circle1.equals(circle1))
                    System.out.println("Passes: equals");
                else
                    System.out.println("Failed: equals");
                
                //for distance method
                
                if(circle1.distance(circle1)!=0)
                    System.out.println("Failed: distance");
                else
                    System.out.println("Passed: distance");
                
                if(circle2.distance(circle2)!=0)
                    System.out.println("Failed: distance");
                else
                    System.out.println("Passed: distance");
                
                if(circle1.distance(circle2)==0)
                    System.out.println("Failed: distance");
                else
                    System.out.println("Passed: distance");
                
                //for isSmaller method
                
                if(circle1.isSmaller(circle2))
                    System.out.println("Passed: isSmaller");
                else
                    System.out.println("Failed: isSmaller");
                
                if(circle2.isSmaller(circle1))
                    System.out.println("Failed: isSmaller");
                else
                    System.out.println("Passed: isSmaller");
                
                if(circle1.isSmaller(circle1))
                    System.out.println("Passed: isSmaller");
                else
                    System.out.println("Failed: isSmaller");
                
                //for compareTo method
                
                if(circle1.compareTo(circle2)==-1)
                    System.out.println("Passed: compareTo");
                else
                    System.out.println("Failed: compareTo");
                
                if(circle2.compareTo(circle1)==1)
                    System.out.println("Passed: compareTo");
                else
                    System.out.println("Failed: compareTo");
                
                if(circle1.compareTo(circle1)==0)
                    System.out.println("Passed: compareTo");
                else
                    System.out.println("Failed: compareTo");
                
                //for intersects method
                
                if(circle1.intersects(circle2))
                    System.out.println("Passed: intersects");
                else
                    System.out.println("Failed: intersects");
                
                if(circle2.intersects(circle1))
                    System.out.println("Passed: intersects");
                else
                    System.out.println("Failed: intersects");
                
                if(circle1.intersects(circle1))
                    System.out.println("Passed: intersects");
                else
                    System.out.println("Failed: intersects");
                
	}
	
}