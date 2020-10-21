package com.pro;

public class ShoppingCart {
private int NoOfProduct;
private int Product1;
private int Product2;
private int Total;
public int getNoOfProduct() {
	return NoOfProduct;
}
public void setNoOfProduct(int noOfProduct) {
	NoOfProduct = noOfProduct;
}
public int getProduct1() {
	return Product1;
}
public void setProduct1(int product1) {
	Product1 = product1;
}
public int getProduct2() {
	return Product2;
}
public void setProduct2(int product2) {
	Product2 = product2;
}
public int getTotal() {
	return Total;
}
public void setTotal(int total) {
	Total = total;
}
@Override
public String toString() {
	return "ShoppingCart [NoOfProduct=" + NoOfProduct + ", Product1=" + Product1 + ", Product2=" + Product2 + ", Total="
			+ Total + "]";
}


}
