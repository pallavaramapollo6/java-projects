package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteBatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/example", "root", "root");
			Statement s = c.createStatement();
			String query1 = "insert into employee values(1,'name1', 'name1@example.com', 26, 102, 'chennai')";
			String query2 = "insert into employee values(12,'name2','name2@example.com', 27, 101, 'chennai')";
			// add query to statement
			s.addBatch(query1);
			s.addBatch(query2);
			s.executeBatch();
			System.out.println("record inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
