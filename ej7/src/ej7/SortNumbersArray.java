package ej7;

import java.util.ArrayList;

public class SortNumbersArray {

	public static void main(String[] args) {
		int numbers[] = {6, 5, 7, 9, 3, 346, 45};
		
		for (int i = 0; i < numbers.length; i++) {
			int tmp = numbers[i];
			if (i > i+1) {
				numbers[i] = numbers[i+1];
				numbers[i+1] = tmp;
			}
		};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}		
	}
}
