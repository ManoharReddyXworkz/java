package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ldelete {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/lipstick", "root", "s1820923");
		System.out.println(connection);


		String delete = "delete from lipstick_details where price = 350.00";

		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(delete);

		System.out.println(rowAffected);
	}


}
