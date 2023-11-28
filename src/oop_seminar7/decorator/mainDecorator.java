package oop_seminar7.decorator;

public class mainDecorator {
    public static void main(String[] args) {
        Pizza pizza = new PeperoniDecorator(new CheeseDecorator( new CheeseDecorator(new PizzaDough())));
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());
    }
}