package test;

import org.junit.Assert;
import org.junit.Test;

import accountmngsys.Account;
import accountmngsys.Service;

public class AccServiceTest {

	@Test
	public void testAccService() {
		Account firstAcc = new Account(12345, "Hashim", "Ali");
		Account secAcc = new Account(678910, "Abdi", "Rahman");
		
		Service main = new Service();
		
		main.insertAcc(firstAcc);
		Assert.assertEquals(1, main.returnMap().size());
		main.insertAcc(secAcc);
		Assert.assertEquals(2, main.returnMap().size());
		main.removeAcc(12345);
		Assert.assertEquals(1, main.returnMap().size());
		main.removeAcc(678910);
		Assert.assertEquals(0, main.returnMap().size());
	}

}
