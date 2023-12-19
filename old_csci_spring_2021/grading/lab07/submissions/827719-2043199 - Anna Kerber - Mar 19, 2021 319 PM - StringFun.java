
/*
 * StringFun.java
 * Author:  Anna Kerber
 * Submission Date:  3/19/21
 *
 * Purpose: The purpose of this program is to perform various operations
 * on an entered string as specified by the user, including reversing,
 * replacing, and removing specific characters in that string.
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

public class StringFun {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char replace, replaceWith, remove;
		String str, command = "", newStr = "";
		int removeIndex, k;

		System.out.println("Enter the string to be manipulated");
		str = scanner.nextLine();

		while (!command.equals("Quit")) {

			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = scanner.nextLine();

			while (!(command.equals("Quit") || command.equalsIgnoreCase("Reverse")
					|| command.equalsIgnoreCase("Replace First") || command.equalsIgnoreCase("Replace Last")
					|| command.equalsIgnoreCase("Remove All") || command.equalsIgnoreCase("Remove"))) {

				System.out
						.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
				command = scanner.nextLine();
			}

			if (command.equals("Quit")) {
				System.exit(0);
			}

			else if (command.equalsIgnoreCase("Reverse")) {
				for (int i = str.length() - 1; i >= 0; i--) {
					newStr += str.charAt(i);
				}
				str = newStr;
				newStr = "";
				System.out.println("The new sentence is: " + str);
			}

			else if (command.equalsIgnoreCase("Replace First")) {
				k = 0;
				System.out.println("Enter the character to replace");
				replace = scanner.next().charAt(0);
				System.out.println("Enter the new character");
				replaceWith = scanner.next().charAt(0);
				for (int i = 0; i < str.length() && k <= 0; i++) {
					if (str.charAt(i) == replace) {
						k++;
						newStr = str.substring(0, i) + replaceWith + str.substring(i + 1);
					}
				}
				if (newStr.equals("")) {
					System.out.println("The letter was not found in the word");
				} else {
					str = newStr;
					System.out.println("The new sentence is: " + str);
				}
				newStr = "";
				scanner.nextLine();
			}

			else if (command.equalsIgnoreCase("Replace Last")) {
				k = 0;
				System.out.println("Enter the character to replace");
				replace = scanner.next().charAt(0);
				System.out.println("Enter the new character");
				replaceWith = scanner.next().charAt(0);
				for (int i = str.length() - 1; i >= 0 && k <= 0; i--) {
					if (str.charAt(i) == replace) {
						k++;
						newStr = str.substring(0, i) + replaceWith + str.substring(i + 1);
					}
				}
				if (newStr.equals("")) {
					System.out.println("The letter was not found in the word");
				} else {
					str = newStr;
					System.out.println("The new sentence is: " + str);
				}
				newStr = "";
				scanner.nextLine();
			}

			else if (command.equalsIgnoreCase("Remove")) {
				k = 0;
				System.out.println("Enter the character to remove");
				remove = scanner.next().charAt(0);
				System.out.println(
						"Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.)");
				removeIndex = scanner.nextInt();
				for (int i = 0; i < str.length() && k <= 0; i++) {
					if (str.charAt(i) == remove) {
						removeIndex--;
						if (removeIndex == 0) {
							k++;
							newStr = str.substring(0, i) + str.substring(i + 1);
						}
					}
				}
				if (newStr.equals("")) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					str = newStr;
					System.out.println("The new sentence is: " + str);
				}
				newStr = "";
				scanner.nextLine();
			}

			else {
				newStr = str;
				System.out.println("Enter the character to remove");
				remove = scanner.next().charAt(0);
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == remove) {
						str = str.substring(0, i) + str.substring(i + 1);
						i--;
					}
				}
				if (newStr.equals(str)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					System.out.println("The new sentence is: " + str);
				}

				newStr = "";
				scanner.nextLine();
			}

		}

		scanner.close();
	}

}
