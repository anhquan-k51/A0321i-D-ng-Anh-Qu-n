package Introduction_to_java.bai_tap;

import java.util.Scanner;
public class LoiChao {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println("Hello:"+ s);
	}

}