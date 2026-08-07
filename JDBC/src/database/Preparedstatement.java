package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Preparedstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			// or
			// Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/example", "root", "root");
			PreparedStatement s = c.prepareStatement(
					"delete from employee where employee_id=?");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id value");
			int id = sc.nextInt();
			s.setInt(1, id);
			int Result = s.executeUpdate();
			System.out.println(Result + " rows affected");
			c.close();
			sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
