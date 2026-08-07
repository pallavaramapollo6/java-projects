package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/example", "root", "root");
			Statement s = c.createStatement();
			String query = "select * from dept";
			ResultSet rs = s.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("deptid");
				String name = rs.getString("deptname");
				String location = rs.getString("location");

				System.out.println("dept id = " + id);
				System.out.println("dept name = " + name);
				System.out.println("dept location = " + location);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
