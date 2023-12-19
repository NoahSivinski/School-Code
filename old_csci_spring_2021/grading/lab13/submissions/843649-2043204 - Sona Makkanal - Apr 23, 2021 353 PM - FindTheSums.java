/*
 * [FindTheSums].java
 * Author:  [Sona Makkanal] 
 * Submission Date:  [4/23/21]
 *
 * Purpose: This program is a series of methods including arrayToString, horizontalSums, and verticalSums that are called in the FindTheSumsTester.java which tests and runs these different methods. The main goal is to convert a 2D array to a String and the additional two
 methods find the horizontal and vertical sums for a 2D input array and an input integer (sumToFind).
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

	// arrayToString method
	public static String arrayToString(int[][] a) {

		String array = "";
		
		String finalArray = "";

		// rows & columns
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (j == 0)

				// space
				{
					array = ("" + a[i][j]);
				} else

				{
					array = (" " + a[i][j]);
				}

				finalArray = finalArray + array;
			}

			// new line
			if (i != (a.length - 1))

			{
				finalArray = (finalArray + "\n");
			}
		}

		return finalArray;
	}

	// horizontalSums method
	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		int sum;
		int position;
		boolean Sum;

		// rows
		for (int i = 0; i < a.length; i++)

		{
			// columns
			for (int k = 0; k < a[0].length; k++)

			{
				sum = 0;
				position = 0;
				Sum = false;

				for (int j = k; j >= 0; j--)

				{

					sum += a[i][j];

					if (sum == sumToFind)

					{
						Sum = true;
						position = j;
					}
				}

				if (Sum == true)

				{
					for (int p = k; p >= position; p--)

					{
						b[i][p] = a[i][p];
					}
				}

			}

		}

		return b;
	}

	// verticalSums method
	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		int sum;
		int position;
		boolean Sum;

		// rows
		for (int i = 0; i < a[0].length; i++)

		{
			// columns
			for (int k = 0; k < a.length; k++) {
				sum = 0;
				position = 0;
				Sum = false;

				for (int j = k; j >= 0; j--) {
					sum += a[j][i];

					if (sum == sumToFind) {
						Sum = true;
						position = j;
					}
				}
				if (Sum == true) {

					for (int p = k; p >= position; p--) {
						b[p][i] = a[p][i];
					}
				}

			}
		}
		return b;

	}

}