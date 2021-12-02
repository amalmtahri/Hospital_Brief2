package com.hospital.models;

import java.util.List;

public class Doctor extends Person{

	private String professionNumber;
	private TimeSlot shiftSlot;
	private double salary;
	private List<Nurse> nusreD;
	
	public Doctor(String firstname,String lastname,String phone,String address,String professionNumber,TimeSlot shiftSlot,double salary,List<Nurse> nurseD) {
		super(firstname,lastname,phone,address);
		this.setProfessionNumber(professionNumber);
		this.setShiftSlot(shiftSlot);
		this.setSalary(salary);
		this.setNusreD(nurseD);
	}
	



	public List<Nurse> getNusreD() {
		return nusreD;
	}




	public void setNusreD(List<Nurse> nusreD) {
		this.nusreD = nusreD;
	}




	public Doctor() {
		// TODO Auto-generated constructor stub
	}


	public String getProfessionNumber() {
		return professionNumber;
	}

	public void setProfessionNumber(String professionNumber) {
		this.professionNumber = professionNumber;
	}

	public TimeSlot getShiftSlot() {
		return shiftSlot;
	}

	public void setShiftSlot(TimeSlot shiftSlot) {
		this.shiftSlot = shiftSlot;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Doctor [firstname="+getFirstname()+",lastName="+getLastname()+",phone="+getPhone()+",address="+getAddress()+",professionNumber=" + professionNumber + ", shiftSlot=" + shiftSlot + ", salary=" + salary + ",nusreD="+nusreD+"]";
	}
	
}
