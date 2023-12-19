/*
 * FindTheSum.java
 * Author:  Natalia Gonzalez
 * Submission Date:  04-23-2021
 *
 * Purpose: This program will be working with 2D input arrays of 
 * integers that have "m" rows and "n" columns. The goal is to write a 
 * method that convert a 2D array to a String and find the sums.
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
    
    public static String arrayToString(int[][] a)
    {
        String str = "";
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(col != 0)
                    str += " ";
                str += a[row][col];
            }
            if(row != a.length - 1)
                str += "\n";
        }
        return str;
    }
    
    public static int[][] horizontalSums(int[][] a, int sumToFind)
    {
        int[][] b = new int[a.length][a[0].length];
        
        for(int i = 0; i < b.length; i++) //first fill this array with all 0's
            for(int j = 0; j < b[i].length; j++)
                b[i][j] = 0;
        
        for(int row = 0; row < a.length; row++)
        {
            int tempSum = 0, col = 0, tempCol = 0;
            while(col < a[row].length)
            {
                tempSum += a[row][tempCol];
                if(tempSum > sumToFind)
                {
                    col++;
                    tempCol = col;
                    tempSum = 0;
                }
                else
                {
                    if(tempSum == sumToFind)
                    {
                        for(int j = col; j <= tempCol; j++) //for replacing original values if sum is found
                            b[row][j] = a[row][j];
                        col++;
                        tempCol = col;
                        tempSum = 0;
                    }
                    else if(tempCol == a[row].length - 1)
                    {
                        col++;
                        tempCol = col;
                        tempSum = 0;
                    }
                    else
                        tempCol++;
                }
            }
        }
        return b;
    }
    
    public static int[][] verticalSums(int[][] a, int sumToFind)
    {
        int[][] b = new int[a.length][a[0].length];
        
        for(int i = 0; i < b.length; i++) //first fill this array with all 0's
            for(int j = 0; j < b[i].length; j++)
                b[i][j] = 0;
        
        for(int col = 0; col < a[0].length; col++)
        {
            int tempSum = 0, row = 0, tempRow = 0;
            while(row < a.length)
            {
                tempSum += a[tempRow][col];
                if(tempSum > sumToFind)
                {
                    row++;
                    tempRow = row;
                    tempSum = 0;
                }
                else
                {
                    if(tempSum == sumToFind)
                    {
                        for(int j = row; j <= tempRow; j++) //for replacing original values if sum is found
                            b[j][col] = a[j][col];
                        row++;
                        tempRow = row;
                        tempSum = 0;
                    }
                    else if(tempRow == a.length - 1)
                    {
                        row++;
                        tempRow = row;
                        tempSum = 0;
                    }
                    else
                        tempRow++;
                }
            }
        }
        return b;
    }
}
