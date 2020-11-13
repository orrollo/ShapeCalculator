package model.triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super("Равносторонний треугольник", side, side, side);
    }

    @Override
    public double getPerimeter() {
        return firstSide * 3;
    }

    @Override
    public double getSquare() {
        return Math.sqrt(3) * Math.pow(firstSide, 2) / 4;
    }

    @Override
    protected void describeShape(StringBuilder builder) {
        builder.append("\nCторона: ").append(firstSide);
    }
}
