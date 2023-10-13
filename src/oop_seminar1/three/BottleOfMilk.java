package oop_seminar1.three;

public class BottleOfMilk extends Product {

    /**
     * Объем бутылки с молоком
     */
    private double volume;

    /**
     * Жирность
     */
    private double fat;

    public double getVolume() {

        return volume;
    }

    public double getFat() {

        return fat;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с молоком]\n%s - %s - %.2f;\nОбъем: %.1f\nЖирность: %.1f",
                brand, name, price, volume, fat);
    }

}
