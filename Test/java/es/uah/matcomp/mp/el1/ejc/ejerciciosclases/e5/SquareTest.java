package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square1 = new Square();
        assertEquals(1.0, square1.getSide());
        Square square2 = new Square(3.0);
        assertEquals(3.0, square2.getSide());
        Square square3 = new Square(4.0, "green", true);
        assertEquals(4.0, square3.getSide());
    }

    @Test
    void setSide() {
        Square square1 = new Square();
        square1.setSide(4.0);
        assertEquals(4.0, square1.getSide());
    }

    @Test
    void setWidth() {
        Square square1 = new Square();
        square1.setWidth(3.0);
        assertEquals(3.0, square1.getWidth());
    }

    @Test
    void setLength() {
        Square square1 = new Square();
        square1.setLength(3.0);
        assertEquals(3.0, square1.getLength());
    }

    @Test
    void testToString() {
        Square square1 = new Square(3.0);
        assertEquals("Square: subclass of Rectangle: subclass of Shape [color=red, filled=true] " +
                "width: 3.0 length: 3.0 width 3.0 length 3.0", square1.toString());
    }
}