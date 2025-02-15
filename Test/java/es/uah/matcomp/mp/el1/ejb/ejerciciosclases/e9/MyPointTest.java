package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint myPoint = new MyPoint();
        assertEquals(0, myPoint.getX());
        MyPoint myPoint2 = new MyPoint(5,6);
        assertEquals(5, myPoint2.getX());
    }

    @Test
    void setX() {
        MyPoint myPoint = new MyPoint(8,7);
        myPoint.setX(5);
        assertEquals(5, myPoint.getX());
    }

    @Test
    void getY() {
        MyPoint myPoint = new MyPoint(8,7);
        assertEquals(7, myPoint.getY());
        MyPoint myPoint2 = new MyPoint();
        assertEquals(0, myPoint2.getY());
    }

    @Test
    void setY() {
        MyPoint myPoint = new MyPoint(8,7);
        myPoint.setY(5);
        assertEquals(5, myPoint.getY());
    }

    @Test
    void getXY() {
        MyPoint myPoint = new MyPoint(8, 7);
        assertArrayEquals(new int[]{8, 7}, myPoint.getXY());
    }

    @Test
    void setXY() {
        MyPoint myPoint = new MyPoint(8,7);
        myPoint.setXY(5,6);
        assertArrayEquals(new int[]{5, 6}, myPoint.getXY());
    }

    @Test
    void testToString() {
        MyPoint myPoint = new MyPoint(8,7);
        assertEquals("(8, 7)", myPoint.toString());
    }

    @Test
    void distance() {
        MyPoint myPoint = new MyPoint(3,4);
        assertEquals(5.0, myPoint.distance(0,0));
    }

    @Test
    void testDistance() {
        MyPoint myPoint = new MyPoint(3,4);
        MyPoint myPoint2 = new MyPoint(0,0);
        assertEquals(5.0, myPoint.distance(myPoint2));
    }

    @Test
    void testDistance1() {
        MyPoint myPoint = new MyPoint(3,4);
        assertEquals(5.0, myPoint.distance());
    }
}

