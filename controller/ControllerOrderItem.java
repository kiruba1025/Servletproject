package com.ebrain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.ebrain.dao.CustomerOrderItemDao;
import com.ebrain.dto.CustomerOrderItemDto;

/**
 * Servlet implementation class ControllerOrderItem
 */
@WebServlet("/ControllerOrderItem")
public class ControllerOrderItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerOrderItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		String order_id =request.getParameter("order_id");
		String item_name =request.getParameter("item_name");
		String item_sku =request.getParameter("item_sku");
		String item_rate =request.getParameter("item_rate");
		String ordered_qty =request.getParameter("ordered_qty");
		String order_total =request.getParameter("order_total");
		CustomerOrderItemDto customer_order_item=new CustomerOrderItemDto(Integer.parseInt(id), Integer.parseInt(order_id), item_name, item_sku, Integer.parseInt(item_rate), ordered_qty, Integer.parseInt(order_total));
		try {
			CustomerOrderItemDao.saveven(customer_order_item);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("$$$$$$");
		doGet(request, response);
	}

}
