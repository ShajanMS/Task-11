package tasK11;

import java.util.Scanner;

public class Task11_5_i {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			
            // Initialize an array with 5 elements
			
            int[] array = {1, 2, 3, 4, 5};

            // Prompt the user to enter an index
            
            System.out.print("Enter an index to access (0-4): ");
            
            int index = scanner.nextInt();

            // Attempt to access the element at the given index
            
            System.out.println("Element at index " + index + ": " + array[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            // Handle the exception if the index is out of bounds
        	
            System.out.println("Error: Array index is out of bounds.");
            
        } finally {
        	
            // Close the scanner
        	
            scanner.close();
        }

	}

}
