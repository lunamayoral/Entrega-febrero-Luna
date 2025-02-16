package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e8;

import es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e1.Circle;

public class Cylinder {
    private Circle base;
    private double height;

    // Constructors

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public String toString() {
        return "Cylinder: " + base.toString() + ", Height: " + height;
    }

}
