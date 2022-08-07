package com.xworkz.corejava.collections.set.train.dao;

import com.xworkz.corejava.collections.set.train.dto.TrainDTO;

public interface TrainDAO {
	
	public void addTrain(TrainDTO traindto);
	public TrainDTO getTraindetails(String trainName);
	public void upadteTrainDetails(TrainDTO traindto);
	public void cancelTrain(TrainDTO traindto);


}
