package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ebrain.connection.DataConnection;
import com.ebrain.dto.CustomerOrderItemDto;

public class CustomerOrderItemDao {
	public static void saveven(CustomerOrderItemDto customer_order_item) throws ClassNotFoundException, SQLException {
		Connection con = DataConnection.getConnection();
		String insertQuery = "INSERT INTO customer_order_item_kiruba values(?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(insertQuery);
		pst.setInt(1, customer_order_item.getId());
		pst.setInt(2, customer_order_item.getOrder_id());
		pst.setString(3, customer_order_item.getItem_name());
		pst.setString(4, customer_order_item.getItem_sku());
		pst.setInt(5, customer_order_item.getItem_rate());
		pst.setString(6, customer_order_item.getOrdered_qty());
		pst.setInt(7, customer_order_item.getOrder_total());
		pst.executeUpdate();
		System.out.println("444444");
	}
}
