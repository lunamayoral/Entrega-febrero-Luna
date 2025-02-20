package es.uah.matcomp.mp.el1.ejd.ejerciciosclases.e5;

public class ResizableCircle extends Circle implements Resizable {
    //Constructor
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" +super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }

}
