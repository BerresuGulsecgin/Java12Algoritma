package Lesson17;

public class Hasta implements Comparable<Hasta> {

	private String ad;
	private Sikayet sikayet;
	private int sira;
	private static int num;

	public Hasta(String ad, Sikayet sikayet) {
		super();
		this.ad = ad;
		this.sikayet = sikayet;
		this.sira=num;
		num++;
	}
	
	

	public int getSira() {
		return sira;
	}



	public void setSira(int sira) {
		this.sira = sira;
	}



	public static int getNum() {
		return num;
	}



	public static void setNum(int num) {
		Hasta.num = num;
	}



	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Sikayet getSikayet() {
		return sikayet;
	}

	public void setSikayet(Sikayet sikayet) {
		this.sikayet = sikayet;
	}

	

	@Override
	public String toString() {
		return "Hasta [ad=" + ad + ", sikayet=" + sikayet + ", sira=" + sira + "]";
	}



	@Override
	public int compareTo(Hasta o) {
		if (this.sikayet.ordinal()-o.sikayet.ordinal()==0||(o.sikayet.ordinal()>=3 &&this.sikayet.ordinal()>=3)) {
			return this.sira-o.sira;
		}
		return this.sikayet.ordinal()-o.sikayet.ordinal();

	}

}
