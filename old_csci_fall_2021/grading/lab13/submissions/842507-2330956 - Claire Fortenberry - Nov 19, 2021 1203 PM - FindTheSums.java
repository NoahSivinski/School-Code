/*
 * FindTheSums.java
 * Author:  Claire Fortenberry 
 * Submission Date:  [Submission date here]
 *
 * Purpose: The goal of this program is to take a 2D input array of integers
 * and find all of the horizontal and vertical sums that equal some integer value 
 * that the user will input. The program will output a new array, that has replaced 
 * the values that are not a part of one of the sums with the value of 0.
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
	
	//returns string representation of a without any extraneous newline characters or spaces
	public static String arrayToString(int[][] a) {
		String stringArray = "";
		boolean lastR = false;
		boolean lastC = false;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				lastR = (i == a.length - 1); 
				lastC = (j == a[0].length - 1);
				
				if (lastC) { //checks if value is the last value in its row
					stringArray += a[i][j];
				}
				else { //if not the last value, add a space
					stringArray += a[i][j] + " ";
				}
			}
			if (!lastR) { //if not the last row of values, add a new line
				stringArray += "\n";
			}
		}
		return stringArray;
	}
	
	//creates output array 'b' that contains the values of the array a that are a part of a horizontal sum that equals sumToFind. all other values are changed to 0
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = 0;
			}
		}
		
		int sum;
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
				sum = 0;
				for (int i = column; i < a[0].length; i++) {
					sum += a[row][i];
					if (sum == sumToFind) {
						for (int j = column; j <= i; j++) {
							b[row][j] = a[row][j];
						}
						i = a[0].length;
					}
				}
			}
			
		}
		return b;	
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[i][j] = 0;
			}
		}
		
		int sum;
		for (int column = 0; column < a[0].length; column++) {
			for (int row = 0; row < a.length; row++) {
				sum = 0;
				for (int i = row; i < a.length; i++) {
					sum += a[i][column];
					if (sum == sumToFind) {
						for (int j = row; j <= i; j++) {
							b[j][column] = a[j][column];
						}
						i = a.length;
					}
				}
			}
		}
		return b;
	}
	

}
