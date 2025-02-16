package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void testToString() {
        LineSub line1 = new LineSub(1,2,3,4);
        assertEquals("Line subclass of: Point: (1,2) to Point: (3,4)", line1.toString());
        Point begin = new Point(1,2);
        Point end = new Point(3,4);
        LineSub line2 = new LineSub(begin,end);
        assertEquals("Line subclass of: Point: (1,2) to Point: (3,4)", line2.toString());
    }

    @Test
    void getBegin() {
        Point begin = new Point(1, 2);
        Point end = new Point(4, 6);
        LineSub line = new LineSub(begin, end);
        Point result = line.getBegin();
        assertEquals(begin.getX(), result.getX());
        assertEquals(begin.getY(), result.getY());
    }

    @Test
    void getEnd() {
        Point begin = new Point(1, 2);
        Point end = new Point(4, 6);
        LineSub line = new LineSub(begin, end);
        Point result = line.getEnd();
        assertEquals(end.getX(), result.getX());
        assertEquals(end.getY(), result.getY());
    }

    @Test
    void setBegin() {
        Point begin = new Point(1, 2);
        Point end = new Point(4, 6);
        LineSub line = new LineSub(begin, end);
        Point begin2 = new Point(2,5);
        line.setBegin(begin2);
        assertEquals(begin2.getX(), line.getBegin().getX());
        assertEquals(begin2.getY(), line.getBegin().getY());
    }

    @Test
    void setEnd() {
        Point begin = new Point(1, 2);
        Point end = new Point(4, 6);
        LineSub line = new LineSub(begin, end);
        Point end2 = new Point(2,5);
        line.setEnd(end2);
        assertEquals(end2.getX(), line.getEnd().getX());
        assertEquals(end2.getY(), line.getEnd().getY());
    }

    @Test
    void getBeginX() {
        LineSub line1 = new LineSub(1,2,3,4);
        assertEquals(1,line1.getBeginX());
    }

    @Test
    void getBeginY() {
        LineSub line1 = new LineSub(1,2,3,4);
        assertEquals(2,line1.getBeginY());
    }

    @Test
    void getEndX() {
        LineSub line1 = new LineSub(1,2,3,4);
        assertEquals(3,line1.getEndX());
    }

    @Test
    void getEndY() {
        LineSub line1 = new LineSub(1,2,3,4);
        assertEquals(4,line1.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub line1 = new LineSub(1,2,3,4);
        line1.setBeginX(5);
        assertEquals(5,line1.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub line1 = new LineSub(1,2,3,4);
        line1.setBeginY(5);
        assertEquals(5,line1.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub line1 = new LineSub(1,2,3,4);
        line1.setBeginXY(5,5);
        assertEquals(5, line1.getBeginX());
        assertEquals(5, line1.getBeginY());
    }

    @Test
    void setEndX() {
        LineSub line1 = new LineSub(1,2,3,4);
        line1.setEndX(5);
        assertEquals(5,line1.getEndX());
    }

    @Test
    void setEndY() {
        LineSub line1 = new LineSub(1,2,3,4);
        line1.setEndY(5);
        assertEquals(5,line1.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub line1 = new LineSub(1,2,3,4);
        line1.setEndXY(5,5);
        assertEquals(5,line1.getEndX());
        assertEquals(5,line1.getEndY());
    }

    @Test
    void getLength() {
        LineSub line1 = new LineSub(1,0,4,4);
        assertEquals(5,line1.getLength());
    }

    @Test
    void getGradient() {
        LineSub line1 = new LineSub(1,0,4,4);
        assertEquals(Math.atan2(4,3),line1.getGradient());
    }
}