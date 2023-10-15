package oop_homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink coffee1 = new Coffee("Американо", 70, 250, 70);
        HotDrink coffee2 = new Coffee("Американо", 100, 300, 70);
        HotDrink coffee3 = new Coffee("Латте", 300, 400, 80);
        HotDrink coffee4 = new Coffee("Латте", 100, 250, 75);
        HotDrink coffee5 = new Coffee("Капучино", 200, 300, 75);

        List<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(coffee1);
        hotDrinks.add(coffee2);
        hotDrinks.add(coffee3);
        hotDrinks.add(coffee4);
        hotDrinks.add(coffee5);

        HotDrinkMachine machine = new HotDrinkMachine(hotDrinks);


        List<HotDrink> hotDrinksByName = machine.getHotDrinksByName("Американо");
        System.out.println("Горячие напитки с именем Американо: ");
        for (HotDrink hotDrink : hotDrinksByName) {
            System.out.println(hotDrink);
        }
        System.out.println();

        List<HotDrink> hotDrinksByVolume = machine.getHotDrinksByVolume(300);
        System.out.println("Горячие напитки с объемом 300 мл: ");
        for (HotDrink hotDrink : hotDrinksByVolume) {
            System.out.println(hotDrink);
        }
        System.out.println();

        List<HotDrink> hotDrinksByCost = machine.getHotDrinksByCost(300);
        System.out.println("Горячие напитки с ценой 300 рублей: ");
        for (HotDrink hotDrink : hotDrinksByCost) {
            System.out.println(hotDrink);
        }
        System.out.println();

        List<HotDrink> hotDrinksByTemperature = machine.getHotDrinksByTemperature(70);
        System.out.println("Горячие напитки с температурой 70 градусов: ");
        for (HotDrink hotDrink : hotDrinksByTemperature) {
            System.out.println(hotDrink);
        }
        System.out.println();

        HotDrink coffee = machine.getProduct("Американо", 100, 70);
        if (coffee != null) {
            System.out.println("Найден горячий напиток по имени, объему и температуре: " + coffee);
        } else {
            System.out.println("Горячий напиток не найден по имени, объему и температуре.");
        }
    }
}


