package org.example;

public class Sphere extends ThreeDFigure{

    private double radius;

    public Sphere (double radius) {
        this.radius = radius;
    }

    @Override
    double volume() {
        return 4/3 * Math.PI * radius * radius * radius ;
    }


}
