package lesson20.StreamUygulama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Market {

	List<Urun> productList;
	Map<String, Double> urunlerListesi;

	public Market() {
		super();
		urunleriOlustur();

	}

	public List<Urun> getProductList() {
		return productList;
	}

	public void setProductList(List<Urun> productList) {
		this.productList = productList;
	}

	public Map<String, Double> getUrunlerListesi() {
		return urunlerListesi;
	}

	public void setUrunlerListesi(Map<String, Double> urunlerListesi) {
		this.urunlerListesi = urunlerListesi;
	}

	public void urunleriOlustur() {
		EUrun[] urunler = EUrun.values(); // enumdan diziye çekme

		productList = Arrays.asList(urunler).stream().map(urun -> new Urun(urun.name(), urun.getFiyat()))
				.collect(Collectors.toList());
	}

}
