package src.creational.factory.factorymethod;

import src.creational.factory.simplefactory.Shape;

public class FactoryMethod {
    public static void main(String[] args) {
        SquareFactory squareFactory = new SquareFactory();
        Shape shape = squareFactory.createShape();
        shape.draw();
    }
}
