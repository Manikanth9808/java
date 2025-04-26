package com.tap.Servlet;

import java.io.IOException;

import com.tap.DAO.MenuDAO;
import com.tap.DAOImpl.MenuDAOImpl;
import com.tap.models.Cart;
import com.tap.models.CartItem;
import com.tap.models.Menu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	    HttpSession session = req.getSession();
//	    Cart cart = (Cart) session.getAttribute("cart");
//
//    try {
//	        String restaurantId = req.getParameter("restaurantId");
//
//	        if (restaurantId != null && !restaurantId.isEmpty()) {
//	            Integer currentRestaurantId = (Integer) session.getAttribute("newRestaurantId");
//
//	            if (cart == null || !restaurantId.equals(currentRestaurantId != null ? currentRestaurantId.toString() : "")) {
//	                try {
//	                    int newRestaurantId = Integer.parseInt(restaurantId); // Only parse if restaurantId is valid
//	                    cart = new Cart();
//	                    session.setAttribute("cart", cart);
//	                    session.setAttribute("newRestaurantId", newRestaurantId);
//	                } catch (NumberFormatException e) {
//	                    e.printStackTrace();
//	                    // Handle error when the restaurantId is not a valid integer
//	                    cart = new Cart();
//	                    session.setAttribute("cart", cart);
//	                    session.setAttribute("newRestaurantId", currentRestaurantId != null ? currentRestaurantId : 0);
//	                }
//	            }
//	        } 
//	        
//	        else {
//	            // Handle the case where restaurantId is missing or empty
//	            Integer currentRestaurantId = (Integer) session.getAttribute("newRestaurantId");
//	            cart = new Cart();
//	            session.setAttribute("cart", cart);
//	            session.setAttribute("newRestaurantId", currentRestaurantId != null ? currentRestaurantId : 0);
//	        }
//
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	        resp.sendRedirect("cart.jsp");
//	        return;
//	    }
//
//	    RequestDispatcher rd = req.getRequestDispatcher("cart.jsp");
//	    rd.forward(req, resp);
//	}


	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	    HttpSession session = req.getSession();
//	    Cart cart = (Cart) session.getAttribute("cart");
//	    String restaurantId = req.getParameter("restaurantId");
//	    if (cart==null || restaurantId == null || restaurantId.isEmpty()) {
//	    	Integer currentRestaurantId = (Integer) session.getAttribute("newRestaurantId");
//            cart = new Cart();
//            session.setAttribute("cart", cart);
//            session.setAttribute("newRestaurantId", currentRestaurantId != null ? currentRestaurantId : 0);
//	    }
//	    
//	    RequestDispatcher rd = req.getRequestDispatcher("cart.jsp");
//	    rd.forward(req, resp);
//	}
	    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        try {
        	String restaurantId = req.getParameter("restaurantId");
        	Integer currentRestaurantId = (Integer) session.getAttribute("newRestaurantId");

        	if (cart == null || restaurantId == null || !restaurantId.equals(currentRestaurantId.toString())) {
        	    try {
        	        int newRestaurantId = Integer.parseInt(restaurantId);
        	        cart = new Cart();
        	        session.setAttribute("cart", cart);
        	        session.setAttribute("newRestaurantId", newRestaurantId);
        	    } catch (NumberFormatException e) {
        	        e.printStackTrace();
        	        int newRestaurantId = Integer.parseInt(restaurantId);
        	        cart = new Cart();
        	        session.setAttribute("cart", cart);
        	        session.setAttribute("newRestaurantId", newRestaurantId);
        	    }
        	}



            String action = req.getParameter("action");

            if (action.equals("add")) {
                addItemToCart(req, cart);
            } else if (action.equals("update")) {
                updateCart(req, cart);
            } else if (action.equals("remove")) {
                removeItemToCart(req, cart);
            } else if (action.equals("removeAll")) {
                removeAll(req, cart);
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            resp.sendRedirect("cart.jsp");
            return;
        }
        
        session.setAttribute("cart", cart);
        resp.sendRedirect("cart.jsp");
    }
    
    
    @Override
    	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		
    	
    	 HttpSession session = req.getSession();
         Cart cart = (Cart) session.getAttribute("cart");

         try {
         	String restaurantId = req.getParameter("restaurantId");
         	Integer currentRestaurantId = (Integer) session.getAttribute("newRestaurantId");

         	if (cart == null || restaurantId == null || !restaurantId.equals(currentRestaurantId.toString())) {
         	    try {
         	        int newRestaurantId = Integer.parseInt(restaurantId);
         	        cart = new Cart();
         	        session.setAttribute("cart", cart);
         	        session.setAttribute("newRestaurantId", newRestaurantId);
         	    } catch (NumberFormatException e) {
         	        e.printStackTrace();
         	        int newRestaurantId = Integer.parseInt(restaurantId);
         	        cart = new Cart();
         	        session.setAttribute("cart", cart);
         	        session.setAttribute("newRestaurantId", newRestaurantId);
         	    }
         	}



             String action = req.getParameter("action");

             if (action.equals("add")) {
                 addItemToCart(req, cart);
             } else if (action.equals("update")) {
                 updateCart(req, cart);
             } else if (action.equals("remove")) {
                 removeItemToCart(req, cart);
             } else if (action.equals("removeAll")) {
                 removeAll(req, cart);
             }

         } catch (NumberFormatException e) {
             e.printStackTrace();
             resp.sendRedirect("cart.jsp");
             return;
         }
         
         session.setAttribute("cart", cart);
         resp.sendRedirect("cart.jsp");
     }


    private void addItemToCart(HttpServletRequest request, Cart cart) {
        int itemId = Integer.parseInt(request.getParameter("itemId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        MenuDAO obj = new MenuDAOImpl();
        Menu menuItem = obj.getMenu(itemId);

        if (menuItem != null) {
            CartItem existingItem = cart.getCartItem(itemId);
            if (existingItem != null) {
                existingItem.setQuantity(existingItem.getQuantity() + quantity);
            } else {
                CartItem cartItem = new CartItem(menuItem.getMenuId(), menuItem.getItemName(), menuItem.getPrice(), quantity);
                cart.addCartItem(cartItem);
            }
        }
    }

    private void updateCart(HttpServletRequest request, Cart cart) {
        int itemId = Integer.parseInt(request.getParameter("itemId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        cart.updateItem(itemId, quantity);
    }

    private void removeItemToCart(HttpServletRequest request, Cart cart) {
        String itemIdParam = request.getParameter("itemId");
        if (itemIdParam != null && !itemIdParam.isEmpty()) {
            try {
                int itemId = Integer.parseInt(itemIdParam);
                cart.removeItem(itemId);
            } catch (NumberFormatException e) {
                System.err.println("Invalid itemId: " + itemIdParam);
            }
        } else {
            System.err.println("itemId parameter is missing or empty");
        }
    }

    private void removeAll(HttpServletRequest request, Cart cart) {
        if (cart != null) {
            cart.removeAllItem();
        }
    }
}


