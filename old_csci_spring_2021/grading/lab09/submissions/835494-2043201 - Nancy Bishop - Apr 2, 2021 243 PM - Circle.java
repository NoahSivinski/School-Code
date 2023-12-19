/*
 * Circle.java
 * Author:  Nancy Bishop
 * Submission Date: April 2, 2021
 *
 * Purpose: The program uses OOP to use circle method and familiarize ourselves with it through templates
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
public class Circle {
    private String name;
    private double radius;
    private double x;
    private double y;

    public static final double THRESHOLD = 0.000000001;

    //----------------------------------------------
    // getName - returns the value of name
    //----------------------------------------------
    public String getName() {
        return name;
    }

    //----------------------------------------------
    // getRadius - returns the value of radius
    //----------------------------------------------
    public double getRadius() {
        return radius;
    }

    //----------------------------------------------
    // getX - returns the value of x
    //----------------------------------------------
    public double getX() {
        return x;
    }

    //----------------------------------------------
    // getY - returns the value of y
    //----------------------------------------------
    public double getY() {
        return y;
    }

    //----------------------------------------------
    // setName - assigns a new value to name
    //----------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    //----------------------------------------------
    // setRadius - assigns a new value to radius
    //----------------------------------------------
    public void setRadius(double radius) {
        if(radius > THRESHOLD){
            this.radius = radius;
        }
    }

    //----------------------------------------------
    // setX - assigns a new value to x
    //----------------------------------------------
    public void setX(double x) {
        this.x = x;
    }

    //----------------------------------------------
    // setY - assigns a new value to y
    //----------------------------------------------
    public void setY(double y) {
        this.y = y;
    }

    //--------------------------------------------------------
    // area - returns the area of the circle
    //--------------------------------------------------------
    public double area() {

        // Your code goes here
        return Math.PI*getRadius()*getRadius();
    }


    //--------------------------------------------------------
    // perimeter - returns the perimeter of the circle
    //--------------------------------------------------------
    public double perimeter() {

        // Your code goes here
        return 2*Math.PI*getRadius();
    }


    //--------------------------------------------------------
    // diameter - calculates the diameter of the circle
    //--------------------------------------------------------
    public double diameter() {

        // Your code goes here
        return 2*getRadius();
    }


    //--------------------------------------------------------
    // isUnitCircle - return true if the radius of this circle
    //                is 1 and its center is (0,0) and false
    //                    otherwise.
    //--------------------------------------------------------
    public boolean isUnitCircle() {

        // Your code goes here
        if(Double.compare(getX(),getY()) == 0  &&  getRadius() == 1){
            return true;
        }
        return false;
    }

}
