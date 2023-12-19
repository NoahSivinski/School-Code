/*
 * Circle.java
 * Author: Ofuan Oyakhire
 * Submission Date: 04/02/21
 *
 * Purpose: the blueprint of a circle
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

    // declare the private String instance  name
    private String name;

    // declare the private double instance  radius
    private double radius;

    // declare the private double instance  x
    private double x;

    // declare the private double instance  y
    private double y;

    //Used to compare doubles.  Remember, don't compare doubles directly using ==
    public static final double THRESHOLD = 0.000000001;

    //----------------------------------------------
    // getName - returns the value of name
    //----------------------------------------------
    public String getName() {
        return name;
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
    // getRadius - returns the value of radius
    //----------------------------------------------
    public double getRadius() {
        return radius;
    }

    //----------------------------------------------
    // setName - assigns a new value to name
    //----------------------------------------------
    public void setName(String name) {
        this.name = name;
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

    //----------------------------------------------
    // setRadius - assigns a new value to radius
    //----------------------------------------------
    public void setRadius(double radius) {
        // radius is only valid when it is greater than or equal to 0
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    //--------------------------------------------------------
    // area - returns the area of the circle
    //--------------------------------------------------------
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    //--------------------------------------------------------
    // perimeter - returns the perimeter of the circle
    //--------------------------------------------------------
    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }

    //--------------------------------------------------------
    // diameter - calculates the diameter of the circle
    //--------------------------------------------------------
    public double diameter() {
        return getRadius() * 2;
    }

    //--------------------------------------------------------
    // isUnitCircle - return true if the radius of this circle
    //                is 1 and its center is (0,0) and false
    //      	      otherwise.
    //--------------------------------------------------------
    public boolean isUnitCircle() {
        Double zero = new Double(0);
        return getRadius() == 1 &&
                (new Double(getX())).equals(zero) &&
                (new Double(getY())).equals(zero);
    }

    //--------------------------------------------------------
    // toString - return a String representation of
    //            this circle in the following format:
    //			  name: name
    //            center:(x,y)
    //            radius: r
    //--------------------------------------------------------
    @Override
    public String toString() {
        return "name: " + getName() +
                "\ncenter: " + "(" + getX() + "," + getY() + ")" +
                "\nradius: " + getRadius();
    }

    //--------------------------------------------------------
    // equals - returns true when the radius and centers of
    //          both circles are the same; otherwise,
    //          it returns false
    //--------------------------------------------------------
    public boolean equals(Circle anotherCircle) {
        return getRadius() == anotherCircle.getRadius() &&
                (new Double(getX())).equals(anotherCircle.getX()) &&
                (new Double(getY())).equals(anotherCircle.getY());
    }

    //--------------------------------------------------------
    // distance -  returns the distance between the centers
    //             of the circle executing the method and anotherCircle
    //--------------------------------------------------------
    public double distance(Circle anotherCircle) {
        double xDifference = anotherCircle.getX() - getX();
        double yDifference = anotherCircle.getY() - getY();
        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

    //--------------------------------------------------------
    // isSmaller - returns true when the circle executing the method (calling object) is
    //             smaller than the parameter (anotherCircle). Otherwise, it returns false.
    //--------------------------------------------------------
    public boolean isSmaller(Circle anotherCircle) {
        return diameter() < anotherCircle.diameter();
    }

    //--------------------------------------------------------
    // compareTo - If the calling object is larger, the
    //             method returns a positive 1. If the
    //             calling object is smaller than anotherCircle,
    //             it returns -1. Otherwise, it returns 0.
    //--------------------------------------------------------
    public int compareTo(Circle anotherCircle) {
        if (isSmaller(anotherCircle)) {
            return -1;
        } else {
            return diameter() == anotherCircle.diameter() ? 0 : 1;
        }
    }

    //--------------------------------------------------------
    // intersects - returns true when the circle executing the
    //              method and anotherCircle have an intersecting
    //              area (one or more points enclosed by both circles);
    //              otherwise, it returns false
    //--------------------------------------------------------
    public boolean intersects(Circle anotherCircle) {
        return distance(anotherCircle) < getRadius() + anotherCircle.getRadius();
    }


}

