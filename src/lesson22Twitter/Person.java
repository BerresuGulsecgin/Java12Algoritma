package lesson22Twitter;

import java.util.UUID;

public class Person {

	private String id;
	private String username;
	private String password;

	public Person(String username, String password) {
		this.id = UUID.randomUUID().toString();
		this.username = username;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
