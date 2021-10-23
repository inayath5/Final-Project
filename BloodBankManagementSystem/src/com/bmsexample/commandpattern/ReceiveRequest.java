package com.bmsexample.commandpattern;

public class ReceiveRequest implements BloodTransportation{

	HospitalRequest hr;
	public ReceiveRequest(HospitalRequest hr) {
		this.hr = hr;
	}
	
	@Override
	public void deliver() {
		hr.receive();
		
	}

}
