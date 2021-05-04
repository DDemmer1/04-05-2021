package de.demmer.dennis;

public class Product implements Comparable<Product> {

	private float price;
	private String name;
	private int id;

	public Product(float price, String name, int id) {
		super();
		this.price = price;
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Product otherProduct) {

		// 1
		if (this.getId() > otherProduct.getId()) {
			return 1;
		}

		// -1
		if (this.getId() < otherProduct.getId()) {
			return -1;
		}

		// 0
		if (this.getId() == otherProduct.getId()) {
			return 0;
		}

		return 0;
	}

}
