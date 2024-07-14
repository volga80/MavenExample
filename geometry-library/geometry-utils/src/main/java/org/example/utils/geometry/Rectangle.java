package org.example.utils.geometry;

public class Rectangle extends GeometricFigure {

    private double width;

    private double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double square() {
        return length * width;
    }
}
