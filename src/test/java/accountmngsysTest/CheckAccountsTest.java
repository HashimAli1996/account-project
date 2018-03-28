package accountmngsysTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import accountmngsys.Account;
import accountmngsys.CheckAccounts;
import accountmngsys.Service;

public class CheckAccountsTest {
	
	private Service accService;
	private CheckAccounts testFunctionality;
	
	@Before public void setUp() throws Exception {
		accService = new Service();
		testFunctionality = new CheckAccounts();
		Account firstAcc = new Account(12345, "Hashim", "Ali");
		Account secAcc = new Account(678910, "Abdi", "Rahman");
		Account thirdAcc = new Account(11121314, "Jordan", "Smart");
		accService.insertAcc(firstAcc);
		accService.insertAcc(secAcc);
		accService.insertAcc(thirdAcc);
	}
	

	@Test
	public void test() {
		assertEquals(testFunctionality.findName("Hashim", accService), 1);
		Account frthAcc = new Account(456123, "udhufh", "Mahmood");
		accService.insertAcc(frthAcc);
		assertEquals(testFunctionality.findName("Hashim", accService), 2);
	}

}
