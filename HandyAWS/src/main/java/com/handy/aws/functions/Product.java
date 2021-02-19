package com.handy.aws.functions;

public class Product {
	
	
	public Product(int id, String title, String type, String desc, String filename, int height, int width, float price,
			int rating) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.desc = desc;
		this.filename = filename;
		this.height = height;
		this.width = width;
		this.price = price;
		this.rating = rating;
	}
	
	public Product() {
		
	}
	int id;
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", type=" + type + ", desc=" + desc + ", filename=" + filename
				+ ", height=" + height + ", width=" + width + ", price=" + price + ", rating=" + rating + "]";
	}
	String title;
	String type;
	String desc;
	String filename;
	int height;
	int width;
	float price;
	int rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
