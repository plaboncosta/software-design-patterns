package src.factory.factorymethod;

import src.factory.simplefactory.Shape;
import src.factory.simplefactory.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
