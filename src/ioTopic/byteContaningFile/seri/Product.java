package ioTopic.byteContaningFile.seri;

import java.io.Serializable;

public class Product implements Serializable {
	
	private int productId;
	private String manufacturing;
	private String name;
	private transient int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String manufacturing, String name, int price) {
		super();
		this.productId = productId;
		this.manufacturing = manufacturing;
		this.name = name;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(String manufacturing) {
		this.manufacturing = manufacturing;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
