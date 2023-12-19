/*
 * FindTheSums.java
 * Author:  Jonathan Anderson
 * Submission Date:  11/17/2021
 *
 * Purpose: Given a certain sum to find in a 2d array, finds all the elements in that array that
 * add up to given sum. Returns a 2d array where non-included elements are 0. Can find horizontal
 * or vertical sums.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.
 */

public class FindTheSums {
    public static String arrayToString(int[][] a){
        String rtn = "";

        //loops through entire array
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                rtn += a[i][j];
                //if statement ensures no spaces after final character in row
                if(j != a[i].length - 1){
                    rtn += " ";
                }
            }
            //if statement ensures no new line character after final row
            if(i != a.length - 1){
                rtn += "\n";
            }
        }

        return rtn;
    }

    public static int[][] horizontalSums(int[][] a, int sumToFind){
        int[][] b = new int[a.length][a[0].length];

        //loops through the array, rows first
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                int distance = 0;
                int jindex = j;
                int sum = 0;

                //finds a sum that is either equal to or greater than sumToFind
                while(sum < sumToFind && jindex < a[0].length){
                    sum += a[i][jindex];
                    distance++;
                    jindex++;
                }

                //code handles adding a sum to b[][] if a sum is successfully found
                if(sum == sumToFind){
                    //jindex gets reset to j again
                    jindex = j;
                    //adding ints to b[][] as long as they are part of the sum
                    while(jindex <= distance && jindex < a[0].length){
                        b[i][jindex] = a[i][jindex];
                        jindex++;
                    }
                }
                //sets current element to 0 in b if not a part of the sum
                if(b[i][j] != a[i][j]){
                    b[i][j] = 0;
                }
            }
        }

        return b;
    }

    public static int[][] verticalSums(int[][] a, int sumToFind){
        int[][] b = new int[a.length][a[0].length];

        //loops through array, columns first
        for(int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                int distance = 0;
                int index = i;
                int sum = 0;

                //finds a sum that is either equal to or greater than sum to find
                while (sum < sumToFind && index < a.length) {
                    sum += a[index][j];
                    distance++;
                    index++;
                }

                //if found sum is equal to the sum to find, those elements get added to b
                if (sum == sumToFind) {
                    index = i;
                    sum = 0;
                    //makes sure that all necessary elements get added to b
                    while ((index < distance && index < a.length) || (sum < sumToFind && index < a.length)) {
                        b[index][j] = a[index][j];
                        sum += b[index][j];
                        index++;
                    }
                }

                //if current element is not part of a sum, gets set to 0 in b
                if (b[i][j] != a[i][j]) {
                    b[i][j] = 0;
                }
            }
        }

        return b;
    }
}
