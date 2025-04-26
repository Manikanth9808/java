package com.tap.Launch;

import com.tap.DAOImpl.MenuDAOImpl;
import com.tap.models.Menu;

public class MenuLaunch {

	public static void main(String[] args) {
		
		
//		to Add Menu
	
		Menu mu = new Menu();
		mu.setRestaurantId(1);
		mu.setItemName("Masala Dosa");
		mu.setDescription("Serves 1 | A crispy, golden-brown dosa filled with a spiced potato filling.\r\n"
				+ "Served with coconut chutney and tangy sambar on the side.");
		mu.setPrice(70);
		mu.setIsAvailable(true);
		mu.setRatings(4.7);
		mu.setPeopleRated(371);
		mu.setActualPrice(100);
		mu.setImagePath("imagesResturent/resturentList/dosa.webp");
		
		MenuDAOImpl mud = new MenuDAOImpl();
		mud.addMenu(mu);
		
//		TO DELETE MENU
//		Menu mu = new Menu();
//		MenuDAOImpl mud = new MenuDAOImpl();
//		mud.deleteMenu(9);
		
//		TO UPDATE VALUE
//		Menu mu = new Menu();
//		mu.setItemName("BB Biryani");
//		mu.setDescription("HYDRABADI BIRYANI SPECIAL");
//		mu.setIsAvailable("YES");
//		mu.setMenuId(6);
//		MenuDAOImpl mud = new MenuDAOImpl();
//		mud.updateMenu(mu);
		
//		Menu mu = new Menu();
//		mu.setImagePath("Image/BB.jpg");
//		mu.setMenuId(1);
//		MenuDAOImpl mud = new MenuDAOImpl();
//		mud.updateMenu(mu);
		
		
//		TO GET ALL MENU
//		Menu mu = new Menu();
//		MenuDAOImpl mud = new MenuDAOImpl();
//		List<Menu> allMenu = mud.getAllMenusByRestaurant(1);
//		for(Menu menu1 : allMenu)
//		{
//			System.out.println(menu1);
//		}
		
//		TO GET ONE VALUE
//		Menu mu = new Menu();
//		MenuDAOImpl mud = new MenuDAOImpl();
//		System.out.println(mud.getMenu(7));
		
	}
}
