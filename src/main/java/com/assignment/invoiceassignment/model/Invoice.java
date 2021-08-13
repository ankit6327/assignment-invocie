package com.assignment.invoiceassignment.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Class hold all the invoice related column.
 *
 */
@Entity
@Table(name = "Invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "invoice_id")
	private long invoiceId;

	@Column
	private String client;

	@Column
	private Long varRate;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date invoiceDate;

	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "INVOICE_ID")
	private List<LineItem> items;

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Long getVarRate() {
		return varRate;
	}

	public void setVarRate(Long varRate) {
		this.varRate = varRate;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

}
