package src.creational.factory.factorymethod;

import src.creational.factory.simplefactory.Shape;
import src.creational.factory.simplefactory.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
