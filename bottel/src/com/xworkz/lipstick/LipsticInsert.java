package com.xworkz.lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipsticInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/lipstick", "root", "s1820923");
		System.out.println(connection);

		String lakme = "insert into lipstick_details values(2,'Lakme','Glossy','pink',350.00)";
		String may = "insert into lipstick_details values(3,'Mayboline','Glossy','Red',250.00)";
		String lib = "insert into lipstick_details values(4,'Libon','Matt','Purple',280.00)";
		String glam = "insert into lipstick_details values(5,'MyGlam','Glossy','Yello',450.00)";
		String renee = "insert into lipstick_details values(6,'Reene','Matt','Grey',150.00)";
		String elle = "insert into lipstick_details values(7,'Elle','Glossy','Green',180.00)";
		String loral = "insert into lipstick_details values(8,'Loral-Paris','Matt','Rose-Mary',519.00)";
		String nykaa = "insert into lipstick_details values(9,'Nykaa','Glossy','Wicked-Wine',173.00)";
		String plum = "insert into lipstick_details values(10,'Plum','Matt','Blue',424.00)";

		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(lakme);
		int rowAffected1 = statement.executeUpdate(may);
		int rowAffected2 = statement.executeUpdate(lib);
		int rowAffected3 = statement.executeUpdate(glam);
		int rowAffected4 = statement.executeUpdate(renee);
		int rowAffected5 = statement.executeUpdate(elle);
		int rowAffected6 = statement.executeUpdate(loral);
		int rowAffected7 = statement.executeUpdate(nykaa);
		int rowAffected8 = statement.executeUpdate(plum);

		System.out.println(rowAffected1);
		System.out.println(rowAffected2);
		System.out.println(rowAffected3);
		System.out.println(rowAffected4);
		System.out.println(rowAffected5);
		System.out.println(rowAffected6);
		System.out.println(rowAffected7);
		System.out.println(rowAffected8);

	}
}