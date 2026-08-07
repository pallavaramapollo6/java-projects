package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver;
		try {
			driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/example", "root", "root");
			Statement s = c.createStatement();

			String query = "update employee set city='tiruvannamalai' where EmpId=2";
			int Result = s.executeUpdate(query);
			System.out.println("effected rows " + Result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
