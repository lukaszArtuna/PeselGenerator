
public class Person {

	
	private String year;
	private String month;
	private String day;
	private char gender;
	

	public Person(String year, String month, String day, char gender) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.gender = gender;
	}
	
	public Person() {

	}



	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (day != other.day)
			return false;
		if (gender != other.gender)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Osoba [year=" + year + ", month=" + month + ", day=" + day + ", gender=" + gender + "]";
	}


}
