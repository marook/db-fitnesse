package com.github.marook.db_fitnesse;

import java.sql.SQLException;

import fit.ColumnFixture;

public class TestFixture extends ColumnFixture {
	
	private String sql;
	
	public void setSql(final String sql){
		this.sql = sql;
	}
	
	public int rowcount(){
		try {
			return new SqlRunner().run(sql);
		} catch (SQLException e) {
			throw new RuntimeException("Failed to execute SQL: " + sql, e);
		}
	}

}
