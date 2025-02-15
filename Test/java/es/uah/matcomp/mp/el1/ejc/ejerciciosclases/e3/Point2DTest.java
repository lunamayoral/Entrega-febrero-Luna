package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p1 = new Point2D();
        assertEquals(0.0f, p1.getX());
        Point2D p2 = new Point2D(3.0f, 4.0f);
        assertEquals(3.0f, p2.getX());
    }

    @Test
    void setX() {
        Point2D p1 = new Point2D(3.0f, 4.0f);
        p1.setX(20.0f);
        assertEquals(20.0f, p1.getX());
    }

    @Test
    void getY() {
        Point2D p1 = new Point2D();
        assertEquals(0.0f, p1.getY());
    }

    @Test
    void setY() {
        Point2D p1 = new Point2D(3.0f, 4.0f);
        p1.setY(20.0f);
        assertEquals(20.0f, p1.getY());
    }

    @Test
    void setXY() {
        Point2D p1 = new Point2D(3.0f, 4.0f);
        p1.setXY(18.0f, 2.0f);
        assertEquals(18.0f, p1.getX());
        assertEquals(2.0f, p1.getY());
    }

    @Test
    void getXY() {
        Point2D p1 = new Point2D(3.0f, 4.0f);
        assertArrayEquals(new float[]{3.0f, 4.0f}, p1.getXY());
    }

    @Test
    void testToString() {
        Point2D p1 = new Point2D(3.0f, 4.0f);
        assertEquals("(3.0, 4.0)", p1.toString());
    }
}