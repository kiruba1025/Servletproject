package com.ebrain.connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ebrain.dao.CustomerDao;
import com.ebrain.dto.Customerdto;

/**
 * Servlet implementation class ControllerSubmit
 */
@WebServlet("/ControllerSubmit")
public class ControllerSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customerdto> customer=null;
		
		try {
			 customer =CustomerDao.getallcustomer();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		request.setAttribute("customerkey",customer);
		request.getRequestDispatcher("index.jsp").include(request,response);
		//response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		String NAME =request.getParameter("NAME");
		String CODE =request.getParameter("CODE");
		String email =request.getParameter("email");
		String phone =request.getParameter("phone");
		String contact_person_name =request.getParameter("contact_person_name");
		String contact_person_phone =request.getParameter("contact_person_phone");
		String STATUS =request.getParameter("STATUS");
		String created_date =request.getParameter("created_date");
		String created_by =request.getParameter("created_by");
		String modified_date =request.getParameter("modified_date");
		String modified_by =request.getParameter("modified_by");
		
Customerdto customer=new Customerdto(Integer.parseInt(id),NAME,CODE,email,phone,contact_person_name,contact_person_phone,STATUS,created_date,created_by,modified_date,modified_by);
	try {
		CustomerDao.saveven(customer);
	} catch (Exception e) {
		e.fillInStackTrace();
		
	} 
	System.out.println("1");
	doGet(request, response);
	}
	
}
