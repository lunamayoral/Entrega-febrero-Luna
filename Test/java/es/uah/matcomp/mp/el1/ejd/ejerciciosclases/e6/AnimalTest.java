package es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void greets() {
        Animal cat = new Cat("Luna");
        cat.greets();
    }
}