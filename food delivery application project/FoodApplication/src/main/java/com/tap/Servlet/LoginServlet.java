package com.tap.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tap.DAO.UserDAO;
import com.tap.DAOImpl.UserDAOImpl;
import com.tap.Utility.DBConnection;
import com.tap.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
	    resp.sendRedirect("account.jsp"); 
	}
	
	private static final long serialVersionUID = 1L;
    private UserDAO userDAO = new UserDAOImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String username = req.getParameter("username");
        String loginPassword = req.getParameter("loginPassword");

//        String FETCH = "SELECT * FROM user WHERE (`email`=? OR `phone`=?) AND `loginPassword`=?";
        String FETCH = "SELECT * FROM user WHERE `email`=?  AND `password`=?";
        	
        User user = userDAO.getUserByEmailAndPassword(username, loginPassword);

        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("loggedInUser", user);
        }

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(FETCH)) {

            ps.setString(1, username);
            ps.setString(2, loginPassword);
//            ps.setString(3, username);

            ResultSet result = ps.executeQuery(); 

            if (result.next()) {
                resp.sendRedirect("home");
            } else {
                req.setAttribute("errorMessage", "Incorrect Password");
                req.getRequestDispatcher("account.jsp").forward(req, resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "Error occurred during login, please try again later.");
            req.getRequestDispatcher("account.jsp").forward(req, resp);
        }
    }
}

