package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e3;

public class Point3D extends Point2D {
    private float z;

    // Constructor
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        super();
        this.z = 0.0f;
    }

    // Setters y getters
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = getZ();
        return result;
    }  // Sobrecargado

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }

}
