package es.uah.matcomp.mp.el1.ejc.ejerciciosclases.e7;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point

    // Constructors
    public Line (Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }

    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);   // construct the Points here
        end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        return begin.toString() + " " + end.toString();
    }

    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(Point begin) {
        begin.setX(begin.getX());
    }
    public void setBeginY(Point begin) {
        begin.setY(begin.getY());
    }
    public void setBeginXY(int beginX, int beginY) {
        this.begin = new Point(beginX, beginY);
    }
    public void setEndX(Point end) {
        end.setX(end.getX());
    }
    public void setEndY(Point end) {
        end.setY(end.getY());
    }
    public void setEndXY(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public int getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int)Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }    // Length of the line

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }   // Gradient in radians
}
