package homework6;
/*
Подумать над структурой класса Ноутбук (Laptop) для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков Set<Laptop>. (добиться чтобы во множестве не было одинаковых ноутбуков)
(*) Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ

2 - Объем ЖД

3 - Операционная система

4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести подходящие по условиям.
 */


import java.util.*;

class Laptop { //поля класса
    private String brand;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Laptop(String brand, int ram, int storage, String os, String color) { //конструктор класса
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", ram=" + ram + ", storage=" + storage + ", os=" + os + ", color=" + color;
    }


    @Override
    public boolean equals(Object obj) {
        Laptop newlaptop = (Laptop) obj;
        return this.brand.equals(newlaptop.brand) && this.ram == newlaptop.ram && this.storage == newlaptop.storage &&
                this.os.equals(newlaptop.os) && this.color.equals(newlaptop.color);

    }

    @Override
    public int hashCode() {
        return this.brand.hashCode() + this.ram + this.storage + this.os.hashCode() + this.color.hashCode();
    }

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("HP", 8, 256, "Windows", "Black"));
        laptops.add(new Laptop("HP", 8, 256, "Windows", "Black"));
        laptops.add(new Laptop("Gigabyte", 16, 256, "Linux", "White"));
        laptops.add(new Laptop("Apple", 16, 512, "macOS", "Silver"));
        System.out.println(laptops);
        filter(laptops);
    }

    public static void filter(Set<Laptop> laptops) {
        Map<Integer, Object> criteria = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 4) {
            System.out.println("Введен неверный номер критерия.");
            return;
        }

        if (choice == 1) {
            System.out.println("Введите минимальный объем ОЗУ:");
            int minRam = scanner.nextInt();
            criteria.put(1, minRam);
        } else if (choice == 2) {
            System.out.println("Введите минимальный объем ЖД:");
            int minStorage = scanner.nextInt();
            criteria.put(2, minStorage);
        } else if (choice == 3) {
            System.out.println("Введите операционную систему:");
            String os = scanner.next().toLowerCase();
            criteria.put(3, os);
        } else if (choice == 4) {
            System.out.println("Введите цвет:");
            String color = scanner.next().toLowerCase();
            criteria.put(4, color);
        }


        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean match = true;

            for (Map.Entry<Integer, Object> entry : criteria.entrySet()) {
                int criteriaKey = entry.getKey();
                Object criteriaValue = entry.getValue();

                if (criteriaKey == 1 && laptop.ram != (int) criteriaValue) {
                    match = false;
                } else if (criteriaKey == 2 && laptop.storage != (int) criteriaValue) {
                    match = false;
                } else if (criteriaKey == 3 && !laptop.os.equalsIgnoreCase((String) criteriaValue)) {
                    match = false;
                } else if (criteriaKey == 4 && !laptop.color.equalsIgnoreCase((String) criteriaValue)) {
                    match = false;
                }
            }

            if (match) {
                filteredLaptops.add(laptop);
            }
        }

        System.out.println("Отфильтрованные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}