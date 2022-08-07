package com.xworkz.Job.dto;

import com.xworkz.constant.Destignation;
import com.xworkz.constant.Qualification;

public class JobDto {
private Integer id;
private Destignation destignation= Destignation.DEFAULT;
private double annualpackage;
private Qualification qualification =  Qualification.DEFAULT;
private double percentage;
private boolean fresher;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Destignation getDestignation() {
	return destignation;
}
public void setDestignation(Destignation destignation) {
	this.destignation = destignation;
}
public double getAnnualpackage() {
	return annualpackage;
}
public void setAnnualpackage(double annualpackage) {
	this.annualpackage = annualpackage;
}
public Qualification getQualification() {
	return qualification;
}
public void setQualification(Qualification qualification) {
	this.qualification = qualification;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public boolean isFresher() {
	return fresher;
}
public void setFresher(boolean fresher) {
	this.fresher = fresher;
}




public JobDto(int id, Destignation associateengineer, double annualpackage2, Qualification be, double percentage2,
		String string) {
	this.id=id;
	this.destignation=destignation;
	this.qualification=qualification;
	this.annualpackage=annualpackage;
	this.percentage=percentage;
	this.fresher=fresher;
	
}
@Override
public String toString() {
	return "JobDto [id=" + id + ", destignation=" + destignation + ", annualpackage=" + annualpackage
			+ ", qualification=" + qualification + ", percentage=" + percentage + ", fresher=" + fresher + ", getId()="
			+ getId() + ", getDestignation()=" + getDestignation() + ", getAnnualpackage()=" + getAnnualpackage()
			+ ", getQualification()=" + getQualification() + ", getPercentage()=" + getPercentage() + ", isFresher()="
			+ isFresher() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

}
