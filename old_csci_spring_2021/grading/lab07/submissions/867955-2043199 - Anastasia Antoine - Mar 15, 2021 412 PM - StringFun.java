import java.util.Scanner; 

/*
 * StringFun.java
 * Author:  [Anastasia Antoine] 
 * Submission Date:  [3/15/2021]
 *
 * Purpose: This program asks the user for a sentence or word and then the computer 
 * will ask you if you want to reserve the sentence or word, replace first, replace last, remove
 * remove all, or quit. 
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
public class StringFun {

	public static void main(String[] args) {
		String command; 
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the string to be manipulated");
		String word = input.nextLine();  
		
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = input.nextLine();
			String manipulatedWord = ""; 
			if (command.equalsIgnoreCase("reverse")) {
				for(int reverse = (word.length() - 1); reverse > -1; reverse--) {
					manipulatedWord += word.charAt(reverse);
				}
				word = manipulatedWord; 
				System.out.println("The new sentence is:" + " " + word); 
			}
			
			else if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace"); 
				char charactertoReplace = input.next().charAt(0); 	
				System.out.println("Enter the new character"); 
				char newCharacter = input.next().charAt(0); 
				input.nextLine(); 
				int index = -1; 
				for(int replace = 0; replace < word.length(); replace++) {
					if (index < 0 && charactertoReplace == word.charAt(replace)) {
						manipulatedWord += newCharacter; 
						index = replace; 
					}
					else {
						manipulatedWord += word.charAt(replace);
					}
				}
				if (manipulatedWord.equals(word)) {
					System.out.println("The letter was not found in word");
				}
				else {
					word = manipulatedWord; 
					System.out.println("The new sentence is:" + " " + word);
				}
			}
			
			else if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter the character to replace"); 
				char charactertoReplace = input.next().charAt(0); 	
				input.nextLine();
				System.out.println("Enter the new character"); 
				char newCharacter = input.next().charAt(0); 
				input.nextLine(); 
				
				int index = -1; 
				for(int replace = (word.length() - 1); replace > -1; replace--) {
					if (index < 0 && charactertoReplace == word.charAt(replace)) {
						manipulatedWord += newCharacter; 
						index = replace; 
					}
					else {
						manipulatedWord += word.charAt(replace);
					}
				}
				String manipulatedLastWord = "";
				for(int reverse = (word.length() -1); reverse > -1; reverse-- ) {
					manipulatedLastWord += manipulatedWord.charAt(reverse);
				}
				if (manipulatedWord.equals(word)) {
					System.out.println("The letter was not found in word");
				}
				else {
					word = manipulatedLastWord; 
					System.out.println("The new sentence is:" + " " + word);
				}
			}
			
			else if(command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				char removeAll= input.next().charAt(0);
				input.nextLine(); 
				
				for (int removeAllLetters = 0; removeAllLetters < word.length(); removeAllLetters++) {
					if(removeAll != word.charAt(removeAllLetters)) {
						manipulatedWord += word.charAt(removeAllLetters); 
					}
				} 
				if (manipulatedWord.equals(word)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					word = manipulatedWord; 
					System.out.println("The new sentence is:" + " " + word); 
				}
			}
			
			else if(command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				char charactertoRemove = input.next().charAt(0);
				input.nextLine();
				System.out.println("Enter the" + " " + charactertoRemove + " " + "you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.");
				int removeLetter = input.nextInt(); 
				input.nextLine();
				int countNumber = 0; 
				
				for (int removeAllLetters = 0; removeAllLetters < word.length(); removeAllLetters++) {
					if(charactertoRemove != word.charAt(removeAllLetters)) {
						manipulatedWord += word.charAt(removeAllLetters); 
					}
					else {
						countNumber++; 
						if(countNumber != removeLetter) {
							manipulatedWord += word.charAt(removeAllLetters);
						}
					}
				} 
				if (manipulatedWord.equals(word)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else {
					word = manipulatedWord; 
					System.out.println("The new sentence is:" + " " + word); 
				}
			}
		} while (!command.equalsIgnoreCase("quit")); 
		System.out.println("...Execution Ends...");
		input.close();
	}
}
