package lesson19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlakaTahmini {

	private HashMap<Integer, String> sehirler;
	private HashMap<Integer, List<String>> tahminler;

	private int hak = 3;
	private int oyunSayisi = 1;

	static Random rnd = new Random();

	public PlakaTahmini() {
		super();
		sehirMetniOlustur();
		this.tahminler = new HashMap<Integer, List<String>>();

	}

	public void sehirMetniOlustur() {
		sehirler = new HashMap<>();
		sehirler.put(1, "Adana");
		sehirler.put(1, "Adana");
		sehirler.put(2, "Adıyaman");
		sehirler.put(3, "Afyonkarahisar");
		sehirler.put(4, "Ağrı");
		sehirler.put(5, "Amasya");
		sehirler.put(6, "Ankara");
		sehirler.put(7, "Antalya");
		sehirler.put(8, "Artvin");
		sehirler.put(9, "Aydın");
		sehirler.put(10, "Balıkesir");
		sehirler.put(11, "Bilecik");
		sehirler.put(12, "Bingöl");
		sehirler.put(13, "Bitlis");
		sehirler.put(14, "Bolu");
		sehirler.put(15, "Burdur");
		sehirler.put(16, "Bursa");
		sehirler.put(17, "Çanakkale");
		sehirler.put(18, "Çankırı");
		sehirler.put(19, "Çorum");
		sehirler.put(20, "Denizli");
		sehirler.put(21, "Diyarbakır");
		sehirler.put(22, "Edirne");
		sehirler.put(23, "Elazığ");
		sehirler.put(24, "Erzincan");
		sehirler.put(25, "Erzurum");
		sehirler.put(26, "Eskişehir");
		sehirler.put(27, "Gaziantep");
		sehirler.put(28, "Giresun");
		sehirler.put(29, "Gümüşhane");
		sehirler.put(30, "Hakkari");
		sehirler.put(31, "Hatay");
		sehirler.put(32, "Isparta");
		sehirler.put(33, "Mersin");
		sehirler.put(34, "İstanbul");
		sehirler.put(35, "İzmir");
		sehirler.put(36, "Kars");
		sehirler.put(37, "Kastamonu");
		sehirler.put(38, "Kayseri");
		sehirler.put(39, "Kırkareli");
		sehirler.put(40, "Kırşehir");
	}

	public HashMap<Integer, String> getSehirler() {
		return sehirler;
	}

	public void setSehirler(HashMap<Integer, String> sehirler) {
		this.sehirler = sehirler;
	}

	public HashMap<Integer, List<String>> getTahminler() {
		return tahminler;
	}

	public void setTahminler(HashMap<Integer, List<String>> tahminler) {
		this.tahminler = tahminler;
	}

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public int getOyunSayisi() {
		return oyunSayisi;
	}

	public void setOyunSayisi(int oyunSayisi) {
		this.oyunSayisi = oyunSayisi;
	}

	public void tahminEt() {

		List<String> sehirTahmini = new ArrayList<String>();
		int plaka = rnd.nextInt(1, 41);
		System.out.println(plaka + " numaralı plaka hangi ilimizin");

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + ". tahminin giriniz");
			String tahmin = OyunMenusu.sc.nextLine();
			if (!tahmin.equalsIgnoreCase(sehirler.get(rnd))) {
				setHak(getHak() - 1);
				sehirTahmini.add(tahmin);

				System.out.println("bilemediniz.Kalan hak : " + getHak());
			} else {
				sehirTahmini.add(tahmin);

				break;
			}
		}

		getTahminler().put(oyunSayisi, sehirTahmini);
		oyunSayisi++;
	}

	public void tahminEt2() {
		tahminler.put(oyunSayisi, new ArrayList<>());
		int randomPlaka = randomPlaka();
		System.out.println("plakaNo = (" + randomPlaka + ") hangi şehrin plakasıdır?");
		for (int i = 1; hak > 0; i++) {
			System.out.print("tahmininizi giriniz");
			String tahmin = OyunMenusu.sc.nextLine();
			tahminler.get(oyunSayisi).add(tahmin);
			if (tahmin.equalsIgnoreCase(sehirler.get(randomPlaka))) {
				System.out.println("tebrikler " + i + " denemede buldunuz");
				hak = 3;
				break;
			}
			hak--;
			System.out.println("tahmininiz yanlış.kalan hak : " + hak);
		}
		oyunSayisi++;
		hak = 3;

	}

	public void tahminListem() {
		tahminler.forEach((k, v) -> System.out.println(k + ". oyun tahminleri " + v));
	}

	private int randomPlaka() {
		List<Integer> plakaNolari = new ArrayList<Integer>(getSehirler().keySet());
		return plakaNolari.get(rnd.nextInt(plakaNolari.size()));
	}

}
