/*
 * FindTheSums.java
 * Author:  Malinda Uboh 
 * Submission Date:  11/18/2021
 *
 * Purpose: This program works with a 2D array of integers
 * and many methods. This program can print a 2D array of integers
 * into a neat string and find certain vertical and horizontal sums of
 * 2D input arrays based off of a given integer input called sumToFind.  
 
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

	// return a string representation of the values of a
	public static String arrayToString(int[][] a) {

		String stringRep = "";

		// iterate through each value of a column in a row
		for (int i = 0; i < a.length; i++) { // iterate through rows

			for (int j = 0; j < a[i].length; j++) { // iterate through columns

				if (j == a[i].length - 1) { // Restricts the printing out of space character after the last value
					stringRep += a[i][j];
				} else {
					stringRep += a[i][j] + " ";// print space between values
				}

			}

			if ((i != a.length - 1)) { // print out new line after every character except the last
				stringRep += "\n";
			}

		}
		return stringRep;

	}

	// find the continuous horizontal sum that equals the given sum to find in the input array
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int currentSum;

		int[][] b = new int[a.length][a[0].length]; // create a new output array called b that has the same dimensions as a
													

		for (int i = 0; i < a.length; i++) {// iterate through rows
			for (int j = 0; j < a[i].length; j++) { // iterate through columns

				currentSum = 0;
				int nextHorizontalValue = j + 1;
				currentSum += a[i][j];
				while (currentSum != sumToFind && nextHorizontalValue < a[i].length) {

					currentSum += a[i][nextHorizontalValue]; // increment through horizontal values and adds them to the current sum
																
					nextHorizontalValue++;
				}

				if (currentSum == sumToFind) {
					for (int jValue = j; jValue < nextHorizontalValue; jValue++) { // put the value of j in variable jValue to preserve the original value of j
																					
						b[i][jValue] = a[i][jValue];
					}

				}
			}

		}

		return b;
	}

	// find the continuous vertical sum that equals the given sum to find in the  input array

	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];

		int currentSum;

		for (int i = 0; i < a[0].length; i++) { // iterate through columns
			for (int j = 0; j < a.length; j++) { // iterate through rows

				currentSum = 0;
				int nextVerticalValue = j + 1;
				currentSum += a[j][i];

				while (currentSum != sumToFind && nextVerticalValue < a.length) {

					currentSum += a[nextVerticalValue][i];// increment through vertical values and adds them to the current sum
															
					nextVerticalValue++;

				}

				if (currentSum == sumToFind) {

					for (int jValue = j; jValue < nextVerticalValue; jValue++) { // put the value of j in variable jValue to preserve the original value of j
						b[jValue][i] = a[jValue][i];
					}

				}

			}
		}

		return b;
	}

}
