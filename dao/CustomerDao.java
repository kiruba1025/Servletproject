package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrain.connection.DataConnection;
import com.ebrain.dto.Customerdto;

public class CustomerDao {
	public static void saveven(Customerdto customer) throws ClassNotFoundException, SQLException {
		Connection con = DataConnection.getConnection();
		String insertQuery = "INSERT INTO tb_customer_kiruba values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(insertQuery);
		pst.setInt(1, customer.getId());
		pst.setString(2, customer.getNAME());
		pst.setString(3, customer.getEmail());
		pst.setString(4, customer.getCODE());
		pst.setString(5, customer.getPhone());
		pst.setString(6, customer.getContact_person_name());
		pst.setString(7, customer.getContact_person_phone());
		pst.setString(8, customer.getSTATUS());
		pst.setString(9, customer.getCreated_date());
		pst.setString(10, customer.getCreated_by());
		pst.setString(11, customer.getModified_date());
		pst.setString(12, customer.getModified_by());
		pst.executeUpdate();
		System.out.println("2");
	}
	public static  List<Customerdto> getallcustomer()throws ClassNotFoundException, SQLException {
		Connection con= DataConnection.getConnection();
		PreparedStatement pst = con.prepareStatement("SELECT id, name,code, email,  phone,contact_person_name, contact_person_phone,  status,  created_date, created_by,modified_date, modified_by FROM tb_customer_kiruba");
		ResultSet res =pst.executeQuery();
		List<Customerdto> customer =new ArrayList<Customerdto>(); 
		while(res.next()) {
			Integer id =res.getInt(1);
			String name =res.getString(2);
			String code =res.getString(3);
			String email =res.getString(4);
			String phone =res.getString(5);
			String contact_person_name =res.getString(6);
			String contact_person_phone =res.getString(7);
			String status =res.getString(8);
			String created_date =res.getString(9);
			String created_by =res.getString(10);
			String modified_date =res.getString(11);
			String modified_by =res.getString(12);
			Customerdto customer1 =new Customerdto(id,name,code,email,phone,contact_person_name,contact_person_phone,status,created_date,created_by,modified_date,modified_by);
		 customer.add(customer1);
		} 
		return customer;
	}
		
	
}
