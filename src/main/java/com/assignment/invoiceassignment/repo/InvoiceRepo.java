package com.assignment.invoiceassignment.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.invoiceassignment.model.Invoice;

@Repository
public interface InvoiceRepo extends CrudRepository<Invoice, Long> {

}
