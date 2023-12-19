//*******************************************************
// CircleTester.java
//
/*
 * CircleTester.java
 * Author:  Nicolas B.
 * Submission Date: 10/29
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * THis runs through multiple test cases using the methods made in Circle.java.
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

//
//  A client to test the functionality of objects
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
// 
//*******************************************************
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
        circle2.setRadius(1);
        System.out.println("circle1=" + circle1);
        System.out.println("circle2=" + circle2);

        circle1.setRadius(-2.0);
        if(circle1.getRadius() < THRESHOLD)
            System.out.println("PASSED: Set Radius");
        else
            System.out.println("FAILED: Set Radius");

        circle1.setX(-3.0);
        circle1.setY(4.0);
        System.out.println("circle1=" + circle1);

        circle2.setRadius(5.3);
        System.out.println("circle2=" + circle2);

        // print circle1 diameter, area and perimeter
        System.out.println("diameter: "+ circle1.diameter());
        System.out.println("area: " + circle1.area());
        System.out.println("perimeter: " + circle1.perimeter());

        // print circle2 diameter, area and perimeter
        System.out.println("diameter: "+ circle2.diameter());
        System.out.println("area: " + circle2.area());
        System.out.println("perimeter: " + circle2.perimeter());

        // Is it a unitCircle
        if(circle1.isUnitCircle()) {
        	 System.out.println("Circle#1 is a Unit Circle");
        }
        else {
        	 System.out.println("Circle#1 is a Unit Circle");
        }


        // display whether circle2 is a unit circle
        if(circle2.isUnitCircle()) {
        	   System.out.println("Circle#2 is a Unit Circle");
        }
        else {
       	 System.out.println("Circle#2 is a Unit Circle");
       }

        	
    }
}