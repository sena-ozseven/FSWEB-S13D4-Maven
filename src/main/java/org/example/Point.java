package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return this.distance(0,0);
    }

    public double distance(Point p) {
        return this.distance(p.getX(), p.getY());
    }
    public double distance(int a, int b) {
        int farkX = a - this.x;
        int farkY = b - this.y;
        return Math.sqrt((farkX * farkX) + (farkY * farkY));
    }
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}


