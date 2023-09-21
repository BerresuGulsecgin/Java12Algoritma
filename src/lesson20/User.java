package lesson20;

public class User {

	private int id;
	private String ad;
	private int salary;
	private EGender egender;

	public User(int id, String ad, int salary, EGender egender) {
		super();
		this.id = id;
		this.ad = ad;
		this.salary = salary;
		this.egender = egender;
	}

	public User(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EGender getEgender() {
		return egender;
	}

	public void setEgender(EGender egender) {
		this.egender = egender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ad=" + ad + ", salary=" + salary + ", egender=" + egender + "]";
	}

	public void bilgileriGoster() {
		System.out.println(toString());
	}

}
