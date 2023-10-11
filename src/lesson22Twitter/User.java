package lesson22Twitter;

public class User extends Person {

	private String telefon;
	private Profile profile;
	private EStatus eStatus;

	public User(String username, String password, String telefon) {
		super(username, password);
		this.telefon = telefon;
		this.eStatus = EStatus.ACTIVE;

		this.profile = new Profile();
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public EStatus geteStatus() {
		return eStatus;
	}

	public void seteStatus(EStatus eStatus) {
		this.eStatus = eStatus;
	}

}
