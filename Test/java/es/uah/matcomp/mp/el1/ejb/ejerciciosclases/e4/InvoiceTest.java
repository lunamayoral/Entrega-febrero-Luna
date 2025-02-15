package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,65.5);
        assertEquals(222, invoice.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,65.5);
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer customer1 = new Customer(0350,"Emma Mayoral", 60);
        Customer customer2 = new Customer(0361,"Coral Mayoral", 80);
        Invoice invoice = new Invoice(222, customer1,65.5);
        invoice.setCustomer(customer2);
        assertEquals(customer2, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,65.5);
        assertEquals(65.5, invoice.getAmount());
    }

    @Test
    void setAmount() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,65.5);
        invoice.setAmount(75.5);
        assertEquals(75.5, invoice.getAmount());
    }

    @Test
    void getCustomerId() {
        Customer customer = new Customer(350,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,65.5);
        assertEquals(350, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,65.5);
        assertEquals("Emma Mayoral", invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,65.5);
        assertEquals(60, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,80);
        assertEquals(32, invoice.getAmountAfterDiscount());

    }

    @Test
    void testToString() {
        Customer customer = new Customer(555,"Emma Mayoral", 60);
        Invoice invoice = new Invoice(222, customer,65.5);
        assertEquals("Invoice [id=222, customer=Emma Mayoral(555)(60%), amount=65.5]", invoice.toString());
    }
}