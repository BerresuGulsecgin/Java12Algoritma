package lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {

	public static void main(String[] args) {
		//

		String[] ogrenci = { "ayşe", "zeynep", "mehmet" };
		Integer[] notlar = { 60, 80, 70 };

		MapOrnek2 ornek2 = new MapOrnek2();

		ornek2.notlar(ogrenci, notlar);

		System.out.println("----------2-------------");

		// her bir öğrencinin 3 notu olacak
		String[] ogrenci2 = { "ayşe", "zeynep", "mehmet" };
		Integer[][] notlar2 = { { 60, 80, 70 }, { 60, 80, 70 }, { 60, 80, 70 } };

		ornek2.notlar2(ogrenci2, notlar2);

		System.out.println("----------3-------------");
		
		notlar3(ogrenci2, notlar2);

	}

	// 1
	public <T, E> void notlar(T[] ogrenci, E[] notlar) {
		Map<T, E> map = new HashMap<T, E>();

		for (int i = 0; i < notlar.length; i++) {
			map.put(ogrenci[i], notlar[i]);
		}

		for (Entry<T, E> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

	// 3
	public <T, E> void notlar2(T[] ogrenci, E[][] notlar) {
		Map<T, E[]> map = new HashMap<>();

		for (int i = 0; i < notlar.length; i++) {
			map.put(ogrenci[i], notlar[i]);
		}

		for (Entry<T, E[]> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i]);
			}

		}
	}

	// map<isimler, notları liste şeklinde tut
	public static void notlar3(String[] ogrenci, Integer[][] notlar) {

		Map<String, List<Integer>> map = new HashMap<>();
		
		for (int i = 0; i < ogrenci.length; i++) {
			if (!map.containsKey(ogrenci[i])) {
				map.put(ogrenci[i], new ArrayList<Integer>());
			}
			for (int j = 0; j < notlar[i].length; j++) {
				map.get(ogrenci[i]).add(notlar[i][j]);
			}
			
			//map.put(ogrenci[i], new ArrayList<Integer>(Arrays.asList(notlar[i]))); tek satır hali yukarıdakilerin
		}
		
		
		
		for (Entry<String, List<Integer>> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		

	}
}
