package com.pro;

public class Customer {
private int CustomerId;
private String CustomerName;
private String CustomerAddress;
private int CustomerPhNo;

public int getCustomerId() {
	return CustomerId;
}
public void setCustomerId(int customerId) {
	CustomerId = customerId;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getCustomerAddress() {
	return CustomerAddress;
}
public void setCustomerAddress(String customerAddress) {
	CustomerAddress = customerAddress;
}
public int getCustomerPhNo() {
	return CustomerPhNo;
}
public void setCustomerPhNo(int customerPhNo) {
	CustomerPhNo = customerPhNo;
}
@Override
public String toString() {
	return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerAddress="
			+ CustomerAddress + ", CustomerPhNo=" + CustomerPhNo + "]";
}


}
