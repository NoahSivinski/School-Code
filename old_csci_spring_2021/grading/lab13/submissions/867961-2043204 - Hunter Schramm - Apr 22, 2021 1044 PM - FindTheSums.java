/**
 * [FindTheSums].java 
 * Author: [Hunter Schramm] 
 * Submission Date: [04/22/21]
 *
 * Purpose:This program converts a 2D array to a printable String and finds the
 * horizontal and vertical sums for a 2D input array and an input integer.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither received nor given
 * inappropriate assistance. I have not copied or modified code from any source
 * other than the course webpage or the course textbook. I recognize that any
 * unauthorized assistance or plagiarism will be handled in accordance with the
 * University of Georgia's Academic Honesty Policy and the policies of this
 * course. I recognize that my work is based on an assignment created by the
 * Department of Computer Science at the University of Georgia. Any publishing
 * or posting of source code for this assignment is strictly prohibited unless
 * you have written consent from the Department of Computer Science at the
 * University of Georgia.
 *
 *
 * @author hunterschramm
 *
 *
 **/
public class FindTheSums {

	/**
	 * @param args
	 */
	
	// returns array as a string
	public static String arrayToString(int[][] a) {
		String res = "";

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (j == a[i].length - 1)
					res += a[i][j];
				else
					res += a[i][j] + " ";
			}
			if (i != a.length - 1)
				res += "\n";
		}
		return res;
	}

	// horizontalSums
	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				b[i][j] = 0;

		// initializing all the elements in array b to be 0
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int sum = 0, h = j;

				// finding every sum in each row
				while (h < a[i].length) {
					sum += a[i][h];

					if (sum > sumToFind)
						break;

					if (sum == sumToFind) {

						for (int t = j; t <= h; t++)
							b[i][t] = a[i][t];
						break;
					}
					h++;
				}
			}
		}
		return b;
	}

	// verticalSums
	public static int[][] verticalSums(int[][] a, int sumToFind) {

		// new array b
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++)

			for (int j = 0; j < a[i].length; j++)
				b[i][j] = 0;

		// initializing all the elements in array b to be 0
		for (int i = 0; i < a[0].length; i++) {

			for (int j = 0; j < a.length; j++) {
				int sum = 0, h = j;

				// finding every sum in each column
				while (h < a.length) {
					sum += a[h][i];
					if (sum > sumToFind)
						break;

					if (sum == sumToFind) {
						for (int t = j; t <= h; t++)
							b[t][i] = a[t][i];
						break;
					}
					h++;
				}
			}
		}
		return b;
	}

}