package com.tap.models;

public class Menu {

	private int menuId;
	private int restaurantId;
	private String itemName;
	private String Description;
	private double price;
	private int actualPrice;
	private boolean isAvailable;
	private double ratings;
	private int peopleRated;
	private String imagePath;

	public Menu() {

	}

	public Menu(int menuId, int restaurantId, String itemName, String description, double price, boolean isAvailable,
			double ratings, int actualPrice, int peopleRated, String imagePath) {
		super();
		this.menuId = menuId;
		this.restaurantId = restaurantId;
		this.itemName = itemName;
		Description = description;
		this.price = price;
		this.isAvailable = isAvailable;
		this.ratings = ratings;
		this.actualPrice = actualPrice;
		this.peopleRated = peopleRated;
		this.imagePath = imagePath;
	}

	public int getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(int actualPrice) {
		this.actualPrice = actualPrice;
	}

	public int getPeopleRated() {
		return peopleRated;
	}

	public void setPeopleRated(int peopleRated) {
		this.peopleRated = peopleRated;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", restaurantId=" + restaurantId + ",item name=" + itemName + ", Description="
				+ Description + ", price=" + price + ", is Available=" + isAvailable + ", ratings=" + ratings
				+ ", actualPrice=" + actualPrice + ", peopleRated=" + peopleRated + ", imagePath=" + imagePath + "]";
	}

}
