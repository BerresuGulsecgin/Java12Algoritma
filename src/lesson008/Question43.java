package lesson008;

public class Question43 {

	public static void main(String[] args) {
		// 3*3 lük boş matris oluştur

		// 1 1 1
		// 2 2 2
		// 3 3 3

		int[][] matris = new int[3][3];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j] = (i + 1);
				System.out.print(matris[i][j] + " ");

			}
			System.out.println();
		}

	}

}
