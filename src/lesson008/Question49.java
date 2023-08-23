package lesson008;

public class Question49 {

	public static void main(String[] args) {

		// verilen arreyde en büyük ve en küçükleri bul

		String[] arrey = { "20", "30", "40", "5", "-2" };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arrey.length; i++) {
			if (Integer.parseInt(arrey[i]) > max) {
				max = Integer.parseInt(arrey[i]);

			} else if (Integer.parseInt(arrey[i]) < min) {
				min = Integer.parseInt(arrey[i]);
			}
		}
		System.out.println("max = " + max + " min = " + min);
		
		System.out.println("**************************************************");
	

	}

}
