package test;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import accountmngsys.account;
import accountmngsys.service;

public class accServiceTest {

	@Test
	public void testAccService() {
		account firstAcc = new account(12345, "Hashim", "Ali");
		account secAcc = new account(678910, "Abdi", "Rahman");
		
		service main = new service();
		
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
