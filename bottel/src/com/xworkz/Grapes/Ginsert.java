package com.xworkz.Grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ginsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class .forName("com.Mysql.cj.jdbc. drive");
		Connection  connection =DriverManager.getConnection("  ");
		System.out.println(connection);
		
		String syrah = "insert into grapes_details values (2,'Syrah','Sour','Black',90.00)";
		String zin = "insert into grapes_details values (3,'Zinfandel','Sweet','Grey',180.00)";
		String con = "insert into grapes_details values (4,'Concord','Sour','White',200.00)";
		String gren = "insert into grapes_details values (5,'Grenache','Sweet','Brown',100.00)";
		String sultan = "insert into grapes_details values (6,'Sultana','Sweet','Green',60.00)";
		String barbera = "insert into grapes_details values (7,'Barbera','Sour','DarkBlack',300.00)";
		String pinot = "insert into grapes_details values (8,'PinotGrogio','Sweet','Red',500.00)";
		String gamay = "insert into grapes_details values (9,'Gamay','Sour','Violet',750.00)";
		String merlot = "insert into grapes_details values (10,'Merlot','Sour','Brown',50.00)";


		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(syrah);
		int rowAffected1 = statement.executeUpdate(zin);
		int rowAffected2 = statement.executeUpdate(con);
		int rowAffected3 = statement.executeUpdate(gren);
		int rowAffected4 = statement.executeUpdate(sultan);
		int rowAffected5 = statement.executeUpdate(barbera);
		int rowAffected6 = statement.executeUpdate(pinot);
		int rowAffected7 = statement.executeUpdate(gamay);
		int rowAffected8 = statement.executeUpdate(merlot);

		System.out.println(rowAffected);
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

