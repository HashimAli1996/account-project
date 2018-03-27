package accountmngsys;

public class accRunner {
	
	public static void main(String[] args) {
		
		
		account firstAcc = new account(12345, "Hashim", "Ali");
		account secAcc = new account(678910, "Abdi", "Rahman");
		account thirdAcc = new account(11121314, "Jordan", "Smart");
		account fthAcc = new account(15161718, "Sean", "Smart");
		
		service main = new service();
		
		main.insertAcc(firstAcc);
		main.insertAcc(secAcc);
		main.insertAcc(thirdAcc);
		main.insertAcc(fthAcc);
		
		System.out.println(main.retrieveAcc(12345));
		
		main.printMap();
		
	}
}
