package lesson13.profile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profile ahmetProfili = new Profile();
		
		ahmetProfili.kullaniciAdi="Ahmet1";
		ahmetProfili.isim="ahmet";
		System.out.println(ahmetProfili.isim);
		System.out.println(ahmetProfili.kullaniciAdi);
		
		ahmetProfili.postEkle("ankarada kahve");
		ahmetProfili.postEkle("ankarada kahve");		
		System.out.println(ahmetProfili.postSayisi);
		
		Profile mehmetProfili = new Profile();
		
		mehmetProfili.postEkle("istanbul");
		mehmetProfili.postEkle("istanbul");
		mehmetProfili.postEkle("istanbul");
		System.out.println(mehmetProfili.postSayisi);
		
		
		System.out.println(Profile.toplamProfilSayisi);
		
		ahmetProfili.profilIsimGuncelle("ahmet22");
		System.out.println(ahmetProfili.isim);
		
		ahmetProfili.istegiKabulEt();
		ahmetProfili.istegiKabulEt();
		ahmetProfili.istegiKabulEt();
		ahmetProfili.istegiKabulEt();
		ahmetProfili.istegiKabulEt();
		ahmetProfili.istegiKabulEt();		
		
		System.out.println(ahmetProfili.takipciSayisi);
		System.out.println(mehmetProfili.takipciSayisi);		
		
		System.out.println(ahmetProfili.maviTik);
		
		ahmetProfili.takiptenCikar();
		ahmetProfili.takiptenCikar();
		ahmetProfili.takiptenCikar();
		ahmetProfili.takiptenCikar();
		ahmetProfili.takiptenCikar();
		ahmetProfili.takiptenCikar();
		ahmetProfili.takiptenCikar();
		ahmetProfili.takiptenCikar();
		
		System.out.println(ahmetProfili.maviTik);
		
		System.out.println(ahmetProfili.toString());
		ahmetProfili.profilBilgileriniGoster();
		
		
		
		

	}

}
