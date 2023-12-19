/* ParseTheTweet.java
 * Author: Madison Bardwell 
 * Submission Date: 2/12/21
 *
 * Purpose: This program uses string to collect a tweet from the user and process the message to pull out information and manipulate it 
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
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a tweet below");			//Prompts the user to enter their single line of text
		String tweet= input.nextLine();						// This allows the user to enter their tweet
		
		String type;
		String location;				
		String detail;								//I declared all 5 variables with names that made since based on the info they would later represent
		String latitude;
		String longitude;
		
		int start= tweet.indexOf("#");				//this finds the index of the first and last part of the tweet. the # and the ;
		int finish= tweet.indexOf(";");
		
		int start2= tweet.indexOf("#", start+1);	//I used this to discard the previous section of the tweet and start at the new one. it does the same thing as the original start and finish
		int finish2=tweet.indexOf(";", finish+1);
		
		int startloc= tweet.indexOf("#", start2+1);
		int finishloc=tweet.indexOf(";", finish2+1);		//I used this to discard the previous section of the tweet and start at the new one. it does the same thing as the original start and finish
		
		int startlat= tweet.indexOf("#", startloc+1);
		int finishlat=tweet.indexOf(";", finishloc+1);		//I used this to discard the previous section of the tweet and start at the new one. it does the same thing as the original start and finish
		
		int startlon= tweet.indexOf("#", startlat+1);
		int finishlon=tweet.indexOf(";", finishlat+1);		//I used this to discard the previous section of the tweet and start at the new one. it does the same thing as the original start and finish
		
		type= tweet.substring(start+4,finish); //this specifies the earlier declared variables
		String typetrimmed= type.trim();		//this trimmed away the excess spaces around the needed info
		String typeupper= typetrimmed.toUpperCase();	//this made the info all upper case		
		
		detail= tweet.substring(start2+4,finish2);		//this specifies the earlier declared variables
		String detailtrimmed=detail.trim();		//this trimmed away the excess spaces around the needed info
		String detailrep= detailtrimmed.replace(',','-'); // this replaced all of the commas with a single hiphen in the info taken from the tweet
		
		location= tweet.substring(startloc+4,finishloc);		//this specifies the earlier declared variables
		String locationtrimmed=location.trim();		//this trimmed away the excess spaces around the needed info
		String locationrep= locationtrimmed.replace(',','-');		// this replaced all of the commas with a single hiphen in the info taken from the tweet
		
		latitude= tweet.substring(startlat+4,finishlat);		//this specifies the earlier declared variables
		String latitudetrimmed=latitude.trim();		//this trimmed away the excess spaces around the needed info
		
		longitude= tweet.substring(startlon+4,finishlon);		//this specifies the earlier declared variables
		String longitudetrimmed=longitude.trim();		//this trimmed away the excess spaces around the needed info
		
		System.out.println();			// this created a space between the tweet entered and the infor that was taken from it
		System.out.println("Type:\t\t"+typeupper);
		System.out.println("Detail:\t\t"+ detailrep);			//lines 71-75 print out the info taken from the tweet the user entered in a desired and easily understood way w/ all of the previous alterations made in the previous lines of code in effect
		System.out.println("Location:\t"+locationrep);
		System.out.println("Latitude:\t"+latitudetrimmed);
		System.out.println("Longitude:\t"+longitudetrimmed);
		
		
		
		
		
		
		input.close();			//closes the scanner
	}

}
