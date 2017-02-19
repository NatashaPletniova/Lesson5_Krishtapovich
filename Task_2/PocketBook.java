package by.epam.lesson5.task;

import java.util.List;

public class PocketBook {

	private List<Record> pocketBook;

	public PocketBook(List<Record> pocketBook) {
		this.pocketBook = pocketBook;

	}

	public List<Record> getPocketBook() {
		return pocketBook;
	}

	public void setPocketBook(List<Record> pocketBook) {
		this.pocketBook = pocketBook;
	}
}
