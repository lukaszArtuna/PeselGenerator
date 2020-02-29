
public class Pesel {
	
	private String datePeselPart;
	private String randomPeselPart;
	private String genderPeselPart;
	private String checkPeselPart;
	
	
	
	public Pesel(String datePeselPart, String randomPeselPart, String genderPeselPart, String checkPeselPart) {
		super();
		this.datePeselPart = datePeselPart;
		this.randomPeselPart = randomPeselPart;
		this.genderPeselPart = genderPeselPart;
		this.checkPeselPart = checkPeselPart;
	}
	
	
	
	public Pesel() {
		super();
	}



	public String getDatePeselPart() {
		return datePeselPart;
	}
	public void setDatePeselPart(String datePeselPart) {
		this.datePeselPart = datePeselPart;
	}
	public String getRandomPeselPart() {
		return randomPeselPart;
	}
	public void setRandomPeselPart(String randomPeselPart) {
		this.randomPeselPart = randomPeselPart;
	}
	public String getGenderPeselPart() {
		return genderPeselPart;
	}
	public void setGenderPeselPart(String genderPeselPart) {
		this.genderPeselPart = genderPeselPart;
	}
	public String getCheckPeselPart() {
		return checkPeselPart;
	}
	public void setCheckPeselPart(String checkPeselPart) {
		this.checkPeselPart = checkPeselPart;
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pesel other = (Pesel) obj;
		if (checkPeselPart != other.checkPeselPart)
			return false;
		if (datePeselPart != other.datePeselPart)
			return false;
		if (genderPeselPart != other.genderPeselPart)
			return false;
		if (randomPeselPart != other.randomPeselPart)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Pesel [datePeselPart=" + datePeselPart + ", randomPeselPart=" + randomPeselPart + ", genderPeselPart="
				+ genderPeselPart + ", checkPeselPart=" + checkPeselPart + "]";
	}
	
	
	

}
