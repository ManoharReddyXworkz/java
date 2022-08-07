package com.xworkz.rolex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Rupdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/rolex","root","s1820923");
		System.out.println(connection);

		String update = "update rolex_details set price = 11500 where brandName = 'TommyHillfigure'";

		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(update);

		System.out.println(rowAffected);

	}


}
