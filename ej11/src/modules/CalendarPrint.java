package modules;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarPrint {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int date = 0;
		int monthDays = 0;
		int year =0;
		int month = 0;
		int day = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please set the year: ");
		year = in.nextInt();
		System.out.println("Please set the month: ");
		month = in.nextInt();
		System.out.println("Please set the day: ");
		day = in.nextInt();
		
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, day);
	}
}
