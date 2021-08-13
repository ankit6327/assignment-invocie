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

	List<InvoiceDto> invoiceDtos;

	/**
	 * @return
	 */
	public List<InvoiceDto> getInvoiceDtos() {
		return invoiceDtos;
	}

	/**
	 * @param invoiceDtos
	 */
	public void setInvoiceDtos(List<InvoiceDto> invoiceDtos) {
		this.invoiceDtos = invoiceDtos;
	}

}
