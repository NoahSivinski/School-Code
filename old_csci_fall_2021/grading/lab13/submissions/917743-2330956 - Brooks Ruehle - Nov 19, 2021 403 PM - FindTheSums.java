/*
 * CSCI1301.java
 * Author:  Brooks Ruehle 
 * Submission Date:  Nov. 19, 2021
 *
 * Purpose: This class sorts a 2d array by its horizontal
 * or vertical sums.
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

	/**
	 * Method prints 2D arrays
	 * 
	 * @param a
	 * @return result
	 */
	public static String arrayToString(int[][] a) {
		String result = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result += a[i][j] + " ";
				if (j + 1 == a[0].length && i + 1 != a.length) {
					result += "\n";
				}
			}
		}
		return result;
	}

	/**
	 * Method increments horizontal index in the input array to test if values add
	 * up to the sumToFind horizontally
	 * 
	 * @param a
	 * @param sumToFind
	 * @return b (array containing only values that add up to sumToFind)
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int sum = 0;
				int k = 0;
				for (k = j; k < a[0].length && sum < sumToFind; k++) {
					sum += a[i][k];
				}
				if (sum == sumToFind) {
					for (int x = j; x < k; x++) {
						b[i][x] = a[i][x];
					}
				}
			}
		}
		return b;
	}

	/**
	 * Method increments vertical index in the input array to test if values add up
	 * to the sumToFind vertically
	 * 
	 * @param a
	 * @param sumToFind
	 * @return b (array containing only values that add up to sumToFind)
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int sum = 0;
				int k = 0;
				for (k = i; k < a.length && sum < sumToFind; k++) {
					sum += a[k][j];
				}
				if (sum == sumToFind) {
					for (int x = i; x < k; x++) {
						b[x][j] = a[x][j];
					}
				}
			}
		}
		return b;
	}
}