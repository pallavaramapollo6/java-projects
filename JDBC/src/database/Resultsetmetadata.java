package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Resultsetmetadata {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/example";
		String user = "root";
		String password = "root";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open connection
			connection = DriverManager.getConnection(url, user, password);

			// Create statement
			statement = connection.createStatement();

			// Run SELECT query (example: on any table)
			String query = "SELECT * FROM employee"; // Use your table name
														// here
			resultSet = statement.executeQuery(query);

			// Get metadata
			ResultSetMetaData metaData = resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();

			// Print column names
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(metaData.getColumnName(i) + "\t");
			}
			System.out.println();

			// Loop through result set and print each column
			while (resultSet.next()) {
				for (int i = 1; i <= columnCount; i++) {
					Object value = resultSet.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
