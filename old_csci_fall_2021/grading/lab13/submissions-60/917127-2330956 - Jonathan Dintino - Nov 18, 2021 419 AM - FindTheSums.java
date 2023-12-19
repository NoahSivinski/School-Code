/*
 * FindTheSums.java
 * Author: Jonathan Dintino
 * Submission Date: 18 November 2021
 *
 * Purpose: This class contains utility functions including
 * arrayToString, horizontalSums, and verticalSums. The first
 * of these methods will output a two-dimensional array in a
 * grid format. The other methods will search for and show all
 * adjacent sequences in a two-dimensional array that add up to
 * a given number on the axis specified by the method name.
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
		String temp = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				temp += a[i][j];
				if (j < a[i].length - 1) {
					temp += " ";
				}
			}
			if (i < a.length - 1) {
				temp += "\n";
			}
		}
		return temp;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		
		int m = a.length;		// rows size
		int n = a[0].length;	// cols size
		
		int[][] b = new int[m][n];
		
		for (int r = 0; r < m; r++) { // 0 <= r < m
			// ROW START
			for (int c = 0; c < n; c++) { // 0 <= c < n
				// COL START
				int sum = 0;
				int[] rowData = new int[n];
				
				for (int v = c; v < n; v++) { // c <= v < n
					// VAL START
					int x = a[r][v]; // current element value
					
					if (sum < sumToFind) {
						// the sum is less than what we are trying to find
						if (sum + x > sumToFind) {
							// the next sum is greater than the sum to find
							rowData = new int[n];
							sum = x;
						} else {
							// the next sum is less than or equal to the sum to find
							sum += x;
						}
						rowData[v] = 1;
					}
					// VAL END
				}
				
				// if the sum is not the sum to find then clear row data
				if (sum != sumToFind) rowData = new int[n];
				
				// fill out the values in the new array based on the row data
				for (int k = 0; k < n; k++) {
					if (rowData[k] == 1) {
						b[r][k] = a[r][k];
					}
				}
				// COL END
			}
			// ROW END
		}
		
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		
		int m = a.length;		// rows size
		int n = a[0].length;	// cols size
		
		int[][] b = new int[m][n];
		
		for (int c = 0; c < n; c++) { // 0 <= c < n
			// COL START
			for (int r = 0; r < m; r++) { // 0 <= r < m
				// ROW START
				int sum = 0;
				int[] colData = new int[m];
				
				for (int v = c; v < m; v++) { // c <= v < m
					// VAL START
					int x = a[v][r]; // current element value
					
					if (sum < sumToFind) {
						// the sum is less than what we are trying to find
						if (sum + x > sumToFind) {
							// the next sum is greater than the sum to find
							colData = new int[m];
							sum = x;
						} else {
							// the next sum is less than or equal to the sum to find
							sum += x;
						}
						colData[v] = 1;
					}
					// VAL END
				}
				
				// if the sum is not the sum to find then clear col data
				if (sum != sumToFind) colData = new int[m];
				
				// fill out the values in the new array based on the col data
				for (int k = 0; k < m; k++) {
					if (colData[k] == 1) {
						b[k][r] = a[k][r];
					}
				}
				// ROW END
			}
			// COL END
		}
		
		return b;
	}
	
}