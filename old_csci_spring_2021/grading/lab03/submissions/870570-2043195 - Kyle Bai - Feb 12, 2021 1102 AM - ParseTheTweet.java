/*
 * [ParseTheTweet].java
 * Author:  [Kyle Bai] 
 * Submission Date:  [02/12/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program is use for natural and manmade disasters.
 * It could help emergency management agencies to get important imformation and they can broadcast timely and location specific to ordinary citizens.
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
       String tweet = keyboard.nextLine();
       
       String type = tweet.substring(0,tweet.indexOf(";")); //To get the information before the first ";".
       tweet = tweet.substring(tweet.indexOf(";") + 1);
       
       String detail = tweet.substring(0,tweet.indexOf(";")); //To get the information before the second ";".
       tweet = tweet.substring(tweet.indexOf(";") + 1);
      
       String location = tweet.substring(0,tweet.indexOf(";")); //To get the information before the third ";".
       tweet = tweet.substring(tweet.indexOf(";") + 1);
       
       String latitude = tweet.substring(0,tweet.indexOf(";")); //To get the information before the fourth ";".
       tweet = tweet.substring(tweet.indexOf(";") + 1);
       
       String longitude = tweet.substring(0,tweet.indexOf(";")); //To get the information before the fifth ";".
       
       type = type.substring(5, type.length()); //Pick the word that need to display.
       detail = detail.substring(5, detail.length()); //Pick the word that need to display.
       location = location.substring(5, location.length()); //Pick the word that need to display.
       latitude = latitude.substring(5,latitude.length()); //Pick the word that need to display.
       longitude = longitude.substring(5,longitude.length()); //Pick the word that need to display.
       
       System.out.println("Type: " + '\t' + '\t' + type.trim().toUpperCase()); //To trimm and uppercase.
       System.out.println("Detail: " + '\t' + detail.trim().replaceAll(",", "-")); //To trimm and replace , by -.
       System.out.println("Location: " + '\t' + location.trim().replaceAll(",", "-")); //To trimm and replace , by -.
       System.out.println("Latitude: " + '\t' + latitude.trim().replaceAll(",", "-")); //To trimm and replace , by -.
       System.out.println("Longitude: " + '\t' + longitude.trim().replaceAll(",", "-")); //To trimm and replace , by -.
       
       keyboard.close();
   }
}