package oop_seminar1.two;
/*
Наследование позволяет создавать новый класс (BottleOfWater), используя и расширяя функциональность существующего класса (Product).
Класс BottleOfWater наследует поля и методы Product, а также добавляет свои собственные поля и методы, что делает его конкретным видом продукта.
 */
public class BottleOfWater extends Product{
    private double volume;
    public BottleOfWater(String name, double cost) {
        super(name, cost); //конструктор суперкласса Product, инициализация поля name и cost
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name=" + super.getName() +
                "volume=" + volume +
                "cost=" + super.getCost() +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
