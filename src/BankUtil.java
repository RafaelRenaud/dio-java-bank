import java.util.Random;

public class BankUtil {
	
	public static String generateAccountID(String generatorType) {
		
		String value = "";
		int size = 0;
		Random rand = new Random();
		
		if("ACCOUNT".equals(generatorType)) {
			size = 12;
		}else if("PENUMPER".equals(generatorType)){
			size = 8;
		}else {
			size = 4;
		}
		
		for(int i=0; i<size; i++) {
			value = value.concat(String.valueOf(rand.nextInt(9)));
		}
		
		return value;
	}

}
