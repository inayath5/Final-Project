package com.bmsexample.adapterpattern;


public class BMSAdapterMain {

	public static void main(String[] args) {
		HospitalAgent st = new HospitalAgent();

		st.getBloodStockDetails("A+ve", "Hari");
		st.getBloodStockDetails("B+ve", "Vishwa");
		st.getBloodStockDetails("A+ve", "Ram");
		st.getBloodStockDetails("D", "Shankar");

	}

}
