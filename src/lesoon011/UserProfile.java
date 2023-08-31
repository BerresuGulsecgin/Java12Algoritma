package lesoon011;

public class UserProfile {

	String usarname;
	String about;
	int followers;
	int following;
	String avatar;
	int postCount;
	String name;
	String surname;

	public void editProfile() {
		System.out.println(name + " profilini düzenledi");
	}

	public void createPost() {
		System.out.println("post oluşturuldu");
		postCount++;
	}

	public void shareStory() {
		System.out.println("story oluşturuldu");
	}

	public void addFriend() {
		System.out.println("takip edildi");
		following++;
	}
	public void getInformation() {
		System.out.println("=========Profil Bilgileri=========");
		System.out.println("isim soyisim = "+name+ " "+surname);
		System.out.println("kullanıcı ismi = "+usarname);
		System.out.println("post sayısı = "+postCount);
		System.out.println("takipçi sayısı = "+followers);
		System.out.println("takip sayısı = "+following);
		System.out.println("==================================");
	}

}
