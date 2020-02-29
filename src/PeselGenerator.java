import java.util.*;

public class PeselGenerator {
	
	Person person = new Person();
	Pesel pesel = new Pesel();
	Scanner sc = new Scanner(System.in);
	
	public Person generatePerson() {
		
		
		System.out.println("Podaj rok urodzenia RRRR: ");
		person.setYear(sc.next());
		if ((1799>Integer.parseInt(person.getYear()) || (Integer.parseInt(person.getYear())>2300))) {
			System.out.println("Bledne dane!");
			generatePerson();
		}
		System.out.println("Podaj miesiac urodzenia MM: ");
		person.setMonth(sc.next());
		if (1>Integer.parseInt(person.getMonth()) || (Integer.parseInt(person.getMonth())>12) || person.getMonth().length()<2) {
			System.out.println("Bledne dane!");
			generatePerson();
		}
		System.out.println("Podaj dzien urodzenia DD: ");
		person.setDay(sc.next());
		if ((Integer.parseInt(person.getDay())>31) || (Integer.parseInt(person.getDay())<1) || person.getDay().length()<2) {
			System.out.println("Bledne dane!");
			generatePerson();
		}
		System.out.println("Podaj swoj¹ p³eæ M - Mezczyzna K - Kobieta: ");
		person.setGender(sc.next().charAt(0));
		if (person.getGender()!='K' & person.getGender()!='k' & person.getGender()!='M' & person.getGender()!='m') {
			System.out.println("Bledne dane!");
			generatePerson();
		}
		
				
		
		return person;
	}
	
	public String generateDatePeselPart() {
		
	String yy =	person.getYear().substring(2, 4);
	String mm = person.getMonth();
	String dd = person.getDay();
	//Correction of the month according to the year of birth
	if(1799<Integer.parseInt(person.getYear()) & Integer.parseInt(person.getYear())<1900) {
		mm=Integer.toString(Integer.parseInt(mm)+80);	
	}
	if (1999<Integer.parseInt(person.getYear()) & Integer.parseInt(person.getYear())<2100) {
		mm=Integer.toString(Integer.parseInt(mm)+20);
	}
	if (2099<Integer.parseInt(person.getYear()) & Integer.parseInt(person.getYear())<2200) {
		mm=Integer.toString(Integer.parseInt(mm)+40);
	}
	if (2199<Integer.parseInt(person.getYear()) & Integer.parseInt(person.getYear())<2300) {
		mm=Integer.toString(Integer.parseInt(mm)+60);
	}
	
	
	pesel.setDatePeselPart(yy+mm+dd);
	return pesel.getDatePeselPart();

	}
	
	public String generateRandomPeselPart() {
		Random random = new Random();
		int randomInt1 = random.nextInt(10); 
        int randomInt2 = random.nextInt(10);
        int randomInt3 = random.nextInt(10); 
        
        
     pesel.setRandomPeselPart(Integer.toString(randomInt1)+Integer.toString(randomInt2)+Integer.toString(randomInt3));   
	return pesel.getRandomPeselPart();
	
	}
	
	public String generateGenderPeselPart() {
		Random random = new Random();
		int randomInt=0;
		if(person.getGender()=='K' || person.getGender()=='k') {
			 randomInt = (random.nextInt(10/2))*2; 
		}
		
		
		if(person.getGender()=='M' || person.getGender()=='m') {
			 randomInt = (random.nextInt(10/2))*2+1;
		}
		
		pesel.setGenderPeselPart(Integer.toString(randomInt));
		return pesel.getGenderPeselPart();
	}
	
	public String generateControlPeselPart() {
		String sumOfPartsPesel;
		String checksum;
		
		
		// sum pesel digits in int
		sumOfPartsPesel=pesel.getDatePeselPart()+pesel.getRandomPeselPart()+pesel.getGenderPeselPart();		
		int value = (Character.getNumericValue(sumOfPartsPesel.charAt(0))*1) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(1))*3) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(2))*7) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(3))*9) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(4))*1) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(5))*3) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(6))*7) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(7))*9) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(8))*1) +
				 	 (Character.getNumericValue(sumOfPartsPesel.charAt(9))*3);
				 
		// count of checsum
		
		value = value%10;
		value = 10-value;
		value = value%10;
		checksum=Integer.toString(value); 
		return  checksum;
		
		
	}
	
	
	
	 

}