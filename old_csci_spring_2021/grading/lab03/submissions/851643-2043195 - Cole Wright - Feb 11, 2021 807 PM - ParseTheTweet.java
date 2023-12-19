/*
 * ParseTheTweet.java
 * Author:  Cole Wright 
 * Submission Date: 2/11/21 

 * * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program is used to pull out the important information from a given tweet and form an easy to read 
 * version of the information. It sorts the information into a list and allows the reader to find what they 
 * need to with speed and little confusion.
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
       System.out.println("Enter tweet below");
       String tweet=keyboard.nextLine();

       int start=tweet.indexOf("#");
       int finish=tweet.indexOf(";");

       String type;
       start=start+5;
       type=tweet.substring(start, finish);
       type=type.trim();
       type=type.toUpperCase();
       System.out.println("Type: \t\t"+type);
       
       String detail;
       tweet=tweet.substring(finish+1);
       start=tweet.indexOf("#");
       finish=tweet.indexOf(";");
       start=start+5;
       detail=tweet.substring(start, finish);
       detail=detail.trim();
       System.out.println("Detail: \t"+detail);
       
       String location;
       tweet=tweet.substring(finish+1);
       start=tweet.indexOf("#");
       finish=tweet.indexOf(";");
       start=start+5;
       location=tweet.substring(start, finish);
       location=location.trim();
       System.out.println("Location: \t"+location);
       
       String latitude;
       tweet=tweet.substring(finish+1);
       start=tweet.indexOf("#");
       finish=tweet.indexOf(";");
       start=start+5;
       latitude=tweet.substring(start, finish);
       latitude=latitude.trim();
       System.out.println("Latitude: \t"+latitude);
       
       String longitude;
       tweet=tweet.substring(finish+1);
       start=tweet.indexOf("#");
       finish=tweet.indexOf(";");
       start=start+5;
       longitude=tweet.substring(start, finish);
       longitude=longitude.trim();
       System.out.println("Longitude: \t"+longitude);
       
    

	}

}
