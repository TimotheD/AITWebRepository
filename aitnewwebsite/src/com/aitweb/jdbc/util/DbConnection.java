package com.AitWeb.jdbc.Util;

import java.sql.*;

public class DbConnection {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/aitnewwebsite";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "Ivoirien";
	private Statement stmt = null;
	private Connection conn = null;
	private ResultSet resultset = null;

	public Connection getDbConnection() {

		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			conn.close();
		} catch (SQLException se) {

			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

	public void setSql(String sql) throws SQLException {
		int dbCounter = 0;
		boolean Retry = false;
		do {
			Retry = false;
			if (conn == null) {
				conn = getDbConnection();
			}
			// STEP 4: Execute a query
			try {
				stmt = conn.createStatement();
			} catch (Exception se) {
				conn = null;
				dbCounter++;
				if (dbCounter > 1)
					throw new SQLException();
			}
			Retry = true;
		}

		while (Retry);

		stmt.close();

	}

	public ResultSet executeQuery() throws SQLException {

		resultset = stmt.executeQuery(null);
		return (resultset);
	}

	public void closeConnection() {

		try {
			if (conn != null)
				conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

}
