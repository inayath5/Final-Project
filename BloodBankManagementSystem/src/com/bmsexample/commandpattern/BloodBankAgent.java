package com.bmsexample.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class BloodBankAgent {

	private List<BloodTransportation> orderList = new ArrayList<BloodTransportation>(); 

	   public void takeUnitsOrder(BloodTransportation order){
	      orderList.add(order);		
	   }

	   public void placeUnitOrders(){
	   
	      for (BloodTransportation order : orderList) {
	         order.deliver();
	      }
	      orderList.clear();
	   }
}
