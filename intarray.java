package ex;
import java.util.Scanner;

public class intarray {

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

	        // Display the elements of the array
	        System.out.println("You entered:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}