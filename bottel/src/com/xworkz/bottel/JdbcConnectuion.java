package com.xworkz.bottel;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectuion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(Dbproperties.URL.getValues(), Dbproperties.USERNAME1.getValues(),Dbproperties.PASSWORD.getValues());;
		System.out.println(connection);

		String insert="INSERT INTO PERFUME.COMPANY_NAME VALUES(2,'FOG', 'DEO','150','JASMINE')";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);

	}

}
