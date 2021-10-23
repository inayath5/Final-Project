package com.bmsexample.commandpattern;



public class BMSCommandMain {

	public static void main(String[] args) {
		HospitalRequest h1 = new HospitalRequest("Mark",4,"A+ve");
		HospitalRequest h2 = new HospitalRequest("Jack",2,"B+ve");
		HospitalRequest h3 = new HospitalRequest("Peter",2,"AB-ve");

		ReceiveRequest r1 = new ReceiveRequest(h1);
		ReceiveRequest r2 = new ReceiveRequest(h2);
		ReceiveRequest r3 = new ReceiveRequest(h3);
		RejectRequest rs1 = new RejectRequest(h1);
		RejectRequest rs2 = new RejectRequest(h2);

		BloodBankAgent broker = new BloodBankAgent();
	      broker.takeUnitsOrder(r1);
	      broker.takeUnitsOrder(r2);
	      broker.takeUnitsOrder(r3);
	      broker.takeUnitsOrder(rs1);
	      broker.takeUnitsOrder(rs2);

	      broker.placeUnitOrders();
		

	}

}
