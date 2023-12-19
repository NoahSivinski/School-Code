package cs1302.example;
public class Hello {
    public static void main(String[] args) {
	System.out.println("Please input your full name:");
	java.util.Scanner scan = new java.util.Scanner(System.in);
	String name = scan.nextLine();
	System.out.println("Hello, " + name);
    }
}
	
