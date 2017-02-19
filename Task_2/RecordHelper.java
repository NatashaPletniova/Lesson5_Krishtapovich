package by.epam.lesson5.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class RecordHelper {
	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

	private RecordHelper() {

	}

	public static void showRecord(Record record) {

		System.out.println("Last Name: " + record.getLastName());
		System.out.println("Date of Birth : " + sdf.format(record.getBirthDate().getTime()));
		System.out.println("Phone: " + record.getPhone());

		System.out.println();
	}

	public static void showPocketBook(PocketBook pocketBook) {

		for (Record a : pocketBook.getPocketBook()) {
			RecordHelper.showRecord(a);
		}

	}

	public static void deleteRecordBylastName(PocketBook pocketBook) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String tempLastName = null;
		System.out.println("Введите фамилию для удаления");
		tempLastName = sc.next();

		Iterator<Record> iter = pocketBook.getPocketBook().iterator();
		while (iter.hasNext()) {
			if (iter.next().getLastName().compareTo(tempLastName) == 0) {
				iter.remove();
				System.out.println("Запись " + tempLastName + " удалена.");
			}
		}

	}

	public static void addRecordBylastName(PocketBook pocketBook, String lastName, Calendar birthDate, String phone) {
		Record newRecord = new Record(lastName, birthDate, phone);

		pocketBook.getPocketBook().add(newRecord);
		System.out.println("Запись " + lastName + " добавлена.");

	}

	public static void sortBylastName(PocketBook pocketBook) {

		Collections.sort(pocketBook.getPocketBook(), new Comparator<Record>() {
			public int compare(Record recordOne, Record recordTwo) {
				return ((Record) recordOne).getLastName().compareTo(((Record) recordTwo).getLastName());
			}
		});

	}

	public static void sortByBirthDate(PocketBook pocketBook) {

		Collections.sort(pocketBook.getPocketBook(), new Comparator<Record>() {
			public int compare(Record recordOne, Record recordTwo) {
				return ((Record) recordOne).getBirthDate().compareTo(((Record) recordTwo).getBirthDate());
			}
		});
	}

	public static void findlastName(PocketBook pocketBook) {
		int sign = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String tempLastName = null;
		System.out.println("Введите фамилию для поиска");
		tempLastName = sc.next();
		System.out.println();

		for (Record a : pocketBook.getPocketBook()) {

			if (a.getLastName().compareTo(tempLastName) == 0) {
				System.out.println("Запись " + tempLastName + " найдена.");
				RecordHelper.showRecord(a);
				sign = 1;
			}
		}
		if (sign == 0) {
			System.out.println("Запись " + tempLastName + "  не найдена.");
		}

	}
}
