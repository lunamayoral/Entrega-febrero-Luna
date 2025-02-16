package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder cylinder1 = new Cylinder();
        assertEquals(1.0, cylinder1.getHeight());
        Cylinder cylinder2 = new Cylinder(3.0);
        assertEquals(3.0, cylinder2.getHeight());
        Cylinder cylinder3 = new Cylinder(5.0,4.0);
        assertEquals(4.0, cylinder3.getHeight());
    }

    @Test
    void setHeight() {
        Cylinder cylinder2 = new Cylinder(3.0);
        cylinder2.setHeight(5.0);
        assertEquals(5.0, cylinder2.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder cylinder2 = new Cylinder(3.0,4.0);
        assertEquals(9.0 * Math.PI * 4.0, cylinder2.getVolume());
    }

    @Test
    void testToString() {
        Cylinder cylinder2 = new Cylinder(3.0,4.0);
        assertEquals("Cylinder: es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle[radius=3.0 color=red], " +
                "Height: 4.0", cylinder2.toString());
    }
}