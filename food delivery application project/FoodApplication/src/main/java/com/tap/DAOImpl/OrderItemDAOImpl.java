package com.tap.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tap.DAO.OrderItemDAO;
import com.tap.Utility.DBConnection;
import com.tap.models.OrderItem;

public class OrderItemDAOImpl implements OrderItemDAO {

	@Override
	public void addOrderItem(OrderItem orderItem) {

		String INSERT="INSERT INTO `orderItem` (`orderId`,`menuId`,`quantity`,`totalAmount`) values(?,?,?,?)";
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(INSERT);){
			
			prepareStatement.setInt(1, orderItem.getOrderId());
			prepareStatement.setInt(2, orderItem.getMenuId());
			prepareStatement.setInt(3, orderItem.getQuantity());
			prepareStatement.setDouble(4, orderItem.getTotalAmount());
			
			int i=prepareStatement.executeUpdate();
			System.out.println(i+" rows added");
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public OrderItem getOrderItem(int orderItemId) {
		
		String GET_ORDERITEM_BY_ID="SELECT * FROM `orderItem` WHERE `orderItemId`=?";
		
		OrderItem orderItem=null;
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(GET_ORDERITEM_BY_ID);	){
			
			prepareStatement.setInt(1,orderItemId);
			
			ResultSet result=prepareStatement.executeQuery();
			
			while(result.next()) {
				int orderId=result.getInt("orderId");
				int menuId=result.getInt("menuId");
				int quantity=result.getInt("quantity");
				double totalAmount=result.getDouble("totalAmount");
				
				 orderItem=new OrderItem(orderId,menuId,quantity,totalAmount);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return orderItem;
	}
	
	@Override
	public void updateOrderItem(OrderItem orderItem) {
		
		String UPDATE_ORDER_ITEM="UPDATE `orderItem` set `quantity`=?, `totalAmount`=? WHERE `orderItemId`=?";
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(UPDATE_ORDER_ITEM);){
			
			prepareStatement.setInt(1, orderItem.getQuantity());
			prepareStatement.setDouble(2,orderItem.getTotalAmount());
			prepareStatement.setInt(3, orderItem.getOrderItemId());
			
			int i=prepareStatement.executeUpdate();
			System.out.println(i+" rows updated");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void deleteOrderItem(int orderItemId) {

		String DELETE_ORDER_ITEM="DELETE  FROM `orderItem` WHERE `orderItemId`=?";
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(DELETE_ORDER_ITEM);){
			
			prepareStatement.setInt(1,orderItemId);
			
			int i=prepareStatement.executeUpdate();
			
			if(i>0) System.out.println("orderItem with ID :"+orderItemId+ " deleted Successfully..");
		
			else  System.out.println("orderItem with ID :"+orderItemId+" not found");
				
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<OrderItem> getOrderItemsByOrder(int orderId) {
		String GET_ORDERITEM_BY_ORDER="SELECT * FROM `orderItem` WHERE `orderId`=?";
		
		List<OrderItem> orderItems=new ArrayList<OrderItem>();
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(GET_ORDERITEM_BY_ORDER)){
			
			prepareStatement.setInt(1, orderId);
			ResultSet result=prepareStatement.executeQuery();
			
			while(result.next()) {
				int orderItemId=result.getInt("orderItemId");
				int menuId=result.getInt("menuId");
				int quantity=result.getInt("quantity");
				double totalAmount=result.getDouble("totalAmount");
				
				OrderItem orderItem=new OrderItem(orderId,menuId,quantity,totalAmount);
				
				orderItems.add(orderItem);
			}
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return orderItems;
	}


}
