package com.xworkz.rolex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RolexInsert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/rolex","root","s1820923");
		System.out.println(connection);

		String rolex01 = "insert into rolex_details values (02,'Rolex01','Classic','Belt',5000.00)";
		String rado = "insert into rolex_details values (03,'Rado','Sporty','Syntatic',50000.00)";
		String sonata = "insert into rolex_details values (04,'Sonata','Classic','Belt',5000.00)";
		String ftrack = "insert into rolex_details values (05,'FastTrack','Sporty','Chain',7000.00)";
		String quardz = "insert into rolex_details values (06,'Qwards','Classic','Belt',4500.00)";
		String titan = "insert into rolex_details values (07,'Titan','Classic','Chain',3000.00)";
		String timex = "insert into rolex_details values (08,'Timex','Classic','Belt',7500.00)";
		String tommy = "insert into rolex_details values (09,'TommyHillfigure','Sporty','Belt',15000.00)";
		String blan = "insert into rolex_details values (10,'BlancPain','Classic','Chain',55000.00)";

		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(rolex01);
		int rowAffected1 = statement.executeUpdate(rado);
		int rowAffected2 = statement.executeUpdate(sonata);
		int rowAffected3 = statement.executeUpdate(ftrack);
		int rowAffected4 = statement.executeUpdate(quardz);
		int rowAffected5 = statement.executeUpdate(titan);
		int rowAffected6 = statement.executeUpdate(timex);
		int rowAffected7 = statement.executeUpdate(tommy);
		int rowAffected8 = statement.executeUpdate(blan);

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
