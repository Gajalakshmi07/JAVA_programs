package ex;

import java.util.Scanner;

public class wordinput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three lines of text:");
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		String line3 = scanner.nextLine();
		System.out.println("The line you entered:"+line1);
		System.out.println("The line you entered:"+line2);
		System.out.println("The line you entered:"+line3);
		 scanner.close();

	}

}
