import java.util.Scanner;

/*
 * ParseTheTweet.java
 * Author:           Aiden Hammond
 * Submission Date:  September 14, 2021
 *
 * Purpose:
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
public class ParseTheTweet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a tweet below:");
        String original = input.nextLine();
        String trimmed = original.trim();
        int start = 4;
        int finish = trimmed.indexOf(";");
        String type = trimmed.substring(start, finish).toUpperCase();
        trimmed = trimmed.substring(finish+2);
        finish = trimmed.indexOf(";");
        String detail = trimmed.substring(start, finish);
        trimmed = trimmed.substring(finish+2);
        finish = trimmed.indexOf(";");
        String location = trimmed.substring(start, finish);
        trimmed = trimmed.substring(finish+2);
        finish = trimmed.indexOf(";");
        String latitude = trimmed.substring(start, finish);
        trimmed = trimmed.substring(finish+2);
        finish = trimmed.indexOf(";");
        String longitude = trimmed.substring(start,finish);

        System.out.println("Type:         " + type);
        System.out.println("Detail:       " + detail);
        System.out.println("Location:     " + location);
        System.out.println("Latitude:     " + latitude);
        System.out.println("Longitude:    " + longitude);




    }
    public static String getNextString(String whole, String regex){
        return whole.substring(whole.indexOf(regex), whole.indexOf(";"));
    }
}
