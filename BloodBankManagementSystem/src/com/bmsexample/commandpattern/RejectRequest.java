package com.bmsexample.commandpattern;

public class RejectRequest implements BloodTransportation{

	HospitalRequest hr;
	public RejectRequest(HospitalRequest hr) {
		this.hr = hr;
	}
	
	@Override
	public void deliver() {
		hr.reject();
		
	}

}
