package lesson13.product;

import java.util.ArrayList;

public class Cart {

	private double totalPrice;
	private int amount;
	private ArrayList<Product> products;

	public Cart() {
		this.products=new ArrayList<>();
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	// sepete ekle metodu
	// totalPrice güncellemek lazım
	// amount güncellemek lazım
	// stock kontrolü yap
	public void addToCart(Product product) {

		if (product.getStock() <= 0) {
			System.err.println("üründe stok kalmamıştır");
			product.removeFormListing();
		} else {
			getProducts().add(product);
			product.setStock(product.getStock() - 1); // stoğu bir azaltır
			setAmount(getAmount() + 1);
			setTotalPrice(getTotalPrice() + product.getPrice());
			System.out.println(product.getName()+" sepete eklenmiştir");
		}

	}
	
	//sepetteki ürünleri göster metodu
	
	public void showCartList() {
		for (Product product : products) {
			System.out.println(product.getName()+" "+product.getPrice());
		}
	}

}
