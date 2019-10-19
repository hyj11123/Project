package com.practice.signup;

public class MemberVO {
	/*
	MEMBER_UID
	NAME
	ID
	PASSWORD
	EMAIL
	ADD
	DETAIL_ADD
	LEVEL
	ZIP_CODE
	*/
	
	private String member_uid ;
	private String name       ;
	private String id         ;
	private String password   ;
	private String email      ;
	private String add        ;
	private String detail_add ;
	private String level      ;
	private String zip_code   ;
	
	
	
	public String getMember_uid() {
		return member_uid;
	}
	public void setMember_uid(String member_uid) {
		this.member_uid = member_uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getDetail_add() {
		return detail_add;
	}
	public void setDetail_add(String detail_add) {
		this.detail_add = detail_add;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	
	
}
