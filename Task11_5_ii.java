package tasK11;

import java.util.Scanner;

public class Task11_5_ii {

	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		
		try {
            // Initialize a string 
			
            String str = "Hello, World!";

            // Prompt the user to enter an index
            
            System.out.print("Enter an index to access in the string (0-12): ");
            
            int index = scanner.nextInt();

            // Attempt to access the character at the given index
            
            System.out.println("Character at index " + index + ": " + str.charAt(index));
            
        } catch (StringIndexOutOfBoundsException e) {
        	
            // Handle the exception if the index is out of bounds
        	
            System.out.println("Error: String index is out of bounds.");
            
        } finally {
        	
            // Close the scanner
        	
            scanner.close();
        }
		

	}

}
