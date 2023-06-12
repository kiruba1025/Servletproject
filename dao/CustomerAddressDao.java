package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ebrain.connection.DataConnection;
import com.ebrain.dto.CustomerAddressDto;

public class CustomerAddressDao {
	public static void saveven(CustomerAddressDto customeraddress) throws ClassNotFoundException, SQLException {
		Connection con = DataConnection.getConnection();
		String insertQuery = "INSERT INTO tb_customer_address_kiruba values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(insertQuery);
		pst.setInt(1, customeraddress.getId());
		pst.setInt(2, customeraddress.getCustomer_id());
		pst.setString(3, customeraddress.getAddress_type());
		pst.setString(4, customeraddress.getAddress_line1());
		pst.setString(5, customeraddress.getAddress_line2());
		pst.setString(6, customeraddress.getCity());
		pst.setString(7, customeraddress.getState());
		pst.setString(8, customeraddress.getCountry());
		pst.setString(9, customeraddress.getPostal_code());
		pst.executeUpdate();
		System.out.println("333333");
	}
		
}
