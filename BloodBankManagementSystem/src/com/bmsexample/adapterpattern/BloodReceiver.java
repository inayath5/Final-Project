package com.bmsexample.adapterpattern;

public class BloodReceiver implements BloodDonRec{

	@Override
	public void bloodDonor(String patientName) {
	
		
	}

	@Override
	public void bloodReceiver(String patientName) {
		System.out.println("A-ve Blood requied for Patient: "+patientName);
		
	}

	

}
