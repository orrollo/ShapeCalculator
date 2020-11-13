import model.Shape;
import model.quadrangle.Quadrangle;
import model.quadrangle.Rectangle;
import model.quadrangle.Trapeze;
import model.triangle.EquilateralTriangle;
import model.triangle.IsoscelesTriangle;
import model.triangle.RectangularTriangle;
import model.triangle.Triangle;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new Triangle(3,4,5),
                new IsoscelesTriangle(5,4),
                new EquilateralTriangle(3),
                new RectangularTriangle(3, 4), new Quadrangle(5,2,5,8),
                new Trapeze(5,2,5,8),
                new Rectangle(5)
        };

        //(new RectangularTriangle(3, 4)).equals(new Triangle(3,4,5));

//        Triangle[] shapes = new  Triangle[4];
//        shapes[0] = new Triangle(4,5,6);
//        shapes[1] = new IsoscelesTriangle(5,4);
//        shapes[2] = new EquilateralTriangle(3);
//        shapes[3] = new RectangularTriangle(3, 4);
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }
    }
}