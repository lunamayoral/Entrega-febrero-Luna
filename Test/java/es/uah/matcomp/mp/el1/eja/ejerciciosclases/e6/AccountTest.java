package es.uah.matcomp.mp.el1.eja.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account c = new Account("xxx","888");
        String testid = c.getId();
        assertEquals("xxx",testid);
    }

    @Test
    void getName() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void credit() {
    }

    @Test
    void debit() {
    }

    @Test
    void transferTo() {
    }

    @Test
    void testToString() {
    }
}