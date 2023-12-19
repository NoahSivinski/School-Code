/*
* ParseTheTweet
 * Author:  Husain Naseer 
 * Submission Date:  09.17.2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * In this lab we used string and substring to use the information in the text and change it.
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
public class ParseTheTweet 
{

	   public static void main(String[] args) 
	   {

	       Scanner keyboard = new Scanner(System.in);
	       System.out.println("Enter a tweet below: ");
	       String tweet= keyboard.nextLine();
	       
	       int start=0;
	       int end=tweet.indexOf(";");
	    
	      
	      String type=(tweet.substring(start + 5, end)).trim();
	      type=type.toUpperCase();
	      tweet=tweet.substring(end+1);
	      start=0;
	      end=tweet.indexOf(";");
	       
	      String detail=(tweet.substring(start + 5, end)).trim();
	      detail=detail.replaceAll(",","-");
	      tweet=tweet.substring(end+1);
	      end=tweet.indexOf(";");
	      
	      String location=(tweet.substring(start + 5, end)).trim();
	      location=location.replaceAll(",","-");
	      tweet=tweet.substring(end+1);
	      end=tweet.indexOf(";");
	      
	      String latitude=(tweet.substring(start + 5, end)).trim();
	      tweet=tweet.substring(end+1);
	      end=tweet.indexOf(";");
	      
	      String longitude = (tweet.substring(start + 5, end)).trim();
	       
	      System.out.println("Type:	\t "+type);
	      System.out.println("Detail:	\t "+detail);
	      System.out.println("Location:\t "+location);
	      System.out.println("Latitude:\t "+latitude);
	      System.out.println("Longitude:\t "+longitude);
	      
	      keyboard.close();
	   }
	}
