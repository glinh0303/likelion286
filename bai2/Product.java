package ex286.bai2;

public class Product {
	private int productID;
	private String productName;
	private double price;
	private static final String storeName = "ABC Store";

//	public Product(int productID, String productName, double price) {
//		this.productID = productID;
//		this.productName = productName;
//		this.price = price;
//	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public static String getStorename() {
		return storeName;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID
				+ ", productName=" + productName + ", price=" + price + ", storeName=" + storeName + "]";
	}

}
