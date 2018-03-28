package accountmngsysTest;

import org.junit.Assert;
import org.junit.Test;

import accountmngsys.*;

public class JavatToJsonTest {

	@Test
	public void testJavaJson() {
		Account firstAcc = new Account(12345, "Hashim", "Ali");
		Account secAcc = new Account(678910, "Abdi", "Rahman");
		Service main = new Service();		
		main.insertAcc(firstAcc);
		main.insertAcc(secAcc);

		Assert.assertEquals("{\"678910\":{\"accnum\":678910,\"fName\":\"Abdi\",\"lName\":\"Rahman\"},\"12345\":{\"accnum\":12345,\"fName\":\"Hashim\",\"lName\":\"Ali\"}}", main.mapToJSON());
	}

}
