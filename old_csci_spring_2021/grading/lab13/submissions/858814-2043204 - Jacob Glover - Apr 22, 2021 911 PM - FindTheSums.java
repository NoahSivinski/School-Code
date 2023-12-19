/*
 * FindTheSums.java
 * Author: Jacob Glover
 * Submission Date:  4/22/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program compiles the sums
 * of each row and column and compares them to the user input.
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
		String toString = "";

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				toString = toString + a[i][j] + " ";
			}
			toString = toString.trim() + "\n"; // for formatting purposes
		}
		return toString.substring(0, toString.length() - 1); // for formatting purposes
	}
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int sum = 0;
		int firstNumber = 0;
		int[][] b = new int[a.length][a[0].length]; // output array
		// outer loop
		for (int c = 0; c < a[0].length; c++) {
			for (int i = 0; i < a.length; i++) {
				firstNumber = a[i][c];
				sum = firstNumber;
				for (int j = c + 1; j < a[i].length; j++) {
					sum = sum + a[i][j];
					// if the column equals the user input
					if (sum == sumToFind) {
						// inner loop that gets the output
						for (int k = c; k <= j; k++) {
							b[i][c] = firstNumber;
							b[i][k] = a[i][k];
						}
					}
				}
			}
		}
		return b; // output array
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) { // finds vertical sums
		int sum = 0;
		int firstNumber = 0;
		int[][] b = new int[a.length][a[0].length];
		// outer loop
		for (int c = 0; c < a.length; c++) {
			for (int i = 0; i < a[0].length; i++) {
				firstNumber = a[c][i];
				sum = firstNumber;

				for (int j = c + 1; j < a.length; j++) {
					sum = sum + a[j][i];
					if (sum == sumToFind) {
						// loop that gets the output
						for (int k = c; k <= j; k++) {

							b[c][i] = firstNumber;
							b[k][i] = a[k][i];
						}
					}
				}
			}
		}
		return b;
	}
}
