package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DbConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/user_registration";
	private static final String USER = "root";
	private static final String PASSWORD = "root"; // Use your MySQL password

	public static Connection getConnection()
			throws SQLException, ClassNotFoundException {
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Database connection failed", e);
		}
	}
}
