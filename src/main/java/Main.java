import model.Shape;
import model.triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.toString());
    }
}