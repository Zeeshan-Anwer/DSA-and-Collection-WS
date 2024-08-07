package com.practice.threads;

public class MehtodChaining {
	
	private int id;
	private String  name;
	private String location;
	
	
	public int getId() {
		return id;
	}
	public MehtodChaining setId(int id) {
		this.id = id;
		return this;
	}
	@Override
	public String toString() {
		return "MehtodChaining [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	public String getName() {
		return name;
	}
	public  MehtodChaining setName(String name) {
		this.name = name;
		return this;
	}
	public String getLocation() {
		return location;
	}
	public MehtodChaining() {
		super();
		// TODO Auto-generated constructor stub
	}
	private MehtodChaining(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public MehtodChaining setLocation(String location) {
		this.location = location;
		return this;
	}
	
	public static MehtodChaining  Of() {
		return new MehtodChaining();
	}
	
	

}
