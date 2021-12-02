package com.hospital.Impl;

import java.util.List;

import com.hospital.interfaces.NurseInterface;
import com.hospital.models.Nurse;

public class NurseImpl implements NurseInterface{

	@Override
	public void affichage(Nurse n) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Le nom de inf�rmi�re :" + n.getFirstname() + " " + n.getLastname());
		System.out.println("Le phone de inf�rmi�re :" + n.getPhone());
		System.out.println("L'addresse de inf�rmi�re :" + n.getAddress());
		System.out.println("Le professionNumber de inf�rmi�re :" + n.getProfessionNumber());
		System.out.println("Le salaire de inf�rmi�re :" + n.getSalary()+ " DH");
	}

	@Override
	public void affichages(List<Nurse> nurses) {
		// TODO Auto-generated method stub
		for (Nurse n : nurses) {
			affichage(n);
		}
		
	}

}
