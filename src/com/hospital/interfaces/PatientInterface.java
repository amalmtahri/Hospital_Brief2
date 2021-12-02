package com.hospital.interfaces;
import java.util.List;

import com.hospital.models.Patient;

public interface PatientInterface {
	public Patient saisie();
	public void affichage(Patient p);
	public List<Patient> saisiListe();
	public void affichageListe(List<Patient> patients);
	public Patient getone(String affiliationNumber, List<Patient> patients);
	
	
}
