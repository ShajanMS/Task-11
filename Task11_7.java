package tasK11;

import java.util.Scanner;

//Define the custom exception

class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {

		super(message);
	}
}

public class Task11_7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter your age: ");

			int age = scanner.nextInt();

			// Check if age is less than 18 and throw custom exception

			if (age < 18) {

				throw new InvalidAgeException("Age must be 18 or older.");
			}

			System.out.println("Age is valid.");

		} catch (InvalidAgeException e) {

			// Handle the custom exception

			System.out.println("InvalidAgeException: " + e.getMessage());

		} catch (Exception e) {

			// Handle any other exceptions

			System.out.println("An unexpected error occurred: " + e.getMessage());

		} finally {

			scanner.close();
		}

	}

}
