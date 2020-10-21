package com.pro;

public class Item {
private int ItemId;
private int Quantity;
public int getItemId() {
	return ItemId;
}
public void setItemId(int itemId) {
	ItemId = itemId;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
@Override
public String toString() {
	return "Item [ItemId=" + ItemId + ", Quantity=" + Quantity + "]";
}


}
