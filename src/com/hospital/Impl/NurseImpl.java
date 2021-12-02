package com.hospital.Impl;

import java.util.List;

import com.hospital.interfaces.NurseInterface;
import com.hospital.models.Nurse;

public class NurseImpl implements NurseInterface{

	@Override
	public void affichage(Nurse n) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Le nom de inférmière :" + n.getFirstname() + " " + n.getLastname());
		System.out.println("Le phone de inférmière :" + n.getPhone());
		System.out.println("L'addresse de inférmière :" + n.getAddress());
		System.out.println("Le professionNumber de inférmière :" + n.getProfessionNumber());
		System.out.println("Le salaire de inférmière :" + n.getSalary()+ " DH");
	}

	@Override
	public void affichages(List<Nurse> nurses) {
		// TODO Auto-generated method stub
		for (Nurse n : nurses) {
			affichage(n);
		}
		
	}

}
