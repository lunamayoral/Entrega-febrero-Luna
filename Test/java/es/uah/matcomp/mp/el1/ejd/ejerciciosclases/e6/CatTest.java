package es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Animal cat = new Cat("Ines");
        cat.greets();
    }
}