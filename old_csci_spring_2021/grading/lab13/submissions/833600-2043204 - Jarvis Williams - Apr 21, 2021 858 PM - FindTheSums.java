/*
 * FindTheSums.java
 * Author: Jarvis Williams
 * Submission Date:  4/23/2021
 *
 * Purpose: The purpose of this lab is create a method to convert a
 * 2D array to string and to find the horizontal and vertical sums
 * of a number
 * * Statement of Academic Honesty:
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
public class FindTheSums {
    //method to print out the arrays in a form of String
    public static String arrayToString(int[][] a) {
        //String to hold array values.
        String arrayString = "";

        //for loop to get values for 2D array  
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                //if statement for last number in array (wont put space after last number)
                if(j != a[0].length - 1) {
                	arrayString = arrayString + a[i][j] + " ";
                }
                else {
                	arrayString = arrayString +  a[i][j];
                }
            }
            if(i != a.length - 1) {
            	arrayString = arrayString + "\n";
            }
        }

        //returns the string
        return arrayString;
    }

    //method to find the horizontal sums
    public static int[][] horizontalSums(int[][] a, int sumToFind) {
        //creates an array with the same dimensions as array a
        int[][] b = new int [a.length][a[0].length];

        //for loop for finding values of 2D array a 
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                //initializing variables
            	int temp = 0;
                int count = 0;

                //loop for adding values of horizontal line
                for(int x = 0; x < a[0].length - j; x++) {
                	temp += a[i][j + x];
                    count++;

                    //if some of horizontal numbers equal sumToFind, stores those values in array b
                    if(temp == sumToFind) {
                        for(int y = 0; y < count; y++) {
                            b[i][j + x - y] = a[i][j + x - y];
                        }
                        //ends loop
                        x = a[0].length;
                    }
                    //ends loop
                    if(temp > sumToFind) {
                        x = a[0].length;
                    }
                }
            }
        }
        //returns array b
        return b;
    }

    //method to find the vertical sums
    public static int[][] verticalSums(int[][] a, int sumToFind) {

    	//creates an array with the same dimensions as array a
        int [][] b = new int [a.length][a[0].length];

        //for loop for finding values of 2D array a 
        for(int i = 0; i < a[0].length; i++) {
            for(int j = 0; j < a.length; j++) {
                //initializes the variables
            	int temp = 0;
                int count = 0;

                //loop for adding values of vertical line
                for(int x = 0; x < a.length - j; x++) {
                	temp += a[j + x][i];
                    count++;

                    //if some of vertical numbers equal sumToFind, stores those values in array b
                    if(temp == sumToFind) {
                        //uses for loop to store the numbers
                        for(int y = 0; y < count; y++) {
                            b[j + x - y][i] = a[j + x - y][i];
                        }
                        //ends the for loop
                        x = a.length;
                    }

                    //ends loop
                    if(temp > sumToFind) {
                        x = a.length;
                    }
                }
            }
        }
        //returns array b
        return b;
    }
}