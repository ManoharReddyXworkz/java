package com.xworkz.corejava.collections.set.train.dto;

public class TrainDTO {
	
	private Integer trainNo;
	private String trainName;
	private Double price;
	
	public TrainDTO() {
		
	}

	public Integer getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TrainDTO [trainNo=" + trainNo + ", trainName=" + trainName + ", price=" + price + "]";
	}
	
	
	

}
