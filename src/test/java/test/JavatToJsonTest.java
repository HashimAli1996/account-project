package test;

import org.junit.Assert;
import org.junit.Test;

import accountmngsys.*;

public class JavatToJsonTest {

	@Test
	public void testJavaJson() {
		account firstAcc = new account(12345, "Hashim", "Ali");
		account secAcc = new account(678910, "Abdi", "Rahman");
		service main = new service();		
		main.insertAcc(firstAcc);
		main.insertAcc(secAcc);

		Assert.assertEquals("{\"678910\":{\"accnum\":678910,\"fName\":\"Abdi\",\"lName\":\"Rahman\"},\"12345\":{\"accnum\":12345,\"fName\":\"Hashim\",\"lName\":\"Ali\"}}", main.mapToJSON());
	}

}
