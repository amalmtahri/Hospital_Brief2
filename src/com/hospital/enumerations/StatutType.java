package com.hospital.enumerations;

public enum StatutType {

	ENCOURS("ENCOURS"),
	REUSSIT("REUSSIT"),
	NONREUSSIT("NONREUSSIT");
	private String value;

	StatutType(String value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	
}
