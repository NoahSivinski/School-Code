/*
 * FindTheSums.java
 * Author:  William Malonda
 * Submission Date:  April 23, 2021
 *
 * Purpose: The program FindTheSums.java is a program that is essentially a word searcher with numbers. It does 
 * this by finding horizontal and vertical sums in an array of integers.
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

	// Method for arrayToString
	public static String arrayToString(int[][] a) {
		String array = "";

		// Searches each column
		for (int i = 0; i < a.length; i++) {
			// Searches each row
			for (int j = 0; j < a[0].length; j++) {
				array = array + a[i][j];
				// Adds a space between numbers except for last element
				if (j < a[0].length - 1) {
					array = array + " ";
				}
			}
			// Adds new line until it reaches last line
			if (i < a.length - 1) {
				array = array + "\n";
			}
		}
		return array;
	}

	// Method for horizontalSums
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		// Creates b array
		int[][] b = new int[a.length][a[0].length];

		// Puts in 0s for output array b
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = 0;
			}
		}

		// Searches through columns
		for (int i = 0; i < a.length; i++) {
			// Searches through rows
			for (int j = 0; j < a[0].length; j++) {
				int sum = 0;
				int counter = 0;
				for (int k = j; k < a[0].length; k++) {
					// Searches until it finds sum
					if (sum < sumToFind) {
						// Holds sum
						sum = sum + a[i][k];
						counter++;
					}
				}
				// Replaces 0s in b array with numbers that add up to sum
				if (sum == sumToFind) {
					for (int k = 0; k < counter; k++) {
						b[i][j + k] = a[i][j + k];
					}
				}
			}
		}
		return b;
	}

	// Method for verticalSums
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		// Creates b array
		int[][] b = new int[a.length][a[0].length];

		// Puts in 0s for output array b
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = 0;
			}
		}

		// Searches through columns
		for (int i = 0; i < a[0].length; i++) {
			// Searches through rows
			for (int j = 0; j < a.length; j++) {
				int sum = 0;
				int counter = 0;
				for (int k = j; k < a.length; k++) {
					// Searches until it finds sum
					if (sum < sumToFind) {
						// holds sum
						sum = sum + a[k][i];
						counter++;
					}
				}
				// Replaces 0s in b array with numbers that add up to sum
				if (sum == sumToFind) {
					for (int k = 0; k < counter; k++) {
						b[j + k][i] = a[j + k][i];
					}
				}
			}
		}
		return b;
	}
}
