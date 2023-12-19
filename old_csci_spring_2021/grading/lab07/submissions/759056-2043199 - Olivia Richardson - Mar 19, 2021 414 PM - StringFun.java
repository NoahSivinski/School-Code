import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in); // scanner class introduced to allow user input

		// initializing variables
		String userInput; // used throughout program
		String userCommand; // used throughout program
		char replaceThisLetter; // variable for user to specify which letter to replace
		String newCharacterForReplacement; // variable for user to specify what letter to replace with
		char removeThisLetter; // variable for user to specify which letter to remove
		int whichInstanceOfLetterToRemove; // variable for user to specify which instance of the specified letter they
											// want to replace
		char removeTheseLetters; // variable for user to specify which letter they want to remove all instances
									// of

		System.out.println("Enter the string to be manipulated"); // Prompts users for initial string. this string will
																	// be
																	// manipulated.
		userInput = keyboard.nextLine();

		// Program lists 6 possible commands that the user can choose from and asks for
		// the user to select one
		System.out.println("Enter your command (reverse, replace first, replace last, remove, remove all, quit)");
		userCommand = keyboard.nextLine(); // receives and stores the command input
		while (!userCommand.equalsIgnoreCase("Quit")) {

			// next few lines address the reverse command
			if (userCommand.equalsIgnoreCase("Reverse")) { // if the user inputs reverse the program will output the
															// input
															// in reverse
				String reverseString = "";
				for (int i = userInput.length() - 1; i >= 0; i--) { // this flips the input
					reverseString += userInput.charAt(i);
				}
				userInput = reverseString;
				System.out.println("The new sentence is: " + userInput);
			}
			// next few lines address the replace first command
			else if (userCommand.equalsIgnoreCase("Replace First")) { // if user wants to replace the first instance of
																		// a
																		// character
				System.out.println("Enter the character to replace"); // user inputs what character they want to replace
																		// the
																		// first instance of

				replaceThisLetter = keyboard.next().charAt(0);
				keyboard.nextLine(); // this line forces the program to scan the next line and get the input for the
										// replacement letter
				System.out.println("Enter the new character"); // user inputs what character they want to replace the
																// letter
				newCharacterForReplacement = keyboard.nextLine();

				int index = 0; // index variable is used in place of indexOf() to find the variable to replace
				boolean characterFound = false; // setting up true/false condition to enter loop
				for (int i = 0; i <= userInput.length() - 1; i++) {
					if (characterFound == false && userInput.charAt(i) == replaceThisLetter) { // these conditions need
																								// to
																								// be met to enter the
																								// loop
																								// of looking for the
																								// letter
																								// to replace
						index = i;
						characterFound = true;
						String firstReplace = ""; // new string introduced within this statement to keep track of the
													// changes replace first does
						firstReplace = userInput.substring(0, index) + newCharacterForReplacement
								+ userInput.substring(++index);
						userInput = firstReplace; // keeps an updated userInput for printing
					}

				}
				if (characterFound == false) { // if the letter they want to replace is not found the boolean is false
												// and...
					System.out.println("The letter was not found"); // ... this error message will print
				}

				else {
					System.out.println("The new sentence is: " + userInput); // prints out modified sentence if the two
																				// conditions are met
																				// and then the correct
																				// character is found
				}

			}
			// next few lines address the replace last command
			else if (userCommand.equalsIgnoreCase("Replace Last")) {
				System.out.println("Enter the character to replace"); // user inputs what character they want to replace
																		// the
																		// last instance of
				replaceThisLetter = keyboard.next().charAt(0);
				System.out.println("Enter the new character"); // user inputs what character they want to replace the
																// letter
																// with
				keyboard.nextLine(); // this line forces the program to scan the next line and get the input
				newCharacterForReplacement = keyboard.nextLine();

				int index = 0; // index variable is used in place of indexOf() to find the variable to replace
				boolean characterFound = false; // setting up true/false condition to enter loop
				for (int i = userInput.length() - 1; i >= 0; --i) { // the program needs to read the input in reverse to
																	// find the last instance of the letter
					if (characterFound == false && userInput.charAt(i) == replaceThisLetter) { // these conditions need
																								// to be met to enter
																								// the
																								// loop of looking for
																								// the letter to replace
						index = i;
						characterFound = true;
						String lastReplace = ""; // new string introduced within this statement to keep track of the
													// changes replace first does
						lastReplace = userInput.substring(0, index) + newCharacterForReplacement
								+ userInput.substring(++index);
						userInput = lastReplace; // keeps an updated userInput for printing
					}
				}
				if (characterFound == false) { // if the letter they want to replace is not found the boolean is false
												// and...
					System.out.println("The letter was not found"); // ... this error message will print
				}

				else {
					System.out.println("The new sentence is: " + userInput); // prints out modified sentence if the two
																				// conditions are met
																				// and then the correct character is
																				// found
				}
			}

			// next few lines address the remove command
			else if (userCommand.equalsIgnoreCase("Remove")) { // if the user says "remove", the program will ask the
																// user
																// which letter to remove and which numerical instance
																// to remove
				System.out.println("Enter the character to remove"); // prompts user to input which letter to remove
				removeThisLetter = keyboard.next().charAt(0);
				keyboard.nextLine(); // this line forces the program to scan the next line and get the input
				System.out.println("Enter the " + removeThisLetter
						+ " you would like the remove (Not the index - 1 = 1st, 2 = 2nd, etc.):"); // determines which
																									// instance of the
																									// letter should be
																									// removed
				whichInstanceOfLetterToRemove = keyboard.nextInt(); // variable for which instance of the letter to
																	// remove
				keyboard.nextLine(); // this line forces the program to scan the next line and get the input

				

				int occursCount = 0; // setting up a counter to keep track of the character placement position
				int index = 0; // variable to use in place of indexOf and to find position of the letter to
								// remove
				boolean characterFound = false; // setting up true/false condition to enter loop
				for (int i = 0; i < userInput.length(); i++) {
					if (userInput.charAt(i) == removeThisLetter) { // this if statement allows the loop to continue the
																	// count
																	// of the number of occurrences of the letter to
																	// remove
																	// until the number of occurrences is equal to the
																	// instance of the letter to remove
						occursCount++; // keeps track of the number of occurrences of the letter to remove to find the
										// correct letter to remove

					}
					
					if (userInput.charAt(i) == removeThisLetter && characterFound == false // this if statement will end
																							// the
																							// loop once all three
																							// conditions are met
							&& whichInstanceOfLetterToRemove == occursCount) {
						characterFound = true;
						index = i; // storing the value of the letter to remove
						String removeUpdate = ""; // string to keep up with changes to allow program to continue
						removeUpdate = userInput.substring(0, index) + userInput.substring(++index);
						userInput = removeUpdate;

					}
				}
				if (characterFound == false) { // if the letter they want to replace is not found the boolean is
												// false...
					System.out.println("The letter you are trying to remove does not exist"); // ... this error message
																								// will
																								// print
				} else { // if all the conditions are met the output message will show the new sentence
							// with the correct letter removed
					System.out.println("The new sentence is: " + userInput); // prints out modified statement
				}
			}

			else if (userCommand.equalsIgnoreCase("Remove All")) { // if the user says "remove all", all instances of
																	// the
																	// specified letter are removed
				System.out.println("Enter the character to remove"); // prompts user to input which letters to remove
				removeTheseLetters = keyboard.next().charAt(0);
				keyboard.nextLine(); // this line forces the program to scan the next line and get the input

				boolean characterFound = false; // setting up true/false condition to enter loop
				for (int i = 0; i < userInput.length(); i++) {
					if (userInput.charAt(i) == removeTheseLetters) {
						int manipulatedRemoveAll = i;
						userInput = userInput.substring(0, manipulatedRemoveAll)
								+ userInput.substring(++manipulatedRemoveAll);
						characterFound = true;
						i--;
					}
				}
				if (characterFound == false) { // if the letter they want to replace is not found the boolean is
												// false...
					System.out.println("The letter you are trying to remove does not exist"); // ... this error message
																								// will
																								// print
				} else { // if all the conditions are met the output message will show the new sentence
							// with the correct letter removed
					System.out.println("The new sentence is: " + userInput); // prints
					// out
					// modified
					// statement
				}
			} else if (userCommand.equalsIgnoreCase("Quit")) { // if the user inputs "quit" the program ends
				System.exit(0);
			} else {
				System.out.println("Invalid command input"); // prints this error message if user inputs anything other
																// than
																// reverse, replace first, replace last, remove, remove
																// all,
																// or quit. this error also occurs in the event of
																// misspellings and blank strings.
			}
			System.out.println("Enter your command (reverse, replace first, replace last, remove, remove all, quit)");
			userCommand = keyboard.nextLine(); // receives and stores the command input
		}
		keyboard.close(); // close keyboard b/c program is over

	}

}