package models;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Cloneable{
    double side1, side2, side3;
    private double square;
    private Triangle(Triangle triangle) {
        this.side1 = triangle.side1;
        this.side2 = triangle.side2;
        this.side3 = triangle.side3;
        this.square = triangle.getSquare();
    }
    public Triangle(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public Triangle() {}

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", square=" + square +
                '}';
    }

    @Override
    public Triangle clone() {
        return new Triangle(this);
    }

    @FigureAnnotation(name = "square3",
    desc = "Считает площадь треугольника")
    public void square() {
        double p = (side1 + side2 + side3)/2;
        this.square = Math.sqrt(p*(p-side1) * (p-side2) * (p-side3));
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSquare() {
        return square;
    }


}
