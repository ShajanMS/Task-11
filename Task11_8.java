package tasK11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task11_8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: "); 
        
        String filePath = scanner.nextLine();

        // Attempt to read the file
        
        try {
            File file = new File(filePath);
            
            Scanner fileScanner = new Scanner(file);

            System.out.println("File contents:");
            
            while (fileScanner.hasNextLine()) {
            	
                String line = fileScanner.nextLine();
                
                System.out.println(line);
            }

            fileScanner.close();
            
        } catch (FileNotFoundException e) {
        	
            // Handle the FileNotFoundException
        	
            System.out.println("FileNotFoundException: The file at path '" + filePath + "' was not found.");
            
        } catch (Exception e) {
        	
            // Handle any other exceptions
        	
            System.out.println("An unexpected error occurred: " + e.getMessage());
            
        } finally {
        	
            scanner.close();
        }

	}

}
