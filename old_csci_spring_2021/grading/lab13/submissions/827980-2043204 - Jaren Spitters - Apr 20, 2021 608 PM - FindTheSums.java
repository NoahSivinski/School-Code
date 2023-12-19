/*
 * FindTheSums.java
 * Author:  Jaren Spitters 
 * Submission Date:  4/20/21
 *
 * Purpose: This program houses 3 methods related to the manipulation of 2D integer arrays. The first converts the array into a 
 * string that can be printed out, the second finds horizontal sums of the user's choice made with touching numbers in the specified 
 * array, just like an array of horizontal letters make up words in word searches. The third does the same exact thing but with 
 * vertical sums. 
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

		String newArray = "";

		for (int i = 0; i < a.length; i++) {

			for (int x = 0; x < a[i].length; x++) {

				newArray += a[i][x];

				if (x != a[i].length - 1) {

					newArray += " ";
				}
			}

			if (i != a.length - 1) {

				newArray += "\n";
			}
		}

		return newArray;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		int[][] c = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {

			for (int x = 0; x < a[i].length; x++) {

				int sum = 0;

				if ((a[i][x] < sumToFind) && (sum < sumToFind) && (sum + a[i][x] <= sumToFind)) {

					b[i][x] = a[i][x];
					sum += a[i][x];

					for (int y = x + 1; y < a[i].length; y++) {

						if ((a[i][y] < sumToFind) && (sum < sumToFind) && (sum + a[i][y] <= sumToFind)) {

							b[i][y] = a[i][y];
							sum += a[i][y];

						} else {

							y = a[i].length;
						}

						if (sum == sumToFind) {

							for (int z = x; z < a[i].length; z++) {

								c[i][z] = b[i][z];
							}

							y = a[i].length;
						}
					}

					if (sum != sumToFind) {

						for (int z = x; z < a[i].length; z++) {

							b[i][z] = 0;
						}
					}
				}
			}
		}
		
		return c;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		int[][] c = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {

			for (int x = 0; x < a.length; x++) {

				int sum = 0;

				if ((a[x][i] < sumToFind) && (sum < sumToFind) && (sum + a[x][i] <= sumToFind)) {

					b[x][i] = a[x][i];
					sum += a[x][i];

					for (int y = x + 1; y < a.length; y++) {

						if ((a[y][i] < sumToFind) && (sum < sumToFind) && (sum + a[y][i] <= sumToFind)) {

							b[y][i] = a[y][i];
							sum += a[y][i];

						} else {

							y = a.length;
						}

						if (sum == sumToFind) {

							for (int z = x; z < a.length; z++) {

								c[z][i] = b[z][i];
							}

							y = a.length;
						}
					}

					if (sum != sumToFind) {

						for (int z = x; z < a.length; z++) {

							b[z][i] = 0;
						}
					}
				}
			}
		}
		
		return c;
	}
}
