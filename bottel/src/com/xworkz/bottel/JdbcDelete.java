package com.xworkz.bottel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306", "root", "s1820923");
		System.out.println(connection);
		String delete="Delete From PERFUME .COMPANY_NAME where name='Axe'";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);
	}

}
