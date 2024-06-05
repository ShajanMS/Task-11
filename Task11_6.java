package tasK11;

import java.util.Scanner;

//Custom exception for incorrect password

class IncorrectPasswordException extends Exception {
	
 public IncorrectPasswordException(String message) {
	 
     super(message);
 }
}

//User authentication class

class UserAuthentication {
	
 private static final String USERNAME = "admin";
 
 private static final String PASSWORD = "password123";

 public void login(String username, String password) throws IncorrectPasswordException {
	 
     if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
    	 
         throw new IncorrectPasswordException("Incorrect username or password.");
     }
 }
}

public class Task11_6 {
	
	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
		 
	        UserAuthentication auth = new UserAuthentication();

	        System.out.print("Enter username: ");
	        
	        String username = scanner.next();

	        System.out.print("Enter password: ");
	        
	        String password = scanner.next();

	        try {
	            auth.login(username, password);
	            
	            System.out.println("Login successful!");
	            
	        } catch (IncorrectPasswordException e) {
	        	
	            System.out.println(e.getMessage());
	            
	        } finally {
	        	
	            scanner.close();
	        }
		

	}

}
