/**
 * File name: FindTheSums.java
 * Author: Jacob Tate
 * Submission Date: Thursday, November 18th, 2021.
 *
 *This program allows the user to take a defined two dimensional array, print it out, 
 *and find the defined vertical and horizontal sums of said array. The methods all take a
 *two dimensional array as input, but the horizontalSums() and the verticalSums() methods also
 *take a integer parameter, called the sumToFind. The user can input any number there and the 
 *program will search for the values that make up the sum.
 *
 *Statement of Academic Honesty:
 *
 *The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be playerMoveled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
*/
public class FindTheSums 
{
	/**
	 * Below code functions similar to the toString() method in the String class. 
	 * It loops through every single item in the two dimensional array, adding the elements to an initially empty string.
	 * Each column in the array has a single space between them and the rows have a single newline character between them.
	 */
	public static String arrayToString(int[][] a)
	{
		String output = "";
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[0].length; col++)
			{
				if(row == a.length- 1 && col == a[0].length - 1)
				{
					output = output + a[row][col];
				}
				else
				{
					if(col == a[0].length - 1)
					{
						output = output + a[row][col];
					}
					else
					{
						output =  output + a[row][col] + " ";
					}
				}
			}
			if(row == a.length - 1)
			{
				output += "";
			}
			else
			{
				output += "\n";
			}
		}
		return output;
	}
	/*
	 * Below code will create a new array that is the same size of a.
	 * However, this new array will hold the values of the array that make up the input integer, sumToFind, horizontally.
	 * Two copies of the column variable are implemented, one is changed so that the program knows how many numbers it needs to store in the new array. 
	 * It loops through the columns "first" and then the rows "second", adding the value found in the columns to the sum, and constantly checks if the sum is greater or equal to the sumToFind parameter.
	 * If the sum, local variable, is equal to the sumToFind parameter, then the program will loop back through and add all the values that make the sum to the array.
	 * Otherwise, the values will stay zero. 
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind)
	{
		int sum = 0;
		int colCopy;
		int colSecondCopy;
		int[][] b = new int[a.length][a[0].length];
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[0].length; col++)
			{
				colCopy = col;
				while(sum < sumToFind && colCopy < a[0].length)
				{
					sum += a[row][colCopy];
					colCopy++;
				}
				if(sum == sumToFind)
				{
					colSecondCopy = col;
					while(colSecondCopy < colCopy)
					{
						b[row][colSecondCopy] = a[row][colSecondCopy];
						colSecondCopy++;
					}
				}
				else
				{
					colSecondCopy = col;
					while(colSecondCopy < colCopy)
					{
						if(b[row][colSecondCopy] == 0)
						{
							b[row][colSecondCopy] = 0;
							
						}
						colSecondCopy++;
					}
				}
				sum = 0;
				colCopy = 0;
				colSecondCopy = 0;
			}
			
		}
		return b;
	}
	/*
	 * Below code will create a new array that is the same size of a.
	 * However, this new array will hold the values of the array that make up the input integer, sumToFind, vertically.
	 * Two copies of the column variable are implemented, one is changed so that the program knows how many numbers it needs to store in the new array. 
	 * It loops through the row "first" and then the columns "second", adding the value found in the rows to the sum, and constantly checks if the sum is greater or equal to the sumToFind parameter.
	 * If the sum, local variable, is equal to the sumToFind parameter, then the program will loop back through and add all the values that make the sum to the array.
	 * Otherwise, the values will stay zero. 
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind)
	{
		int sum = 0;
		int rowCopy;
		int rowSecondCopy;
		int[][] b = new int[a.length][a[0].length];
		for(int col = 0; col < a[0].length; col++)
		{
			for(int row = 0; row < a.length; row++)
			{
				rowCopy = row;
				while(sum < sumToFind && rowCopy < a.length)
				{
					sum += a[rowCopy][col];
					rowCopy++;
				}
				if(sum == sumToFind)
				{
					rowSecondCopy = row;
					while(rowSecondCopy < rowCopy)
					{
						b[rowSecondCopy][col] = a[rowSecondCopy][col];
						rowSecondCopy++;
					}
				}
				else
				{
					rowSecondCopy = row;
					while(rowSecondCopy < rowCopy)
					{
						if(b[row][col] == 0)
						{
							b[row][col] = 0;
							
						}
						rowSecondCopy++;
					}
				}
				sum = 0;
				rowCopy = 0;
				rowSecondCopy = 0;
			}
			
		}
		return b;
	}

}
