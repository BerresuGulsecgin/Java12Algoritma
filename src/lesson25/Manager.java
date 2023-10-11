package lesson25;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manager {
	ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

	public void ogrenciListesiOlustur() {

		try (Scanner sc = new Scanner(new FileReader("ogrenci.txt"))) {

			while (sc.hasNext()) {
				String satir = sc.nextLine();
				String[] dizi = satir.split(",");
				// double ortalama = ortBul(dizi);
				double ortalama = ortBulList(Arrays.asList(dizi));
				Ogrenci ogr = new Ogrenci(dizi[0], ortalama);
				ogrenciler.add(ogr);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ogrenciler);
	}

	public double ortBul(String[] dizi) {

		int toplam = 0;
		double ortalama;
		for (int i = 1; i < dizi.length; i++) {
			toplam += Integer.parseInt(dizi[i]);
		}
		ortalama = toplam / (dizi.length - 1);
		// double ortalama = (Integer.parseInt(dizi[1]) + Integer.parseInt(dizi[2]) +
		// Integer.parseInt(dizi[3])) / 3;

		// return ortalama;
		return Arrays.stream(dizi).skip(1).mapToDouble(Double::parseDouble).average().orElse(0); // steam ile hesaplama

	}

	public double ortBulList(List<String> list) {

		int toplam = 0;
		double ortalama;
		for (int i = 1; i < list.size(); i++) {
			toplam += Integer.parseInt(list.get(i));
		}
		ortalama = toplam / (list.size() - 1);
		return ortalama;
		// return
		// list.stream.skip(1).mapToDouble(Double::parseDouble).average().orElse(0); //
		// steam ile hesaplama

	}

	public void dosyayaYaz() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serilizeOgrenciler.txt"))) {

			oos.writeObject(ogrenciler);

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public void dosyayaYaz2() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serilizeOgrenciler2.txt"))) {

			ogrenciler.forEach(o -> {
				try {
					oos.writeObject(o);
				} catch (IOException e) {

					e.printStackTrace();
				}
			});

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public void dosyaOku() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serilizeOgrenciler.txt"))) {
			ArrayList<Ogrenci> okunan = (ArrayList<Ogrenci>) ois.readObject();
			for (Ogrenci ogrenci : okunan) {
				System.out.println(ogrenci);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dosyaOku2() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serilizeOgrenciler2.txt"))) {
			Ogrenci ogrenci;
			while ((ogrenci = (Ogrenci) ois.readObject()) != null) {
				System.out.println(ogrenci);
			}

		}catch (EOFException e) {
			
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
