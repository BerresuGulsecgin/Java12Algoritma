package Lesson17;

public class Musteri implements Comparable<Musteri> {

	private String ad;
	private int yas;

	public Musteri(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Musteri [ad=" + ad + ", yas=" + yas + "]";
	}

	@Override
	public int compareTo(Musteri o) {

		return o.yas - this.yas;

	}
//	
//	@Override
//	public int compareTo(Musteri o) {
//		
//		if (o.getYas()>65) {
//			return o.yas-this.yas;
//		}else {
//			return this.yas-o.yas;
//		}

}
