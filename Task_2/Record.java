package by.epam.lesson5.task;

import java.util.Calendar;

public class Record {

	// фамилии, дате рождения или номеру телефона

	private String lastName;
	private Calendar birthDate;
	private String phone;

	public Record(String lastName, Calendar birthDate, String phone) {
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phone = phone;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
