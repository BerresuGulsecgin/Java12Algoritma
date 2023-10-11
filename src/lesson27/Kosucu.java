package lesson27;

public class Kosucu implements Runnable {

	// run methodu içerisinde 100 metre koşu yaptırcaz 0-100 arası her sayıda
	// mesamiz bir artacak

	// her 10 metrede bir çıktı verelim kosucu şu mesafede diye
	// methodun çalışma süresini hesaplayalım
	// daha mainde 2 tane koşucu oluşturalım ve başlatalım

	public String name;
	public Long sure;

	public Kosucu(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		long baslangic = System.currentTimeMillis();

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " " + ((i * 10) + 10) + " metrede");

		}
		long bitis = System.currentTimeMillis();
		sure = bitis - baslangic;
		System.out.println(name + " adlı koşucu " + sure + " milisaniyede bitirdi");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSure() {
		return sure;
	}

	public void setSure(Long sure) {
		this.sure = sure;
	}
	
	
}
