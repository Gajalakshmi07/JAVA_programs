package ex;
import java.util.Scanner;
public class fibonnaci_recur {

	public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of terms
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Print the Fibonacci sequence up to the nth term
        System.out.println("Fibonacci sequence up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

	


