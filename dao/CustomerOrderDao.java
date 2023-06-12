package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ebrain.connection.DataConnection;
import com.ebrain.dto.CustomerOrderdto;

public class CustomerOrderDao {
	public static void saveven(CustomerOrderdto customerorder) throws ClassNotFoundException, SQLException {
		Connection con = DataConnection.getConnection();
		String insertQuery = "INSERT INTO tb_customer_order_kiruba values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(insertQuery);
		pst.setInt(1, customerorder.getId());
		pst.setInt(2, customerorder.getCustomer_id());
		pst.setInt(3, customerorder.getOrder_no());
		pst.setString(4, customerorder.getOrder_date());
		pst.setString(5, customerorder.getNo_of_items());
		pst.setString(6, customerorder.getOrder_sub_total());
		pst.setString(7, customerorder.getOrder_discount());
		pst.setString(8, customerorder.getOrder_total_amount());
		pst.setString(9, customerorder.getPayment_type());
		pst.setString(10, customerorder.getDelivery_date());
		pst.setString(11, customerorder.getSTATUS());
		pst.setString(12, customerorder.getCreated_date());
		pst.setString(13, customerorder.getCreated_by());
		pst.setString(14, customerorder.getModified_date());
		pst.setString(15, customerorder.getModified_by());
		pst.executeUpdate();
	}
}
