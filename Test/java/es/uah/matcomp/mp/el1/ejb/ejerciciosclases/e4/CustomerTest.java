package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        assertEquals(0350, customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        assertEquals("Emma Mayoral", customer.getName());
    }

    @Test
    void getDiscount() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        assertEquals(60, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer customer = new Customer(0350,"Emma Mayoral", 60);
        customer.setDiscount(70);
        assertEquals(70, customer.getDiscount());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(222,"Emma Mayoral", 60);
        assertEquals("Emma Mayoral(222)(60%)", customer.toString());
    }
}