package lesson26;

import java.io.Serializable;

public class Ogrenci implements Serializable{
	
	//Serializable için id neden tanımlıyoruz, ne işe yarıyor, tanımlamazsak nolur...
	private static final long serialVersionUID = 1L;

	private String ad;
	private String ogrenciNo;
	private String password; 
	private int puan;
	
	public Ogrenci(String ad,String password) {
		super();
		this.ad = ad;
		this.ogrenciNo = Integer.toString(SinavSistemi.ogrenciler.size() + 1); 
		this.password = password;
	}
	

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}



	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(String ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", ogrenciNo=" + ogrenciNo + "]";
	}
	
	
	
}