package lesson13.profile;

public class Profile {

	// atturibute, property, field

	public String profilResmi;
	public String kullaniciAdi;
	public String isim;
	public int takipciSayisi;
	public int takipSayisi;
	public String[] posts;
	public int postSayisi;
	public static int toplamProfilSayisi;
	public boolean maviTik;

	public Profile() {
		this.posts = new String[10];
		toplamProfilSayisi++;

	}

	// post oluşturma metodu yazalım
	// String isim verelim

	public void postEkle(String isim) {
		System.out.println(isim + " adlı post oluşturuldu");
		posts[postSayisi] = isim;
		postSayisi++;
	}

	// profil ismini güncelle metodu yazalım

	public void profilIsimGuncelle(String isim) {

		this.isim = isim;
		System.out.println("isminiz " + this.isim + " olarak güncellendi");

	}

	// isteği kabul et
	// takipten çıkar

	public void istegiKabulEt() {
		System.out.println("gelen istek kabul edildi");
		this.takipciSayisi++;
		maviTikKontrol();

	}

	public void takiptenCikar() {
		if (this.takipciSayisi > 0) {
			System.out.println("takipten çıkarıldı");
			this.takipciSayisi--;
			maviTikKontrol();
		} else {
			System.out.println("hiç takipçiniz yok");
		}

	}

	// mavi tik vermek istiyorum
	// takipçi sayisi 5 den büyükse mavi tik ver değilse verme

	private void maviTikKontrol() {

		if (this.takipciSayisi > 5 && maviTik == false) {
			this.maviTik = true;
		} else if (takipciSayisi <= 5 && maviTik == true) {
			this.maviTik = false;
		}

	}
	
	//profilbilgilerinigöster
	//ismi, takipçi sayisi, post sayisi, mavi tik,
	
	public void profilBilgileriniGoster() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Profile [isim=" + isim + ", takipciSayisi=" + takipciSayisi + ", postSayisi=" + postSayisi
				+ ", maviTik=" + maviTik + "]";
	}
	
	
	
	

}
