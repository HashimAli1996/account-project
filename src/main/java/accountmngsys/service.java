package accountmngsys;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

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

		for (int acc : accMap.keySet()) {

			String value = accMap.get(acc).toString();

			System.out.println(value);

		}
	}

	public Map<Integer, account> returnMap() {
		return accMap;
	}

	public String mapToJSON() {
		ObjectMapper jsonMaker = new ObjectMapper();
		try {
			return jsonMaker.writeValueAsString(accMap);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
			return "error";
		} catch (JsonMappingException e) {
			e.printStackTrace();
			return "error";
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
		}

	}

}
