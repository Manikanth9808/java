package com.tap.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.DAO.MenuDAO;
import com.tap.Utility.DBConnection;
import com.tap.models.Menu;

public class MenuDAOImpl implements MenuDAO {
	
	@Override
	public void addMenu(Menu menu) {
		String INSERT = "INSERT into `menu` (`restaurantId`,`itemName`,`description`,`price`,`isAvailable`,`ratings`,`actualPrice`,`peopleRated`,`imagePath`)"
				+ "values (?,?,?,?,?,?,?,?,?)";
		
		try {
			Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(INSERT);
			prepareStatement.setInt(1, menu.getRestaurantId());
			prepareStatement.setString(2, menu.getItemName());
			prepareStatement.setString(3,menu.getDescription());
			prepareStatement.setDouble(4,menu.getPrice());
			prepareStatement.setBoolean(5,menu.getIsAvailable());
			prepareStatement.setDouble(6,menu.getRatings());
			prepareStatement.setInt(7, menu.getActualPrice());
			prepareStatement.setInt(8, menu.getPeopleRated());
			prepareStatement.setString(9,menu.getImagePath());
			
			int i=prepareStatement.executeUpdate();
			System.out.println(i+" rows affected");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Menu getMenu(int menuId) {
		
		String GET_MENU_BY_ID="SELECT * FROM `menu` WHERE `menuId`=?";
		Menu menu=null;
		try {
			Connection conn=DBConnection.getConnection();
			PreparedStatement pt=conn.prepareStatement(GET_MENU_BY_ID);
			pt.setInt(1, menuId);
			
			ResultSet result=pt.executeQuery();
			if(result.next()) {
				int restaurantId=result.getInt("restaurantId");
				String itemName=result.getString("itemName");
				String description=result.getString("description");
				double price=result.getDouble("price");
				boolean isAvailable=result.getBoolean("isAvailable");
				double ratings=result.getDouble("ratings");
				int actualPrice=result.getInt("actualPrice");
				int peopleRated=result.getInt("peopleRated");
				String imagePath=result.getString("imagePath");
				
				menu=new Menu(menuId,restaurantId,itemName,description,price,isAvailable,ratings,actualPrice,peopleRated,imagePath);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return menu;
	}
	
	@Override
	public void updateMenu(Menu menu) {

		Connection conn=DBConnection.getConnection();
		String UPDATE_MENU="UPDATE `menu` SET `itemName`=?, `description`=?, `isAvailable`=? WHERE `menuId`=?";
		
		try {
			PreparedStatement preparedStatement=conn.prepareStatement(UPDATE_MENU);
			preparedStatement.setString(1,menu.getItemName());
			preparedStatement.setString(2,menu.getDescription());
			preparedStatement.setBoolean(3,menu.getIsAvailable());
			preparedStatement.setInt(4,menu.getMenuId());
			
			int n=preparedStatement.executeUpdate();
			System.out.println(n +"rows affected");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//	@Override
//	public void updateMenu(Menu menu) {
//		Connection connection = DBConnection.getConnection();
//        String UPDATE_MENU = "UPDATE menu SET imagePath=? WHERE menuId = ?";
//
//        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_MENU)) {
//            preparedStatement.setString(1, menu.getImagePath());
//            preparedStatement.setInt(2, menu.getMenuId()); 
//
//            int n = preparedStatement.executeUpdate();
//            System.out.println(n + " Row/s Updated");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }				
//	}

	@Override
	public void deleteMenu(int menuId) {

		Connection conn=DBConnection.getConnection();
		String DELETE_MENU="DELETE FROM `menu` WHERE `menuId`=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(DELETE_MENU);
			ps.setInt(1, menuId);
			int i=ps.executeUpdate();
			System.out.println(i+" Row deleted");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Menu> getAllMenusByRestaurant(int restaurantId) {
		
		Connection conn=DBConnection.getConnection();
		ArrayList<Menu> menuList= new ArrayList<Menu>();
		String GET_ALL_MENU= "SELECT * FROM `menu` where `restaurantId`=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(GET_ALL_MENU);
			ps.setInt(1, restaurantId);
			ResultSet result=ps.executeQuery();
			
			while(result.next()) {
				int menuId=result.getInt("menuId");
				String itemName=result.getString("itemName");
				String description=result.getString("description");
				double price=result.getDouble("price");
				boolean isAvailable=result.getBoolean("isAvailable");
				double ratings=result.getDouble("ratings");
				int actualPrice=result.getInt("actualPrice");
				int peopleRated=result.getInt("peopleRated");
				String imagePath=result.getString("imagePath");
				
				Menu menu=new Menu(menuId,restaurantId,itemName,description,price,isAvailable,ratings,actualPrice,peopleRated,imagePath);
				menuList.add(menu);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return menuList;
	}
	
}
