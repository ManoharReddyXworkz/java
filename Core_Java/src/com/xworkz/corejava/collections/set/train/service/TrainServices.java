package com.xworkz.corejava.collections.set.train.service;

import com.xworkz.corejava.collections.set.train.dto.*;

public interface TrainServices {
	
	public void addTrain(TrainDTO traindto);
	public TrainDTO getTraindetails(String trainName);
	public void upadteTrainDetails(TrainDTO traindto);
	public void deleteTrainDetails(TrainDTO traindto);

}
