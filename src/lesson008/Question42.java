package lesson008;

public class Question42 {

	public static void main(String[] args) {
		
		// //bilgeadam
		//advancedjava
		
		String[][] matris1 = { { "Bilge", "Advanced" }, { "Postgre", "Data" } };
		
		String[][] matris2 = { { "Adam", "Java" }, { "SQL", "Base" } };
		
		//00 + 00
		//01 + 01
		//10 + 10
		//11 + 11
		
		for (int i = 0; i < matris1.length; i++) {
			for (int j = 0; j < matris2.length; j++) {
				System.out.println(matris1[i][j]+matris2[i][j]);
				
			}
			
		}
		

	}

}
