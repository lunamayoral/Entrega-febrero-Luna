package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p = new Point3D();
        assertEquals(0.0f, p.getZ());
        Point3D p2 = new Point3D(3.0f, 5.0f, 4.0f);
        assertEquals(4.0f, p2.getZ());
    }

    @Test
    void setZ() {
        Point3D p = new Point3D();
        p.setZ(1.0f);
        assertEquals(1.0f, p.getZ());
    }

    @Test
    void setXYZ() {
        Point3D p = new Point3D(4.0f, 5.0f, 3.0f);
        p.setXYZ(1.0f, 2.0f, 5.0f);
        assertArrayEquals(new float[] {1.0f, 2.0f, 5.0f}, p.getXYZ());
    }

    @Test
    void getXYZ() {
        Point3D p = new Point3D(4.0f, 5.0f, 3.0f);
        assertArrayEquals(new float[] {4.0f, 5.0f, 3.0f}, p.getXYZ());
    }

    @Test
    void testToString() {
        Point3D p = new Point3D(4.0f, 5.0f, 3.0f);
        assertEquals("(4.0,5.0,3.0)", p.toString());
    }
}