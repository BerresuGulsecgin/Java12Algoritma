package lesson18;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOrnek {

	// char ve int tutan bir map oluşturulaım
	// kullanıcıdan bir kelime alalım
	// girilen kelimelerde hangi karften kaç tane var yazdıralım

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		System.out.println("kelime giriniz");
		String kelime = sc.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
//			if (!map.containsKey(kelime.charAt(i))) {
//				map.put(kelime.charAt(i), 1);
//			} else {
//				map.put(kelime.charAt(i), map.get(kelime.charAt(i)) + 1);
//			}
			
			map.put(kelime.charAt(i), map.getOrDefault(kelime.charAt(i), 0)+1);

		}
		System.out.println(map);

	}

}
