package com.bmsexample.adapterpattern;

public class BloodDonor implements BloodDonRec{

	@Override
	public void bloodDonor(String patientName) {
		System.out.println("A+ve Blood donated by: "+patientName);
		
	}

	@Override
	public void bloodReceiver(String patientName) {
		
		
	}

	

}
