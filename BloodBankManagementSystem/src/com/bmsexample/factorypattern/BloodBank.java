package com.bmsexample.factorypattern;

public class BloodBank {

	public HospitalMgmt getBloodGroup(String bloodType){
	      if(bloodType == null){
	         return null;
	      }		
	      if(bloodType.equalsIgnoreCase("A+ve")){
	         return new APositveGroup();
	         
	      } else if(bloodType.equalsIgnoreCase("AB+ve")){
	         return new ABPositveGroup();
	         
	      } else if(bloodType.equalsIgnoreCase("B+ve")){
	         return new BPositveGroup();
	      }
	      
	      return null;
	   }
}
