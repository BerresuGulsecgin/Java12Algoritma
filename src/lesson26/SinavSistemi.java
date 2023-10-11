package lesson26;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lesson15.Util;

public class SinavSistemi {

	public static List<Soru> sorular = new ArrayList<>();

	public static List<Ogrenci> ogrenciler = new ArrayList<>();

	public List<String> secenekler;

	public void soruDosyasiniOku(String fileName) {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			Soru soru = null;
			String satir;
			int index = 0;

			while (index <= 5 && (satir = reader.readLine()) != null) {
				switch (index) {
				case 0:
					soru = new Soru();
					soru.setSoruNo(satir);
					index++;
					break;
				case 1:
					soru.setPuan(Integer.parseInt(satir));
					index++;
					break;
				case 2:
					soru.setSoruMetni(satir);
					index++;
					break;
				case 3:
					soru.getSecenekler().add(satir);
					if (soru.getSecenekler().size() == 5) {
						index++;
					}
					break;
				case 4:
					soru.setDogruCevap(satir);
					sorular.add(soru);
					index = 0;
					break;

				default:
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void sinaviBaslat(Ogrenci ogrenci) {
		for (Soru soru : sorular) {
			soru.soruyuGoster();
			String cevap = Util.getStringValue("Doğru Cevabı Girinz:");
			if (soru.getDogruCevap().equals(cevap)) {
				ogrenci.setPuan(ogrenci.getPuan() + soru.getPuan());
			}
		}
		System.out.println("Sınav Tamamlandı ");
		sinaviBitir(ogrenci);

	}

	private static void sinaviBitir(Ogrenci ogrenci) {

		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("AogrenciNotlar.txt"))) {
			// ogrenciler.add(ogrenci);
			writer.writeObject(ogrenciler);
			System.out.println("Puanınız: " + ogrenci.getPuan());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ogrenciSinavlariniGoster() {
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("AogrenciNotlar.txt"))) {
			List<Ogrenci> ogrenciler = (List<Ogrenci>) reader.readObject();

			ogrenciler.forEach(u -> System.out.println("İsim " + u.getAd() + " Puan " + u.getPuan()));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}