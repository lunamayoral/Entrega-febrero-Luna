package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e7;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint pointA = new MyPoint(0,0);
        MyPoint pointB = new MyPoint(3,4);

        MyLine line1 = new MyLine(0,0,3,4);
        MyLine line2 = new MyLine(pointA, pointB);

        System.out.println("Line 1:" + line1);
        System.out.println("Line 2:" + line2);

        System.out.println("Line 1 Begin: " + line1.getBeginX() + ", " + line1.getBeginY());
        System.out.println("Line 1 End: " + line1.getEndX() + ", " + line1.getEndY());

        line1.setBeginXY(1,1);
        System.out.println("After changing begin point of line 1:" + line1);

        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 1: " + line1.getGradient());

        line1.setEndXY(5, 5);
        System.out.println("Updated Line 1: " + line1);
        System.out.println("New End Point of Line 1: " + line1.getEndX() + ", " + line1.getEndY());

    }
}
