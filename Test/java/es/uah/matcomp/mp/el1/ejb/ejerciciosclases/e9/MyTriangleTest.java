package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(3, 0);
        MyPoint v3 = new MyPoint(0, 4);
        MyTriangle triangle = new MyTriangle(v1, v2, v3);
        String s = "MyTriangle [v1=(0, 0), v2=(3, 0), v3=(0, 4)]";
        assertEquals(s, triangle.toString());
    }

    @Test
    void getPerimeter() {
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(3, 0);
        MyPoint v3 = new MyPoint(0, 4);
        MyTriangle triangle = new MyTriangle(0,0,3,0,0,4);

        double expectedPerimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.001);
    }

    @Test
    void getType() {
        MyTriangle triangle = new MyTriangle(0,0,3,0,3,4);
        assertEquals("Scalene", triangle.getType());

        MyPoint v4 = new MyPoint(0, 0);
        MyPoint v5 = new MyPoint(2, 0);
        MyPoint v6 = new MyPoint(1, 1);
        MyTriangle triangle2 = new MyTriangle(v4, v5, v6);
        assertEquals("Isosceles", triangle2.getType());

        MyPoint v7 = new MyPoint(0, 0);
        MyPoint v8 = new MyPoint(0, 0);
        MyTriangle triangle3 = new MyTriangle(v7, v8, new MyPoint(0, 0));
        assertEquals("Equilateral", triangle3.getType());
    }
}