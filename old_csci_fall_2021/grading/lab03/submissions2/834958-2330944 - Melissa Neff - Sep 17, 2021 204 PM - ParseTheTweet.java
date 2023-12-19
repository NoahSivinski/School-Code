/*
 * ParseTheTweet.java
 * Author:  Melissa Neff 
 * Submission Date:  9/17/21
 *
 * Purpose: The purpose of this program is to process messages similarly to "Tweak the
 * Tweet," and split up the information from the "tweets" into five different categories.
 * (The categories will be type, detail, location, latitude, and longitude.)
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
		Scanner scan = new Scanner(System.in);
		String tweet;
		//The following prints a string to the console:
		System.out.println("Enter a tweet below");
		//The tweet will be the next line input by the user:
		tweet = scan.nextLine();
		scan.close();

		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		/*Each piece of information (type, detail, location, latitude
		 * and longitude) starts with a "#" and ends with a ";". So, the "#" and
		 * ";" are used to calculate the indices of where the substrings start and
		 * finish:
		 */
		int start = tweet.indexOf("#");
		int finish = tweet.indexOf(";");
		/*The start  of each substring will be where the "#" is plus 5 indices, since each 
		 * category starts with a "#" followed by three characters and a space. This means
		 * the actual information that needs to be extracted begins at index 5:
		 */
		start = start + 5 ;
		/*The information for "type" is extracted using the substring and trim methods.
		 * The information for "type" is also changed to upper case in the following lines:
		 */
		type = tweet.substring(start,finish);
		type = type.trim();
		type = type.toUpperCase();
		/*The start and finish of each substring must be re-calculated for each
		 * category of information (for type, detail, location, latitude,
		 * and longitude). This is shown in the following lines:
		 */
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		start = start + 5;
		finish = tweet.indexOf(";");
		/*The information for "detail" is extracted in the following lines, and
		 * all commas are changed to hyphens:
		 */
		detail = tweet.substring(start,finish);
		detail = detail.replaceAll(",","-");
		/*Once again, the indices for start and finish are calculated in the following
		 * lines:
		 */
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		start = start + 5;
		finish = tweet.indexOf(";");
		/*In the following lines, the information for "location" is extracted, and
		 * all commas are changes to hyphens:
		 */
		location = tweet.substring(start,finish);
		location = location.replaceAll(",","-");
		//The indices for start and finish are calculated:
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		start = start + 5;
		finish = tweet.indexOf(";");
		//The information for "latitude" is extracted in the following line:
		latitude = tweet.substring(start,finish);
		//The indices for start and finish are calculated:
		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#");
		start = start + 5;
		finish = tweet.indexOf(";");
		//The information for "longitude" is extracted in the following line:
		longitude = tweet.substring(start,finish);
		
		//The following lines all print string to the console:
		System.out.println("Type:         " + type);
		System.out.println("Detail:       " + detail);
		System.out.println("Location:     " + location);
		System.out.println("Latitude:     " + latitude);
		System.out.println("Longitude:    " + longitude);

	}

}
