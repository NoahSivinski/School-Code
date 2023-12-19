/*
 * FindTheSums.java
 * Author: Ofuan Oyakhire
 * Submission Date: 04/23/21
 *
 * Purpose:
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

    // Neatly print out the 2d array
    public static String arrayToString(int[][] a) {

        String sb = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j != a[i].length - 1) {
                    sb += a[i][j] + " ";
                } else {
                    sb += a[i][j];
                }
            }
            if (i != a.length - 1) {
                sb += "\n";
            }
        }
        return sb;
    }

    // Find all the horizontal sums in a 2d array
    public static int[][] horizontalSums(int[][] a, int sumToFind) {
        int[][] b = copy(a);
        for (int i = 0; i < a.length; i++) { // loop through each row
            int[] temp = a[i]; // create a temp int array
            for (int j = 0; j < temp.length; j++) { // loop through temp array
                int sum = 0;
                for (int k = j; k < temp.length; k++) { // get sum starting from each index
                    sum += temp[k];
                    if (sum == sumToFind) { // if the sumToFind is found, then fill the array b with it
                        for (int l = j; l <= k; l++) {
                            b[i][l] = temp[l];
                        }
                        break; // go to the next row
                    }
                }
            }
        }
        return b;
    }

    // Finds all th vertical sums in a 2d array
    public static int[][] verticalSums(int[][] a, int sumToFind) {
        int[][] b = copy(a);
        for (int i = 0; i < a[0].length; i++) { // loop through each column
            int[] temp = columnToRow(a, i); // create a temp int array (column to row)
            for (int j = 0; j < temp.length; j++) { // loop through temp array
                int sum = 0;
                for (int k = j; k < temp.length; k++) { // get sum starting from each index
                    sum += temp[k];
                    if (sum == sumToFind) { // if the sumToFind is found, then fill the array b with it
                        for (int l = j; l <= k; l++) {
                            b[l][i] = temp[l];
                        }
                        break; // go to the next column
                    }
                }
            }
        }
        return b;
    }

    // Transform column into row to help visual the algo (easier to work with a single array)
    private static int[] columnToRow(int[][] array, int column) {
        int[] a = new int[array.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = array[i][column];
        }
        return a;
    }

    // Makes a copy of the 2d array but set all the values to 0
    private static int[][] copy(int[][] array) {
        int[][] myInt = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            myInt[i] = new int[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                myInt[i][j] = 0;
            }
        }

        return myInt;
    }
}
