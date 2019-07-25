package com.example.demo.pojo;

public class boot {

	private Integer id;
	private String name;
	private String address;
	private String picture;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public boot(Integer id, String name, String address, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "boot [id=" + id + ", name=" + name + ", address=" + address + ", picture=" + picture + "]";
	}
	
	public boot() {
		
	}
}
