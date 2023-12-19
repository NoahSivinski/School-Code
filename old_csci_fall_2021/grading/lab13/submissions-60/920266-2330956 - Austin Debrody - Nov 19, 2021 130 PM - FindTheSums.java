/*
 * FindTheSums.java
 * Author:  Austin Debrody
 * Submission Date:  11/19/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This class has a method that converts a 2D array to a neatly
 * printable String and two additional methods that find
 * the horizontal and vertical sums for a 2D input array and an
 * input integer called sumToFind. The program uses nested loops,
 * nested statements, static methods, and problem decomposition.
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

public class FindTheSums {

	/*
	 * Returns a String that is a neat representation of the values
	 * in a. Values in each column have a single space between them
	 * and the rows have a single newline character between them.
	 * There should not be a space before the first value in a column
	 * or after the last value in a column. Also, there is not a 
	 * newline before the first row or after the last row.
	 */
	public static String arrayToString(int[][] a) {
		String array = "";
		// loops through all but the last row of the array
		for(int row = 0; row < a.length - 1; row ++) {
			for(int i = 0; i < a[row].length - 1; i++) {
				array += a[row][i] + " ";
			}
			array += a[row][a[row].length - 1] + "\n";
		}
		
		for(int i = 0; i < a[a.length - 1].length - 1; i++) {
			array += a[a.length - 1][i] + " ";
		}
		array += a[a.length - 1][a[a.length - 1].length - 1];
		
		
		return array;
	}
	
	/*
	 * Creates a new output array called b that has the same dimensions as a
	 * and assigns values to b if they are part of a horizontal sum in a that
	 * equals sumToFind. Otherwise, the value in b is 0.
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length]; // new 2D array b
		
		int sum = 0; // int variable for sum
		
		// loops through each row in the array
		for(int row = 0; row < a.length; row++) {
			// loops through each value in the row
			for(int i = 0; i < a[row].length; i++) {
				int count = i; // variable used to change value of i to look at next value
				sum = 0; // resets sum to 0
				
				// finds the sum of values while the sum is less than the sumToFind and 
				// count is less than the row's length
				while(sum < sumToFind && count < a[row].length) {
					sum += a[row][count]; // adds the next value in the array to the sum
					count ++; // increments count by 1
				}
				
				// assigns values to b if those values have a sum equal to sumToFind
				if(sum == sumToFind) {
					for(int j = i; j < count; j++) {
						b[row][j] = a[row][j];
					}
					
				}
			}
		}
		
		return b;
	}
	
	/*
	 * Creates a new output array called b that has the same dimensions as a
	 * and assigns values to b if they are part of a vertical sum in a that
	 * equals sumToFind. Otherwise, the value in b is 0.
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length]; // new 2D array b
		
		int sum = 0; // int variable for sum
		
		// loops through each column in the array
		for(int column = 0; column < a[0].length; column++) {
			// loops through each value in the column
			for(int i = 0; i < a.length; i++) {
				int count = i; // variable used to change value of i to look at next value
				sum = 0; // resets sum to 0
				
				// finds the sum of values while the sum is less than the sumToFind and 
				// count is less than the column's length
				while(sum < sumToFind && count < a.length) {
					sum += a[count][column]; // adds the next value in the array to the sum
					count ++; // increments count by 1
				}
				
				// assigns values to b if those values have a sum equal to sumToFind
				if(sum == sumToFind) {
					for(int j = i; j < count; j++) {
						b[j][column] = a[j][column];
					}
					
				}
			}
		}
		
		return b;
	}

}
