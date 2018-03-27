package accountmngsys;

public class AccRunner {
	
	public static void main(String[] args) {
		
		
		Account firstAcc = new Account(12345, "Hashim", "Ali");
		Account secAcc = new Account(678910, "Abdi", "Rahman");
		Account thirdAcc = new Account(11121314, "Jordan", "Smart");
		Account fthAcc = new Account(15161718, "Shaun", "Smart");
		
		Service main = new Service();
		
		main.insertAcc(firstAcc);
		main.insertAcc(secAcc);
		//main.insertAcc(thirdAcc);
		//main.insertAcc(fthAcc);
		
		System.out.println(main.mapToJSON());
		
	}
}
