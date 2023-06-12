package com.ebrain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.ebrain.dao.CustomerDao;
import com.ebrain.dao.CustomerOrderDao;
import com.ebrain.dto.CustomerOrderdto;

/**
 * Servlet implementation class ControllerOrder
 */
@WebServlet("/ControllerOrder")
public class ControllerOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerOrder() {
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
		String customer_id =request.getParameter("customer_id");
		String order_no =request.getParameter("order_no");
		String order_date =request.getParameter("order_date");
		String no_of_items =request.getParameter("no_of_items");
		String order_sub_total =request.getParameter("order_sub_total");
		String order_discount =request.getParameter("order_discount");
		String order_total_amount =request.getParameter("order_total_amount");
		String payment_type =request.getParameter("payment_type");
		String delivery_date =request.getParameter("delivery_date");
		String STATUS =request.getParameter("STATUS");
		String created_date =request.getParameter("created_date");
		String created_by =request.getParameter("created_by");
		String modified_date =request.getParameter("modified_date");
		String modified_by =request.getParameter("modified_by");
		CustomerOrderdto customerorder=new CustomerOrderdto(Integer.parseInt(id), Integer.parseInt(customer_id), Integer.parseInt(order_no),order_date, no_of_items, order_sub_total, order_discount, order_total_amount, payment_type, delivery_date, STATUS, created_date, created_by, modified_date, modified_by);
		
		System.out.println("completed");
		
			try {
				CustomerOrderDao.saveven(customerorder);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		doGet(request, response);
	}

}
