package src.structural.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        Coffee milkEspresso = new Milk(espresso);
        Coffee whippedCreamEspresso = new WhippedCream(espresso);

        System.out.println(milkEspresso.getDescription() + " : $" + milkEspresso.getCost());
        System.out.println(whippedCreamEspresso.getDescription() + " : $" + whippedCreamEspresso.getCost());
    }
}
