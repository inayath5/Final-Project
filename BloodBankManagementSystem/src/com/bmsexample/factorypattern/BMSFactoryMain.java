package com.bmsexample.factorypattern;

public class BMSFactoryMain {

	public static void main(String[] args) {
		BloodBank bb = new BloodBank();

	  HospitalMgmt h1 = bb.getBloodGroup("A+ve");
    
	  h1.getBloodGroup();
	      
      HospitalMgmt h2 = bb.getBloodGroup("AB+ve");
	    
      h2.getBloodGroup();
	      
      HospitalMgmt h3 = bb.getBloodGroup("B+ve");
	       
      h3.getBloodGroup();

	}

}
