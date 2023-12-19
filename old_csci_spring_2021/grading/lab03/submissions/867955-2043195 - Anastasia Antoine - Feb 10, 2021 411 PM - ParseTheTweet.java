import java.util.Scanner;

/** ParseTheTweet.java
 * Author:  Anastasia Antoine
 * Submission Date:  [2/10/2021]
 *
 * Purpose:  This program is for you to input tweet and then it splits it into different 
 * categories. 
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
 * 
 */
public class ParseTheTweet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = input.nextLine(); 
		
		String type = tweet.split(";")[0]; 
		String detail = tweet.split(";")[1];
		String location = tweet.split(";")[2];  
		String latitude = tweet.split(";")[3];
		String longitude = tweet.split(";")[4]; 
		
		type = type.trim().substring(5, type.length()).toUpperCase();
		detail = detail.trim().replaceAll(",", "-").substring(5, detail.length()-1);
		location = location.trim().replaceAll(",","-" ).substring(5, location.length()-1);
		latitude = latitude.trim().substring(5, latitude.length()-1);
		longitude = longitude.trim().substring(5, longitude.length()-1) ;
		
		
		
		System.out.println("Type:" + "\t" + "\t" + type);
		System.out.println("Detail:" + "\t" + "\t" + detail);
		System.out.println("Location:" + "\t" + location);
		System.out.println("Latitude:"+ "\t"  + latitude);
		System.out.println("Longitude:"+ "\t" + longitude); 
		
		
		
		
		
		

	}

}
