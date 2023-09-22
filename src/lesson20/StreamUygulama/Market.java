package lesson20.StreamUygulama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Market {

	List<Urun> productList;
	Map<String, Double> urunlerListesi;
	Map<String, Integer> sepet = new HashMap<String, Integer>();;

	public Market() {
		super();
		urunleriOlustur();
		urunlerveFiyatlarListesiOlustur();

	}

	public void urunleriOlustur() {
		EUrun[] urunler = EUrun.values(); // enumdan diziye çekme

		productList = Arrays.asList(urunler).stream().map(urun -> new Urun(urun.name(), urun.getFiyat()))
				.collect(Collectors.toList());
	}

	public void urunlerveFiyatlarListesiOlustur() {
		urunlerListesi = productList.stream().collect(Collectors.toMap(u -> u.getName(), u -> u.getPrice()));
	}

	public void urunlerveFiyatlarListesiGoster() {
		urunlerListesi.forEach((k, v) -> System.out.println(k + " " + v));
	}

	public void sepeteUrunEkle() {

		// kullanıcıdan hangi ürünü almak istediği sor -> cips
		// markette var mı yok mu kontrol et
		// yoksa bilgi verelim
		// varsa sepeti kontrol edelim
		// daha önce eklendiyse adeti 1 arttır
		// yoksa direk ekleyeceğiz

		Scanner sc = new Scanner(System.in);
		System.out.println("almak istediğiniz ürün");
		String urun = sc.nextLine();

		if (urunlerListesi.containsKey(urun)) {
			sepet.put(urun, sepet.getOrDefault(urun, 0) + 1);
		} else {
			System.out.println("ürün bulunamadı");
		}

	}

	public void sepetiGoster() {
		sepet.forEach((k, v) -> System.out.println(k + " " + v));
	}

	public void ortalamaAl() {
		double ort = productList.stream().filter(p -> p.getPrice() < 50)
				.collect(Collectors.averagingDouble(Urun::getPrice));

		double ortalama = productList.stream().filter(p -> p.getPrice() < 50).mapToDouble(Urun::getPrice).average()
				.orElse(0.0); // alternatif

		System.out.println(ort);

	}

}
