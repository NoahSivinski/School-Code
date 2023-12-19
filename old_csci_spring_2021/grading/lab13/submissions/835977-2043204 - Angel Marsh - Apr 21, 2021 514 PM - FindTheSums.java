/*
 * FindTheSums.java
 * Author:  Angel Marsh 
 * Submission Date:  April 21, 2021
 *
 * Purpose: The purpose of this program is to search a 2D array
 * for consecutive numbers that add up to a certain sum 
 * horizontally and/or vertically and replace all the numbers
 * that don't add up to that sum with zeroes.
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

	// turns the 2D array into a neatly formatted String of numbers
	public static String arrayToString(int[][] a) {
		String arrayString = "";
		// loop for the rows
		for (int row = 0; row < a.length; row++) {
			// loop for the columns
			for (int column = 0; column < a[0].length; column++) {
				// building a string that holds the array's elements
				arrayString += a[row][column];
				// to create spaces between the numbers (excluding the last one)
				if (column < a[0].length - 1) {
					arrayString += " ";
				}
			}
			if (row < a.length - 1) {
				// puts each element is the column on a new line
				arrayString += "\n";
			}
		}
		return arrayString;
	}

	// finds horizontal sums and replaces the horizontally consecutive numbers that
	// don't equal sumToFind with zeroes
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		// creating the array of zeroes
		int[][] otherArray = new int[a.length][a[0].length];
		for (int row = 0; row < otherArray.length; row++)
			for (int column = 0; column < otherArray[0].length; column++)
				otherArray[row][column] = 0;

		// loop for the rows
		for (int row = 0; row < a.length; row++) {
			// loop for the columns
			for (int column = 0; column < a[0].length; column++) {
				int sum = 0;
				int counter = 0;
				// checks the sum of the consecutive values in the array
				for (int i = column; i < a[0].length; i++) {
					if (sum < sumToFind) {
						// adds the consecutive numbers so long as the sum of them is >= sumToFind
						sum += a[row][i];
						counter++;
					}
				}
				if (sum == sumToFind) {
					for (int j = 0; j < counter; j++)
						// the array of zeroes gets replaced with the actual array's numbers where the
						// sum of the consecutive numbers = the sum we are searching for
						otherArray[row][column + j] = a[row][column + j];
				}
			}
		}
		return otherArray;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		// creating the array of zeroes
		int[][] otherArray = new int[a.length][a[0].length];
		for (int row = 0; row < otherArray.length; row++)
			for (int column = 0; column < otherArray[0].length; column++)
				otherArray[row][column] = 0;

		// loop for the columns
		for (int column = 0; column < a[0].length; column++) {
			// loop for the rows
			for (int row = 0; row < a.length; row++) {
				int sum = 0;
				int counter = 0;
				// checks the sum of the consecutive values in the array
				for (int i = row; i < a.length; i++) {
					if (sum < sumToFind) {
						// adds the consecutive numbers so long as the sum of them is >= sumToFind
						sum += a[i][column];
						counter++;
					}
				}
				if (sum == sumToFind) {
					for (int i = 0; i < counter; i++) {
						// the array of zeroes gets replaced with the actual array's numbers where the
						// sum of the consecutive numbers = the sum we are searching for
						otherArray[row + i][column] = a[row + i][column];
					}
				}
			}
		}
		return otherArray;
	}
}
