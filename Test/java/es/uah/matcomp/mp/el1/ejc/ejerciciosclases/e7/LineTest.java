package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testToString() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        assertEquals("Line: Point: (0,0) Point: (5,5)", l1.toString());

        Line l2 = new Line(1,2,3,4);
        assertEquals("Line: Point: (1,2) Point: (3,4)", l2.toString());
    }

    @Test
    void getBegin() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        assertEquals(begin, l1.getBegin());
    }

    @Test
    void getEnd() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        assertEquals(end, l1.getEnd());
    }

    @Test
    void setBegin() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        Point newBegin = new Point(5, 5);
        l1.setBegin(newBegin);
        assertEquals(newBegin, l1.getBegin());
    }

    @Test
    void setEnd() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        Point newEnd = new Point(3, 5);
        l1.setEnd(newEnd);
        assertEquals(newEnd, l1.getEnd());
    }

    @Test
    void getBeginX() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        assertEquals(begin.getX(), l1.getBeginX());
    }

    @Test
    void getBeginY() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        assertEquals(begin.getY(), l1.getBeginY());
    }

    @Test
    void getEndX() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        assertEquals(end.getX(), l1.getEndX());
    }

    @Test
    void getEndY() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        assertEquals(end.getY(), l1.getEndY());
    }

    @Test
    void setBeginX() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        l1.setBeginX(5);
        assertEquals(begin.getX(), l1.getBeginX());
    }

    @Test
    void setBeginY() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        l1.setBeginY(4);
        assertEquals(begin.getY(), l1.getBeginY());
    }

    @Test
    void setBeginXY() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        l1.setBeginXY(5, 5);
        assertEquals(5, l1.getBeginX());
        assertEquals(5, l1.getBeginY());
    }

    @Test
    void setEndX() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        l1.setEndX(6);
        assertEquals(end.getX(), l1.getEndX());
    }

    @Test
    void setEndY() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        l1.setEndY(6);
        assertEquals(end.getY(), l1.getEndY());

    }

    @Test
    void setEndXY() {
        Point begin = new Point(0, 0);
        Point end = new Point(5, 3);
        Line l1 = new Line(begin, end);
        l1.setEndXY(4,5);
        assertEquals(4, l1.getEndX());
        assertEquals(5, l1.getEndY());
    }

    @Test
    void getLength() {
        Point begin = new Point(8, 9);
        Point end = new Point(5, 5);
        Line l1 = new Line(begin, end);
        assertEquals(5, l1.getLength());
    }

    @Test
    void getGradient() {
        Point begin = new Point(7, 8);
        Point end = new Point(9, 10);
        Line l1 = new Line(begin, end);
        assertEquals(Math.atan2(2, 2), l1.getGradient());
    }
}