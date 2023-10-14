package oop_homework1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine{
    private List<HotDrink> hotDrinkList;

    public HotDrinkMachine(List<HotDrink> hotDrinkList) {
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
            if (hotDrink.getName().equals(name)) {
                result.add(hotDrink);
            }
        }
        return result;
    }

    public List<HotDrink> getHotDrinksByVolume(double volume) {
        List<HotDrink> result = new ArrayList<>();
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getVolume() == volume) {
                result.add(hotDrink);
            }
        }
        return result;
    }

    public List<HotDrink> getHotDrinksByCost(double cost) {
        List<HotDrink> result = new ArrayList<>();
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getCost() == cost) {
                result.add(hotDrink);
            }
        }
        return result;
    }

    public List<HotDrink> getHotDrinksByTemperature(int temperature) {
        List<HotDrink> result = new ArrayList<>();
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink instanceof Coffee) {
                Coffee coffee = (Coffee) hotDrink;
                if (coffee.getTemperature() == temperature) {
                    result.add(hotDrink);
                }
            }
        }
        return result;
    }
}