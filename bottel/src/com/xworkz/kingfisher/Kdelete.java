package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Kdelete {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/kingfisher", "root", "s1820923");
		System.out.println(connection);


		String delete = "delete from kingfisherdetails where color = 'Nocolor'";
				Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(delete);

		System.out.println(rowAffected);

	}

}


