package com.hospital.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import com.hospital.enumerations.InsuranceType;
import com.hospital.errors.ErrorConstants;
import com.hospital.interfaces.PatientInterface;
import com.hospital.models.Patient;

public class PatientImpl implements PatientInterface {
	Scanner sc = new Scanner(System.in);
	int cmp = 100;
	@Override
	public Patient saisie() {
		Patient p = new Patient();
		// TODO Auto-generated method stub
		System.out.println("saisir le prenom de patient : ");
		p.setFirstname(sc.next().toString());
		System.out.println("saisir le nom de patient : ");
		String nom = sc.next();
		p.setLastname(nom);
		System.out.println("saisir l'adresse de patient : ");
		p.setAddress(sc.next().toString());
		System.out.println("saisir le phone de patient : ");
		p.setPhone(sc.next().toString());
		int z;
		do {
			z = 0;
		System.out.println("saisir la date de l'entrer ce format dd/MM/yyyy: ");
		String sDate1= sc.next();
			try {
				Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
				p.setHospitalEntryDate(date1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(ErrorConstants.ERR_DATE);
				System.out.print("Press 1 to Continue and Press 2 to Terminate The Program :");
		        z = sc.nextInt();
			}
		}while(z == 1);

		System.out.println("saisir AffiliationNumber de patient :");
		p.setAffiliationNumber(sc.next());
		System.out.println("Choisir votre type d'assurance :");
		System.out.println("------------------------------------------------------------");
		System.out.println("1 =====> CNSS");
		System.out.println("2 =====> RAMED");
		System.out.println("3 =====> CNOPS");
		System.out.println("4 =====> NONE");
		System.out.println("------------------------------------------------------------");
		int choix = sc.nextInt();
		InsuranceType insuranceTypev = insuranceType(choix);
        p.setInsuranceType(insuranceTypev);
        System.out.println("saisir le portefeuille de patient :");
        p.setPortefeuille(Double.parseDouble(sc.next()));
		System.out.println("------------------------------------------------------");
		System.out.println("Le prenom de patient : " + p.getFirstname());
		System.out.println("Le nom de patient : " + p.getLastname());
		System.out.println("L'adresse de patient : " + p.getAddress());
		System.out.println("Le phone de patient : " + p.getPhone());
		System.out.println("La date d'entrer à l'hopitale de patient : " + p.getHospitalEntryDate());
		System.out.println("Le AffiliationNumber de patient : " + p.getAffiliationNumber());
		System.out.println("Le Type d'assurance de patient : " + p.getInsuranceType());
		System.out.println("Le portefeuille de patient : " + p.getPortefeuille());
		System.out.println("------------------------------------------------------");

		
		return p;
	}
	public InsuranceType insuranceType(int chose) {

        switch (chose){
            case 1 : return InsuranceType.CNSS;
            case 2: return  InsuranceType.RAMED;
            case 3: return InsuranceType.CNOPS;
            case 4:return InsuranceType.NONE;
            default:
                System.out.println("This chose not in list");
                return null;
        }
    }
	@Override
	public void affichage(Patient p) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------------------");
		System.out.println("Le prenom de patient : " + p.getFirstname());
		System.out.println("Le nom de patient : " + p.getLastname());
		System.out.println("L'adresse de patient : " + p.getAddress());
		System.out.println("Le phone de patient : " + p.getPhone());
		System.out.println("La date d'entrer à l'hopitale de patient : " + p.getHospitalEntryDate());
		System.out.println("Le AffiliationNumber de patient : " + p.getAffiliationNumber());
		System.out.println("Le Type d'assurance de patient : " + p.getInsuranceType());
		System.out.println("Le portefeuille de patient : " + p.getPortefeuille());
		System.out.println("------------------------------------------------------");
		
	}

	/*@Override
	public List<Patient> saisiListe() {
		String rep = null;
		List<Patient> liste = new ArrayList<Patient>();
		do {
			liste.add(saisie());
			affichageListe(liste);
			System.out.println("Continuer ? o/n ");
			rep = sc.next();
		}while(rep.equalsIgnoreCase("o"));
		
		return liste;
	}*/

	@Override
	public void affichageListe(List<Patient> patients) {
		if(!patients.isEmpty()) {
			for (Patient p : patients) {
				affichage(p);
			}
		}
		else {
			System.out.println("Aucun patient pour le moment");
		}
		
		
	}
	@Override
	public List<Patient> saisiListe() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Patient getone(String affiliationNumber, List<Patient> patients) {
		// TODO Auto-generated method stub
		for (Patient patient : patients) {
			if(patient.getAffiliationNumber().equalsIgnoreCase(affiliationNumber));
			return patient;
		}
		return null;
	}

	
	

}
