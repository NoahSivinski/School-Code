/*
 * CSCI1301.java
 * Author:  Brooks Ruehle 
 * Submission Date:  9/17/2021
 *
 * Purpose: This program takes the input of a tweet and prints out each topic and hashtag"
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

public class Lab3 {

	public static void main(String[] args) {
		
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a tweet below: \n");
        String tweet = keyboard.nextLine();
        
        String type = tweet.substring(tweet.indexOf("#typ"), tweet.indexOf("; #det"));
        String detail = tweet.substring(tweet.indexOf("#det"), tweet.indexOf("; #loc"));
        String loco = tweet.substring(tweet.indexOf("#loc"), tweet.indexOf("; #lat"));;
        String latitude = tweet.substring(tweet.indexOf("#lat"), tweet.indexOf("; #lng"));
        String longitude = tweet.substring(tweet.indexOf("#lng"), tweet.length() -1);
        
        String pType = type.substring(type.lastIndexOf("#typ") + 5, type.length() );
        System.out.println("Type:\t\t" + pType.toUpperCase());
        
        String pDetail = detail.substring(detail.lastIndexOf("#det") + 5, detail.length() );
        System.out.println("Detail:\t\t" + pDetail);
        
        String pLoco = loco.substring(loco.lastIndexOf("#loc") + 5, loco.length() );
        System.out.println("Location:\t" + pLoco);
        
        String pLatitude = latitude.substring(latitude.lastIndexOf("#lat") + 5, latitude.length() );
        System.out.println("Latitude: \t" + pLatitude);
        
        String pLongitude = longitude.substring(longitude.lastIndexOf("#lng") + 5, longitude.length() );
        System.out.println("Longitude:\t" + pLongitude);

	}

}
