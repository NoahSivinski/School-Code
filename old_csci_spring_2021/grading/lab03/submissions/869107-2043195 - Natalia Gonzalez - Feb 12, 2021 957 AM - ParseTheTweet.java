/*
 * ParseTheTweet.java
 * Author:  Natalia Gonzalez
 * Submission Date:  02-12-2021
 *
 * Purpose: The program ParseTheTweet will read in a single tweet
 * from the keyboard and then the tweets will be processed by the call
 * and encode the hastags using methods of String class and substring.
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

import java.util.Scanner;
public class ParseTheTweet {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a tweet below");
        String line = keyboard.nextLine(); //taking input from user and assigning it to line variable
        String type = "", location = "", detail = "";
        double latitude, longitude;
        int start, finish;
        
        //getting start and finish indexes of Type tag and value
        start = line.indexOf("#");
        finish = line.indexOf(";");
        //assigning to type varibale the value by extracting from main input
        type = line.substring(start + 5, finish);
        type = type.trim();
        type = type.toUpperCase();
        
        //getting start and finish indexes of Detail tag and value
        start = line.indexOf("#", finish + 1);
        finish = line.indexOf(";", finish + 1);
        //assigning to detail varibale the value by extracting from main input
        detail = line.substring(start + 5, finish);
        detail = detail.trim();
        detail = detail.replace(',', '-');
        
        //getting start and finish indexes of Location tag and value
        start = line.indexOf("#", finish + 1);
        finish = line.indexOf(";", finish + 1);
        //assigning to detail varibale the value by extracting from main input
        location = line.substring(start + 5, finish);
        location = location.trim();
        location = location.replace(',', '-');
        
        //getting start and finish indexes of Latitude tag and value
        start = line.indexOf("#", finish + 1);
        finish = line.indexOf(";", finish + 1);
        //assigning to detail varibale the value by extracting from main input
        String tempVariable = line.substring(start + 5, finish); //temporary variable to store latitude value as a string then after doing specific 
                                                                //operations on it and after validation, we will convert it in to double and assign its value
        tempVariable = tempVariable.trim();
        latitude = Double.parseDouble(tempVariable);
        
        //getting start and finish indexes of Longitude tag and value
        start = line.indexOf("#", finish + 1);
        finish = line.indexOf(";", finish + 1);
        //assigning to detail varibale the value by extracting from main input
        tempVariable = line.substring(start + 5, finish); //temporary variable to store longitude value as a string then after doing specific 
                                                         //operations on it and after validation, we will convert it in to double and assign its value
        tempVariable = tempVariable.trim();
        longitude = Double.parseDouble(tempVariable);
        
        System.out.println("Type:\t\t" + type);
        System.out.println("Detail:\t\t" + detail);
        System.out.println("Location:\t" + location);
        System.out.println("Latitude:\t" + latitude);
        System.out.println("Longitude:\t" + longitude);
    }
    
}

