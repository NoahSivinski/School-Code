/*
 * FindTheSums.java
 * Author:  Sunny Shah 
 * Submission Date:  04/23/2021
 *
 * Purpose: This program is like “Word Search” puzzles games where players are given a 2D (two dimensional) array 
 * of letters and the goal is to find words that are spelled horizontally, vertically, and diagonally. 
 * This program will do something similar, but will use integers and sums instead of letters and words. 
 * This program will find horizontal and vertical sums in a 2D input array of integers that equal some input 
 * integer value (i.e. find all horizontal sums in a 2D array that equal 20). This program won’t be finding 
 * diagonal sums.
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

	// Returns a String that is a neat representation of the values in a.
	// The values in each column of a have a single space between them and the rows have a 
	// single newline character between them.
	public static String arrayToString(int[][] a) {

		String neatString = ""; // holds the cleaned up string

		// for rows
		for (int i = 0; i < a.length; i++) 
		{
			// for columns
			for (int z = 0; z < a[0].length; z++) 
			{
				neatString = neatString + a[i][z];

				// spacing
				if (z < a[0].length - 1)
				{
					neatString = neatString + " ";
				}
			}

			// lining
			if (i < a.length - 1)
			{
				neatString = neatString + "\n";
			}
		}
		return neatString;
	}

	// Creates a new output array called b that has the same dimensions as a. For 
	// each a[i][j], where i and j are valid indices in a, if a[i][j] is part of a horizontal sum in a that 
	// equals sumToFind, then b[i][j] = a[i][j]. Otherwise, b[i][j] = 0. Returns b.
	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		// new array b has the same dimensions as a
		int [][] b = new int [a.length][a[0].length];

		// Otherwise, b[i][j] = 0.
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[0].length; j++)
			{
				b[i][j] = 0;
			}
		}

		// For each a[i][j], where i and j are valid indices in a, if a[i][j] is part of 
		// a horizontal sum in a that equals sumToFind, then b[i][j] = a[i][j].

		// for rows
		for (int i = 0; i < a.length; i++) 
		{ 
			// for columns
			for (int j = 0; j < a[0].length; j++) 
			{ 
				int sum = 0;
				int counter = 0;

				// checks
				for (int z = j; z < a[0].length; z++) 
				{ 
					if (sum < sumToFind) 
					{
						sum = sum + a[i][z];
						counter++;
					}
				}

				// replaces the b array
				if (sum == sumToFind)
				{ 
					for (int z = 0; z < counter; z++)
					{
						b[i][j + z] = a[i][j + z];
					}
				}
			}
		}
		return b;
	}

	// Creates a new output array called b that has the same dimensions as a. For 
	// each a[i][j], where i and j are valid indices in a, if a[i][j] is part of a vertical sum in a that 
	// equals sumToFind, then b[i][j] = a[i][j]. Otherwise, b[i][j] = 0. Returns b.
	public static int[][] verticalSums(int[][] a, int sumToFind) {

		// new array b has the same dimensions as a
		int [][] b = new int[a.length][a[0].length];

		// Otherwise, b[i][j] = 0. 
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[0].length; j++)
			{
				b[i][j] = 0;
			}
		}

		// For each a[i][j], where i and j are valid indices in a, if a[i][j] is part of a 
		// vertical sum in a that equals sumToFind, then b[i][j] = a[i][j].

		// for columns
		for (int i = 0; i < a[0].length; i++) 
		{ 
			// for rows
			for (int j = 0; j < a.length; j++) 
			{ 
				int sum = 0;
				int counter = 0;

				// checks
				for (int z = j; z < a.length; z++) 
				{ 
					if (sum < sumToFind)
					{
						sum = sum + a[z][i];
						counter++;
					}
				}

				// replaces the b array
				if (sum == sumToFind) 
				{ 
					for (int z = 0; z < counter; z++)
					{
						b[j + z][i] = a[j + z][i];
					}
				}
			}
		}
		return b;
	}

}