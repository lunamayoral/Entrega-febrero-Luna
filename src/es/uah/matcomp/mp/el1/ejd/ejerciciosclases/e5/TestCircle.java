package es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e5;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println(circle.toString());

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

    }
}
