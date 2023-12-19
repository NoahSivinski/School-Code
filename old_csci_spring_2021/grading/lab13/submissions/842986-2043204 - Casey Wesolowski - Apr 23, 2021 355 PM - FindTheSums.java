

/*
 * CSCI1301 27827
 * FindTheSums.java
 * Author:  Casey Wesolowski 
 * Submission Date:  April 23th, 2021
 *
 * Purpose:  The purpose of this lab is to work with and 
 * help understand 2-dimensional arrays.
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
	
	//returns a string with the neat values in a
	//columns: a single space between each character – no space b/w the first value and last value
	//rows: \n between each character – no newline character before the first row or after the last
	public static String arrayToString(int[][] a)	{
		String formatting = "";
        for (int i = 0; i < a.length; i++)	{
            for (int j = 0; j < a[i].length; j++)	{
            	formatting = formatting + a[i][j] + " ";
            }
            formatting = formatting + "\n";
		}
		return formatting;
	}
	//creates a new output array b that has the same dimensions of a
	public static int[][] horizontalSums(int[][] a, int sumToFind)	{
        for (int i = 0; i < a.length; i++)	{
            for (int j = 0; j < a[i].length; j++)	{
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
		}
        int[][] b = a;
        //variables
		int rowSum = 0;
		int i = 0;
		int j = 0;
		//hopeful calculation
		for (i = 0; i < a.length; i++)	{
			rowSum = 0;
			for (j = 0; j < a[i].length - 1; j++)	{
			rowSum += b[i][j];
			}
		}
		//checking valid indices
		if((i != 0) || (j != 0)) {
			if(rowSum == sumToFind)	{
				b[i][j] = a[i][j];
			}
			else	{
				b[i-1][j-1] = 0;
			}
		}
		return b;
	}
	//creates a new output array b that has the same dimensions of a
	public static int[][] verticalSums(int[][] a, int sumToFind)	{
        for (int i = 0; i < a.length; i++)	{
            for (int j = 0; j < a[i].length; j++)	{
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
		}
        int[][] b = a;
        //variables
		int columnSum = 0;
		int i = 0;
		int j = 0;
		//hopeful calculation
		for (i = 0; i < a.length; i++)	{
			columnSum = 0;
			for (j = 0; j < a[i].length - 1; j++)
			columnSum += b[i][j];
		}
		//checking valid indices
		if((i != 0) || (j != 0)) {
			if(columnSum == sumToFind)	{
				b[i][j] = a[i][j];
			}
			else	{
				b[i-1][j-1] = 0;
			}
		}
		return b;
	}


}
