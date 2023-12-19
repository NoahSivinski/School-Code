/*
 * FindTheSums.java
 * Author:  Tenacity Murdie 
 * Submission Date:  11-15-2021
 *
 * Purpose: This class consists of methods that print out a 2D array, find horizontal sums in an array that add up to a given integer, and 
 * find vertical sums in an array that add up to a given integer
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

	/*
	 * Returns a String that is a neat representation of the values in a
	 * There are no spaces after the last value in a row
	 * And there are no newlines after the last row
	 */
	public static String arrayToString(int[][] a) {
		String arrayString = "";
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				arrayString += (a[i][j] + " ");
			}
			arrayString += (a[i][a[i].length - 1] + "\n");
		}
		for (int i = 0; i< a[a.length - 1].length - 1; i++) {
			arrayString += (a[a.length - 1][i] + " ");
		}
		arrayString += (a[a.length - 1][a[a.length - 1].length - 1]);
		return arrayString;
	}
	
	/*
	 * Creates a new output array with the same dimensions as a
	 * Includes integers that add up to sumToFind horizontally
	 * Otherwise, values are 0
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[a.length-1].length];
		int sum;
		int index;
		int count;
		//creates b with default values of 0
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
			//loops through every row
			for (int k = 0; k < a.length; k++) {
				//loops through every value in a row
				for (int position = 0; position < a[k].length; position++) {
					index = position;
					sum = 0;
					count = 0; //keeps track of every value used in sum
					//sums up every value at and to the right of our starting position until sum >= sumToFind
					while (sum < sumToFind && index < a[k].length) {
						sum += a[k][index];
						count++;
						if (sum == sumToFind) {
							//assigns values used in sum to b array
							for (int l = position; l < position + count && l < a[k].length; l++) {
								b[k][l] = a[k][l];
							}
						}
						index++;
					}
				}
			}
		}
		return b;
	}
	
	/*
	 * Creates a new output array with the same dimensions as a
	 * Includes integers that add up to sumToFind vertically
	 * Otherwise, values are 0
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[a.length-1].length];
		int sum;
		int index;
		int count;
		//creates b with default values of 0
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
		}
		//loops through every column (a[0] used since these are rectangular arrays)
		for (int k = 0; k < a[0].length; k++) {
			//loops through every value in a column
			for (int position = 0; position < a.length; position++) {
				index = position;
				sum = 0;
				count = 0; //keeps track of every value used in sum
				//sums up every value at and below our starting position until sum >= sumToFind
				while (sum < sumToFind && index < a.length) {
					sum += a[index][k];
					count++;
					if (sum == sumToFind) {
						//assigns values used in sum to b array
						for (int l = position; l < position + count && l < a.length; l++) {
							b[l][k] = a[l][k];
						}
					}
					index++;
				}
			}
		}
		return b;
	}

}
