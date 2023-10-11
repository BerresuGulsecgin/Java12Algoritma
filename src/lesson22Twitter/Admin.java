package lesson22Twitter;

public class Admin extends Person {

	private ELevel level;

	public Admin(String username, String password, ELevel level) {
		super(username, password);
		this.level = level;
	}

	public ELevel getLevel() {
		return level;
	}

	public void setLevel(ELevel level) {
		this.level = level;
	}

}
