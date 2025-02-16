package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle1 = new Rectangle();
        assertEquals(1.0, rectangle1.getWidth());
        Rectangle rectangle2 = new Rectangle(3.0,4.0);
        assertEquals(3.0, rectangle2.getWidth());
        Rectangle rectangle3 = new Rectangle(4.0,5.0,"red",true);
        assertEquals(4.0, rectangle3.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(5.0);
        assertEquals(5.0, rectangle1.getWidth());
    }

    @Test
    void getLength() {
        Rectangle rectangle1 = new Rectangle();
        assertEquals(1.0, rectangle1.getLength());
    }

    @Test
    void setLength() {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(5.0);
        assertEquals(5.0, rectangle1.getLength());
    }

    @Test
    void getArea() {
        Rectangle rectangle1 = new Rectangle(4.0,3.0);
        assertEquals(12.0, rectangle1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle1 = new Rectangle(4.0,3.0);
        assertEquals(14.0, rectangle1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle1 = new Rectangle(4.0,3.0);
        assertEquals("Rectangle: subclass of Shape [color=red, filled=true] width: 4.0 length: 3.0", rectangle1.toString());
    }
}