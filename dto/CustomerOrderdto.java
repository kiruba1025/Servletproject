package com.ebrain.dto;

public class CustomerOrderdto {
	public Integer id;
	public Integer customer_id;
	public Integer order_no;
	public String order_date;
	public String no_of_items;
	public String order_sub_total;
	public String order_discount;
	public String order_total_amount;
	public String payment_type;
	public String delivery_date;
	public String STATUS;
	public String created_date;
	public String created_by;
	public String modified_date;
	public String modified_by;
	public CustomerOrderdto(Integer id, Integer customer_id, Integer order_no, String order_date, String no_of_items,
			String order_sub_total, String order_discount, String order_total_amount, String payment_type,
			String delivery_date, String STATUS, String created_date, String created_by, String modified_date,
			String modified_by) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.order_no = order_no;
		this.order_date = order_date;
		this.no_of_items = no_of_items;
		this.order_sub_total = order_sub_total;
		this.order_discount = order_discount;
		this.order_total_amount = order_total_amount;
		this.payment_type = payment_type;
		this.delivery_date = delivery_date;
		this.STATUS = STATUS;
		this.created_date = created_date;
		this.created_by = created_by;
		this.modified_date = modified_date;
		this.modified_by = modified_by;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getOrder_no() {
		return order_no;
	}
	public void setOrder_no(Integer order_no) {
		this.order_no = order_no;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getNo_of_items() {
		return no_of_items;
	}
	public void setNo_of_items(String no_of_items) {
		this.no_of_items = no_of_items;
	}
	public String getOrder_sub_total() {
		return order_sub_total;
	}
	public void setOrder_sub_total(String order_sub_total) {
		this.order_sub_total = order_sub_total;
	}
	public String getOrder_discount() {
		return order_discount;
	}
	public void setOrder_discount(String order_discount) {
		this.order_discount = order_discount;
	}
	public String getOrder_total_amount() {
		return order_total_amount;
	}
	public void setOrder_total_amount(String order_total_amount) {
		this.order_total_amount = order_total_amount;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getModified_date() {
		return modified_date;
	}
	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	

}
