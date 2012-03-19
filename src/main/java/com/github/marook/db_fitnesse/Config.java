package com.github.marook.db_fitnesse;

public class Config {
	
	private static Config INSTANCE;
	
	public static Config getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Config();
		}
		
		return INSTANCE;
	}
	
	private String databaseUrl;
	
	private String user;
	
	private String password;
	
	public String getDatabaseUrl() {
		return databaseUrl;
	}
	
	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
