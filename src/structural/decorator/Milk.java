package src.structural.decorator;

// Concrete Decorator Milk
public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " Milk";
    }
}
