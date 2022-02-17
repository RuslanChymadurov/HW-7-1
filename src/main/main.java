package main;

public class main {


    public static void main(String[] args) {

        Shape shapeTriangle = new Triangle();
        Shape shapeCircle = new Circle();
        Shape shapePoint = new Point();
        Shape shapeText = new Text();
        Shape shapeRectangle = new Rectangle();

        ShapePrinter.print(shapeTriangle);
        ShapePrinter.print(shapeCircle);
        ShapePrinter.print(shapePoint);
        ShapePrinter.print(shapeText);
        ShapePrinter.print(shapeRectangle);




    }
}