package tasK11;

import java.util.Scanner;

public class Task11_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			// Read the first integer from the user

			System.out.print("Enter the first integer: ");

			int num1 = scanner.nextInt();

			// Read the second integer from the user

			System.out.print("Enter the second integer: ");

			int num2 = scanner.nextInt();

			// Perform the division

			int result = num1 / num2;

			// Display the result

			System.out.println("The result of the division is: " + result);

		} catch (ArithmeticException e) {

			// Handle division by zero

			System.out.println("Error: Division by zero is not allowed.");

		} catch (Exception e) {

			// Handle other potential exceptions

			System.out.println("Error: Invalid input.");

		} finally {

			// Close the scanner

			scanner.close();

		}

	}

}