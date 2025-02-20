package es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricObjectTest {

    @Test
    void getArea() {
        GeometricObject circle = new Circle(5.0);
        assertEquals(5.0 * 5.0 * Math.PI, circle.getArea());
    }

    @Test
    void getPerimeter() {
        GeometricObject circle = new Circle(5.0);
        assertEquals(10.0 * Math.PI, circle.getPerimeter());
    }
}