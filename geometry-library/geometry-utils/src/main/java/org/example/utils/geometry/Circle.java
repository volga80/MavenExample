package org.example.utils.geometry;

public class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return radius * radius * Math.PI;
    }
}
