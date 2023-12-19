/*
 * FindTheSums.java
 * Author:  Anna Kerber
 * Submission Date:  4/19/21
 *
 * Purpose: This program has classes that print a neat representation 
 * of the parameter array and return an array that includes the 
 * values that add up to a specified number horizontally or vertically.
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
		int rows = a.length;
		int cols = a[0].length;
		String arr = "";

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr += a[i][j] + " ";
			}
			arr = arr.trim();
			if (i != rows - 1) {
				arr += "\n";
			}
		}
		return arr;
	}

	/*
	 * Initializes b as an array of all 0 with the same size as array a and loops
	 * through rows and columns of a. For each column on each row, loops through the
	 * following values on that row to see if that value and the continuous values
	 * add up to the desired sum at any point. If so, the values that add up to that
	 * sum are put in the b array in the same spot as they were on the a array.
	 * Then, the process begins again with the next column on the row. The
	 * horizontal sequences that do not add up to the desired sum are left at a
	 * value of 0. Returns b at the end.
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int rows = a.length;
		int cols = a[0].length;
		int rowSum = 0, numFound = 1;
		int[][] b = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = 0;
			}
		}

		for (int r = 0; r < rows; r++) {
			numFound = 1;
			for (int c = 0; c < cols; c++) {
				rowSum = a[r][c];
				numFound = 1;
				for (int k = c + 1; k < cols; k++) {
					rowSum += a[r][k];
					numFound++;
					if (rowSum == sumToFind) {
						for (int x = c; x < numFound + c; x++) {
							b[r][x] = a[r][x];
						}
					}
				}
			}
		}
		return b;
	}

	/*
	 * Initializes b as an array of all 0 with the same size as array a and loops
	 * through rows and columns of a. For each row on each column, loops through the
	 * following values on that column to see if that value and the continuous
	 * values add up to the desired sum at any point. If so, the values that add up
	 * to that sum are put in the b array in the same spot as they were on the a
	 * array. Then, the process begins again with the next row on the column. The
	 * vertical sequences that do not add up to the desired sum are left at a value
	 * of 0. Returns b at the end.
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int rows = a.length;
		int cols = a[0].length;
		int colSum = 0, numFound = 1;
		int[][] b = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = 0;
			}
		}

		for (int c = 0; c < cols; c++) {
			numFound = 1;
			for (int r = 0; r < rows; r++) {
				colSum = a[r][c];
				numFound = 1;
				for (int k = r + 1; k < rows; k++) {
					colSum += a[k][c];
					numFound++;
					if (colSum == sumToFind) {
						for (int x = r; x < numFound + r; x++) {
							b[x][c] = a[x][c];
						}
					}
				}
			}
		}
		return b;
	}

}
