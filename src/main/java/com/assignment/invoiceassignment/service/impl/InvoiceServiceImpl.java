package com.assignment.invoiceassignment.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.invoiceassignment.dto.InvoiceDto;
import com.assignment.invoiceassignment.dto.InvoicesDto;
import com.assignment.invoiceassignment.dto.LineItemDto;
import com.assignment.invoiceassignment.model.Invoice;
import com.assignment.invoiceassignment.model.LineItem;
import com.assignment.invoiceassignment.repo.InvoiceRepo;
import com.assignment.invoiceassignment.service.InvoiceService;

/**
 * All the logic related to invoices are in this class.
 *
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepo invoiceRepo;

	/**
	 * Save invoice
	 */
	public void addInvoice(InvoiceDto invoiceDto) {
		Invoice invoice = createDtoToEntity(invoiceDto);
		invoiceRepo.save(invoice);
	}

	/**
	 * Find all invoices.
	 */
	public InvoicesDto viewAllInvoices() {
		InvoicesDto dto = new InvoicesDto();
		List<InvoiceDto> dtos = new ArrayList<>();
		Iterable<Invoice> invoices = invoiceRepo.findAll();
		for (Invoice invoice : invoices) {
			dtos.add(new InvoiceDto(invoice));
		}
		dto.setInvoices(dtos);
		return dto;
	}

	/**
	 * Find as per the invoice id
	 */
	public InvoiceDto viewInvoice(long invoiceId) {
		Optional<Invoice> invoice = invoiceRepo.findById(invoiceId);
		InvoiceDto invoiceDto = null;
		if (invoice.isPresent()) {
			invoiceDto = new InvoiceDto(invoice.get());
		}
		return invoiceDto;
	}

	/**
	 * 
	 * Convert {@link InvoiceDto} object to {@link Invoice}
	 * 
	 * @param invoiceDto
	 * @return
	 */
	private Invoice createDtoToEntity(InvoiceDto invoiceDto) {
		Invoice invoice = new Invoice();
		invoice.setClient(invoiceDto.getClient());
		invoice.setInvoiceId(invoiceDto.getId());
		invoice.setInvoiceDate(new Date());
		invoice.setVarRate(invoiceDto.getVarRate());
		List<LineItem> lineItems = new ArrayList<LineItem>();
		for (LineItemDto lineItemDto : invoiceDto.getLineItems()) {
			LineItem item = createLineItemDtoToLineItem(lineItemDto);
			item.setInvoice(invoice);
			lineItems.add(item);
		}
		invoice.setItems(lineItems);
		return invoice;
	}

	private LineItem createLineItemDtoToLineItem(LineItemDto lineItemDto) {
		LineItem item = new LineItem();
		item.setDescription(lineItemDto.getDescription());
		item.setQuantity(lineItemDto.getQuantity());
		item.setUnitPrice(lineItemDto.getUnitPrice());
		return item;
	}

}
