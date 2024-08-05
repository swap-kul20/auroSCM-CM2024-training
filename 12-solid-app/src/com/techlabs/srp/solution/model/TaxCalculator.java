package com.techlabs.srp.solution.model;

public class TaxCalculator {
	
	private Invoice invoice;
	
	
	
	public TaxCalculator(Invoice invoice) {
		super();
		this.invoice = invoice;
	}



	public double calculateTax()
	{
		return invoice.getAmount() * invoice.getTax()/100;
	}

}
