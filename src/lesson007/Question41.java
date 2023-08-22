package lesson007;

public class Question41 {

	public static void main(String[] args) {

		// dizideki en büyük 2. sayıyı bulalım

		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };

		int max = Integer.MIN_VALUE;
		int ikinci = Integer.MIN_VALUE;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > max) {
				ikinci = max;
				max = sayilar[i];

			}else if (sayilar[i]>max && sayilar[i]!=max ) {
				ikinci=sayilar[i];
				
			}

		}
		System.out.println(ikinci);
		
		

	}

}
