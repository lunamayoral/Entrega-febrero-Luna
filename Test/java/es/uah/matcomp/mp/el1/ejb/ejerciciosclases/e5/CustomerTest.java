package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(226, "Roberto Pascual", 'm');
        assertEquals(226, customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(226, "Roberto Pascual", 'm');
        assertEquals("Roberto Pascual", customer.getName());
    }

    @Test
    void getGender() {
        Customer customer = new Customer(226, "Roberto Pascual", 'm');
        assertEquals('m', customer.getGender());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(226, "Roberto Pascual", 'm');
        assertEquals("Roberto Pascual(226)", customer.toString());
    }
}