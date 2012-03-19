package com.github.marook.db_fitnesse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static ConnectionFactory INSTANCE;
	
	public static ConnectionFactory getInstance(){
		if(INSTANCE == null){
			INSTANCE = new ConnectionFactory();
		}
		
		return INSTANCE;
	}
	
	public ConnectionFactory(){
		loadOracleDriver();
	}
	
	private void loadOracleDriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (final ClassNotFoundException e) {
			throw new RuntimeException("Can't load oracle JDBC driver.", e);
		}
	}

	public Connection getConnection(){
		try {
			final Config config = Config.getInstance();
			return DriverManager.getConnection(config.getDatabaseUrl(), config.getUser(), config.getPassword());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
