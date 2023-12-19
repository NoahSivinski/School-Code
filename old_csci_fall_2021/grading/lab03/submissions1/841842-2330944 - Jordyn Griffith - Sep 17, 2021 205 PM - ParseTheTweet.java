/*
 * [ParseTheTweet].java
 * Author:  [Jordyn Griffith] 
 * Submission Date:  [September 17, 2021]
 *
 * Purpose: This program is designed to process messages, or "tweets," 
 * input from a user regarding natural and man-made disasters. It then
 * manipulates them to be sorted into an efficient, orderly manner. 
 * It categorizes them by type, detail, location, and provides the latitude 
 * and longitude coordinates of the incident. 
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
import java.util.Scanner; //Import the Scanner Class 


public class ParseTheTweet {

	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in); //Create new Scanner Object 
		System.out.println("Enter a tweet below"); //Prompts user to enter a tweet 
		
		String tweet = keyboard.nextLine();
		tweet = tweet.replace(',', '-'); //This replaces all "," from user input to "-"
		
		int start = tweet.indexOf("#"); //This tells the computer to start the index after the first # of the user input
		int endOfTweet = tweet.indexOf(";"); //This tells the computer to stop at the ;, thus indicating the end of the line
		String type = tweet.substring(start+5, endOfTweet); //This is just formatting to ignore the #typ to clean up output
		type = type.toUpperCase(); //changes the value of type to all Upper Case letters 
		System.out.print("Type:\t\t" + type.trim()); //Prints out "Type:" and adds indentation for cleanliness. Also outputs the type value. Trims to remove any leading and trailing white spaces that may be present 
		tweet = tweet.substring(endOfTweet+1); //This tells the computer to move on to the next set of "#" and ";" for the next section

		start = tweet.indexOf("#");
		endOfTweet = tweet.indexOf(";");
		String detail = tweet.substring(start+5, endOfTweet); //This is just formatting to ignore the #det to clean up output
		System.out.println("\nDetail:\t\t" + detail.trim()); //Prints "Detail:" and adds indentation for cleanliness. Also outputs detail value
		tweet = tweet.substring(endOfTweet+1);
		
		start = tweet.indexOf("#");
		endOfTweet = tweet.indexOf(";");
		String location = tweet.substring(start+5, endOfTweet); //This is just formatting to ignore the #loc to clean up output
		System.out.print("Location:\t" + location.trim()); //Prints "Location:" and adds indentation for cleanliness. Also outputs detail value
		tweet=tweet.substring(endOfTweet+1);
		
		start = tweet.indexOf("#");
		endOfTweet = tweet.indexOf(";");
		String latitude = tweet.substring(start+5, endOfTweet); //This is just formatting to ignore the #lat to clean up output
		System.out.print("\nLatitude:\t" + latitude.trim()); //Prints "Latitude:" and adds indentation for cleanliness. Also outputs detail value
		tweet = tweet.substring(endOfTweet+1);
		
		start = tweet.indexOf("#");
		endOfTweet = tweet.indexOf(";");
		String longitude = tweet.substring(start+5, endOfTweet); //This is just formatting to ignore the #lng to clean up output
		System.out.print("\nLongitude:\t" + longitude.trim()); //Prints "Longitude:" and adds indentation for cleanliness. Also outputs detail value
		
		keyboard.close(); //closes keyboard 
	}

}
