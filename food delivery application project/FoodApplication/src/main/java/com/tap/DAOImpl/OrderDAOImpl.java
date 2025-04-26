package com.tap.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.tap.DAO.OrderDAO;
import com.tap.Utility.DBConnection;
import com.tap.models.Order;


public class OrderDAOImpl implements OrderDAO {
	
	@Override
	public int addOrder(Order order) {
		 String INSERT = "INSERT INTO `orders` (`restaurantId`,`userId`,`orderDate`,`totalAmount`,`status`,`paymentMode`,`address`) VALUES (?,?,?,?,?,?,?)";
		 int order_id=0;
		 try( Connection conn=DBConnection.getConnection();
		/*PreparedStatement prepareStatement=conn.prepareStatement(INSERT)*/
		PreparedStatement prepareStatement=conn.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS) ;){
			 
			 prepareStatement.setInt(1, order.getRestaurantId());
			 prepareStatement.setInt(2, order.getUserId());
			 prepareStatement.setTimestamp(3, order.getOrderDate());
			 prepareStatement.setDouble(4, order.getTotalAmount());
			 prepareStatement.setString(5, order.getStatus());
			 prepareStatement.setString(6, order.getPaymentMode());
			 prepareStatement.setString(7, order.getAddress());
			 
			 int i=prepareStatement.executeUpdate();
			 ResultSet key=prepareStatement.getGeneratedKeys();
			
			 while(key.next()) {
				 order_id=key.getInt(1);
			 }
			 System.out.println(i+" row affected");
			 
			 
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return order_id;
	}
	
	@Override
	public Order getOrder(int orderId) {
		
		Connection conn=DBConnection.getConnection();
		String GET_ORDER_BY_ID="SELECT * FROM orders WHERE `orderId`=?";
		Order order=null;
		try(PreparedStatement prepareStatement=conn.prepareStatement(GET_ORDER_BY_ID);) {
			
			prepareStatement.setInt(1,orderId);
			
			ResultSet result=prepareStatement.executeQuery();
			if(result.next()) {
				int id=result.getInt(orderId);
				int resturantId=result.getInt("resturantId");
				int userId=result.getInt("userId");
				LocalDateTime orderDate =result.getTimestamp("orderDate").toLocalDateTime();
				double totalAmount=result.getDouble("totalAmount");
				String status=result.getString("status");
				String paymentMode=result.getString("paymentMode");
				String address=result.getString("address");
				
				order=new Order(orderId,resturantId,userId,null,totalAmount,status,paymentMode,address);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return order;
	}
	
	@Override
	public void updateOrder(Order order) {
		
		String UPDATE_ORDER="UPDATE `orders` SET `paymentMode`=? WHERE `orderId`=? ";
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(UPDATE_ORDER);){
			prepareStatement.setString(1, order.getPaymentMode());
			prepareStatement.setInt(2, order.getOrderId());
			
			int i=prepareStatement.executeUpdate();
			System.out.println(i+" rows affected");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void deleteOrder(int orderId) {
		
		String DELETE_ORDER="DELETE FROM `orders` WHERE `orderId`=?";
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(DELETE_ORDER);){
			prepareStatement.setInt(1,orderId);
			
			int i=prepareStatement.executeUpdate();
			System.out.println(i+" rows deleted");
		}
		catch(SQLException e) {
			e.printStackTrace();
		
		}
	}
	
	@Override
	public List<Order> getAllOrdersByUser(int userId) {
		String GET_ALL_ORDERS ="SELECT * FROM `orders WHERE `userId`=?";
		List<Order> orderList=new ArrayList<Order>();
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(GET_ALL_ORDERS);){
			prepareStatement.setInt(1, userId);
			
			ResultSet result=prepareStatement.executeQuery();
			
			while(result.next()) {
				int orderId =result.getInt("orderId");
				int restaurantId=result.getInt("restaurantId");
				LocalDateTime orderDate=result.getTimestamp("orderDate").toLocalDateTime();
				double totalAmount=result.getDouble("totalAmount");
				String status=result.getString("status");
				String paymentMode=result.getString("paymentMode");
				String address=result.getString("address");
				
				Order order=new Order(orderId,restaurantId,userId,null,totalAmount,status,paymentMode,address);
				
				orderList.add(order);
			}
		}
		catch(SQLException e) {
			System.err.println("error fetching orders for User ID "+userId+": "+e.getMessage());
			e.printStackTrace();
		}
		return orderList;
	}

}
