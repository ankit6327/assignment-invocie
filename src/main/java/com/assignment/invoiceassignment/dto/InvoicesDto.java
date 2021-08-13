package com.assignment.invoiceassignment.dto;

import java.util.List;

/**
 * 
 * This {@link InvoicesDto} having list of {@link InvoiceDto}, if in future we
 * wanted to add some more parameters in this response, we can able to add as
 * this is a object
 * 
 *
 */
public class InvoicesDto {

	List<InvoiceDto> invoices;

	public List<InvoiceDto> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<InvoiceDto> invoices) {
		this.invoices = invoices;
	}

}
