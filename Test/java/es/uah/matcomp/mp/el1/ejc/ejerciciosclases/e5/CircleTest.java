package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle1 = new Circle();
        assertEquals(1.0, circle1.getRadius());
        Circle circle2 = new Circle(2.0);
        assertEquals(2.0, circle2.getRadius());
        Circle circle3 = new Circle(3.0, "blue", true);
        assertEquals(3.0, circle3.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle1 = new Circle(4.0);
        circle1.setRadius(5.0);
        assertEquals(5.0, circle1.getRadius());
    }

    @Test
    void getArea() {
        Circle circle1 = new Circle(3.0);
        assertEquals(9.0 * Math.PI, circle1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle circle1 = new Circle(3.0);
        assertEquals(6.0 * Math.PI, circle1.getPerimeter());
    }

    @Test
    void testToString() {
        Circle circle1 = new Circle(3.0);
        assertEquals("Circle: subclass of Shape [color=red, filled=true] radius: 3.0", circle1.toString());
    }
}