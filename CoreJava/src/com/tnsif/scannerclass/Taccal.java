package com.tnsif.scannerclass;

public class Taccal {
	public void calculatetax(Person p) {
		if(p.getIncome()<=1600) {
			p.setTax(0);
		}
		else if(p.getIncome()>1600&&p.getIncome()<30000) {
			p.setTax(5);
			
		}
		else {
			p.setTax(10);
		}
	}

}
