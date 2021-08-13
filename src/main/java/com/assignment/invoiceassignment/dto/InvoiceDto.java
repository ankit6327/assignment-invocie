package com.assignment.invoiceassignment.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.assignment.invoiceassignment.model.Invoice;
import com.assignment.invoiceassignment.model.LineItem;

/**
 * {@link InvoiceDto}
 *
 */
public class InvoiceDto {

	private long id;

	private String client;

	private long varRate;

	private Date invoiceDate;

	private List<LineItemDto> lineItems;

	/**
	 * Default constructor
	 */
	public InvoiceDto() {

	}

	/**
	 * 
	 * Constructor for convert {@link Invoice} object to {@link InvoiceDto}
	 * 
	 * @param invoice
	 */
	public InvoiceDto(Invoice invoice) {
		this.id = invoice.getInvoiceId();
		this.client = invoice.getClient();
		this.varRate = invoice.getVarRate();
		this.invoiceDate = invoice.getInvoiceDate();
		List<LineItemDto> items = createLineItemToDto(invoice);
		this.lineItems = items;
	}

	private List<LineItemDto> createLineItemToDto(Invoice invoice) {
		List<LineItemDto> items = new ArrayList<LineItemDto>();

		for (LineItem lineItem : invoice.getItems()) {
			LineItemDto dto = new LineItemDto(lineItem);
			items.add(dto);
		}
		return items;
	}

	public List<LineItemDto> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItemDto> lineItems) {
		this.lineItems = lineItems;
	}

	public void setVarRate(long varRate) {
		this.varRate = varRate;
	}

	/**
	 * @return
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getClient() {
		return client;
	}

	/**
	 * @param client
	 */
	public void setClient(String client) {
		this.client = client;
	}

	/**
	 * @return
	 */
	public Long getVarRate() {
		return varRate;
	}

	/**
	 * @param varRate
	 */
	public void setVarRate(Long varRate) {
		this.varRate = varRate;
	}

	/**
	 * @return
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

}
