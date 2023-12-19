/*
 * [FindTheSums].java
 * Author:  [Quinton Heald] 
 * Submission Date:  [4-23-21]
 *
 * Purpose: The FindTheSums class is used to scan 2D arrays and find
 * specific sums both in horizontal and vertical patterns. The arrayToString
 * method is used to convert the parameter array into a String, and print out each 
 * number evenly spaced. The horizontalSums method is used to find a specific
 * sum by scanning through the horizontal rows of the array and finding patterns of numbers
 * that add up to the specific sum. These numbers are then put into a separate array where
 * numbers that were not in a pattern that created the sum are converted to 0. The
 * verticalSums method functions similarly to the horizontalSums method where it scans the columns
 * of the array and finds patterns of numbers that add up to the specified sum.
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

		String arrayString = "";

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				arrayString = arrayString + a[i][j];

				if (j < a[i].length - 1) {
					arrayString = arrayString + " ";
				}

			}

			if (i < a.length - 1) {
				arrayString = arrayString + "\n";
			}

		}
		return arrayString;

	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];

		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				
				int sum = 0;
				int sumStartIndex = 0;
				int sumEndIndex = 0;

				for (int h = j; (h < a[i].length && sum < sumToFind); h++) {

					sum += a[i][h];

					if (sum == sumToFind) {

						sumStartIndex = j;

						sumEndIndex = h;

						for (int k = sumStartIndex; k <= sumEndIndex; k++) {
							b[i][k] = a[i][k];
						}

					}

				}
			}
		}

		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];

		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
		}

		for (int i = 0; i < a[0].length; i++) {

			for (int j = 0; j < a.length; j++) {
				
				int sum = 0;
				int sumStartIndex = 0;
				int sumEndIndex = 0;

				for (int v = j; (v < a.length && sum < sumToFind); v++) {

					sum += a[v][i];

					if (sum == sumToFind) {

						sumStartIndex = j;

						sumEndIndex = v;

						for (int k = sumStartIndex; k <= sumEndIndex; k++) {
							b[k][i] = a[k][i];
						}

					}

				}
			}
		}

		return b;
	}

}