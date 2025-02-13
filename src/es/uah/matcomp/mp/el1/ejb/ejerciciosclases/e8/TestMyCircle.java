package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e8;

import es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e7.MyPoint;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle myCircle1 = new MyCircle(new MyPoint(1,1),5);
        MyCircle myCircle2 = new MyCircle(4,1,3);

        // Mostrar información de los círculos
        System.out.println(myCircle1);
        System.out.println("Área: " + myCircle1.getArea());
        System.out.println("Circunferencia: " + myCircle1.getCircumference());

        System.out.println(myCircle2);
        System.out.println("Área: " + myCircle2.getArea());
        System.out.println("Circunferencia: " + myCircle2.getCircumference());

        // Calcular distancia entre círculos
        System.out.println("Distancia entre círculos: " + myCircle1.distance(myCircle2));

    }
}
