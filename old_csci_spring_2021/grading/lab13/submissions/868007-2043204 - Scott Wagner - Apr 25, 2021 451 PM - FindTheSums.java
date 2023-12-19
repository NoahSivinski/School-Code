/*
 * FindTheSums.java
 * Author:  Scott Wagner 
 * Submission Date:  4/22/2021
 *
 * Creates a 2D array of integers, adds 
 * specified ints on horizon.
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

	private static String neatString = "";
	private static String arrayString = "";

	public static String arrayToString(int[][] a) {

		// Rows
		for (int i = 0; i < a.length; i++) {
			neatString = neatString.concat("\n");

			// Columns
			for (int j = 0; j < a[0].length; j++) {
				neatString = neatString.concat(a[i][j] + "");

				// Adds spaces.
				if (j != a[0].length - 1) {
					neatString = neatString.concat(" ");
				}
			}
		}

		// Removes empty space from before first column.
		neatString = neatString.substring(1, neatString.length());
		return neatString;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int indexStart = 0;
		int sum = 0;
		int[][] b = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			indexStart = 0;
			sum = 0;
			for (int j = 0; j < a[0].length; j++) {
				for (int k = 0; k < a[0].length - indexStart; k++) {

					if (sum + a[i][indexStart + k] <= sumToFind) {
						sum += a[i][indexStart + k];

						b[i][indexStart + k] = a[i][indexStart + k];

					}
					if (sum > sumToFind) {
						for (int l = 0; l < b[0].length; l++) {
							b[i][l] = 0;
							indexStart++;

						}
					}
				}
				if (sum != sumToFind) {
					for (int m = 0; m < b[0].length; m++) {
						b[i][m] = 0;
						indexStart++;

					}
				}
			}
		}

		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int indexStart = 0;
		int sum = 0;
		int[][] b = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				indexStart = 0;
				sum = 0;

				for (int k = 0; k < a.length - indexStart; k++) {

					if (sum + a[indexStart + k][j] <= sumToFind && a[indexStart + k][j] != 0) {
						sum += a[indexStart + k][j];

						b[indexStart + k][j] = a[indexStart + k][j];

					} else if (sum > sumToFind) {
						for (int l = 0; l < a.length; l++) {
							b[l][j] = 0;
						}
					}
				}
				if (sum != sumToFind) {
					for (int m = 0; m < b.length; m++) {
						b[m][j] = 0;
						indexStart++;
					}
				}

			}
		}

		return b;

	}

}
