package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape shape1 = new Shape();
        assertEquals("red", shape1.getColor());
        Shape shape2 = new Shape("blue", true);
        assertEquals("blue", shape2.getColor());
    }

    @Test
    void setColor() {
        Shape shape2 = new Shape("blue", true);
        shape2.setColor("green");
        assertEquals("green", shape2.getColor());

    }

    @Test
    void isFilled() {
        Shape shape1 = new Shape();
        assertTrue(shape1.isFilled());
    }

    @Test
    void setFilled() {
        Shape shape2 = new Shape("blue", true);
        shape2.setFilled(false);
        assertFalse(shape2.isFilled());

    }

    @Test
    void testToString() {
        Shape shape2 = new Shape("blue", true);
        assertEquals("Shape [color=blue, filled=true]", shape2.toString());
    }
}