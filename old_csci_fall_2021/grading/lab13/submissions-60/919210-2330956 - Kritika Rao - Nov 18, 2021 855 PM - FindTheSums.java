/*
 * [FindTheSums].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [11/18/21]
 *
 * Purpose: This program is similar to a word search
 * but with numbers. This program will find horizontal and 
 * vertical sums in a 2D input array of integers that 
 * equal some input integer value. It will iterate through
 * the array and summing the numbers until the sum to find
 * is found. 
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

	public static String arrayToString(int[][] a) {
		//empty string to add all numbers of the string
		String theArray = "";
		//going through rows
		for(int row = 0; row < a.length; row++) {
			//going through columns
			for(int column = 0; column < a[row].length - 1; column++) {
				//adding each value from the array to the string
				theArray += a[row][column] + " ";
			}
			//printing the last element of each row 
			theArray += a[row][a[row].length - 1];
			if(row < a.length - 1) {
				theArray += "\n";
			}
			
			
		}
		return theArray;
	}
	//creating an array of numbers that add to a sum horizontally 
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		//creating an empty array
		int[][] b = new int[a.length][a[0].length];
		int counter = 0;
		
		//going through the rows and columns of array a 
		for(int row = 0; row < a.length; row++) {
			for(int column = 0; column < a[row].length; column++) {
				
				counter = 0;
				int startValue = column;
				//putting zeros where sum is not found
				while(counter != sumToFind && startValue < a[row].length) {
					counter += a[row][startValue];
					startValue++;
				}
				//adding the numbers that sum to the number wanted to the array 
				if(counter == sumToFind) {
					for(int c = column; c < startValue; c++) {
						b[row][c] = a[row][c];
					}
				}
			}
		}
		return b;
	}
	//creating an array of numbers that add to a sum vertically 
	public static int[][] verticalSums(int[][] a, int sumToFind){
		//creating an empty array
		int[][] b = new int[a.length][a[0].length];
		int counter = 0;
		
		//going through the rows and columns of array a
		for(int column = 0; column < a[0].length; column++) {
			for(int row = 0; row < a.length; row++) {
				counter = 0;
				int startValue = row;
				
				//putting zeros where sum is not found
				while(counter != sumToFind && startValue < a.length) {
					counter += a[startValue][column];
					startValue++;
				}
				//adding the numbers that sum to the number wanted to the array
				if(counter == sumToFind) {
					for(int r = row; r < startValue; r++) {
						b[r][column] = a[r][column];
					}
				}
			}
		}
		return b;
	}

}
