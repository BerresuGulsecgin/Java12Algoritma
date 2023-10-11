package lesson25;

public class Main {

	public static void main(String[] args) {
		// oörenci sınıfı olsun isim ve ort
		// manager sınıfına metod yazalım
		// dosyadaki verileri okuyup ilk başta sadece ismine göre Oğrenci nesnesi
		// oluşturcak
		// oluşan öğrencileri de bir liste oluşturup içine atalaım
		
		//ayrı olarak ortalama hesapla metodu yazalım 
		//daha sonra okuduğumuz dosyadan bu sefer hem isim hem de ortalamayı alıp öğrenci nesneleri oluşturucaz
		//oluşturulan öğrencileri de listeye atalım
		
		//oluşturduğumuz bu öğrenci verilerini farklı bir dosyaya reilize edip yazalım

		Manager manager = new Manager();
		
		manager.ogrenciListesiOlustur();
		System.out.println("------------------------------------");
		manager.dosyayaYaz();
		System.out.println("------------------------------------");
		manager.dosyaOku();
		System.out.println("------------------------------------");
		manager.dosyayaYaz2();
		System.out.println("------------------------------------");
		manager.dosyaOku2();
		

	}

}
