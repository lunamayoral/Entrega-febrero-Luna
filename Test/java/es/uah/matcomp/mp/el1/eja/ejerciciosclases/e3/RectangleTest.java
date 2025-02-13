package es.uah.matcomp.mp.el1.eja.ejerciciosclases.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(2.0f,3.0f);
        assertEquals(2.0f, rectangle.getLength());
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5.0f);
        assertEquals(5.0f,rectangle.getLength());
    }

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(2.0f, 3.0f);
        assertEquals(3.0f, rectangle.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5.0f);
        assertEquals(5.0f, rectangle.getWidth());
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(2.0f, 3.0f);
        double expectedArea = 2.0f * 3.0f;
        assertEquals(expectedArea, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(2.0f, 3.0f);
        double expectedPerimeter = 2 * (2.0f + 3.0f);
        assertEquals(expectedPerimeter, rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        String expectedString = "Rectangle [length=5.0, width=3.0]";
        assertEquals(expectedString, rectangle.toString());
    }
}