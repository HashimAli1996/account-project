package accountmngsys;

import java.util.HashMap;

public class service {
	
	private HashMap<Integer, account> accMap = new HashMap<Integer, account>();
	
	public account retrieveAcc(int accNum) {
	
		return accMap.get(accNum);
		
	}
	
	public void insertAcc(account newAcc) {
		accMap.put(newAcc.getAccnum(), newAcc);
		System.out.println("Account: " + newAcc.getAccnum() + " added!");
	}
	
	public void printMap() {
		
		for (int acc: accMap.keySet()) {
			
			String value = accMap.get(acc).toString();
			
			System.out.println(value);
			
		}
	}
	
}
