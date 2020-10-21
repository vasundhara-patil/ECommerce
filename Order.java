package com.pro;

public class Order {
private int OrderId;
private String OrderDetails;
public int getOrderId() {
	return OrderId;
}
public void setOrderId(int orderId) {
	OrderId = orderId;
}
public String getOrderDetails() {
	return OrderDetails;
}
public void setOrderDetails(String orderDetails) {
	OrderDetails = orderDetails;
}
@Override
public String toString() {
	return "Order [OrderId=" + OrderId + ", OrderDetails=" + OrderDetails + "]";
}


}
