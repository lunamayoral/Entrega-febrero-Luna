package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e4;

public class Customer {
    private int id;
    private String name;
    private int discount;

    // Constructor
    Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}
