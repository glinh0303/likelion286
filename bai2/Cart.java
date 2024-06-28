package ex286.bai2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> products;

	public Cart() {
		products = new ArrayList<>();
	}

	public List<Product> getList() {
		return this.products;
	}

	public void addToCart(Product p) {
		products.add(p);
	}

	public void totalPrice() {
		double total = 0;
		for (Product product : products) {
			total += product.getPrice();
		}
		System.out.println("Total: " + total);
	}
}
