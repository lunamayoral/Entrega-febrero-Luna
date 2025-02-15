package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle circle = new MyCircle();
        assertEquals(1, circle.getRadius());
        MyCircle circle2 = new MyCircle(3,4,5);
        assertEquals(5, circle2.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle circle = new MyCircle(0,2,3);
        circle.setRadius(5);
        assertEquals(5, circle.getRadius());
    }

    @Test
    void getCenter() {
        MyPoint center = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center,5);
        assertEquals(center, circle.getCenter());
    }

    @Test
    void setCenter() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        MyPoint center2 = new MyPoint(2,1);
        circle.setCenter(center2);
        assertEquals(center2, circle.getCenter());
    }

    @Test
    void getCenterX() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        assertEquals(center1.getX(), circle.getCenter().getX());
    }

    @Test
    void setCenterX() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        circle.setCenterX(2);
        assertEquals(center1.getX(), circle.getCenter().getX());
    }

    @Test
    void getCenterY() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        assertEquals(center1.getY(), circle.getCenter().getY());
    }

    @Test
    void setCenterY() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        circle.setCenterY(2);
        assertEquals(center1.getY(), circle.getCenter().getY());
    }

    @Test
    void getCenterXY() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        assertArrayEquals(center1.getXY(), circle.getCenter().getXY());
    }

    @Test
    void setCenterXY() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        circle.setCenterXY(2,2);
        assertArrayEquals(center1.getXY(), circle.getCenter().getXY());
    }

    @Test
    void testToString() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        assertEquals("MyCircle[radius=5,center=(1, 1)]", circle.toString());
    }

    @Test
    void getArea() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        assertEquals(5 * 5 * Math.PI, circle.getArea());
    }

    @Test
    void getCircumference() {
        MyPoint center1 = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center1,5);
        assertEquals(5 * 2 * Math.PI, circle.getCircumference());
    }

    @Test
    void distance() {
        MyPoint center1 = new MyPoint(5,4);
        MyCircle circle = new MyCircle(center1,5);
        MyPoint center2 = new MyPoint(2,0);
        MyCircle circle2 = new MyCircle(center2,5);
        assertEquals(5.0, circle.distance(circle2));

    }
}