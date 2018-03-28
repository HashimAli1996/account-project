package accountmngsys;

public class CheckAccounts {
	
	private int count;
	
	

	public CheckAccounts() {
		super();
	}


	public int findName(String string, Service accService) {
		/*Green Stage Solution
		for (int acc : accService.returnMap().keySet()) {
			if (accService.returnMap().get(acc).getfName().equals(string)) {
				count++;
			}
		}
		*/
	long count2 = accService.returnMap().values().stream().filter(entry -> entry.getfName().equals(string)).count();
		
		return (int)count2;
	}

}
