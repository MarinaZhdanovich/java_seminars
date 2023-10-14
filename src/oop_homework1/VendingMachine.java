package oop_homework1;

import oop_seminar1.one.Product;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

    public List<HotDrink> getHotDrinksByName(String name);

    public List<HotDrink> getHotDrinksByVolume(double volume);

    public List<HotDrink> getHotDrinksByCost(double cost);

}
