package org.example;

import org.example.utils.GeometryUtils;
import org.example.utils.geometry.Circle;
import org.example.utils.geometry.GeometricFigure;
import org.example.utils.geometry.Rectangle;
import org.example.utils.geometry.Triangle;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        GeometricFigure circle = new Circle(10D);
        Triangle triangle = new Triangle(5D, 4D, 3D);
        Rectangle rectangle = new Rectangle(10D, 13D);
        GeometricFigure restangle2 = new Rectangle(100, 10);
//        Triangle exTriangle = new Triangle(1D, 3D, 10D);

        ThreeDFigure sphere = new Sphere(14);

        System.out.println(((Circle) circle).square() + " Площадь круга");
        System.out.println(triangle.square() + " Плащадь треугольника");
        System.out.println(((Rectangle) rectangle).square() + " Плащадь прямоугольника");
        System.out.println(GeometryUtils.convertCentimetersToMeters(((Circle) circle).square()) + " метров");
        System.out.println(GeometryUtils.convertCentimetersToMillimeters(triangle.square()) + " миллиметров");
        System.out.println(sphere.volume() + " Объём сферы");
    }
}