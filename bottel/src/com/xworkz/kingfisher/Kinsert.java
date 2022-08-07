package com.xworkz.kingfisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Kinsert{

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/kingfisher", "root", "s1820923");
		System.out.println(connection);

		String kf = "insert into kingfisherdetails values (2,'kingfisher','Beer',140,'Yellow')";
		String rodler = "insert into kingfisherdetails values (3,'kingfisher','Non-Alchoholic',120,'Yellow')";
		String ultra = "insert into kingfisherdetails values (4,'kingfisher','Beer',125,'Yellow')";
		String ko = "insert into kingfisherdetails values (5,'kingfisher','One-Punch',230,'green')";
		String apple = "insert into kingfisherdetails values (6,'kingfisher','AppleSider',350,'Yellow')";
		String bacardi = "insert into kingfisherdetails values (7,'kingfisher','Brezzers',180,'Red')";
		String bira = "insert into kingfisherdetails values (8,'kingfisher','beer',132.00,'Nocolor')";
		String comicon = "insert into kingfisherdetails values (9,'kingfisher','Shorts',150.00,'Light-Blue')";
		String fire = "insert into kingfisherdetails values (10,'kingfisher','Visky',87.00,'Brown')";

		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(kf);
		int rowAffected1 = statement.executeUpdate(rodler);
		int rowAffected2 = statement.executeUpdate(ultra);
		int rowAffected3 = statement.executeUpdate(ko);
		int rowAffected4 = statement.executeUpdate(apple);
		int rowAffected5 = statement.executeUpdate(bacardi);
		int rowAffected6 = statement.executeUpdate(bira);
		int rowAffected7 = statement.executeUpdate(comicon);
		int rowAffected8 = statement.executeUpdate(fire);

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

