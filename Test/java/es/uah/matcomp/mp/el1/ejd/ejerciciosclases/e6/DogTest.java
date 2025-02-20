package es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Animal dog = new Dog("Rufus");
        dog.greets();
    }

    @Test
    void testGreets() {
        Dog dog1 = new Dog("Rufus");
        Dog dog2 = new Dog("Rufuss");
        dog1.greets(dog2);
    }
}