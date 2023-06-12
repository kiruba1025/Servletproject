package com.ebrain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.ebrain.dao.CustomerAddressDao;
import com.ebrain.dto.CustomerAddressDto;

/**
 * Servlet implementation class CustomerAddressController
 */
@WebServlet("/AddressController")
public class CustomerAddressController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerAddressController() {
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
		String address_type =request.getParameter("address_type");
		String address_line1 =request.getParameter("address_line1");
		String address_line2 =request.getParameter("address_line2");
		String city =request.getParameter("city");
		String state =request.getParameter("state");
		String country =request.getParameter("country");
		String postal_code =request.getParameter("postal_code");
		
CustomerAddressDto customeraddress=new CustomerAddressDto(Integer.parseInt(id),Integer.parseInt(customer_id), address_type, address_line1, address_line2, city,state, country, postal_code);
	try {
		CustomerAddressDao.saveven(customeraddress);
	} catch (Exception e) {
	}
	System.out.println("kkkkkkkkkk");
	doGet(request, response);
	}
}
