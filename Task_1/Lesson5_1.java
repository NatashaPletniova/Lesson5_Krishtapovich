package by.epam.lesson5.task;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Calendar;

public class Lesson5_1 {

	public static void main(String[] args) {

		GregorianCalendar d = new GregorianCalendar();

		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		int tempMonth = 0;
		int countMonth = 12;

		while (tempMonth < countMonth) {
			d.set(Calendar.DAY_OF_MONTH, 1);
			d.set(Calendar.MONTH, tempMonth);

			System.out.println(d.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));

			int weekday = d.get(Calendar.DAY_OF_WEEK);

			System.out.println("Su Mo Tu We Th Fr Sa");

			for (int i = Calendar.SUNDAY; i < weekday; i++)
				System.out.print("   ");
			do {
				int day = d.get(Calendar.DAY_OF_MONTH);
				if (day < 10)
					System.out.print(" ");
				System.out.print(day);
				if (day == today && month == tempMonth)
					System.out.print("*");
				else
					System.out.print(" ");
				if (weekday == Calendar.SATURDAY)
					System.out.println();
				d.add(Calendar.DAY_OF_MONTH, 1);
				weekday = d.get(Calendar.DAY_OF_WEEK);
			} while (d.get(Calendar.MONTH) == tempMonth);
			System.out.println();
			if (weekday != Calendar.SUNDAY)
				System.out.println();
			tempMonth++;
		}
	}
}
