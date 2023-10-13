package oop_seminar1.three;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product();
        //product1.name = "Продукт #1";
       // product1.brand = "Производитель #1";
        //product1.price = -10;

        System.out.println(product1.displayInfo());

        Product product2 = new Product();

        System.out.println(product2.displayInfo());

        Product product3 = new Product("Производитель #2", "Продукт #2", 325);


        System.out.println(product3.displayInfo());

        Product bottleOfWater = new BottleOfWater("ООО Источник", "Бутылка с водой #1", 200, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком #1", 220, 1.5, 25);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком #2", 120, 1.0, 15);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 =
                new BottleOfMilk("ООО Источник", "Бутылка с молоком #3", 320, 1.0, 15);
        System.out.println(bottleOfMilk3.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком #2", 0.5);
        if (bottleOfMilk == null){
            System.out.println("Такой бутылки с молоком нет в  автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
    }

}
