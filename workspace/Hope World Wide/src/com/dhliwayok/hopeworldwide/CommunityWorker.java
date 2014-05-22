package com.dhliwayok.hopeworldwide;

public class CommunityWorker {

	private String username;
	private String password;
	private String cName;
	
	public CommunityWorker(String username, String password, String cName){
		
		this.username = username;
		this.password = password;
		this.cName = cName;
	}

	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
}
