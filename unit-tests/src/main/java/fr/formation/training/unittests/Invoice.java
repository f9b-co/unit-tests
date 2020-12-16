package fr.formation.training.unittests;

import java.time.LocalDate;

public class Invoice {

    private String invoiceNumber;

    private LocalDate date;

    public Invoice(String invoiceNumber, LocalDate date) {
	setInvoiceNumber(invoiceNumber);
	setDate(date);
    }

    private void setInvoiceNumber(String invoiceNumber) {
	if (invoiceNumber == null) {
	    throw new NullPointerException();
	}
	this.invoiceNumber = invoiceNumber;
    }

    private void setDate(LocalDate date) {
	if (date == null) {
	    throw new NullPointerException();
	}
	if (date.isAfter(LocalDate.now())) {
	    throw new IllegalArgumentException();
	}
	this.date = date;
    }

    public String getInvoiceNumber() {
	return invoiceNumber;
    }

    public LocalDate getDate() {
	return date;
    }
}
