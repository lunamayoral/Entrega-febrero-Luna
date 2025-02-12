package es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1;

/**
 *  A Test Driver for the es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle class
 */

public class TestCircle {
    public static void main(String[] args) {
        // Declare an instance of es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        //The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        //The circle has radius of 2.0 and area of 12.566370614359172

        Circle c3 = new Circle(3.0, "green");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea() + " and colour " + c3.getColor());

        Circle c4 = new Circle();   // construct an instance of es.uah.matcomp.mp.el1.eja.ejerciciosclases.e1.Circle
        c4.setRadius(5.5);          // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("green");       // Change color
        System.out.println("color is: " + c4.getColor());   // Print color via getter

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());   // explicit call

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());  // explicit call
        System.out.println(c6);             // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too
    }
}
