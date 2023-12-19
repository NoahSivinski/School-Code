
/*
 *FindTheSums.java 
 *
 * Author: Cole Wright 
 * Submission Date: 4/22/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *  
 * This lab uses 2D input arrays of integers using rows and columns. The array is to be converted to a neat string.
 * Then, using the numbers in the array, the code finds vertical and horizontal values that equal the desired sum using find
 * the sums tester to ensure the methods are proper. The strings will be displayed in a neat, 10 by 10 graph. 
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
		String num = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == a[i].length - 1)
					num += a[i][j];
				else
					num += a[i][j] + " ";
			}
			if (i != a.length - 1)
				num += "\n";
		}

		return num;

	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[i][j] = 0;
			}
		}
		int sum;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				sum = 0;
				for (int k = j; k < a[0].length; k++) {

					sum += a[i][k];

					if (sum == sumToFind) {

						for (int p = j; p <= k; p++) {
							b[i][p] = a[i][p];
						}
						k = a[0].length;
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

		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				sum = 0;
				for (int k = j; k < a.length; k++) {

					sum += a[k][i];

					if (sum == sumToFind) {

						for (int p = j; p <= k; p++) {
							b[p][i] = a[p][i];
						}
						k = a.length;
					}
				}
			}
		}
		return b;
	}

}
