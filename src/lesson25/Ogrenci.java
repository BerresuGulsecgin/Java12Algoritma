package lesson25;

import java.io.Serializable;

public class Ogrenci implements Serializable{

	private String ad;
	private double ort;

	public Ogrenci(String ad) {
		super();
		this.ad = ad;
	}

	public Ogrenci(String ad, double ort) {
		super();
		this.ad = ad;
		this.ort = ort;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public double getOrt() {
		return ort;
	}

	public void setOrt(double ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", ort=" + ort + "]";
	}

}
