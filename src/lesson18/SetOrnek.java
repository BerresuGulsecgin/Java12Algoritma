package lesson18;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Set<Character> tekrarli = new HashSet<Character>();
		Set<Character> tekrarsiz = new HashSet<Character>();

		Scanner sc = new Scanner(System.in);

		System.out.println("kelime girin");
		String kelime = sc.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			if (!tekrarli.contains(kelime.charAt(i)) && !tekrarsiz.add(kelime.charAt(i))) {
				tekrarli.add(kelime.charAt(i));
				tekrarsiz.remove(kelime.charAt(i));
			}
		}

//		for (int i = 0; i < kelime.length(); i++) {
//			
//			for (int j = i; j < kelime.length(); j++) {
//				if (kelime.charAt(i)==kelime.charAt(j)) {
//					tekrarli.add(kelime.charAt(i));
//				}else {
//					tekrarsiz.add(kelime.charAt(i));
//				}
//			}
//			
//		}

		System.out.println(tekrarli);
		System.err.println(tekrarsiz);

	}

}
