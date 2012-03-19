package com.github.marook.db_fitnesse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlRunner {

	public int run(final String sql) throws SQLException {
		final Connection c = ConnectionFactory.getInstance().getConnection();

		try {
			final PreparedStatement s = c.prepareStatement(sql);
			final ResultSet result = s.executeQuery();
			if(!result.next()){
				throw new IllegalStateException("Query must return at lease one row!");
			}
			
			return result.getInt("rowcount");
		} finally {
			c.close();
		}
	}

}
