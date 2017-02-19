package by.epam.lesson5.task;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.GregorianCalendar;
import java.util.List;

public class Lesson5_2 {

	/*
	 * Создать класс “Записная книжка”. Предусмотреть возможность работы с
	 * произвольным числом записей, пойска записи по какому-либо признаку
	 * (например, по фамилии, дате рождения или номеру телефона), добавления и
	 * удаления записей, cортировки по разным полям.
	 * 
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = 0;

		List<Record> recordList = new ArrayList<>();

		Record record1 = new Record("Smith", new GregorianCalendar(1996, 0, 28), "+375296347567");
		Record record2 = new Record("Smirnov", new GregorianCalendar(1998, 3, 12), "+375296789987");
		Record record3 = new Record("Ivanov", new GregorianCalendar(1974, 5, 2), "+375294563321");
		Record record4 = new Record("Cao", new GregorianCalendar(1990, 3, 4), "+375296347567");
		Record record5 = new Record("Archipov", new GregorianCalendar(1957, 10, 29), "+375296115415");
		Record record6 = new Record("Clark", new GregorianCalendar(1996, 2, 11), "+375296111111");

		recordList.add(record1);
		recordList.add(record2);
		recordList.add(record3);
		recordList.add(record4);
		recordList.add(record5);
		recordList.add(record6);

		PocketBook pocketBook = new PocketBook(recordList);

		while (true) {

			System.out.println("Меню программы.");
			System.out.println("1 - Просмотр.");
			System.out.println("2 - Удалить запись.");
			System.out.println("3 - Добавить запись.");
			System.out.println("4 - Сортировать по фамилии.");
			System.out.println("5 - Сортировать по дате рождения.");
			System.out.println("6 - Поиск записи по фамилии.");
			System.out.println("7 - Выход.");

			System.out.print("Введите число: ");
			if (sc.hasNextInt()) {
				number = sc.nextInt();
			} else {

				sc.next();
				System.out.println("Вы ввели не целое число! В демонстрации отказано!!!");
				return;

			}

			switch (number) {
			case 1:
				RecordHelper.showPocketBook(pocketBook);
				break;
			case 2:
				RecordHelper.deleteRecordBylastName(pocketBook);
				break;
			case 3:
				RecordHelper.addRecordBylastName(pocketBook, "Tramp", new GregorianCalendar(1948, 3, 12),
						"+375296111111");
				RecordHelper.addRecordBylastName(pocketBook, "Putin", new GregorianCalendar(1953, 3, 12),
						"+375296000000");
				break;

			case 4:
				RecordHelper.sortBylastName(pocketBook);
				break;
			case 5:
				RecordHelper.sortByBirthDate(pocketBook);
				break;
			case 6:
				RecordHelper.findlastName(pocketBook);
				break;
			case 7:
				return;

			}

		}
	}

}
