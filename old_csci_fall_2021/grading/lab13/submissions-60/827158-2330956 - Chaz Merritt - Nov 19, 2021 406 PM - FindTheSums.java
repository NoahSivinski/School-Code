/*
 * FindTheSums.java
 * Author:  Charles Merritt
 * Submission Date:  11/19/2021
 *
 * Purpose: This program uses object-oriented programming to print arrays to string with proper formatting,
 * as well as calculating sections of the array, vertically or horizontally, that have a sum equal to some
 * integer passed as sumToFind.
 *
 * Statement of Academic Honesty: CEM
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
     * function to return string with good formatting using nested loops and empty strings with concatenation.
     */
    public static String arrayToString(int[][] a) {
        String emptyStr = "";
        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0 ; j < a[i].length; j++) {
                if (j == a[i].length - 1) {
                    emptyStr += a[i][j];
                }
                else {
                    emptyStr += a[i][j] + " ";
                }
            }
            if (i != a.length - 1) {
                emptyStr += "\n";
            }
        }
        return emptyStr;
    }


    public static int[][] horizontalSums(int[][] a, int sumToFind) {
        // Make array 'b' with some dimensions as 'a'
        int[][] b = new int [a.length] [a[0].length];
        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // initialize b array to 0's
                b[i][j] = 0;
            }
        }

        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0 ; j < a[i].length; j++) {
                int sum = 0, k = j;
                // find every possible sum of horizontal numbers
                while (k < a[i].length) {
                    sum += a[i][k];
                    // if sum becomes greater than sumToFind, then break
                    if (sum > sumToFind) {
                        break;
                    }
                    // if sum is equal to sumToFind, put the corresponding values into array 'b'
                    if (sum == sumToFind) {
                        for (int t = j; t <= k; t++)
                            b[i][t] = a[i][t];
                        break;
                    }
                    k++;
                }
            }
        }
        return b;
    }

    public static int[][] verticalSums(int[][] a, int sumToFind) {
        // Make array 'b' with same dimensions as 'a'
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // initialize b array to 0's
                b[i][j] = 0;
            }
        }
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                int sum = 0, k = j;
                // find every possible sum of vertical numbers
                while (k < a.length) {
                    sum += a[k][i];
                    // if sum becomes greater than sumToFind, then break
                    if (sum > sumToFind) {
                        break;
                    }
                    // if sum is equal to sumToFind, put the corresponding values into array 'b'
                    if (sum == sumToFind) {
                        for (int t = j; t <= k; t++)
                            b[t][i] = a[t][i];
                        break;
                    }
                    k++;
                }
            }
        }
        return b;
    }

}