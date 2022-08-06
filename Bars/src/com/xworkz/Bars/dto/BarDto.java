package com.xworkz.Bars.dto;

import java.io.Serializable;

import com.xworkz.Bars.constant.BarType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor








public class BarDto  implements Serializable{
	
	private Integer id;
	private String barName;
	private String location;
	private BarType type = BarType.DEFAULT;
	private Double avrCollectionPerDay;
	private Double avrCollectionPerMonth;
	
	
	public BarDto (){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBarName() {
		return barName;
	}
	public void setBarName(String barName) {
		this.barName = barName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public BarType getType() {
		return type;
	}
	public void setType(BarType type) {
		this.type = type;
	}
	public Double getAvrCollectionPerDay() {
		return avrCollectionPerDay;
	}
	public void setAvrCollectionPerDay(Double avrCollectionPerDay) {
		this.avrCollectionPerDay = avrCollectionPerDay;
	}
	public Double getAvrCollectionPerMonth() {
		return avrCollectionPerMonth;
	}
	public void setAvrCollectionPerMonth(Double avrCollectionPerMonth) {
		this.avrCollectionPerMonth = avrCollectionPerMonth;
	}
	
	
	
}