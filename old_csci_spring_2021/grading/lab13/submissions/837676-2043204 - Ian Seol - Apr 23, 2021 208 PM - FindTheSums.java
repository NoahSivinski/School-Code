/*
 * [CSCI1301L]
 * FindTheSums.java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [04232021]
 *
 * Purpose:This method finds combination of numbers in a given data 2D array that sums up to the user entered number(sum); 
 * The program finds combination of numbers either horizontally or vertically and prints out in a string representation.
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
		int[][] inputArray = new int[a.length][a.length];
		inputArray = a;
		String toString = "";

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c <= a.length; c++) {

				if (c < a[r].length - 1)
					toString = toString + inputArray[r][c] + " ";

				else if (c < a[r].length) {
					toString = toString + inputArray[r][c] + "\n";
				}
			}
		}
		return toString;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		int temp;
		int temp2;
		int tempTotal = 0;
		int l = 0;

		for (int i = 0; i < a.length; i++) {
			for (l = 0; l < a[i].length; l++) {
				tempTotal = 0;
				for (int j = l; j < a[i].length; j++) {

					tempTotal = tempTotal + a[i][j];

					if (tempTotal == sumToFind) {
						temp = j;
						temp2 = a.length;

						for (int m = l; m <= j; m++) {
							b[i][m] = a[i][m];
						}

					} else if (tempTotal > sumToFind) {
					} else {
					}
				}
			}
		}
		return b;
	}

	
	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		int temp;
		int temp2;
		int tempTotal = 0;
		int l = 0;

		for (int i = 0; i < a.length; i++) {
			for (l = 0; l < a.length; l++) {
				tempTotal = 0;
				for (int j = l; j < a.length; j++) {

					tempTotal = tempTotal + a[j][i];

					if (tempTotal == sumToFind) {
						temp = j;
						temp2 = a[i].length;

						for (int m = l; m <= j; m++) {
							b[m][i] = a[m][i];
						}

					} else if (tempTotal > sumToFind) {
					} else {
					}
				}
			}
		}
		return b;
	}
}
