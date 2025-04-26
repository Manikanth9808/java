package com.tap.Servlet;

import java.io.IOException;
import java.util.List;

import com.tap.DAOImpl.MenuDAOImpl;
import com.tap.DAOImpl.RestaurantDAOImpl;
import com.tap.models.Cart;
import com.tap.models.Menu;
import com.tap.models.Restaurant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int rId=Integer.parseInt(req.getParameter("restaurantId"));
		
		RestaurantDAOImpl restaurantDAO=new RestaurantDAOImpl();
		
		Restaurant details=restaurantDAO.getRestaurant(rId);
		
		req.setAttribute("restaurants", details);
		
		MenuDAOImpl daoImp=new MenuDAOImpl();
		List<Menu> menuList=daoImp.getAllMenusByRestaurant(rId);
		
		req.setAttribute("menus", menuList);
		
		RequestDispatcher rd=req.getRequestDispatcher("menu.jsp");
		rd.include(req, resp);
		
	}
	
	}
	

