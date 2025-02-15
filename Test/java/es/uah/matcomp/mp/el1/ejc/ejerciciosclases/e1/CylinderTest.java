package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder cylinder1 = new Cylinder();
        assertEquals(1.0, cylinder1.getHeight());
        Cylinder cylinder2 = new Cylinder(3.0);
        assertEquals(3.0, cylinder2.getHeight());
        Cylinder cylinder3 = new Cylinder(5.0, 3.0);
        assertEquals(3.0, cylinder3.getHeight());
    }

    @Test
    void setHeight() {
        Cylinder cylinder1 = new Cylinder(8.5);
        cylinder1.setHeight(1.5);
        assertEquals(1.5, cylinder1.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder cylinder1 = new Cylinder(2.0);
        assertEquals(2.0 * cylinder1.getArea(), cylinder1.getVolume());
    }

    @Test
    void testToString() {
        Cylinder cylinder1 = new Cylinder(2.0);
        assertEquals("Cylinder: subclass of es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle[radius=1.0 color=red] " +
                "height: 2.0", cylinder1.toString());
    }
}