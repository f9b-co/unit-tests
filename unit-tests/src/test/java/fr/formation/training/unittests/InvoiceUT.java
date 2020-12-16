package fr.formation.training.unittests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class InvoiceUT {

    @Test
    void should_create_invoice_with_non_null_invoiceNumber_and_past_or_present_date() {
        Invoice actual = new Invoice("001", LocalDate.now());
        assertNotNull(actual);
    }

    @Test
    void should_throw_null_pointer_with_null_invoiceNumber() {
        assertThrows(NullPointerException.class, () -> new Invoice(null, LocalDate.now()));
    }

    @Test
    void should_throw_null_pointer_with_null_date() {
        assertThrows(NullPointerException.class, () -> new Invoice("001", null));
    }

    @Test
    void should_throw_illegal_argument_with_future_date() {
        assertThrows(IllegalArgumentException.class, () -> new Invoice("001", LocalDate.MAX));
    }

    @Test
    void should_not_get_null_attributes_from_invoice_created_with_legal_arguments() {
        Invoice invoice = new Invoice("001", LocalDate.now());
        boolean existNullAttributes = false;
        if (invoice.getInvoiceNumber() == null || invoice.getDate() == null) {
                existNullAttributes = true;
            }
        assertFalse(existNullAttributes);
    }

}
