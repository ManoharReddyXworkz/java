package com.xworkz.runner;

import com.xworkz.Job.dao.JobDao;
import com.xworkz.Job.dao.JobDaoImpl;
import com.xworkz.Job.dto.JobDto;
import com.xworkz.constant.Destignation;
import com.xworkz.constant.Qualification;

public class JobRunner {

	
	public static void main(String[] args) {


			JobDto jobDTO = new JobDto(1,Destignation.ASSOCIATEENGINEER,300000.00D,Qualification.BE,57.65D,"NO");
			JobDao jobDAO = new JobDaoImpl();
			jobDAO.saveDetails(jobDTO);
//			jobDAO.findByID(2);
		

		

	}
}
