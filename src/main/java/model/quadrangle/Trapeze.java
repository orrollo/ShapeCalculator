package model.quadrangle;

import model.ISquare;

public class Trapeze extends Quadrangle implements ISquare {

    double height;

    public Trapeze(double leftSide, double upperBase, double rightSide, double secondBase) {
        super("Трапеция", leftSide, upperBase, rightSide, secondBase);

        double diff = secondBase - upperBase;
        double x = 2*diff;
        x = (diff*diff + leftSide * leftSide - rightSide * rightSide) / x;
        x = leftSide * leftSide - x*x;
        height = Math.sqrt(x);
    }

    @Override
    protected void describeParameters(StringBuilder builder) {
        super.describeParameters(builder);
        builder.append("\nПлощадь: ").append(getSquare());
    }

    @Override
    protected void describeShape(StringBuilder builder) {
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона (основание 1): ").append(secondSide);
        builder.append("\nТретья сторона: ").append(thirdSide);
        builder.append("\nЧетвертая сторона (основание 2): ").append(fourthSide);
        builder.append("\nВысота: ").append(height);
    }

    @Override
    public double getSquare() {
        return (secondSide + fourthSide)*height/2;
    }
}
