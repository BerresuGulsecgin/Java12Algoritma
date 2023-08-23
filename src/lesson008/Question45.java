package lesson008;

public class Question45 {

	public static void main(String[] args) {

		// matrisi topla
		// yeni bir 2*3 ük yazdır

		int[][] matris1 = { { 5, 6, 2 }, { 9, 1, 6 } };

		int[][] matris2 = { { 3, 4, 1 }, { 1, 3, 6 } };

		int[][] yeni = new int[2][3];

		for (int i = 0; i < matris1.length; i++) {
			for (int j = 0; j < matris2[0].length; j++) { // eşit boyutlu olmadığı için [0] kullanılır
				yeni[i][j] = matris1[i][j] + matris2[i][j];
				System.out.print(yeni[i][j] + " ");
			}
			System.out.println();
		}

	}

}
