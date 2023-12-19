/*
 * CSCI1301.java
 * Author:  Olivia Richardson
 * Submission Date:  23 April 2021
 *
 * Purpose: this program uses 2d input arrays of integers that have m rows 
 * and n columns where m>0 and n>0. the input arrays contain only integers
 * ranging from 1 to 9. the goals of this lab are to write a method that
 * covers a 2d array to a neatly printable string and to write two 
 * additional methods that find horizontal and vertical sums for a 2d input
 * array and an input integer called sumToFind. the sums should add up to 20.
 * sums can overlap, too. there are 3 methods in this class: arrayToString, 
 * horrizontalSums, and verticalSums
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

	// the below method returns a string that is a neat representation of the values
	// in a.
	public static String arrayToString(int[][] a) {
		
		String representation = "";
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				if (j == a[i].length - 1)
					representation += a[i][j];
				
				else
					representation += a[i][j] + " ";
			}
			
			if (i != a.length - 1)
				representation += "\n";
		}
		return representation;
	}

	// the below method creates a new output array called b that has
	// the same dimensions as a. For each a[i][j], where i and j are valid indices
	// in a, if a[i][j] is part of a horizontal sum in a that equals sumToFind, then
	// b[i][j] = a[i][j]; otherwise, b[i][j] = 0. The method should return b
	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length]; // creating new array b with same dimensions as a **/
		
		for (int i = 0; i < a.length; i++)
			
			for (int j = 0; j < a[i].length; j++)
				b[i][j] = 0;
		
		// initializing all elements to be 0 in array b
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				int sum = 0, h = j;
				
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
		return b; // return b

	}

	// the below method creates a new output array called b that has
	// the same dimensions as a. For each a[i][j], where i and j are valid indices
	// in a, if a[i][j] is part of a vertical sum in a that equals sumToFind, then
	// b[i][j] = a[i][j]; otherwise, b[i][j] = 0. The method should return b.
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		
		int[][] b = new int[a.length][a[0].length]; //creating new array b with same dimensions as a **/
		
		for (int i = 0; i < a.length; i++)
			
			for (int j = 0; j < a[i].length; j++)
				b[i][j] = 0;
		
		// initialize elements to be 0 in array b
		
		for (int i = 0; i < a[0].length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				int sum = 0, h = j;
				
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
		return b; // return b
	}
}
