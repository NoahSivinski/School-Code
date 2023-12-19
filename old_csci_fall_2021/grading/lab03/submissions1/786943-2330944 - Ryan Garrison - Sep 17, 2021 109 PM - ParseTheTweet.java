/*ParseTheTweet
*Ryan Garrison 09/16/2021

*The purpose of this program is to take a users input tweet and display further details. These details are
*the report type of the tweet, the further details of the tweet, the locations of the tweet, the longitude 
*of the tweet, and the latitude of the tweet.

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
		
		// Here I am printing a promt for the user to enter a tweet along with allowing the user to input the tweet.
		System.out.println("Enter a tweet below");
		Scanner Keyboard = new Scanner(System.in);
		String Tweet = Keyboard.nextLine();
		// Here I am assigning variables
		String typ, det, loc, lat, lng;
		int start, finish;
			
			// These lines trim the tweet to remove any blank spaces
			// This also tell the program where to start and stop to collect the info for typ,det,loc,lat,lng
			start = Tweet.indexOf("#typ")+4;
			finish = Tweet.indexOf("; #det");
			typ = Tweet.substring(start,finish);
			typ.trim();
			
			start = Tweet.indexOf("#det")+4;
			finish = Tweet.indexOf("; #loc");
			det = Tweet.substring(start,finish);
			det.trim();
			
			start = Tweet.indexOf("#loc")+4;
			finish = Tweet.indexOf("; #lat");
			loc = Tweet.substring(start,finish);
			loc.trim();
			
			start = Tweet.indexOf("#lat")+4;
			finish = Tweet.indexOf("; #lng");
			lat = Tweet.substring(start,finish);
			lat.trim();
			
			start = Tweet.indexOf("#lng")+4;
			finish = Tweet.indexOf(";\"");
			lng = Tweet.substring(start,finish);
			lng.trim();
			
		// Here I am printing out the results of the tweets. Making the type upper case and replacing , with -.
		String typeupper =typ.toUpperCase();
		System.out.println("Type: " + "\t" + "\t" + typeupper);
		String detfinal = det.replace(",","-");
		System.out.println("Deatil: " + "\t" + detfinal);
		String locfinal = loc.replace(",","-");
		System.out.println("Location: " + "\t" + locfinal);
		System.out.println("latitude: " + "\t" + lat);
		System.out.println("Longitude: " + "\t" + lng);
		
		
			
			
			
			
			
		
		
		
		

	}

}
