package com.bmsexample.facadepattern;

public class BloodBank {

	private HospitalMgmt Apositive;
	private HospitalMgmt ABpositive;
	private HospitalMgmt Bpositive;

	public BloodBank() {
		ABpositive = new ABPositveGroup();
		Apositive = new APositveGroup();
		Bpositive = new BPositveGroup();
	}

	public void orderApositive() {
		Apositive.getBloodGroup();
	}

	public void orderABpositive() {
		ABpositive.getBloodGroup();
	}

	public void orderBpositive() {
		Bpositive.getBloodGroup();
	}
}
