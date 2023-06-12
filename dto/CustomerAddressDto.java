package com.ebrain.dto;

public class CustomerAddressDto {
	
	public Integer id;
		public Integer customer_id;
		public String address_type;
		public String address_line1;
		public String address_line2;
		public String city;
		public String state;
		public String country;
		public String postal_code;
		public CustomerAddressDto(Integer id, Integer customer_id, String address_type, String address_line1,
				String address_line2, String city, String state, String country, String postal_code) {
			super();
			this.id = id;
			this.customer_id = customer_id;
			this.address_type = address_type;
			this.address_line1 = address_line1;
			this.address_line2 = address_line2;
			this.city = city;
			this.state = state;
			this.country = country;
			this.postal_code = postal_code;
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
		public String getAddress_type() {
			return address_type;
		}
		public void setAddress_type(String address_type) {
			this.address_type = address_type;
		}
		public String getAddress_line1() {
			return address_line1;
		}
		public void setAddress_line1(String address_line1) {
			this.address_line1 = address_line1;
		}
		public String getAddress_line2() {
			return address_line2;
		}
		public void setAddress_line2(String address_line2) {
			this.address_line2 = address_line2;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPostal_code() {
			return postal_code;
		}
		public void setPostal_code(String postal_code) {
			this.postal_code = postal_code;
		}
				
	}

