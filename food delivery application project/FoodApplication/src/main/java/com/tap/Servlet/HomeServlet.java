package com.tap.Servlet;

import java.io.IOException;
import java.util.List;

import com.tap.DAOImpl.RestaurantDAOImpl;
import com.tap.models.Restaurant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		RestaurantDAOImpl restaurantDAO=new RestaurantDAOImpl();
		
		
		List<Restaurant> allRestaurant=restaurantDAO.getAllRestaurant();
		
		req.setAttribute("restaurants", allRestaurant);
		RequestDispatcher rd=req.getRequestDispatcher("restaurantList.jsp");
		
		rd.include(req, resp);
		
	}

}
