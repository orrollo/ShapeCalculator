package model.quadrangle;

import model.Shape;

public class Quadrangle extends Shape {

    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;

    public Quadrangle(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        this("Четырехугольник", firstSide, secondSide, thirdSide, fourthSide);
    }

    protected Quadrangle(String name, double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }

    @Override
    protected double getPerimeter() {
        return firstSide + secondSide + thirdSide + fourthSide;
    }

    @Override
    protected void describeShape(StringBuilder builder) {
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nТретья сторона: ").append(thirdSide);
        builder.append("\nЧетвертая сторона: ").append(fourthSide);
    }

}
