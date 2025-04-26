package com.tap.models;

import java.sql.Date;

public class Restaurant {

	private int restaurantId;
	private String name;
	private String address;
	private String phone;
	private String cuisineType;
	private String deliveryTime;
	private String adminUserId;
	private float rating;
	private String priceRange;
	private String isActive;
	private String openingHours;
	private String imagePath;

	public Restaurant() {

	}

	public Restaurant(int restaurantId, String name, String address, String phone, String cuisineType,
			String deliveryTime, String adminUserId, float rating, String isActive,String priceRange,String openingHours,  String imagePath) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.cuisineType = cuisineType;
		this.deliveryTime = deliveryTime;
		this.adminUserId = adminUserId;
		this.rating = rating;
		this.isActive = isActive;
		this.priceRange=priceRange;
		this.openingHours=openingHours;
		this.imagePath = imagePath;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", address=" + address + ", phone="
				+ phone + ", cuisineType=" + cuisineType + ", deliveryTime+" + deliveryTime + ", adminUserId="
				+ adminUserId + ", rating=" + rating + ", isActive=" + isActive + ", priceRange=" +priceRange+ ", openingHours=" +openingHours+", imagePath=" + imagePath + "]";
	}
}
