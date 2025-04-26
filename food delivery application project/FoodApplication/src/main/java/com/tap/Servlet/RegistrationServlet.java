package com.tap.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tap.DAOImpl.UserDAOImpl;
import com.tap.Utility.DBConnection;
import com.tap.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
	    resp.sendRedirect("account.jsp"); 
	}
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        String INSERT = "INSERT into `user` (`name`, `email`, `phone`, `password`) values (?, ?, ?, ?)";
        
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(INSERT)) {
            
            User user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setPhone(phone);
            user.setPassword(password);
            
            UserDAOImpl u = new UserDAOImpl();
            u.addUser(user);
            
            req.getSession().setAttribute("successMessage", "successfully registered!");
            
            resp.sendRedirect("account.jsp");
            
            System.out.println("Data value added to database");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error occurred. Please try again.");
        }
    }
}
