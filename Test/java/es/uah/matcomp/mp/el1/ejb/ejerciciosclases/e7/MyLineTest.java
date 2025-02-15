package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        assertEquals(begin, line1.getBegin());
    }

    @Test
    void setBegin() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        MyPoint newBegin = new MyPoint(3, 0);
        line1.setBegin(newBegin);
        assertEquals(newBegin, line1.getBegin());
    }

    @Test
    void getEnd() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        assertEquals(end, line1.getEnd());
    }

    @Test
    void setEnd() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        MyPoint newEnd = new MyPoint(3, 0);
        line1.setEnd(newEnd);
        assertEquals(newEnd, line1.getEnd());
    }

    @Test
    void getBeginX() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        assertEquals(begin.getX(), line1.getBeginX());
        MyLine line2 = new MyLine(1,2,3,4);
        assertEquals(1, line2.getBeginX());
    }

    @Test
    void setBeginX() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        line1.setBeginX(3);
        assertEquals(3, line1.getBeginX());
    }

    @Test
    void getBeginY() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        assertEquals(begin.getY(), line1.getBeginY());
    }

    @Test
    void setBeginY() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        line1.setBeginY(3);
        assertEquals(3, line1.getBeginY());
    }

    @Test
    void getEndX() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        assertEquals(end.getX(), line1.getEndX());
    }

    @Test
    void setEndX() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        line1.setEndX(3);
        assertEquals(3, line1.getEndX());
    }

    @Test
    void getEndY() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        assertEquals(end.getY(), line1.getEndY());
    }

    @Test
    void setEndY() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        line1.setEndY(3);
        assertEquals(3, line1.getEndY());
    }

    @Test
    void getBeginXY() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        assertArrayEquals(new int[]{0, 0}, line1.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        line1.setBeginXY(3, 3);
        assertArrayEquals(new int[]{3, 3}, line1.getBeginXY());
    }

    @Test
    void getEndXY() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        assertArrayEquals(new int[]{0, 4}, line1.getEndXY());
    }

    @Test
    void setEndXY() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 4);
        MyLine line1 = new MyLine(begin, end);
        line1.setEndXY(3, 0);
        assertArrayEquals(new int[]{3, 0}, line1.getEndXY());
    }

    @Test
    void getLength() {
        MyLine line = new MyLine(0, 0, 3, 4); // Longitud esperada: 5 (3-4-5)
        assertEquals(5.0, line.getLength(), 0.001);
    }

    @Test
    void getGradient() {
        MyLine line = new MyLine(0, 0, 1, 1); // Gradiente esperado: 45 grados (π/4 radianes)
        assertEquals(Math.PI / 4, line.getGradient(), 0.001);
    }

    @Test
    void testToString() {
        MyLine line = new MyLine(0, 0, 3, 4);
        assertEquals("(0, 0) (3, 4)", line.toString());
    }
}