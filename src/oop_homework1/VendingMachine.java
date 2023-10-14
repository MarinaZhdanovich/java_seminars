package oop_homework1;

import oop_seminar1.one.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<HotDrink> hotDrinkList;

    public VendingMachine(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public List<HotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public List<HotDrink> getHotDrinksByName(String name) {
        List<HotDrink> result = new ArrayList<>();
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getName().equals(name))
                result.add(hotDrink);
        }
        return result;
    }

    public List<HotDrink> getHotDrinksByVolume(double volume) {
        List<HotDrink> result = new ArrayList<>();
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getVolume() == volume)
                result.add(hotDrink);
        }
        return result;
    }

    public List<HotDrink> getHotDrinksByCost(double cost) {
        List<HotDrink> result = new ArrayList<>();
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getCost() == cost)
                result.add(hotDrink);
        }
        return result;
    }
}

