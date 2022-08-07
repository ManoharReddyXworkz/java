package com.xworkz.corejava.collections.set.train;

import com.xworkz.corejava.collections.set.train.dto.TrainDTO;
import com.xworkz.corejava.collections.set.train.service.TrainServiceImpl;
import com.xworkz.corejava.collections.set.train.service.TrainServices;

public class TrainDemo {

	public static void main(String[] args) {
		
	TrainDTO shatabdi = new TrainDTO();
	
	shatabdi.setTrainNo(12345);
	shatabdi.setTrainName("Shatabdhi");
	shatabdi.setPrice(300.00);
	
	
	TrainDTO rani = new TrainDTO();
	
	rani.setTrainNo(12355);
	rani.setTrainName("Raja-Rani");
	rani.setPrice(200.00);
	

	TrainDTO vasco = new TrainDTO();
	
	vasco.setTrainNo(34565);
	vasco.setTrainName("Vascodagama");
	vasco.setPrice(2000.00);
	
	TrainServices service = new TrainServiceImpl();
	service.addTrain(shatabdi);
	service.addTrain(rani);
	service.addTrain(vasco);
	
	 TrainDTO tr = service.getTraindetails("Shatabdhi");
	 System.out.println(tr);
	//service.upadteTrainDetails(vasco);
	//service.deleteTrainDetails(shatabdi);
	}
}
