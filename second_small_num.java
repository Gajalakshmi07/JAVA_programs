package ex;

import java.util.Scanner;

public class second_small_num {
	
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

	        // Initialize the smallest and second smallest to a large value
	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        // Find the smallest and second smallest numbers in the array
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                secondSmallest = smallest; // Update second smallest
	                smallest = numbers[i];     // Update smallest
	            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
	                secondSmallest = numbers[i];
	            }
	        }

	        // Check if a second smallest number exists
	        if (secondSmallest == Integer.MAX_VALUE) {
	            System.out.println("There is no second smallest number.");
	        } else {
	            System.out.println("The second smallest number you entered is: " + secondSmallest);
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}
