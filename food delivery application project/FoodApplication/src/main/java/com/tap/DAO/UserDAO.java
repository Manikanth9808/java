package com.tap.DAO;

import java.util.List;

import com.tap.models.User;

public interface UserDAO {

	void addUser(User user);

	User getUser(int userId);

	void updateUser(User user);

	void deleteUser(int userId);

	List<User> getAllUsers();
	
	User getUserByEmailAndPassword(String email, String password);

}
