package ex;
import java.util.Scanner;

public class arrsmallnum {

	public class SmallestNumberArray {
	    public static void main(String[] args) {
	        // Declare an integer array of size 10
	        int[] numbers = new int[10];

	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter 10 integers
	        System.out.println("Enter 10 integers:");

	        // Loop to get input from the user and store it in the array
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter integer " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        // Find the smallest number in the array
	        int smallest = numbers[0]; // Assume the first element is the smallest
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	        }

	        // Display the smallest number
	        System.out.println("The smallest number you entered is: " + smallest);

	        // Close the scanner
	        scanner.close();
	    }
	}
}