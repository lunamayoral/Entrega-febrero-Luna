package es.uah.matcomp.mp.el1.eja.ejerciciosclases.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date date = new Date(14,2,2025);
        assertEquals(14, date.getDay());
    }

    @Test
    void getMonth() {
        Date date = new Date(14,2,2025);
        assertEquals(2, date.getMonth());
    }

    @Test
    void getYear() {
        Date date = new Date(14,2,2025);
        assertEquals(2025, date.getYear());
    }

    @Test
    void setDay() {
        Date date = new Date(14,2,2025);
        date.setDay(15);
        assertEquals(15, date.getDay());
    }

    @Test
    void setMonth() {
        Date date = new Date(14,2,2025);
        date.setMonth(8);
        assertEquals(8, date.getMonth());
    }

    @Test
    void setYear() {
        Date date = new Date(14,2,2025);
        date.setYear(2019);
        assertEquals(2019, date.getYear());
    }

    @Test
    void setDate() {
        Date date = new Date(14,2,2025);
        date.setDate(15,8,2019);
        assertEquals(15, date.getDay());
        assertEquals(8, date.getMonth());
        assertEquals(2019, date.getYear());
    }

    @Test
    void testToString() {
        Date date = new Date(14,2,2025);
        assertEquals("14/02/2025", date.toString());
    }
}