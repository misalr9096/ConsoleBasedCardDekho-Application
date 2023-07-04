package com.jspiders.cardekho_case_study.entity;

public class Car {

	private int car_id;
	private String name;
	private String model;
	private String brand;
	private String fule_type;
	private double price;
	
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBarnd() {
		return brand;
	}
	public void setBarnd(String brand) {
		this.brand = brand;
	}
	public String getFule_type() {
		return fule_type;
	}
	public void setFule_type(String fule_type) {
		this.fule_type = fule_type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Car(int car_id, String name, String model, String brand, String fule_type, double price) {
		super();
		this.car_id = car_id;
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.fule_type = fule_type;
		this.price = price;
	}
	
	
	public String toString() {
		
		return "[ \n Car_Id : "+car_id+" \n Name  : "+name+" \n Model : "+model+" \n Brand : "+brand+" \n FuleType : "+fule_type+" \n Price : "+price+"  ]  ";
		
	}
	
	
}
