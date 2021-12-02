package com.hospital.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.hospital.models.*;
import com.hospital.app.Main;
import com.hospital.enumerations.StatutType;
import com.hospital.errors.ErrorConstants;
import com.hospital.interfaces.OperationInterface;


public class OperationImpl implements OperationInterface{
	List<Room> listRoom = new ArrayList<Room>();
	List<Nurse> listNurse = new ArrayList<>();
	List<Doctor> listDoctor = new ArrayList<Doctor>();
	List<Transaction> listTransaction = new ArrayList<Transaction>();
	List<Doctor> doctorAvailable = new ArrayList<Doctor>();
	List<Operation> listOperation = new ArrayList<Operation>();
	List<Patient> listPatient = new ArrayList<Patient>();
	List<Nurse> nurseD1 = new ArrayList<Nurse>();
	List<Nurse> nurseD2 = new ArrayList<Nurse>();
	List<Nurse> nurseD3 = new ArrayList<Nurse>();
	List<Nurse> nurseD4 = new ArrayList<Nurse>();
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1 - Ajouter un nouveau patient");
		System.out.println("2 - Ajouter une opération");
		System.out.println("3 - Ajouter un statut d'un opération");
		System.out.println("4 - Afficher la liste des docteurs");
		System.out.println("5 - Afficher la liste des patients");
		System.out.println("6 - Afficher la liste des Inférmières");
		System.out.println("7 - Afficher la liste des Chambres");
		System.out.println("8 - Afficher la liste des Opérations");
		System.out.println("9 - Afficher la liste des transactions");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Entrer votre choix :");
		int res = 0;
		try {
			 res = sc.nextInt();
			 reponse(res);
		}catch(Exception e) {
			System.out.println(ErrorConstants.ERR_TYPE_VAR);
		}
	}
	
	public void reponse(int chose) {
        switch (chose){
            case 1 : 
            	listPatient();
            	menu();
            	break;
            case 2:
            	listOperation();
            	menu();
            	break;
            case 3:
            	choisitOP();
            	menu();
            	break;
            case 4:
            	DoctorImpl d = new DoctorImpl();
            	d.affichageListe(listDoctor());
            	menu();
            	break;
            case 5:
            	PatientImpl patientimpl = new PatientImpl();
            	patientimpl.affichageListe(listPatient);
            	menu();
            	break;
            case 6:
            	NurseImpl n = new NurseImpl();
            	n.affichages(listNurse());
            	menu();
            	break;
            case 7:
            	RoomImpl r = new RoomImpl();
            	r.affichages(listRoom());
            	menu();
            	break;
            case 8:
            	affichage(listOperation);
            	menu();
            	break;
            case 9:
            	afficherTransaction(listTransaction);
            	menu();
            	break;
            default:
                System.out.println("ce nombre n'existe pas dans la liste");
                menu();
                break;
        }
    }
	public List<Nurse> listNurse(){
		 
		 listNurse.add(new Nurse("Nurse1","Nurse1","065247237383","SAFI","A10",3000.00));
		 listNurse.add(new Nurse("Nurse2","Nurse2","065374643830","SAFI","A20",3000.00));
		 listNurse.add(new Nurse("Nurse3","Nurse3","076554445567","SAFI","A30",3000.00));
		 listNurse.add(new Nurse("Nurse4","Nurse4","061714145262","SAFI","A40",3000.00));
		 listNurse.add(new Nurse("Nurse5","Nurse5","062345678962","SAFI","A50",3000.00));
		 listNurse.add(new Nurse("Nurse6","Nurse6","060987654362","SAFI","A60",3000.00));
		 listNurse.add(new Nurse("Nurse7","Nurse7","062283930362","SAFI","A70",3000.00));
		 listNurse.add(new Nurse("Nurse8","Nurse8","060939300482","SAFI","A80",3000.00));
		 
		return listNurse;
		
	}
	public List<Doctor> listDoctor(){
		 nurseD1.add(listNurse().get(0));
		 nurseD1.add(listNurse().get(1));
		 nurseD2.add(listNurse().get(2));
		 nurseD2.add(listNurse().get(3));
		 nurseD3.add(listNurse().get(4));
		 nurseD3.add(listNurse().get(5));
		 nurseD4.add(listNurse().get(6));
		 nurseD4.add(listNurse().get(7));
		listDoctor.add(new Doctor("Doctor1","Doctor1","0655443322","SAFI","B10",new TimeSlot(8,20),10000.00,nurseD1));
		listDoctor.add(new Doctor("Doctor2","Doctor2","0714132637","SAFI","B20",new TimeSlot(14,18),10000.00,nurseD2));
		listDoctor.add(new Doctor("Doctor3","Doctor3","0609343322","SAFI","B30",new TimeSlot(16,20),10000.00,nurseD3));
		listDoctor.add(new Doctor("Doctor4","Doctor4","0765980737","SAFI","B40",new TimeSlot(8,14),10000.00,nurseD4));
		return listDoctor;
	}
	public List<Room> listRoom(){
		listRoom.add(new Room(1,1));
		listRoom.add(new Room(2,1));
		listRoom.add(new Room(3,2));
		listRoom.add(new Room(4,2));
		listRoom.add(new Room(5,3));
		listRoom.add(new Room(6,3));
		listRoom.add(new Room(7,4));
		listRoom.add(new Room(8,4));
		listRoom.add(new Room(9,5));
		listRoom.add(new Room(10,5));
		return listRoom;
	}
	public List<Patient> listPatient(){
		String rep =null;
		do {
			PatientImpl p = new PatientImpl();
			listPatient.add(p.saisie());
			System.out.println("Continuer ? o/n");
			rep = sc.next();
		}while(rep.equalsIgnoreCase("o"));
		return listPatient;
		
	}
	public void affichageOneTr(String nameOperation,String firstNamePatient, String lastNamePatient, Date datePaymant, double mantantOperation ){
		System.out.println("_______________________________________________Les informations de Transaction_______________________________________________");
		System.out.println("Le nom de l'opération :" + nameOperation);
		System.out.println("Le nom de Patient :" + firstNamePatient + " " + lastNamePatient);
		System.out.println("La date de paymant :" + datePaymant);
		System.out.println("Le mantant :" + mantantOperation);
		System.out.println("_____________________________________________________________________________________________________________________________");
		listTransaction(nameOperation,firstNamePatient,lastNamePatient,datePaymant,mantantOperation);
	}
	public List<Transaction> listTransaction(String nameOperation,String firstNamePatient, String lastNamePatient, Date datePaymant, double mantantOperation ){
		listTransaction.add(new Transaction(nameOperation,firstNamePatient,lastNamePatient,datePaymant,mantantOperation));
		return listTransaction;
		
	}



	@Override
	public Operation addOperation(){
		int z;
		int start = 0;
		int end = 0;
		// TODO Auto-generated method stub
		Operation op = new Operation();
		System.out.println("_________________________________Saisir les informations de l'opération_________________________________");
		do {
			z = 0;
			System.out.print("Saisir l'heure de début de l'opération :");
			try {
				 start = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println(ErrorConstants.ERR_TYPE_VAR);
			    System.out.print("Press 1 to Continue and Press 2 to Terminate The Program :");
	            z = sc.nextInt();
			}
		}while(z == 1);
		do {
			z = 0;
			System.out.print("Saisir l'heure de fin de l'opération :");
			try {
				end = Integer.parseInt(sc.next());
			}
			catch(Exception e) {
				System.out.println(ErrorConstants.ERR_TYPE_VAR);
			    System.out.print("Press 1 to Continue and Press 2 to Terminate The Program :");
	            z = sc.nextInt();
			}
		}while(z == 1);
		
		op.setTimeOperation(new TimeSlot(start,end));
		doctorAvailable(start,end,listDoctor());
		
		do {
			z = 0;
			System.out.println("Saisir la date de l'opération ce format dd/MM/yyyy:");
			String sDate1= sc.next();
				try {
					Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
					op.setDateOperation(date1);
				} catch (Exception e) {
					System.out.println(ErrorConstants.ERR_DATE);
		            System.out.print("Press 1 to Continue and Press 2 to Terminate The Program :");
		             z = sc.nextInt();
				}
		}while(z==1);
		
		System.out.print("Saisir le nom de l'opération : ");
		op.setNameOperation(sc.next());
		System.out.print("Saisir la description de l'opération :");
		op.setDescription(sc.next());
		System.out.print("Saisir le prix de l'opération :");
		op.setPrice(Double.parseDouble(sc.next()));
		System.out.println("Voila la liste des docteurs disponible :");
		DoctorImpl doctorimpl = new DoctorImpl();
		doctorimpl.affichageListe(doctorAvailable);
		System.out.println("Saisir le nom de docteur que vous choisit :");
		op.setDoctor(doctorimpl.getOne(sc.next(), doctorAvailable));
		if(listPatient.isEmpty()) {
			System.out.println("Ajouter un patient :");
			PatientImpl patientimpl = new PatientImpl();
			op.setPatient(patientimpl.saisie());
		}
		else {
			System.out.println("Voila la liste des patients :");
			PatientImpl patientimpl = new PatientImpl();
			patientimpl.affichageListe(listPatient);
			System.out.println("Saisir l'affiliationNumber de patient :");
			op.setPatient(patientimpl.getone(sc.next(), listPatient));
		}
		
		op.setHospital(new Hospital("Mohammed 5","SAFI",listDoctor(),listRoom()));
		System.out.println("Voila la liste des chambres :");
		RoomImpl roomimpl = new RoomImpl();
		roomimpl.affichages(listRoom());
		System.out.print("Saisir le nombre de chambre que vous choisit :");
		int choix = sc.nextInt();
		op.setRoom(roomimpl.getOne(choix, listRoom()));
		System.out.println("________________________________________________Paymant_________________________________________________");
		System.out.print("Saisir la date du paymant :");
		Date datePaymant = null;
		double mantant = 0;
		double rembource = 0;
		do {
			z = 0;
		String date2 = sc.next();
		try {
			 datePaymant = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
		} catch (Exception e) {
			System.out.println(ErrorConstants.ERR_DATE);
            System.out.print("Press 1 to Continue and Press 2 to Terminate The Program :");
            z = sc.nextInt();
		}
		}while(z == 1 || op.getDateOperation().before(datePaymant) || op.getDateOperation().equals(datePaymant));
		while(op.getPatient().getPortefeuille() < op.getPrice()) {
			System.out.println("votre argents pas assez pour l'opération svp entrer plus d'argents :");
			double argent = Double.parseDouble(sc.next());
			op.getPatient().setPortefeuille(op.getPatient().getPortefeuille() + argent);
		}
		if(op.getPatient().getInsuranceType().toString().equals("RAMED")) {
			 mantant = op.getPatient().getPortefeuille() - ( (op.getPrice() * 20 ) / 100 );
			op.getPatient().setPortefeuille(mantant);
		}
		if(op.getPatient().getInsuranceType().toString().equals("CNSS")) {
			mantant = op.getPrice();
			double nvPortefeuille = op.getPatient().getPortefeuille() - op.getPrice();
			op.getPatient().setPortefeuille(nvPortefeuille);
			 rembource = (op.getPrice() * 70) / 100;
			op.getPatient().setPortefeuille(rembource + op.getPatient().getPortefeuille());
		}
		if(op.getPatient().getInsuranceType().toString().equals("CNOPS")) {
			mantant = op.getPrice();
			double nvPortefeuille = op.getPatient().getPortefeuille() - op.getPrice();
			op.getPatient().setPortefeuille(nvPortefeuille);
			 rembource = (op.getPrice() * 100) / 100;
			op.getPatient().setPortefeuille(rembource + op.getPatient().getPortefeuille());
		}
		if(op.getPatient().getInsuranceType().toString().equals("NONE")) {
			mantant = op.getPrice();
			double nvPortefeuille = op.getPatient().getPortefeuille() - op.getPrice();
			op.getPatient().setPortefeuille(mantant);
		}
		affichageOP(op);
		System.out.println("Le rembourcement :" + rembource);
		affichageOneTr(op.getNameOperation(),op.getPatient().getFirstname(),op.getPatient().getLastname(),datePaymant,mantant);
		Main m = new Main();
		return op;
	}
	public List<Doctor> doctorAvailable(int start, int end, List<Doctor> doctors) {
		for (Doctor doctor : doctors) {
			if(doctor.getShiftSlot().getStartTime() <= start && doctor.getShiftSlot().getEndTime() >= end) {
				doctorAvailable.add(doctor);
			}
		}
		return doctorAvailable;
	}
	public void afficherTransaction(List<Transaction> transactions) {
		if(!transactions.isEmpty()) {
		for (Transaction transaction : transactions) {
			System.out.println("_______________________________________________Les informations de Transaction_______________________________________________");
			System.out.println("Le nom de l'opération :" + transaction.getNameOperation());
			System.out.println("Le nom de Patient :" + transaction.getFirstNamePatient() + " " + transaction.getLastNamePatient());
			System.out.println("La date de paymant :" + transaction.getDatePaymant());
			System.out.println("Le mantant :" + transaction.getMantantOperation());
			System.out.println("_____________________________________________________________________________________________________________________________");
		}
		}
		else {
			System.out.println("aucun transaction pour le moment");
		}
	}

	@Override
	public List<Operation> listOperation() {
		// TODO Auto-generated method stub
		String rep = null;
		do {
			listOperation.add(addOperation());
			System.out.print("Ajouter autre opération ? o/n");
			rep = sc.next();
		}while(rep.equalsIgnoreCase("o"));
		return listOperation;
	}

	@Override
	public void affichageOP(Operation op) {
		// TODO Auto-generated method stub
		System.out.println("_______________________________________________Informations d'opération_______________________________________________");
		System.out.println("Le Nom de l'opération : " + op.getNameOperation());
		System.out.println("La Description de l'opération : " + op.getDescription());
		System.out.println("L'heure de début de l'opération : " + op.getTimeOperation().getStartTime());
		System.out.println("L'heure de fin de l'opération : " + op.getTimeOperation().getEndTime());
		System.out.println("La date de l'opération : " + op.getDateOperation());
		System.out.println("Le doctor  : " + op.getDoctor().getFirstname());
		System.out.println("Le Patient  : " + op.getPatient().getFirstname() + " " + op.getPatient().getLastname());
		System.out.println("Le Numero de chambre de l'opération  : " + op.getRoom().getNumber() + "\n" + "l'étage de l'opération :" + op.getRoom().getStage());
		System.out.println("Statut de l'opération :" +op.getStatut());
		System.out.println("_______________________________________________________________________________________________________________________");
	}
	@Override
	public void affichage(List<Operation> operations) {
		// TODO Auto-generated method stub
		if(!operations.isEmpty()) {
			for (Operation operation : operations) {
				affichageOP(operation);
			}
		}
		else {
			System.out.println("Aucun opérations pour le moment");
		}
	}
	public void choisitOP() {
		if(!listOperation.isEmpty()) {
			System.out.println("voila la liste des opérations :");
			affichage(listOperation);
			System.out.print("choisit une opération : \n Enter le nom de l'opération :");
			String nameOp = sc.next();
			getone(nameOp, listOperation);
		}
		else {
			System.out.println("Aucun opération pour le moment");
		}
		
	}
	

	@Override
	public Operation getone(String nameOperation, List<Operation> operations) {
		// TODO Auto-generated method stub
		for (Operation operation : operations) {
			if(operation.getNameOperation().equalsIgnoreCase(nameOperation));
			addStatut(operation);
			return operation;
		}
		return null;
	}
	public void addStatut(Operation op) {
		System.out.println("Saisir le nombre de statut de l'opération :");
		System.out.println("-------------------------------------------");
		System.out.println("1 - En cours ");
		System.out.println("2 - Réussit ");
		System.out.println("3 - Non Réussit");
		System.out.println("-------------------------------------------");
		int chose = sc.nextInt();
		StatutType typeStatut = statutType(chose);
		op.setStatut(typeStatut);
		System.out.println(op);
	}
	public StatutType statutType(int chose) {

        switch (chose){
            case 1 : return StatutType.ENCOURS;
            case 2: return  StatutType.REUSSIT;
            case 3: return StatutType.NONREUSSIT;
            default:
                System.out.println("ce nombre n'existe pas dans la liste");
                return null;
        }
    }
	
	

	


}
