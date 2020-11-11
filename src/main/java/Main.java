import model.Shape;
import model.triangle.EquilateralTriangle;
import model.triangle.IsoscelesTriangle;
import model.triangle.RectangularTriangle;
import model.triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = new  Triangle[4];
        triangles[0] = new Triangle(4,5,6);
        triangles[1] = new IsoscelesTriangle(5,4);
        triangles[2] = new EquilateralTriangle(3);
        triangles[3] = new RectangularTriangle(3, 4);
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
    }
}