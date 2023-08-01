package src.factory.factorymethod;

import src.factory.simplefactory.Shape;

public class FactoryMethod {
    public static void main(String[] args) {
        SquareFactory squareFactory = new SquareFactory();
        Shape shape = squareFactory.createShape();
        shape.draw();
    }
}
