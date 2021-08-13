package com.assignment.invoiceassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.invoiceassignment.dto.InvoiceDto;
import com.assignment.invoiceassignment.dto.InvoicesDto;
import com.assignment.invoiceassignment.service.InvoiceService;

/**
 * {@link InvoiceController} class having all end points related to invoice
 *
 */
@RestController
public class InvoiceController {

	@Autowired
	public InvoiceService invoiceService;

	/**
	 * This method is for to add new invoices.
	 * 
	 * @param invoiceDto
	 * @return
	 */
	@PostMapping("/invoice")
	public ResponseEntity<String> getInvoice(@RequestBody InvoiceDto invoiceDto) {
		invoiceService.addInvoice(invoiceDto);
		return new ResponseEntity<String>("Updated successfully", HttpStatus.OK);

	}

	/**
	 * This method is to fetch all invoices available in system
	 * 
	 * @return
	 */
	@GetMapping("/invoices")
	public ResponseEntity<InvoicesDto> getInvoices() {
		InvoicesDto invoiceDtos = invoiceService.viewAllInvoices();
		return new ResponseEntity<InvoicesDto>(invoiceDtos, HttpStatus.OK);

	}

	/**
	 * This method is to fetch invoice as per the id from system.
	 * 
	 * @param invoiceId
	 * @return
	 */
	@GetMapping("/invoices/{invoiceId}")
	public ResponseEntity<InvoiceDto> getInvoiceById(@PathVariable("invoiceId") Long invoiceId) {
		InvoiceDto invoiceDto = invoiceService.viewInvoice(invoiceId);
		return new ResponseEntity<InvoiceDto>(invoiceDto, HttpStatus.OK);

	}

}
