package com.ebrain.dto;

import java.util.List;

public class Customerdto {
public Integer id;
public String NAME;
public String CODE;
public String email;
public String phone;
public String contact_person_name;
public String contact_person_phone;
public String STATUS;
public String created_date;
public String created_by;
public String modified_date;
public String modified_by;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNAME() {
	return NAME;
}
public void setNAME(String NAME) {
	this.NAME = NAME;
}
public String getCODE() {
	return CODE;
}
public void setCODE(String CODE) {
	this.CODE = CODE;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getContact_person_name() {
	return contact_person_name;
}
public void setContact_person_name(String contact_person_name) {
	this.contact_person_name = contact_person_name;
}
public String getContact_person_phone() {
	return contact_person_phone;
}
public void setContact_person_phone(String contact_person_phone) {
	this.contact_person_phone = contact_person_phone;
}
public String getSTATUS() {
	return STATUS;
}
public void setSTATUS(String STATUS) {
	this.STATUS =STATUS;
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
public Customerdto(Integer id, String NAME, String CODE, String email, String phone, String contact_person_name,
		String contact_person_phone, String STATUS, String created_date, String created_by, String modified_date,
		String modified_by) {
	super();
	this.id = id;
	this.NAME = NAME;
	this.CODE = CODE;
	this.email = email;
	this.phone = phone;
	this.contact_person_name = contact_person_name;
	this.contact_person_phone = contact_person_phone;
	this.STATUS = STATUS;
	this.created_date = created_date;
	this.created_by = created_by;
	this.modified_date = modified_date;
	this.modified_by = modified_by;
}
public static List<Customerdto> getallcustomer() {
	// TODO Auto-generated method stub
	return null;
}


}
