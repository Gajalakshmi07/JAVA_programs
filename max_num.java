package ex;

import java.util.Scanner;

public class max_num {
	
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

	        // Find the maximum number in the array
	        int max = numbers[0]; // Assume the first element is the maximum
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {  // If the current number is greater than max
	                max = numbers[i];    // Update max
	            }
	        }

	        // Display the maximum number
	        System.out.println("The maximum number you entered is: " + max);

	        // Close the scanner
	        scanner.close();
	    }
	}