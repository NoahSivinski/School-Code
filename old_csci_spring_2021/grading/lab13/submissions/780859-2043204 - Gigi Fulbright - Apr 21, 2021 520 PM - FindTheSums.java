/**
 * FindTheSums.java 
 * Author: Jordyn Fulbright 
 * Submission Date: April 23rd
 *
 * Purpose: This class finds consecutive horizontal and vertical sums in two
 * dimensional arrays. If the program finds that consecutive numbers sum to the
 * number inputed, those numbers remain in the returned array. The numbers not
 * included in any consecutive sums are changed to zero.
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
 */

public class FindTheSums {

	public static String arrayToString(int[][] a) {
		String arrayString = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				arrayString += a[i][j];

				// to keep spaces in line
				if (j < a[0].length - 1) {

					arrayString += " ";

				}
			}
			if (i < a.length - 1) {

				arrayString += "\n";
			}
		}
		return arrayString;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		// creating new array with same values so that i don't manipulate the original
		int[][] array = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				array[i][j] = a[i][j];
			}
		}
		int sum = 0;

		for (int j = 0; j < array.length; j++) {
			/**
			 * variable safeHold ensures that if a number is apart of a sum beginning with
			 * another number that it will not be erased for not beginning a sum itself. It
			 * works by holding the place at which the sum is reached and not letting any of
			 * the numbers before or at it be equated to 0.
			 */
			int safeHold = -1;
			for (int i = 0; i < array[0].length; i++) {
				// resets the sums value for each number to have its own chance at beginning a
				// sum
				sum = array[j][i];
				// makes sure the number itself doesn't equal the sum, if it does, we just move
				// onto the next number
				if (sumToFind == sum) {

				}
				// if the last number in the sequence isn't part of another sum and doesn't
				// equal the sum, it turns into 0
				else if ((sum != sumToFind) && (i == (array[0].length - 1))) {
					array[j][i] = 0;

				}
				// begins sum calculation
				else {
					for (int k = i + 1; (k < array[0].length); k++) {
						sum += array[j][k];
						// if sum < sumToFind then the program should keep adding consecutive numbers
						if (sum < sumToFind) {
							// unless the sum is less than the sum to find on the last number in the row
							if ((k == (array[0].length - 1)) && (i > safeHold)) {
								array[j][i] = 0;
							}
						}
						// if the sum = sumToFind k will be assigned a value that makes the loop stop
						// and the safeHold value is assigned
						else if (sum == sumToFind) {

							safeHold = k;
							k = array[0].length;

						}
						// if the sum is greater than the sumToFind and the beginner of the sum is not
						// apart of another sum, the beginner of the sum will be assigned to 0.
						else if (sum > sumToFind) {

							if (i > safeHold) {

								array[j][i] = 0;
							}

						}
					}
				}
			}
		}
		return array;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		// creating new array with same values so that i don't manipulate the original
		int[][] array = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				array[i][j] = a[i][j];
			}
		}
		int sum = 0;

		for (int j = 0; j < array[0].length; j++) {
			/**
			 * variable safeHold ensures that if a number is apart of a sum beginning with
			 * another number that it will not be erased for not beginning a sum itself. It
			 * works by holding the place at which the sum is reached and not letting any of
			 * the numbers before or at it be equated to 0.
			 */
			int safeHold = -1;
			for (int i = 0; i < array.length; i++) {
				// resets the sums value for each number to have its own chance at beginning a
				// sum
				sum = array[i][j];

				// makes sure the number itself doesn't equal the sum, if it does, we just move
				// onto the next number
				if (sumToFind == sum) {

				}
				// if the last number in the sequence isn't part of another sum and doesn't
				// equal the sum, it turns into 0
				else if ((sum != sumToFind) && (i == (array.length - 1))) {
					array[i][j] = 0;
				}
				// begins sum calculation
				else {
					for (int k = i + 1; k < array.length; k++) {
						sum += array[k][j];
						// if sum < sumToFind then the program should keep adding consecutive numbers
						if (sum < sumToFind) {
							// unless the sum is less than the sum to find on the last number in the column
							if ((k == (array.length - 1)) && (i > safeHold)) {
								array[i][j] = 0;
							}

						}
						// if the sum = sumToFind k will be assigned a value that makes the loop stop
						// and the safeHold value is assigned
						else if (sum == sumToFind) {

							safeHold = k;
							k = array.length;
						}
						// if the sum is greater than the sumToFind and the beginner of the sum is not
						// apart of another sum, the beginner of the sum will be assigned to 0.
						else if (sum > sumToFind) {

							if (i > safeHold) {

								array[i][j] = 0;
							}

						}

					}
				}
			}
		}
		return array;
	}

}
