package oop_seminar7.decorator;

public class CheeseDecorator extends PizzaDecorator{


    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", сыр";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}