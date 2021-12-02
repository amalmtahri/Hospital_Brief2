package com.hospital.app;

import java.util.Scanner;

import com.hospital.Impl.OperationImpl;
import com.hospital.Impl.PatientImpl;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("---------------------Welcome to Hospital Mohammed 5----------------");
		OperationImpl op = new OperationImpl();
		op.menu();
	}

	
	

	
}
