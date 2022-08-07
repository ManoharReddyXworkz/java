package com.xworkz.Job.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.Job.dto.JobDto;
import com.xworkz.constant.Dbproperties;

public class JobDaoImpl implements JobDao {

	@Override
	public Boolean saveDetails(JobDto jobDTO) {
		try {
			Connection connection = DriverManager.getConnection(Dbproperties.URL.getvalue(),Dbproperties.USERNAME.getvalue(),Dbproperties.SECRET.getvalue());
			String sql = "insert into job.jobdetails values (?,?,?,?,?,?)";
			PreparedStatement preStat = connection.prepareStatement(sql);
			preStat.setInt(1, jobDTO.getId());
			preStat.setString(2, jobDTO.getDestignation().getdestignation());
			preStat.setDouble(3, jobDTO.getAnnualpackage());
			preStat.setString(4,jobDTO.getQualification().getQualification());
			preStat.setDouble(5, jobDTO.getPercentage());
			preStat.setBoolean(6,jobDTO.isFresher());
			int noOfRowsAffected = preStat.executeUpdate();
			if(noOfRowsAffected > 0 ) {
			System.out.println("The Values Inserted Are :" + sql);
			System.out.println(noOfRowsAffected);
			} 
			else {
			System.out.println("Unable to insert Data..!!");
			}
		}	
		catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public JobDto findByID(Integer id) {

		try {
			Connection connection = DriverManager.getConnection(Dbproperties.URL.getvalue(),Dbproperties.USERNAME.getvalue(),Dbproperties.SECRET.getvalue());
			String search = "select * from job.jobdetails where jid = ?";
			PreparedStatement preStat = connection.prepareStatement(search);
			preStat.setInt(1, id);
			ResultSet resultSet = preStat.executeQuery();
			while(resultSet.next()) {
				int jid = resultSet.getInt(1);
				String designation = resultSet.getString(2);
				Double ctc = resultSet.getDouble(3);
				String edu = resultSet.getNString(4);
				Double perc = resultSet.getDouble(5);
				String eLevel = resultSet.getNString(6);
				System.out.println(jid+" "+designation+" "+ctc+" "+edu+" "+perc+" "+eLevel);
//				JobDTO jobDTO = new JobDTO();
//				jobDTO.setJid(id);
//				jobDTO.setDesignation(Designation.valueOf(designation));
//				jobDTO.setAnnualPackage(ctc);
//				jobDTO.setQualification(Qualification.valueOf(edu));
//				jobDTO.setPercentage(perc);
//				jobDTO.setFresher(eLevel);
//				return jobDTO;	
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	



	@Override
	public JobDto findByIdAndDesignation(Integer id, String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobDto findByIdAndDesignationAndQualification(Integer id, String designation, String qualification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isFesherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMaxPercentage() {
		// TODO Auto-generated method stub
		return null;
	}

}