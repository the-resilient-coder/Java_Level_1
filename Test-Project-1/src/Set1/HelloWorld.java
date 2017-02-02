package Set1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String s[]){
		// Initialize Scanner object
		
		System.out.println("Hello! Enter the String");
		Scanner sc = new Scanner(System.in);
		
		// Take input from console
		String inputString = sc.nextLine();
		
		// Close Scanner Object
		sc.close();
		
		// Print desired output and string from console in next line
		System.out.println("Hello, World.");
		System.out.println(inputString);
		
	}
}
