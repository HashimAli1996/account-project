package accountmngsys;

public class Account {
	
	private int accnum;
	private String fName;
	private String lName;
		
	public Account(int accnum, String fName, String lName) {
		super();
		this.accnum = accnum;
		this.fName = fName;
		this.lName = lName;
	}
	
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Account Number= " + accnum + ", First Name= " + fName + ", Last Name= " + lName;
	}
}
