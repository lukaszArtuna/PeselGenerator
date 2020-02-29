
public class Control {
	
	PeselGenerator output = new PeselGenerator();
	
	
		public void headMenu() {
			System.out.println("================PESEL GENERATOR V 0.1==================");
			System.out.println("Witam proszê postêpowaæ wedle ponizszych instrukcji pozdrawiam Lukasz Artuna");
		}
		public void generateFullPesel() {
				
			output.generatePerson();
			System.out.println("Wygenerowany numer PESEL to:");
			System.out.print(output.generateDatePeselPart());
			System.out.print(output.generateRandomPeselPart());
			System.out.print(output.generateGenderPeselPart());
			System.out.print(output.generateControlPeselPart());
				
				
			}
	
}
