package FactoryPattern;
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape cir = shapeFactory.getShape("circle");
        cir.draw();

        Shape rect = shapeFactory.getShape("rectangle");
        rect.draw();
    }
}