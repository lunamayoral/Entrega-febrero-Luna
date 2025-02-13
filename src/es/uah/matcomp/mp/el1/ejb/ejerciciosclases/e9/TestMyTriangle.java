package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0,0,3,0,3,3);
        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(1, 4);
        MyPoint p3 = new MyPoint(4, 1);
        MyTriangle triangle2 = new MyTriangle(p1, p2, p3);
        System.out.println(triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());

        MyTriangle triangle3 = new MyTriangle(5,6,7,5,4,6);
        System.out.println("Type: " + triangle3.getType());

        MyTriangle triangle4 = new MyTriangle(0,0,4,0,2,3);
        System.out.println("Type: " + triangle4.getType());
    }
}
