package model;

public abstract class Shape {
    private String name;

    protected Shape(String name){
        this.name = name;
    }

    protected abstract double getPerimeter();

    public String getName() {
        return name;
    }

    protected abstract void describeShape(StringBuilder builder);

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        describeShape(builder);
        describeParameters(builder);
        return builder.toString();
    }

    protected void describeParameters(StringBuilder builder) {
        builder.append("\nПериметр: ").append(getPerimeter());
    }
}