package lesson26;

import java.util.ArrayList;
import java.util.List;

public class Soru {

	// 14:52
	private String soruMetni;
	private int puan;
	private List<String> secenekler = new ArrayList<>();
	private String dogruCevap;
	private String soruNo;

	public Soru(String soruMetni, int puan, List<String> secenekler, String dogruCevap) {
		super();
		this.soruMetni = soruMetni;
		this.puan = puan;
		this.secenekler = secenekler;
		this.dogruCevap = dogruCevap;
	}

	public Soru() {

	}

	public String getSoruNo() {
		return soruNo;
	}

	public void setSoruNo(String soruNo) {
		this.soruNo = soruNo;
	}

	public String getSoruMetni() {
		return soruMetni;
	}

	public void setSoruMetni(String soruMetni) {
		this.soruMetni = soruMetni;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public List<String> getSecenekler() {
		return secenekler;
	}

	public void setSecenekler(List<String> secenekler) {
		this.secenekler = secenekler;
	}

	public String getDogruCevap() {
		return dogruCevap;
	}

	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}

	public void soruyuGoster() {
		System.out.println(soruNo + " Puan: " + puan);
		System.out.println("Soru : " + soruMetni);
		secenekler.forEach(u -> System.out.println(u.toString()));
	}

}