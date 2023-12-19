import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		/*
		 * [Class name here].java
		 * Author:  [Your name here] 
		 * Submission Date:  [Submission date here]
		 *
		 * Purpose: A brief paragraph description of the
		 * program. What does it do?
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
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a tweet");
		String tweet = keyboard.nextLine();
		
		int Start = tweet.indexOf("#");
		int Finish = tweet.indexOf(";");
		
		
	String typ = tweet.substring(Start+5, Finish); 
		String typ_trim = typ.trim(); 
	String typ_1 = typ_trim.toUpperCase(); 
		
	tweet= tweet.substring(Finish+1); 
	
	int Finish_det = tweet.indexOf(";");
	String det = tweet.substring(Start+4, Finish_det);
	String det_trim = det.trim();
	String det_re= det_trim.replace(',', '-'); 
	
	
	tweet = tweet.substring(Finish_det+1);
	
	int Finish_loc = tweet.indexOf(";");
	String loc = tweet.substring(Start+5, Finish_loc);
	String loc_trim = loc.trim();
	String loc_re = loc_trim.replace(',', '-');
	
	
	tweet = tweet.substring(Finish_loc+1);
	
	int Finish_lat = tweet.indexOf(";");
	String lat = tweet.substring(Start+5, Finish_lat);
	String lat_trim = lat.trim();
	
	
	tweet = tweet.substring(Finish_lat+1);
	
	int Finish_lng = tweet.indexOf(";");
	String lng = tweet.substring(Start+5, Finish_lng);
	String lng_trim = lng.trim();
	
	
	
	
	System.out.println("Type:    \t" + typ_1);
	System.out.println("Detail: \t" + det_re);
	System.out.println("Location: \t" + loc_re);
	System.out.println("Latitude: \t" + lat_trim);
	System.out.println("Longitude: \t" + lng_trim);
	
	
	
	}

}
