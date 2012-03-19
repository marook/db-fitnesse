package com.github.marook.db_fitnesse;

import fit.ColumnFixture;

public class ConfigFixture extends ColumnFixture {
	
	private String databaseUrl;
	
	private String user;
	
	private String password;
	
	public boolean commit(){
		Config.getInstance().setDatabaseUrl(databaseUrl);
		Config.getInstance().setUser(user);
		Config.getInstance().setPassword(password);
		
		return true;
	}
	
}
