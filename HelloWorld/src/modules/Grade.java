package modules;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a grade");
		
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		if (grade < 0) {
			System.out.println("Invalid grade");
		} else if (grade < 51) {
			System.out.println("Failed");
		} else if (grade < 76) {
			System.out.println("C");
		} else if (grade < 91) {
			System.out.println("B");
		} else if (grade < 101) {
			System.out.println("A");
		} else if (grade > 100) {
			System.out.println("Invalid grade");
		}
	}

}
