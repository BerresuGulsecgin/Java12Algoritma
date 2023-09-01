package lesson012;

public class StaticOrnek {

	int number1;
	static int number2;

	public void numaraVer() {
		System.out.println("numara ver metodu");
		number1 += 1;
		number2 += 1;
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
	}

	public static void numaraVer2() {
		System.out.println("numara ver 2 metodu");
		// number1+=1; static bir metod içinde static olmayan bir özellik direk olarak
		// kullanılmaz
		// System.out.println("number1 = "+number1); kullanmak için nesne oluşturmak
		// gerekir
		number2 += 1;
		System.out.println("number2 = " + number2);
	}

	public static void main(String[] args) {
		
		number2=5;
		StaticOrnek.number2=10;
		StaticOrnek nesne = new StaticOrnek();
		nesne.number1=10;
		System.out.println(number2);
		System.out.println(nesne.number1);
		
		nesne=new StaticOrnek();
		System.out.println(number2);
		System.out.println(nesne.number1);
		
		nesne.numaraVer();
		nesne.numaraVer();
		
		StaticOrnek nesne2 = new StaticOrnek();
		System.out.println(nesne2.number1);
		System.out.println(nesne.number1);
		
		System.out.println(nesne2.number2);
		System.out.println(nesne.number2);
		
		
		numaraVer2();
		StaticOrnek.numaraVer2();
		nesne.numaraVer();
		nesne2.numaraVer();
		
		System.out.println(nesne2.number1);
		System.out.println(nesne.number1);
		
		System.out.println(nesne2.number2); // static olunca başına nesne yazılmasına gerek yok
		System.out.println(nesne.number2);
		System.out.println(StaticOrnek.number2);
		System.out.println(number2);
		
		
		

	}
}
