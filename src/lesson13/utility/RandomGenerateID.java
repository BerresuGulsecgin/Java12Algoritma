package lesson13.utility;

import java.util.Random;

public class RandomGenerateID {

	private static Random rnd = new Random();

	public static String generateId() {

		int id = rnd.nextInt(1000, 10001);
		String randomId = Integer.toString(id);

		return randomId;

	}

	// Product ismi ---> asus
	// produckcode --->Asu8941

	public static String generateProductCode(String name) {
		String code = generateId();
		String productCode=name.substring(0, 3)+code;
		return productCode;
	}
}
