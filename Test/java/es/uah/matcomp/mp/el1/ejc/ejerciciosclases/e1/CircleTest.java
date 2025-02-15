package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle1 = new Circle();
        assertEquals(1.0, circle1.getRadius());
        Circle circle2 = new Circle(5.0);
        assertEquals(5.0, circle2.getRadius());
    }

    @Test
    void getArea() {
        Circle circle1 = new Circle(3.0);
        assertEquals(9.0 * Math.PI, circle1.getArea());
    }

    @Test
    void getColor() {
        Circle circle1 = new Circle(3.0);
        assertEquals("red", circle1.getColor());
        Circle circle2 = new Circle(5.0,"white");
        assertEquals("white", circle2.getColor());
    }

    @Test
    void setRadius() {
        Circle circle1 = new Circle(3.0);
        circle1.setRadius(5.0);
        assertEquals(5.0, circle1.getRadius());
    }

    @Test
    void setColor() {
        Circle circle1 = new Circle(3.0, "green");
        circle1.setColor("blue");
        assertEquals("blue", circle1.getColor());
    }

    @Test
    void testToString() {
        Circle circle1 = new Circle(3.0, "pink");
        assertEquals("es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle[radius=3.0 color=pink]", circle1.toString());
    }
}