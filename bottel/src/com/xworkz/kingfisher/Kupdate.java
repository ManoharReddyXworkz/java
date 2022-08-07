package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Kupdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/kingfisher", "root", "s1820923");
		System.out.println(connection);

		String update = "update kingfisherdetails set k_type = 'Visky' where color = 'Brown'";

		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(update);

		System.out.println(rowAffected);
	} 
}
