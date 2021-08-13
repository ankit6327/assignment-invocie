package com.assignment.invoiceassignment.service;

import com.assignment.invoiceassignment.dto.InvoiceDto;
import com.assignment.invoiceassignment.dto.InvoicesDto;

public interface InvoiceService {

	public void addInvoice(InvoiceDto invoiceDto);

	public InvoiceDto viewInvoice(long invoiceId);

	public InvoicesDto viewAllInvoices();

}
