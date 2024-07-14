package org.example.utils.geometry;

public class Triangle extends GeometricFigure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        if (firstSide >= secondSide + thirdSide || secondSide >= firstSide + thirdSide
        || thirdSide >= secondSide + firstSide){
            throw new IllegalArgumentException("недопустимые значения сторон треугольника");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double square() {
        double perimetr = firstSide + secondSide + thirdSide;
        return Math.sqrt(perimetr * (perimetr - firstSide)
                * (perimetr - secondSide) * (perimetr - thirdSide));
    }
}
