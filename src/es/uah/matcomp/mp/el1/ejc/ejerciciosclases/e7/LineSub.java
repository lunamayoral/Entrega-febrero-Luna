package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e7;

public class LineSub extends Point {
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end;               // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
    public LineSub (Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    @Override
    public String toString() {
        return "Line subclass of: " + super.toString() + " to " + end.toString();
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }
    public int getBeginY() {
        return super.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }
    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setX(beginX);
        super.setY(beginY);
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        setEndX(endX);
        setEndY(endY);
    }

    public double getLength() {
        int deltaX = getEndX() - getBeginX();
        int deltaY = getEndY() - getBeginY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }  // Length of the line

    public double getGradient() {
        int deltaX = getEndX() - getBeginX();
        int deltaY = getEndY() - getBeginY();
        return Math.atan2(deltaY, deltaX);
    }  // Gradient in radians
}


