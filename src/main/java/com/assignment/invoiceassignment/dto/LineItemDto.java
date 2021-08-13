package com.assignment.invoiceassignment.dto;

import java.math.BigDecimal;

import com.assignment.invoiceassignment.model.Invoice;
import com.assignment.invoiceassignment.model.LineItem;

public class LineItemDto {

	private Long id;

	private Invoice invoice;

	private Long quantity;

	private String description;

	private BigDecimal unitPrice;

	public LineItemDto() {
	}

	public LineItemDto(LineItem lineItem) {
		this.id = lineItem.getId();
		this.quantity = lineItem.getQuantity();
		this.description = lineItem.getDescription();
		this.unitPrice = lineItem.getUnitPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}
