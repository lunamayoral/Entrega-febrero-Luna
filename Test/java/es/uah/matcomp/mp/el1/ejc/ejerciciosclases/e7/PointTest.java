package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testToString() {
        Point p1 = new Point(1, 2);
        assertEquals("Point: (1,2)", p1.toString());
    }

    @Test
    void getX() {
        Point p1 = new Point(1, 2);
        assertEquals(1, p1.getX());
    }

    @Test
    void getY() {
        Point p1 = new Point(1, 2);
        assertEquals(2, p1.getY());
    }

    @Test
    void setX() {
        Point p1 = new Point(1, 2);
        p1.setX(2);
        assertEquals(2, p1.getX());
    }

    @Test
    void setY() {
        Point p1 = new Point(1, 2);
        p1.setY(4);
        assertEquals(4, p1.getY());
    }

    @Test
    void setXY() {
        Point p1 = new Point(1, 2);
        p1.setXY(2, 4);
        assertEquals(2, p1.getX());
        assertEquals(4, p1.getY());
    }
}