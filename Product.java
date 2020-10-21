package com.pro;

public class Product {
private int ProductId;
private String ProductName;
private int ProductQuantity;
private int Price;

public Product(int ProductId, String ProductName,int ProductQuantity, int Price) {
	
	this.ProductId = ProductId;
	this.ProductName = ProductName;
	this.ProductQuantity = ProductQuantity;
	this.Price=Price;
}

public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getProductQuantity() {
	return ProductQuantity;
}
public void setProductQuantity(int productQuantity) {
	ProductQuantity = productQuantity;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
@Override
public String toString() {
	return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductQuantity=" + ProductQuantity
			+ ", Price=" + Price + "]";
}


}
