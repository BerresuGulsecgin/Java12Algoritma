package lesson14;

public class User {

	private String name;
	private String surname;
	private String email;
	private Account account;

	public User() {
		super();
	}

	public User(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = UserManager.generateEmail(name, surname);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
