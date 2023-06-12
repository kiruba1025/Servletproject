package com.ebrain.dto;

public class CustomerOrderItemDto {
	public Integer id;
	public Integer order_id;
	public String item_name;
	public String item_sku;
	public Integer item_rate;
	public String ordered_qty;
	public Integer order_total;
	public CustomerOrderItemDto(Integer id, Integer order_id, String item_name, String item_sku, Integer item_rate,
			String ordered_qty, Integer order_total) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.item_name = item_name;
		this.item_sku = item_sku;
		this.item_rate = item_rate;
		this.ordered_qty = ordered_qty;
		this.order_total = order_total;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_sku() {
		return item_sku;
	}
	public void setItem_sku(String item_sku) {
		this.item_sku = item_sku;
	}
	public Integer getItem_rate() {
		return item_rate;
	}
	public void setItem_rate(Integer item_rate) {
		this.item_rate = item_rate;
	}
	public String getOrdered_qty() {
		return ordered_qty;
	}
	public void setOrdered_qty(String ordered_qty) {
		this.ordered_qty = ordered_qty;
	}
	public Integer getOrder_total() {
		return order_total;
	}
	public void setOrder_total(Integer order_total) {
		this.order_total = order_total;
	}
	
}
