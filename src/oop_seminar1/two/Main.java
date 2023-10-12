package oop_seminar1.two;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Создаем список бутылок с водой
        List<BottleOfWater> bottleOfWaterList = new ArrayList<>();
        bottleOfWaterList.add(new BottleOfWater("Минералка", 1.0, 0.5));
        bottleOfWaterList.add(new BottleOfWater("Святой источник", 1.5, 0.75));
        bottleOfWaterList.add(new BottleOfWater("Джуси", 2.0, 1.0));

        // Создаем объект BottleOfWaterVendingMachine
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(bottleOfWaterList);

        // Получаем список бутылок с водой из автомата и выводим их
        List<BottleOfWater> bottlesInMachine = vendingMachine.getBottleOfWaterList();
        System.out.println("Бутылки с водой в автомате:");
        for (BottleOfWater bottle : bottlesInMachine) {
            System.out.println(bottle);
        }

        // Ищем бутылку по имени и выводим её
        String bottleNameToFind = "Минералка";
        Product foundProduct = vendingMachine.getProductByName(bottleNameToFind);
        if (foundProduct != null) {
            System.out.println("Найдена бутылка по имени: " + foundProduct);
        } else {
            System.out.println("Бутылка с именем '" + bottleNameToFind + "' не найдена.");
        }

        // Ищем бутылку по стоимости и выводим её
        double bottleCostToFind = 1.5;
        foundProduct = vendingMachine.getProductByCost(bottleCostToFind);
        if (foundProduct != null) {
            System.out.println("Найдена бутылка по стоимости: " + foundProduct);
        } else {
            System.out.println("Бутылка с стоимостью " + bottleCostToFind + " не найдена.");
        }
    }
}
