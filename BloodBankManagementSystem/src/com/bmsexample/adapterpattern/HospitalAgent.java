package com.bmsexample.adapterpattern;

public class HospitalAgent implements BloodGroupStock{

	BloodBankAgentAdapter bladapter;

	@Override
	public void getBloodStockDetails(String bloodGrp, String patientName) {
		
		if(bloodGrp.equalsIgnoreCase("A+ve")){
	         System.out.println("BloodGroup: "+bloodGrp+" received for Patient: " + patientName);			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(bloodGrp.equalsIgnoreCase("A+ve") || bloodGrp.equalsIgnoreCase("B+ve")){
	    	  bladapter = new BloodBankAgentAdapter(bloodGrp);
	    	  bladapter.getBloodStockDetails(bloodGrp, patientName);
	      }
	      
	      else{
	         System.out.println("Invalid blood group " + bloodGrp);
	      }
		
	}
	
}
