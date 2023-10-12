package lesson28;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class Ogretmen extends Thread {

	private String ad;
	List<Ogrenci> notuOkunanlar = new ArrayList<>();
	BufferedReader reader;

	public Ogretmen(String ad, BufferedReader reader) {
		super();
		this.ad = ad;
		this.reader = reader;

	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Override
	public void run() {

		try {
			String satir;
			while ((satir = reader.readLine()) != null) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String[] array = satir.split(",");
				double ort = (Integer.parseInt(array[1]) + Integer.parseInt(array[2]) + Integer.parseInt(array[3])) / 3;
				Ogrenci ogrenci = new Ogrenci(array[0], ort);
				notuOkunanlar.add(ogrenci);
				// System.out.println(ad + " öğretmen " + ogrenci.getAd() + " öğrencisini
				// okudu");

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(list);
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ad + " okudukarı");
		notuOkunanlar.forEach(s -> System.out.print(s.getAd() + "--"));
		System.out.println();

	}

//	public double ortBul(String[] dizi) {
//
//		double ortalama = (Integer.parseInt(dizi[1]) + Integer.parseInt(dizi[2]) + Integer.parseInt(dizi[3])) / 3;
//
//		return ortalama;
//
//	}

}
