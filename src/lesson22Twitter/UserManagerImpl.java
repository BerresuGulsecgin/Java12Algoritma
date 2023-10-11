package lesson22Twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.crypto.Data;

public class UserManagerImpl implements PersonManager {
	// private static final String SUITABLE_CHARACTERS_FOR_PASSWORD_REGEX =
	// "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,12}$";

	// username sadece a-z , A-Z 0-9' a kadar ve min üç max 10 karakter olacak

	/**
	 * Ornek Userame --> Mehmet1
	 */
	private static final String SUITABLE_CHARACTERS_FOR_USERNAME_REGEX = "^[a-zA-Z0-9]{3,10}$";

	/**
	 * Ornek Password-- > Abc123@
	 */
	private static final String SUITABLE_CHARACTERS_FOR_PASSWORD_REGEX = "^(?=.*[A-ZA-Z])(?=.*\\d)(?=.*[@$.!%*#?&])[A-Za-z\\d@$.!%*#?&]{3,10}";

	private static final String TURKISH_PHONE_NUMBER_REGEX = "^[0-9]{10}$";

	@Override
	public Person login() throws RuntimeException {
		String username = Util.getStringValue("Lütfen usernamenizi girin");
		String password = Util.getStringValue("Password belirtin");

		Optional<Person> optionalUser = findByUserNameAndPassword(username, password);

		if (optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			throw new RuntimeException("Kullanıcı bulunamadı");
		}
	}

	private Optional<Person> findByUserNameAndPassword(String username, String password) {
		for (Person user : Database.personList) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return Optional.of(user);
			}
		}
		return Optional.empty();
	}

	private Optional<Person> findByUserName(String username) {
		for (Person user : Database.personList) {
			if (user.getUsername().equals(username)) {
				return Optional.of(user);
			}
		}
		return Optional.empty();
	}

	public void register() {
		while (true) {
			String username = Util.getStringValue("Lütfen usernamenizi girin");

			if ((!checkByUsername(username)) || (!isValidUsernameRegex(username))) {
				continue;
			}
			while (true) {
				String password = Util.getStringValue("Password belirtin");
				String rePassword = Util.getStringValue("Password tekrar girin belirtin");

				if ((!isPasswordMatches(password, rePassword)) || (!isValidPasswordRegex(password))) {
					System.out.println("Yanlış Yada Hatalı giriş");
					continue;
				}
				while (true) {
					String telefon = Util.getStringValue("Telefonunuzu belirtin");
					if ((!isValidPhoneNumberRegex(telefon)) || (!checkByPhoneNumber(telefon))) {
						System.out.println("Telefon formatını doğru girin");
						continue;
					}
					User user = new User(username, password, telefon);
					Database.personList.add(user);
					Database.userList.add(user);
					return;
				}
			}
		}
	}

	private boolean checkByUsername(String username) {
		for (User user : Database.userList) {
			if (user.getUsername().equals(username)) {
				System.out.println("Username Already Exist!");
				return false;
			}
		}
		return true;
	}

	private boolean checkByPhoneNumber(String telefon) {
		for (User user : Database.userList) {
			if (user.getTelefon().equals(telefon)) {
				System.out.println("PhoneNumber Already Exist!");
				return false;
			}
		}
		return true;
	}

	// False dönüyorsa kabul etmicez
	private boolean isValidUsernameRegex(String username) {
		return username.matches(SUITABLE_CHARACTERS_FOR_USERNAME_REGEX);
	}

	private boolean isPasswordMatches(String password, String rePassword) {
		return password.equals(rePassword);
	}

	private boolean isValidPasswordRegex(String password) {
		return password.matches(SUITABLE_CHARACTERS_FOR_PASSWORD_REGEX);
	}

	private boolean isValidPhoneNumberRegex(String password) {
		return password.matches(TURKISH_PHONE_NUMBER_REGEX);
	}

	public void tweetAt(User user) {
		String icerik = Util.getStringValue("Tweet İçerigini giriniz.");
		String hastag = Util.getStringValue("HasTag --> #something formatında Girin");

		if (hastag.startsWith("#")) {
			HashTag hashTag = new HashTag(hastag);
			Database.hastagList.add(hashTag);

			Tweet tweet = new Tweet(icerik);
			tweet.getHashTag().add(hashTag);

			Profile profile = user.getProfile();

			profile.getAtilanTweetler().add(tweet);
			profile.setTweetSayisi(profile.getTweetSayisi() + 1);

			Database.tweetList.add(tweet);
		} else {
			System.out.println("Hastag formatı Yanlış");
		}
	}

	public void tweetlerimiGoster(User user) {
		user.getProfile().getAtilanTweetler().forEach(tweet -> System.out.println(tweet.toString()));
	}

	public void tweetSil(User user) {
		user.getProfile().getAtilanTweetler()
				.forEach(tweet -> System.out.println("İçerik " + tweet.getIcerik() + " ID'si -->" + tweet.getId()));
		String id = Util.getStringValue("Silinice tweet Id.");

		Tweet tweet = findTweetById(id);
		if (tweet != null && user.getProfile().getAtilanTweetler().contains(tweet)) {
			user.getProfile().getAtilanTweetler().remove(tweet);
			Database.tweetList.remove(tweet);
		} else {
			System.out.println("Silenecek tw yok");
		}
	}

	public Tweet findTweetById(String id) {
		for (Tweet tweet : Database.tweetList) {
			if (tweet.getId().equals(id)) {
				return tweet;
			}
		}
		return null;
	}

	public void tweetBegen(User user) {
		Database.tweetList.forEach(tw -> System.out.println(tw.getIcerik() + " ID:" + tw.getId()));
		String id = Util.getStringValue("Begenmek için ID");
		Tweet tweet = findTweetById(id);
		if (tweet != null) {
			if (!tweet.getBegenenler().contains(user)) {
				tweet.setBegeniSayisi(tweet.getBegeniSayisi() + 1);
				tweet.getBegenenler().add(user);
			} else {
				tweet.setBegeniSayisi(tweet.getBegeniSayisi() - 1);
				tweet.getBegenenler().remove(user);
			}
		} else {
			System.out.println("Böyle bir tweet Yok");
		}
	}

	public void tweeteYorumYap(User user) {
		Database.tweetList.forEach(tw -> System.out.println(tw.getIcerik() + " ID:" + tw.getId()));
		String id = Util.getStringValue("Yorum Yapmak için Id gir");

		Tweet tweet = findTweetById(id);
		if (tweet != null) {
			String yorum = Util.getStringValue("Yorumunuz..");
			Comment comment = new Comment(user.getUsername(), yorum);
			tweet.getYorumlar().add(comment);
			tweet.setYorumSayisi(tweet.getYorumSayisi() + 1);
		} else {
			System.out.println("Böyle bir tweet Yok");
		}
	}

	public void mesajGonder(User user) {
		// Stream kullanarak bütün kullancılıar listele ama engelli engelli listesinde
		// olmayanları
		// Database.userList.stream().filter(u -> engelCheck(user, user)).
		Database.userList.forEach(u -> System.out.println(u.getUsername()));
		String username = Util.getStringValue("Kime Mesaj Atmak istiyosunuz");
		Optional<Person> optionalPerson = findByUserName(username);

		if (optionalPerson.isPresent()) {
			User recieverUser = (User) optionalPerson.get();
			if (engelCheck(user, recieverUser)) {
				String mesaj = Util.getStringValue("Mesajınız?? ");
				if (recieverUser.geteStatus().name().equals("LOCK")) {
					System.out.println("Kullanıcı mesaj isteklerini kısıtlamış");
					// TODO: mesaj isteklerine düşsün yapılabilir.
				} else {
					recieverUser.getProfile().getMesajlar().put(user.getUsername(), recieverUser.getProfile()
							.getMesajlar().getOrDefault(user.getUsername(), new ArrayList<>()));
					recieverUser.getProfile().getMesajlar().get(user.getUsername()).add(mesaj);
				}
			}
		} else {
			System.out.println("Böyle biri yok");
		}
	}

	public void mesajIstekleriniKitle(User user) {
		user.seteStatus(EStatus.LOCK);
	}

	public void gelenKutusu(User user) {
		System.out.println(user.getProfile().getMesajlar());
	}

	public void profilGoster(User user) {
		String username = Util.getStringValue("Kimin Profilini Görmek istiyorsunuz");
		Optional<Person> optionalPerson = findByUserName(username);
		if (optionalPerson.isPresent()) {
			User user2 = (User) optionalPerson.get();
			boolean check = engelCheck(user, user2);
			if (check) {
				System.out.println(user2.getUsername() + " " + user2.getProfile().toString());
			}
		} else {
			System.err.println("Veri tabanında Böyle biri yok");
		}
	}

	// eğer ben bir kullancıyı engellediysem
	// kimse kimseye ereşemiyor
	public void userEngelle(User user) {
		String username = Util.getStringValue("Kimin Engelliceksin");
		Optional<Person> optionalPerson = findByUserName(username);
		if (optionalPerson.isPresent()) {
			User engellenecekUser = (User) optionalPerson.get();
			boolean check = engelCheck(user, engellenecekUser);
			if (check) {
				user.getProfile().getEngellenenler().add(engellenecekUser);
			}
		} else {
			System.err.println("Böyle biri yok");
		}

	}

	private boolean engelCheck(User user, User user2) {
		if (user.getProfile().getEngellenenler().contains(user2)) {
			System.out.println(user2.getUsername() + " Kullanıcısını engellemişsiniz");
			return false;
		} else if (user2.getProfile().getEngellenenler().contains(user)) {
			System.err.println("Böyle biri yok");
			return false;
		}
		// true --> her hangi bir engelleme yok
		return true;
	}

}