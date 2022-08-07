package com.xworkz.Cigaratte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cdelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/cigaratee","root","s1820923");
		System.out.println(connection);

		String delete = "delete from c_details where cName = 'Sissors'";

		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(delete);

		System.out.println(rowAffected);

	}
}
