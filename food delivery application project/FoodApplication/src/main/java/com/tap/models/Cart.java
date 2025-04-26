package com.tap.models;

import java.util.HashMap;
import java.util.Map;

public class Cart {


	Map<Integer , CartItem> items; //map:- seraching will become easy.
	 
	public Cart() {
		
		items  = new HashMap<Integer , CartItem>();
	}
	
	public void addCartItem(CartItem item) {
		
		int itemId = item.getItemId();
		
		if(items.containsKey(itemId)) {
			
			CartItem existingCartItem = items.get(itemId);
			int q1  = existingCartItem.getQuantity();
			int q2 = item.getQuantity();
			int newQuantity = q1 + q2;
			existingCartItem.setQuantity(newQuantity); 
		}
		else {
			System.out.println("Inside Cart.java inside else of addcartItem");
			items.put(itemId, item);   
		}
	}
	
	public void updateItem(int itemId , int quantity) {
		
		if(items.containsKey(itemId)) {
			if(quantity<=0) {
				items.remove(itemId);
			} else {
				CartItem existingCartItem = items.get(itemId);
				existingCartItem.setQuantity(quantity);
			}
		}
	}
	
	public void removeItem(int itemId) {
		items.remove(itemId);
	}
	
	public void clear() {    //for removing all the items 
		items.clear();
	}
	
	public float getTotalPrice() {
	    return (float) items.values()
	                .stream()
	                .mapToDouble(item -> item.getPrice() * item.getQuantity())
	                .sum();
	}
	
    public Map<Integer, CartItem> getItems() {
        return items;
    }

	public void removeAllItem() {
		items.clear();
	}

	public int getTotalItems() {
	    int totalItems = 0;
	    for (CartItem item : items.values()) {
	        totalItems += item.getQuantity(); 
	    }
	    
	    return totalItems;
	}
	
	 public CartItem getCartItem(int itemId) {
	        return items.get(itemId);
	        
	        }
	 

}


