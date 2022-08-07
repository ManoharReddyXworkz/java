package com.xworkz.corejava.collections.set.train.service;

import com.xworkz.corejava.collections.set.train.dao.TrainDAO;
import com.xworkz.corejava.collections.set.train.dao.TrainDAOImpl;
import com.xworkz.corejava.collections.set.train.dto.TrainDTO;

public class TrainServiceImpl implements TrainServices {
	
	TrainDAO train = new TrainDAOImpl();

	@Override
	public void addTrain(TrainDTO traindto) {
		Integer name = traindto.getTrainNo();
		Integer count = 0;
		if(name % 5 == 0) {
			count++;
		}
		if(count > 0)
			train.addTrain(traindto);
		
		else {
			System.out.println("Entered Details did not match The Standard");
		}
	}

	@Override
	public TrainDTO getTraindetails(String trainName) {
		return train.getTraindetails(trainName);
	}
	@Override
	public void upadteTrainDetails(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainDetails(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}

}
