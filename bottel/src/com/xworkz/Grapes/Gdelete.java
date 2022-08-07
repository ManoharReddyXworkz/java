package com.xworkz.Grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.bottel.Dbproperties;

public class Gdelete{

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(Dbproperties.URL.getValues(),Dbproperties.USERNAME1.getValues(),Dbproperties.PASSWORD.getValues());
		System.out.println(connection);

		String delete = "delete from grapes_details where gName = 'Barbera'";
		Statement statement = connection.createStatement();
		int rowAffected = statement.executeUpdate(delete);

		System.out.println(rowAffected);

		  AtomicInteger auto = new AtomicInteger();
			    
								try {
									
										while ResultSet.next()) {
										count.auto.incrementAndGet();
										
											ResultSet resultset;
											int id = resultset.getInt(1);
											String brand = resultset.getString(2);
											String price = resultset.getString(3);
											String  type = resultset.getString(4);
											String color = resultset.getString(5);
											System.out.println(id+" "+price+" "+brand+" "+type+" "+color+" ");
											
										}
								}
								 catch (Exception e) {
								
									e.printStackTrace();
								}
			    System.out.println("total rows"+auto);
								
				
	}
}



	


