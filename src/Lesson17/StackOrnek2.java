package Lesson17;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {

	public static void main(String[] args) {

		// parametre olarak String alan ve
		// girilen kelimenin polindrom olup olmadığı bulalım

		Stack<Character> kelime = new Stack<Character>();

		Scanner sc = new Scanner(System.in);

		System.out.println("kelime giriniz");
		String kelimes = sc.nextLine();

		for (int i = 0; i < kelimes.length(); i++) {
			kelime.add(kelimes.charAt(i));

		}

		System.out.println(kelime);

		while (kelime.size() != 1) {
			if (kelime.get(0) == kelime.get(kelime.size() - 1)) {
				kelime.remove(0);
				kelime.remove(kelime.size() - 1);

			} else {
				break;
			}
		}
		if (kelime.size() == 1) {
			System.out.println("polindrom");
		} else {
			System.out.println("değil");
		}

		System.out.println(isPolindrom("kek"));

	}

	public static boolean isPolindrom(String kelime) {
		Stack<Character> kelimeStack = new Stack<Character>();
		for (Character character : kelime.toCharArray()) {
			kelimeStack.add(character);
		}

		for (int i = 0; i < kelime.length()/2; i++) {
			if (kelime.charAt(i) != kelimeStack.pop()) {
				return false;
			}
		}
		return true;
	}

}
