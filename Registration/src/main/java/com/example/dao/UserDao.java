package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.User;

public class UserDao {
	public static boolean registerUser(User user) {
		String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

		try (Connection conn = DbConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query)) {

			stmt.setString(1, user.getName());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());

			int result = stmt.executeUpdate();
			return result > 0;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace(); // Log error
			return false;
		}
	}
}
