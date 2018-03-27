package accountmngsys;

import java.util.HashMap;
import java.util.Map;

public class service {
	
	private HashMap<Integer, account> accMap = new HashMap<Integer, account>();
	
	public account retrieveAcc(int accNum) {
	
		return accMap.get(accNum);
		
	}
	
	public String insertAcc(account newAcc) {
		accMap.put(newAcc.getAccnum(), newAcc);
		return "Account: " + newAcc.getAccnum() + " added!";
	}
	
	public String removeAcc(int accNum) {
		accMap.remove(accNum);
		return "Account: " + accNum + " removed!";
	}
	
	public void printMap() {
		
		for (int acc: accMap.keySet()) {
			
			String value = accMap.get(acc).toString();
			
			System.out.println(value);
			
		}
	}
	
	public Map<Integer, account> returnJSONMap(){
		return accMap;
	}
	
}
