package lesson16;

import java.security.PublicKey;
import java.util.ArrayList;

public class ArrrayListOrnek {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ankara");
		list.add("istanbul");
		list.add("antalya");
		list.add("adana");
		
		
	degerDegistirme(list);
	System.out.println("----------------------------");
	degerDegistirme2(list);
	System.out.println("----------------------------");
	degerDegistirme3(list);
		
		
	}
	public static void degerDegistirme(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String deger=list.get(i);
			if (deger.toLowerCase().startsWith("an")) {
				deger="xxx";
				
			}
			System.out.println(deger);
		}
	}
	public static void degerDegistirme2(ArrayList<String> list) {
		for (String string : list) {
			if (string.toLowerCase().startsWith("an")) {
				string="xxx";
				
			}
			System.out.println(string);
		}
	}
	public static void degerDegistirme3(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String deger=list.get(i);
			if (deger.toLowerCase().startsWith("an")) {
				deger=deger.replaceAll("an", "**");
				list.set(i, "xxx");
				
			}
			
		}
		list.forEach(deger -> System.out.println(deger));
		System.out.println(list);
	}
	
	

}
