/*
 * FindTheSums.java
 * Author:  Nazha Erakat 
 * Submission Date:  4/23/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program will find horizontal and vertical sums from a 2d array. 
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
		
		String string = "";
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				if (column != a[row].length - 1)

					string = string + a[row][column] + " ";
				else
					string = string + a[row][column];
			}
			if (row != a.length - 1) {
				string = string + "\n";
			}
		}
		return string;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		int currentSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				currentSum = 0;
				for (int j = k; j < a[i].length; j++) {
					currentSum += a[i][j];
					if (sumToFind == currentSum) {
						for (int z = k; z <= j; z++)
							b[i][z] = a[i][z];
					}
					while (currentSum >= sumToFind && a.length > sumToFind) {
						{
							b[i][j] = 0;
						}
					}
				}
			}
		}
		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		int currentSum = 0;

		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length; k++) {
				currentSum = 0;
				for (int i = k; i < a.length; i++) {
					currentSum += a[i][j];
					if (currentSum == sumToFind) {
						for (int z = k; z <= i; z++) {
							b[z][j] = a[z][j];
						}
					}
					while (currentSum >= sumToFind && a.length > sumToFind) {
						b[i][j] = 0;
					}
				}
			}
		}
		return b;
	}
}
