package accountmngsys;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class accRunner {
	
	public static void main(String[] args) {
		
		
		account firstAcc = new account(12345, "Hashim", "Ali");
		account secAcc = new account(678910, "Abdi", "Rahman");
		account thirdAcc = new account(11121314, "Jordan", "Smart");
		account fthAcc = new account(15161718, "Sean", "Smart");
		
		service main = new service();
		
		main.insertAcc(firstAcc);
		main.insertAcc(secAcc);
		main.insertAcc(thirdAcc);
		main.insertAcc(fthAcc);
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			System.out.println(mapper.writeValueAsString(main.returnJSONMap()));
		} catch (JsonGenerationException e) {
			System.out.println("JsonGenerationException");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("JsonMappingException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
	}
}
