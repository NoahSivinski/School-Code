import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the string to be manipulated: ");
		String word = keyboard.nextLine();
		int x = 0;
		while(x != 1) {
			
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = keyboard.nextLine();
			
			if(command.equalsIgnoreCase("Quit")){
				x = 1;
			}
			
			else if(command.equalsIgnoreCase("reverse")){
				
				String result = "";
				
				for(int i = word.length() -1; i >= 0; i--) {
					String curLetter = word.substring(i, i+1);
					result += curLetter;
					
					
				}
				word = result;
				System.out.println("The new sentence is: " + word);
				
			}
			
			//Replace First Command
			else if(command.equalsIgnoreCase("replace first")) {
				
				System.out.println("Enter the character to replace");
				String replacee = keyboard.nextLine();
				System.out.println("Enter the new character");
				String replacer = keyboard.nextLine();
				String result = "";
				
				for(int i = 0; i < word.length(); i++) {
					String curLetter = word.substring(i, i +1);
					
					if(curLetter.equals(replacee)){
						
						String first = word.substring(0, i);
						String last = word.substring(i+1, word.length());
						result = result + first + replacer + last;
						replacee = "$^&&*&$#";
					}
				
				}
				
				if(result.equals("")) {
					System.out.println("The letter was not found in the word");
				}
				else {
					word = result;
					System.out.println("The new sentence is: " + word);
				}
			
			}
			
			//Replace Last Command
			else if(command.equalsIgnoreCase("replace last")) {
				
				System.out.println("Enter the character to replace");
				String replacee = keyboard.nextLine();
				System.out.println("Enter the new character");
				String replacer = keyboard.nextLine();
				String result = "";
				
				for(int i = word.length() -1; i >=  0; i--) {
					String curLetter = word.substring(i, i +1);
					
					if(curLetter.equals(replacee)){
						
						String first = word.substring(0, i);
						String last = word.substring(i+1, word.length());
						result = result + first + replacer + last;
						replacee = "$^&&*&$#";
					}
					
					
				
				}
				if(result.equals("")) {
					System.out.println("The letter was not found in the word");
				}
				else {
					word = result;
					System.out.println("The new sentence is: " + word);
				}
				
			
			}
			
			//Remove All Command
			else if(command.equalsIgnoreCase("remove all")) {
				
				System.out.println("Enter the character to remove");
				String charToRemove = keyboard.nextLine();
	
				String result = "";
				
				for(int i = 0; i < word.length(); i++) {
					String curLetter = word.substring(i, i +1);
					
					if(!curLetter.equals(charToRemove)){
						result+=curLetter;
		
					}
				}
				word = result;
				System.out.println("The new sentence is: " + word);
				
			}
			
			//Remove Command
			else if(command.equalsIgnoreCase("remove")) {
				
				System.out.println("Enter the character to remove");
				String charToRemove = keyboard.nextLine();
				System.out.println("Enter the " + charToRemove +  " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.): ");
				int numToRemove = keyboard.nextInt();
				keyboard.nextLine();
	
				String result = "";
				int counter = 0;
				for(int i = 0; i < word.length(); i++) {
					String curLetter = word.substring(i, i +1);
					
					if(curLetter.equals(charToRemove)){
						counter++;
						
						if(counter == numToRemove) {
							result+="";
						}
						else {
							result+=curLetter;
						}
		
					}
					else {
						result+=curLetter;
					}
				}
				if(result.equals(word)) {
					System.out.println("The letter was not found in the word");
				}
				else {
					word = result;
					System.out.println("The new sentence is: " + word);
				}
				
			}
			else {
				
				System.out.println("Command invalid. Try Again");
				
			}
		}
			
	}

}
