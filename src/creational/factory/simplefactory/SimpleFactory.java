package src.creational.factory.simplefactory;

public class SimpleFactory {

    public static void main(String[] args) {
        Shape shape = new ShapeFactory().createShape("circle");
        shape.draw();
    }
}
