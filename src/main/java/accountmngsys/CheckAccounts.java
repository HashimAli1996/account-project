package accountmngsys;

public class CheckAccounts {
	
	private int count = 0;
	
	

	public CheckAccounts() {
		super();
	}


	public int findName(String string, Service accService) {

		for (int acc : accService.returnMap().keySet()) {
			
			if (accService.returnMap().get(acc).getfName().equals(string)) {
				count++;
			}

		}
		return count;
	}

}
