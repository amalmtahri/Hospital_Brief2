package com.hospital.models;

import java.util.Date;

import com.hospital.enumerations.InsuranceType;

public class Patient extends Person{

	private Date hospitalEntryDate;
	private String affiliationNumber;
	private InsuranceType insuranceType;
	private double portefeuille;
	
	public Patient(Date hospitalEntryDate,String affiliationNumber,InsuranceType insuranceType,double portefeuille) {
		super();
		this.hospitalEntryDate = hospitalEntryDate;
		this.affiliationNumber = affiliationNumber;
		this.insuranceType = insuranceType;
		this.portefeuille = portefeuille;
	}

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public double getPortefeuille() {
		return portefeuille;
	}

	public void setPortefeuille(double portefeuille) {
		this.portefeuille = portefeuille;
	}

	public Date getHospitalEntryDate() {
		return hospitalEntryDate;
	}

	public void setHospitalEntryDate(Date hospitalEntryDate) {
		this.hospitalEntryDate = hospitalEntryDate;
	}

	public String getAffiliationNumber() {
		return affiliationNumber;
	}

	public void setAffiliationNumber(String affiliationNumber) {
		this.affiliationNumber = affiliationNumber;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}
	
	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

	@Override
	public String toString() {
		return "Patient [firstname="+getFirstname()+",lastName="+getLastname()+",phone="+getPhone()+",address="+getAddress()+",hospitalEntryDate=" + hospitalEntryDate + ", affiliationNumber=" + affiliationNumber
				+ ", insuranceType=" + insuranceType + "]";
	}	
}
