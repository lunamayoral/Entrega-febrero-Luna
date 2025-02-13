package es.uah.matcomp.mp.el1.eja.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem invoiceItem = new InvoiceItem("555", "20", 50, 10.0);
        assertEquals("555", invoiceItem.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem invoiceItem = new InvoiceItem("555", "20", 50, 10.0);
        assertEquals("20", invoiceItem.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem invoiceItem = new InvoiceItem("555", "20", 50, 10.0);
        assertEquals(50, invoiceItem.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem invoiceItem = new InvoiceItem("555", "20", 50, 10.0);
        invoiceItem.setQty(10);
        assertEquals(10, invoiceItem.getQty());
    }

    @Test
    void getUnitPrice() {
        InvoiceItem invoiceItem = new InvoiceItem("555", "20", 50, 10.0);
        assertEquals(10.0, invoiceItem.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem invoiceItem = new InvoiceItem("555", "20", 50, 10.0);
        invoiceItem.setUnitPrice(15.0);
        assertEquals(15.0, invoiceItem.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem invoiceItem = new InvoiceItem("555", "20", 50, 10.0);
        assertEquals(500.0, invoiceItem.getTotal()); // 50 * 10.0 = 500.0
    }

    @Test
    void testToString() {
        InvoiceItem invoiceItem = new InvoiceItem("555", "20", 50, 10.0);
        String expectedString = "InvoiceItem[id=555,desc=20,qty=50,unitPrice=10.0]";
        assertEquals(expectedString, invoiceItem.toString());
    }
}