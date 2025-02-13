package es.uah.matcomp.mp.el1.eja.ejerciciosclases.e8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time = new Time(16,58,25);
        assertEquals(16, time.getHour());
    }

    @Test
    void getMinute() {
        Time time = new Time(16,58,25);
        assertEquals(58, time.getMinute());
    }

    @Test
    void getSecond() {
        Time time = new Time(16,58,25);
        assertEquals(25, time.getSecond());
    }

    @Test
    void setHour() {
        Time time = new Time(16,58,25);
        time.setHour(12);
        assertEquals(12, time.getHour());
    }

    @Test
    void setMinute() {
        Time time = new Time(16,58,25);
        time.setMinute(25);
        assertEquals(25, time.getMinute());
    }

    @Test
    void setSecond() {
        Time time = new Time(16,58,25);
        time.setSecond(25);
        assertEquals(25, time.getSecond());
    }

    @Test
    void setTime() {
        Time time = new Time(16,58,25);
        time.setTime(22,22,22);
        assertEquals(22,time.getHour());
        assertEquals(22,time.getMinute());
        assertEquals(22,time.getSecond());
    }

    @Test
    void testToString() {
        Time time = new Time(22,6,22);
        assertEquals("22:06:22", time.toString());
    }

    @Test
    void nextSecond() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());
    }

    @Test
    void previousSecond() {
        Time time = new Time(0, 0, 0);
        time.previousSecond();
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());

    }
}