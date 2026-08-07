package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * CREATE TABLE employee ( employee_id INT PRIMARY KEY, employee_name
 * VARCHAR(100), email VARCHAR(100), age INT, department_id INT, city
 * VARCHAR(50) );
 */
public class Execute_update {
	public static void main(String[] args) {
		try {
			// Load the Driver & register the Driver
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			// Establish the Connection
			String url = "jdbc:mysql://localhost:3306/example";
			String user = "root";
			String password = "root";

			Connection c = DriverManager.getConnection(url, user, password);
			// Create Statement & issue the Query
			Statement st = c.createStatement();
			String query = "INSERT INTO employee VALUE(13,'name5', 'name5@example.com', 22, 102, 'chennai')";
			// Process the result set
			int Result = st.executeUpdate(query);
			System.out.println(Result + "rows effected");
			// Close the connection
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
