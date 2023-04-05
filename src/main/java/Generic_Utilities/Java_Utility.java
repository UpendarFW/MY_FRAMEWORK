package Generic_Utilities;

import java.util.Random;

public class Java_Utility {

	public int gatRandomNumber() {
		Random r=new Random();
		int random=r.nextInt(10000);
		return random;
	}
}
