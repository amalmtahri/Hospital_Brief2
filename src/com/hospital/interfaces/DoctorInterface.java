package com.hospital.interfaces;

import java.util.List;

import com.hospital.models.Doctor;

public interface DoctorInterface {
	public void affichageD(Doctor d);
	public void affichageListe(List<Doctor> doctors);
	public Doctor getOne(String name, List<Doctor> doctors);
}
