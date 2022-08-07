package com.xworkz.Cigaratte;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cinsert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/cigaratee","root","s1820923");
		System.out.println(connection);

		String king = "insert into c_details values (2,'King','Tobacoo','brown',25.00)";
		String light = "insert into c_details values (3,'King-Lights','Tobacoo','White',25.00);";
		String black = "insert into c_details values (4,'Black','Tobacoo','Black',20.00);";
		String small = "insert into c_details values (5,'Small','Tobacoo','Brown',15.00);";
		String sissor = "insert into c_details values (6,'Sissors','Tobacoo','White',22.00);";
		String elite = "insert into c_details values (7,'ES-Lights','Chemical','White',10.00);";
		String mond = "insert into c_details values (8,'Mond','Flavoured','Green',12.00);";
		String more = "insert into c_details values (9,'More','Tobacoo','Brown',30.00);";
		String njoy = "insert into c_details values (10,'Njoy','Electric','Black',150.00);";

		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(king);
		int rowAffected1 = statement.executeUpdate(light);
		int rowAffected2 = statement.executeUpdate(black);
		int rowAffected3 = statement.executeUpdate(small);
		int rowAffected4 = statement.executeUpdate(sissor);
		int rowAffected5 = statement.executeUpdate(elite);
		int rowAffected6 = statement.executeUpdate(mond);
		int rowAffected7 = statement.executeUpdate(more);
		int rowAffected8 = statement.executeUpdate(njoy);

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

