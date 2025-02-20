package es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e4;

import es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e3.Movable;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    //Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "(" + x + "," + y + ") speed=(" + xSpeed + "," + ySpeed + ")";
    }

    @Override
    public void moveUp(){
        y -= ySpeed;
    }

    @Override
    public void moveDown(){
        y += ySpeed;
    }

    @Override
    public void moveLeft(){
        x -= xSpeed;
    }

    @Override
    public void moveRight(){
        x += xSpeed;
    }


}
