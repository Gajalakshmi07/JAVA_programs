package ex;

public class SumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;

        // Loop to add numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum of all numbers from 1 to 100 is: "+sum);

	}

}
