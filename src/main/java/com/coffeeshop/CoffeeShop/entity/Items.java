package com.coffeeshop.CoffeeShop.entity;

public class Items {
	private String itemName;
	private String itemType;
	private String itemPrice;
	private String itemQuant;
	
	public Items() {
		itemName = "";
		itemType = "";
		itemPrice = "";
		itemQuant = "";
	}
	
	

	public Items(String itemName, String itemType, String itemPrice, String itemQuant) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemQuant = itemQuant;
	}

	public String getItemQuant() {
		return itemQuant;
	}

	public void setItemQuant(String itemQuant) {
		this.itemQuant = itemQuant;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}



	@Override
	public String toString() {
		return "itemName=" + itemName + ", itemType=" + itemType + ", itemPrice=" + itemPrice + ", itemQuant="
				+ itemQuant;
	}
	
}
