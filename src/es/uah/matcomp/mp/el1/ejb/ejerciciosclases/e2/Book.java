package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e2;

import es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e1.Author;

import java.util.Arrays;

public class Book {
    private String name;
    private es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e1.Author[] authors;
    private double price;
    private int qty;

    //Constructores
    public Book(String name, es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e1.Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }
    public Book(String name, es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e1.Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + ", authors={" + Arrays.toString(authors) + "}, " +
                "price=" + price + ", qty=" + qty + "]";
    }

    public String getAuthorNames() {
        return authors[0].getName();
    }
}


