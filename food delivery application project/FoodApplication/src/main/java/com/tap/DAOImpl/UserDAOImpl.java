package com.tap.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.DAO.UserDAO;
import com.tap.Utility.DBConnection;
import com.tap.models.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public void addUser(User user) {

		String INSERT="INSERT INTO `user`(`name`,`username`,`password`,`email`,`phone`,`address`,`role`) values(?,?,?,?,?,?,?)";
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(INSERT);	){
			
			prepareStatement.setString(1,user.getName());
			prepareStatement.setString(2, user.getUserName());
			prepareStatement.setString(3, user.getPassword());
			prepareStatement.setString(4, user.getEmail());
			prepareStatement.setString(5, user.getPhone());
			prepareStatement.setString(6,user.getAddress());
			prepareStatement.setString(7, user.getRole());
			
			int i=prepareStatement.executeUpdate();
			System.out.println(i+" rows updated");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	@Override
	public User getUser(int userId) {
		
		
        String GET_USER_BY_ID = "SELECT * FROM `user` WHERE `userId` = ?";
        User user = null;

        try (Connection con = DBConnection.getConnection();
        	 PreparedStatement preparedStatement = con.prepareStatement(GET_USER_BY_ID);) {
            preparedStatement.setInt(1, userId);

            ResultSet res = preparedStatement.executeQuery();

            if (res.next()) {
                int id = res.getInt("userId");
                String name = res.getString("name");
                String username = res.getString("username");
                String password = res.getString("password");
                String email = res.getString("email");
                String phone = res.getString("phone");
                String address = res.getString("address");
                String role = res.getString("role");

                user = new User(userId, name, username, password, email, phone, address, role, null, null);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
	}
	
	@Override
	public void updateUser(User user) {

		String UPDATE_USER="UPDATE `user` SET `name`=?,`password`=?,`phone`=?,`address`=?, WHERE `userId`=?";
		
		try(Connection conn=DBConnection.getConnection();
			PreparedStatement prepareStatement=conn.prepareStatement(UPDATE_USER);){
			
			prepareStatement.setString(1, user.getName());
			prepareStatement.setString(2, user.getPassword());
			prepareStatement.setString(3, user.getPhone());
			prepareStatement.setString(4, user.getAddress());
			prepareStatement.setInt(5, user.getUserId());
			
			int i=prepareStatement.executeUpdate();
			System.out.println(i+" rows updated");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void deleteUser(int userId) {
			
		Connection con = DBConnection.getConnection();
		String DELETE_USER = "DELETE FROM `user` WHERE userId=?";
		try(PreparedStatement preparestatement = con.prepareStatement(DELETE_USER);){
			preparestatement.setInt(1, userId);
			int i=preparestatement.executeUpdate();
			System.out.println(i + " Row Deleted");
		}
		
 catch (SQLException e) {
	e.printStackTrace();
}
	}

	@Override
	public List<User> getAllUsers() {

		Connection con = DBConnection.getConnection();
		
		ArrayList<User> userList=new ArrayList<User>();
		
		String GET_ALL_USERS = "SELECT * FROM `user`";
		
		try {
			Statement statement = con.createStatement();
			ResultSet res = statement.executeQuery(GET_ALL_USERS);
			
			while(res.next())
			{
				int userId = res.getInt("userId");
				String name = res.getString("name");
				String username = res.getString("username");
				String password = res.getString("password");
				String email = res.getString("email");
				String phone = res.getString("phone");
				String address = res.getString("address");
				String role = res.getString("role");
				String createdDate = res.getString("createdDate");
				String lastLoginDate = res.getString("lastLoginDate");
				
				User user=new User(userId, name, username, password, email, phone, address, role, null, null);
				
				userList.add(user);		
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	
	@Override
    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;
        String SQL = "SELECT * FROM `user` WHERE email = ? AND password = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User(
                    resultSet.getInt("userId"),
                    resultSet.getString("name"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getString("address"),
                    resultSet.getString("role"),
                    resultSet.getDate("createdDate"),
                    resultSet.getDate("lastLoginDate")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }


}


