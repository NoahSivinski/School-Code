/*
 * FindTheSums.java
 * Author:  Zachary Krausman
 * Submission Date:  25 April 2021
 *
 * Purpose: To practice searching and double arrays.
 * Find sums horizonatally and vertically in a double array using methods.
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

	private static int b[][];

	// This method will return a String that is a neat representation of the values in 'a'
	public static String arrayToString(int[][] a) {
		String printer = "";
		b = a;
		for (int row = 0; row < b.length; row++) { // row loop
			for (int column = 0; column < b[row].length; column++) { // column loop
				if (column < b[row].length - 1) {
					printer = printer + b[row][column] + " "; // print the values of each column for the row with a space
				}
				else{ // makes sure last value in array doesn't have a space after it
					printer = printer + b[row][column];  
				}
			}
			if (row < b.length - 1) { // only prints a new line until the last row
				printer = printer + "\n"; // new line for each new row
			}
		}
		return printer;
	}

	// This method will create a new output array called 'b' that has the same dimensions as 'a' that shows the horizontal sum the user wants
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		b = a; // output array
		int sum = sumToFind;
		int sumOfRow = 0; // sum of column indexes that will be used to compare to sum (sumToFind)
		for (int row = 0; row < b.length; row++) {
			boolean[] useful = new boolean [b[row].length]; // stores which numbers are useful in finding sum; if useful, set to true
			for (int column = 0; column < b[row].length; column++) {
				int count = column; // used to cycle through all indices of a row, as less indices in row, less comparisons to be made
				while (sumOfRow < sum && count < b[row].length) {
					sumOfRow += b[row][count]; // totals row sum to be compared with sum
					if (sumOfRow < sum) { // sum inconclusive so must increase the count to access next index
						if (sumOfRow < sum && count + 1 == b[row].length && (useful[count] != true)) {
							b[row][count] = 0;
						}
						count++;
					}
					else if (sumOfRow > sum) { // number not useful, should be replaced with a 0
						for (int i = column; i <= count; i++) {
							if (useful[i] != true) {
								b[row][i] = 0;
							}
						}
						count++;
						sumOfRow = 0; // reset sumOfRow
					}
					else if (sumOfRow == sum) { // useful numbers
						for (int i = column; i <= count; i++) { // first index to last (inclusive) are set to useful
							useful[i] = true;
						}
						count++;
						sumOfRow = 0; // reset sumOfRow
					}
				}
				sumOfRow = 0;
			}
		}
		return b;
	}

//	// This method will create a new output array called 'b' that has the same dimensions as 'a' that shows the vertical sum the user wants
//	public static int[][] verticalSums(int[][] a, int sumToFind) {
//		// TODO
//	}

}
