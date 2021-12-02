package com.hospital.models;

import java.util.Date;

public class Transaction {
	private String nameOperation;
	private String firstNamePatient;
	private String lastNamePatient;
	private Date datePaymant;
	private double mantantOperation;
	
	public Transaction(String nameOperation,String firstNamePatient,String lastNamePatient,Date datePaymant,double mantantOperation) {
		super();
		// TODO Auto-generated constructor stub
		this.setNameOperation(nameOperation);
		this.setFirstNamePatient(firstNamePatient);
		this.setLastNamePatient(lastNamePatient);
		this.setDatePaymant(datePaymant);
		this.setMantantOperation(mantantOperation);
	}
	public String getLastNamePatient() {
		return lastNamePatient;
	}
	public void setLastNamePatient(String lastNamePatient) {
		this.lastNamePatient = lastNamePatient;
	}
	public String getNameOperation() {
		return nameOperation;
	}
	public void setNameOperation(String nameOperation) {
		this.nameOperation = nameOperation;
	}
	public String getFirstNamePatient() {
		return firstNamePatient;
	}
	public void setFirstNamePatient(String firstNamePatient) {
		this.firstNamePatient = firstNamePatient;
	}
	public Date getDatePaymant() {
		return datePaymant;
	}
	public void setDatePaymant(Date datePaymant) {
		this.datePaymant = datePaymant;
	}
	public double getMantantOperation() {
		return mantantOperation;
	}
	public void setMantantOperation(double mantantOperation) {
		this.mantantOperation = mantantOperation;
	}
	
}
