package com.hospital.Impl;

import java.util.List;

import com.hospital.interfaces.DoctorInterface;
import com.hospital.models.Doctor;

public class DoctorImpl implements DoctorInterface{

	@Override
	public void affichageD(Doctor d) {
		// TODO Auto-generated method stub
		System.out.println("________________________________________________________________");
		System.out.println("Le Prenom : " + d.getFirstname());
		System.out.println("Le Nom :" + d.getLastname());
		System.out.println("Le phone :" + d.getPhone());
		System.out.println("L'address :" + d.getAddress());
		System.out.println("Le professionNumber :" + d.getProfessionNumber());
		System.out.println("L'heure de début du travaille :" + d.getShiftSlot().getStartTime());
		System.out.println("L'heure de fin du travaille :" + d.getShiftSlot().getEndTime());
		System.out.println("Le salaire :" + d.getSalary() + " DH");
		System.out.println("La liste des inférmières : \n" + "1 - "+ d.getNusreD().get(0).getFirstname()+"\n" + "2 - " + d.getNusreD().get(1).getFirstname());
	}

	@Override
	public void affichageListe(List<Doctor> doctors) {
		// TODO Auto-generated method stub
		for (Doctor d : doctors) {
			affichageD(d);
		}
	}

	@Override
	public Doctor getOne(String name,List<Doctor> doctors) {
		// TODO Auto-generated method stub
		for (Doctor doctor : doctors) {
			if(doctor.getFirstname().equalsIgnoreCase(name)) {
				return doctor;
			}
		}
		return null;
	}

}
