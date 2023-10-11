package lesson25;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MarsAplication {

	public static void main(String[] args) {
		// toplam satır sayısı
		// toplam kelime sayisi
		// toplam karakter sayisi

		satirSayisi();
		System.out.println("----------");
		hesapla();
	}

	public static void satirSayisi() {

		List<String[]> list = new ArrayList<String[]>();
		List<Integer> kelime = new ArrayList<>();
		List<Integer> karakter = new ArrayList<>();
		try (Scanner sc = new Scanner(new FileReader("mars.txt"))) {
			while (sc.hasNextLine()) {
				String satir = sc.nextLine();
				String[] dizi = satir.split(" ");
				list.add(dizi);
				kelime.add(dizi.length);
				karakter.add(kelime.size());

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println(list.size());

		int toplam = 0;
		int toplam2 = 0;
		for (int i = 0; i < kelime.size(); i++) {
			toplam += kelime.get(i);
		}
		System.out.println(toplam);
		for (int i = 0; i < karakter.size(); i++) {
			toplam2 += karakter.get(i);
		}
		System.out.println(toplam2);

	}

	public static void hesapla() {
		int karakterSayisi = 0;
		int kelimeSayisi = 0;
		Map<String, Integer> tekrarli = new HashMap<String, Integer>();
		try {
			List<String> list = Files.readAllLines(Path.of("mars.txt")); // satır satır listeye atar

			for (String satir : list) {
				karakterSayisi += satir.replace(" ", "").length();
				kelimeSayisi += satir.split(" ").length;
				for (String kelime : satir.split(" ")) {
					kelime = kelime.toLowerCase().replaceAll("[^a-zA-Z]", "");
					if (!kelime.isEmpty()) {
						tekrarli.put(kelime, tekrarli.getOrDefault(kelime, 0) + 1);

					}
				}
			}
			System.out.println("Satir : " + list.size());
			System.out.println("karakter " + karakterSayisi);
			System.out.println("kelime " + kelimeSayisi);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String enCokTekrar = null;
		int tekrarSayisi = 0;
		for (Map.Entry<String, Integer> entry : tekrarli.entrySet()) {
			if (entry.getValue() > tekrarSayisi) {
				enCokTekrar = entry.getKey();
				tekrarSayisi = entry.getValue(); 
			}
		}
		System.out.println(enCokTekrar + " " + tekrarSayisi);
	}

}
