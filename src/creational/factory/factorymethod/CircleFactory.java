package src.creational.factory.factorymethod;

import src.creational.factory.simplefactory.Circle;
import src.creational.factory.simplefactory.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
