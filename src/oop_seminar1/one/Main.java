package oop_seminar1.one;

import java.util.ArrayList;
import java.util.List;
/*
Инкапсуляция - сокрытие внутренних деталей реализации объекта от внешнего мира и предоставление управляемого интерфейса
(или API) для взаимодействия с этим объектом. Она позволяет скрыть данные (поля) и методы работы с ними (методы) внутри класса,
обеспечивая доступ к ним только через заданные публичные методы (геттеры и сеттеры) или другие специальные интерфейсы.

Основные аспекты:
Приватные поля: доступны только внутри класса.
Публичные методы доступа: Для взаимодействия с этими данными предоставляются публичные методы, такие как геттеры
(методы для получения данных) и сеттеры (методы для установки данных).
Скрытие деталей реализации: Взаимодействие с объектом только через публичные методы
 */
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Зефир", 10.50);
        String productName = product.getName(); // геттеры
        double productCost = product.getCost();

        System.out.println("Название товара: " + productName);
        System.out.println("Стоимость товара: " + productCost);


        product.setName("Мармелад"); // сеттеры
        product.setCost(5.68);

        productName = product.getName(); // получаем данные после изменения
        productCost = product.getCost();

        System.out.println("Измененное название товара: " + productName);
        System.out.println("Измененная стоимость товара: " + productCost);


        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Зефир", 2.35)); // создаем список продуктов
        productList.add(new Product("Шоколад", 3.20));
        productList.add(new Product("Конфета", 15.74));


        VendingMachine vendingMachine = new VendingMachine(productList); // создаем объект VendingMachine

        List<Product> productsInMachine = vendingMachine.getProductList(); // получаем список продуктов из автомата и выводим их
        System.out.println("Продукты в автомате:");
        for (Product products : productsInMachine) {
            System.out.println(products);
        }


        String productNameToFind = "Зефир"; // ищем продукт по имени и выводим его
        Product foundProduct = vendingMachine.getProductByName(productNameToFind);
        if (foundProduct != null) {
            System.out.println("Найден продукт по имени: " + foundProduct);
        } else {
            System.out.println("Продукт с именем '" + productNameToFind + "' не найден.");
        }

        double productCostToFind = 3.20; // ищем продукт по стоимости и выводим его
        foundProduct = vendingMachine.getProductByCost(productCostToFind);
        if (foundProduct != null) {
            System.out.println("Найден продукт по стоимости: " + foundProduct);
        } else {
            System.out.println("Продукт со стоимостью " + productCostToFind + " не найден.");
        }
    }
}
