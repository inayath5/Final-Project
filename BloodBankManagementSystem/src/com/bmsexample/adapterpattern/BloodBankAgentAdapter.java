package com.bmsexample.adapterpattern;

public class BloodBankAgentAdapter implements BloodGroupStock {

	BloodDonRec bd;
	
	public BloodBankAgentAdapter(String bloodGrp) {
		
		if(bloodGrp.equalsIgnoreCase("A+ve")) {
			bd = new BloodDonor();
		}else if(bloodGrp.equalsIgnoreCase("B+ve")) {
			bd = new BloodReceiver();
		}
	}
	
	@Override
	public void getBloodStockDetails(String bloodGrp, String patientName) {
		
		if(bloodGrp.equalsIgnoreCase("A+ve")) {
			bd.bloodDonor(patientName);
		}else if(bloodGrp.equalsIgnoreCase("B+ve")) {
			bd.bloodReceiver(patientName);
		}
	}

}
