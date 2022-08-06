package com.xworkz.Bars.dao;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.Bars.dto.BarDto;

public class BarDaoImpl implements BarDao {

	
	public boolean save1(BarDto barDto) {

		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String query = "insert into bar.bar_info values (" + barDto.getId() + ",'" + barDto.getBarName() + "','"
					+ barDto.getLocation() + "','" + barDto.getType().getBar()
					+barDto.getLocation()+ "',"+barDto.getAvrCollectionPerDay()+","+barDto.getAvrCollectionPerMonth()+")";
			Statement statement = connection.createStatement();
			Integer noOfRowsAffected = statement.executeUpdate(query);
			if (noOfRowsAffected > 0) {

				System.out.println("The Save Data is: " + query);
				System.out.println(noOfRowsAffected);
				return true;
			} else {
				System.out.println("The Data Was not added");
				return false;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;

	}

	public boolean save(BarDto dto) {
		// TODO Auto-generated method stub
		return false;
	

}
}