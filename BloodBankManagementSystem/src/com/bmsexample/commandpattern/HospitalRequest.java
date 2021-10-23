package com.bmsexample.commandpattern;

public class HospitalRequest {

	private String patientName;
	private int noOfUnits;
	private String bloodGroup;
	
	
	
	public HospitalRequest(String patientName, int noOfUnits, String bloodGroup) {
		super();
		this.patientName = patientName;
		this.noOfUnits = noOfUnits;
		this.bloodGroup = bloodGroup;
	}
	public void receive() {
		System.out.println("Thank you for sending "+noOfUnits+" Units of blood group "+bloodGroup+" required for Patient: "+patientName);
	}
	public void reject() {
		System.out.println("We need "+noOfUnits+" Units of blood group "+bloodGroup+" required for Patient: "+patientName);
	}
}
