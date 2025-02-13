package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e5;

public class Customer {
    private int id;
    private String name;
    private char gender;

    // Constructor
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + id + ")";
    }
}
