package de.seidfred.myaktion.model;

public class Account {

	private String name;
	private String nameOfBank;
	private String iban;

	public Account() {
		//no arg constructor
	}
	
	public Account(String aName, String aNameOfBank, String aIban) {
		super();
		name = aName;
		nameOfBank = aNameOfBank;
		iban = aIban;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getNameOfBank() {
		return nameOfBank;
	}

	public void setNameOfBank(String aNameOfBank) {
		nameOfBank = aNameOfBank;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String aIban) {
		iban = aIban;
	}

}
