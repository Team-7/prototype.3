package com.dhliwayok.hopeworldwide;

public class ECD {
	
	private int centre_id;
	private String name;
	private String location;
	
	public ECD(String name, String location){
		
		this.name = name;
		this.location = location;
	}

	public int getCentre_id() {
		return centre_id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ECD [centre_id=" + centre_id + ", name=" + name + ", location="
				+ location + "]";
	}
	
	

}
