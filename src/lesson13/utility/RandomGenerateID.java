package lesson13.utility;

import java.util.Random;

public class RandomGenerateID {

	public static String generateId() {

		Random rnd = new Random();
		int id = rnd.nextInt(1000, 10001);
		String randomId = Integer.toString(id);

		return randomId;

	}
}
