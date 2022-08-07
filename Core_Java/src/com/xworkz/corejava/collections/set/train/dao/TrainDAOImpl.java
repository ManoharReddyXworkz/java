package com.xworkz.corejava.collections.set.train.dao;

import java.util.ArrayList;

import com.xworkz.corejava.collections.set.train.dto.TrainDTO;

public class TrainDAOImpl implements TrainDAO {
	
	ArrayList<TrainDTO> al = new ArrayList<TrainDTO>();

	@Override
	public void addTrain(TrainDTO traindto) {
		al.add(traindto);
		System.out.println(al);
		
	}

	@Override
	public TrainDTO getTraindetails(String trainName) {
		int count = 0;
		for(int i = 0; i < al.size(); i++){
			if(al.get(i) != null && al.get(i).equals(trainName)) {
				count++;
			}
			
			if(count > 0) {
				return al.get(i);
			}
		}
		return null;
	}

	@Override
	public void upadteTrainDetails(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTrain(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}

}
