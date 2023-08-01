package src.structural.decorator;

public class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.75;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " Whipped Cream";
    }
}
