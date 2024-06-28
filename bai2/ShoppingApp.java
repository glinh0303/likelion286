package ex286.bai2;

import java.util.List;

public class ShoppingApp {

	public static void main(String[] args) {
		Product p;
		Cart cart = new Cart();

		for (int i = 1; i <= 5; i++) {
			p = new Product();
			p.setProductID(i);
			p.setProductName("product" + i);
			p.setPrice(i + 100);
			cart.addToCart(p);
		}

		List<Product> cartP = cart.getList();
		for (Product product : cartP) {
			System.out.println(product.toString());
		}
		cart.totalPrice();
	}

}
