package model.quadrangle;

import model.ISquare;

public class Rectangle extends Quadrangle implements ISquare {

    public Rectangle(double side) {
        super("Квадрат", side, side, side, side);
    }

    @Override
    protected void describeShape(StringBuilder builder) {
        builder.append("\nСторона: ").append(firstSide);
    }

    @Override
    protected void describeParameters(StringBuilder builder) {
        super.describeParameters(builder);
        builder.append("\nПлощадь: ").append(getSquare());
    }

    @Override
    public double getSquare() {
        return firstSide*firstSide;
    }
}
