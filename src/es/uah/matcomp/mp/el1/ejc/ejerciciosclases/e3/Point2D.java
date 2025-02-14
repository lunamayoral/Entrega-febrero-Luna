package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e3;

public class Point2D {
    private float x;
    private float y;

    // Constructors
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Getters y setters
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] result = new float[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
