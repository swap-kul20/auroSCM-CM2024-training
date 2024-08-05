package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.model.Invoice;
import com.techlabs.srp.solution.model.InvoicePrinter;
import com.techlabs.srp.solution.model.TaxCalculator;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice=new Invoice(1,"Mobile Phone",15000,10);
		
		TaxCalculator taxCalculator=new TaxCalculator(invoice);
		
		InvoicePrinter printer=new InvoicePrinter(invoice, taxCalculator);
		
		printer.print();
      

	}

}
