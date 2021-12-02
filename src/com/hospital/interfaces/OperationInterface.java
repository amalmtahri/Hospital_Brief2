package com.hospital.interfaces;

import com.hospital.models.Operation;
import java.util.Optional;
import java.util.List;


public interface OperationInterface {

	public Operation addOperation();
	
	public List<Operation> listOperation();
	
	public void affichage(List<Operation> operations);
	public void affichageOP(Operation op);
	public Operation getone(String nameOperation, List<Operation> operations);

	//void addOperation(List<Operation> operations);
}
