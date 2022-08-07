package com.xworkz.Job.dao;

import com.xworkz.Job.dto.JobDto;

public interface JobDao {
	

	public Boolean saveDetails(JobDto jobDTO);
	public JobDto findByID(Integer id);
	public JobDto findByIdAndDesignation(Integer id,String designation);
	public JobDto findByIdAndDesignationAndQualification(Integer id,String designation,String qualification);
	public Integer getTotal();
	public Boolean isFesherById(Integer id);
	public Double getMaxPercentage();
}
	
	
	


