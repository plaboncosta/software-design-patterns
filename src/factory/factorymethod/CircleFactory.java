package src.factory.factorymethod;

import src.factory.simplefactory.Circle;
import src.factory.simplefactory.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
