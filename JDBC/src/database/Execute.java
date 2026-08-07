package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Execute {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/example", "root", "root");
			Statement st = c.createStatement();
			String query = ("create table dept "
					+ " (deptid int not null primary key,"
					+ " deptname varchar(20)," + " location varchar(20))");
			st.execute(query);
			System.out.println("table created successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
