package es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e2;

public class Rectangle implements GeometricObject{
    private double width;
    private double height;

    //Constructors
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
