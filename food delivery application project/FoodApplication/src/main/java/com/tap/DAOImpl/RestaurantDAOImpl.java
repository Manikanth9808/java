package com.tap.DAOImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.DAO.RestaurantDAO;
import com.tap.Utility.DBConnection;
import com.tap.models.Restaurant;

public class RestaurantDAOImpl implements RestaurantDAO {
	
	@Override
	public void addRestaurant(Restaurant restaurant) {
		String INSERT = "INSERT into `restaurant` (`name`,`address`,`phone`,`cuisineType`,`deliveryTime`,`adminUserId`,`rating`,`isActive`,`priceRange`,`openingHours`,`imagePath`)"
				+ "values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try (Connection con = DBConnection.getConnection();
		PreparedStatement preparedStatement = con.prepareStatement(INSERT);) {
			
			preparedStatement.setString(1,restaurant.getName());
			preparedStatement.setString(2,restaurant.getAddress());
			preparedStatement.setString(3,restaurant.getPhone());
			preparedStatement.setString(4,restaurant.getCuisineType());
			preparedStatement.setString(5,restaurant.getDeliveryTime());
			preparedStatement.setString(6,restaurant.getAdminUserId());
			preparedStatement.setFloat(7,restaurant.getRating());
			preparedStatement.setString(8,restaurant.getIsActive());
			preparedStatement.setString(9,restaurant.getPriceRange());
			preparedStatement.setString(10,restaurant.getOpeningHours());
			preparedStatement.setString(11,restaurant.getImagePath());
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i + " Row Added");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Restaurant getRestaurant(int restaurantId) {
		Connection connection = DBConnection.getConnection();
        String GET_RESTAURANT_BY_ID = "SELECT * FROM `restaurant` WHERE `restaurantId` = ?";

        Restaurant resturant = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_RESTAURANT_BY_ID)) {
            preparedStatement.setInt(1, restaurantId);

            ResultSet res = preparedStatement.executeQuery();

            if (res.next()) { 
                int id = res.getInt("restaurantId");  
                String name = res.getString("name");
                String address = res.getString("address");
                String phone = res.getString("phone");
                String cuisineType = res.getString("cuisineType");
                String deliveryTime = res.getString("deliveryTime");  
                String adminUserId = res.getString("adminUserId");
                Float rating = res.getFloat("rating");
                String isActive = res.getString("isActive");
                String priceRange = res.getString("priceRange");
                String openingHours = res.getString("openingHours");
                
                String imagePath = res.getString("imagePath");

                resturant = new Restaurant(id, name, address, phone, cuisineType, deliveryTime, adminUserId, rating, isActive, priceRange ,openingHours,imagePath);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resturant;
			
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		Connection con = DBConnection.getConnection();
        String UPDATE_RESTAURANT = "UPDATE restaurant SET name = ?, address = ?,phone=?, cuisineType = ?, rating = ?, isActive = ? WHERE restaurantId = ?";

        try (PreparedStatement preparedStatement = con.prepareStatement(UPDATE_RESTAURANT)) {
            preparedStatement.setString(1, restaurant.getName());
            preparedStatement.setString(2, restaurant.getAddress());
            preparedStatement.setString(3, restaurant.getPhone());
            preparedStatement.setString(4, restaurant.getCuisineType());
            preparedStatement.setFloat(5, restaurant.getRating());  
            preparedStatement.setString(6, restaurant.getIsActive());
            preparedStatement.setInt(7, restaurant.getRestaurantId());  

            int i = preparedStatement.executeUpdate();
            System.out.println(i + " row/s updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }		
	}
	
	@Override
	public void deleteRestaurant(int restaurantId) {

		String DELETE_RESTAURANT = "DELETE FROM `restaurant` WHERE restaurantId=?";
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(DELETE_RESTAURANT);){
			
			prepareStatement.setInt(1, restaurantId);
			
			int i=prepareStatement.executeUpdate();
			System.out.println(i+" rows deleted");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Restaurant> getAllRestaurant() {
		Connection con = DBConnection.getConnection();
		
		List<Restaurant> restList=new ArrayList<Restaurant>();
		
		String GET_ALL_RESTAURANT = "SELECT * FROM `restaurant`";
		
		try {
			Statement statement = con.createStatement();
			ResultSet res = statement.executeQuery(GET_ALL_RESTAURANT);
			
			while(res.next())
			{
				int restaurantId = res.getInt("restaurantId");
				String name = res.getString("name");
				String address = res.getString("address");
				String phone = res.getString("phone");
				String cuisineType = res.getString("cuisineType");
				String deliveryTime = res.getString("deliveryTime");
				String AdminUserId = res.getString("AdminUserId");
				float rating = res.getFloat("rating");
				String isActive = res.getString("isActive");
				String priceRange = res.getString("priceRange");
			    String openingHours = res.getString("openingHours");
				String imagePath = res.getString("imagePath");
				
				Restaurant rest = new Restaurant(restaurantId, name, address, phone, cuisineType, deliveryTime, AdminUserId, rating, isActive,priceRange,openingHours,imagePath);
				restList.add(rest);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return restList;
	}

}

