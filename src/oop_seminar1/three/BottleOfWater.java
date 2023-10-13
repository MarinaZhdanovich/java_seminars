package oop_seminar1.three;

public class BottleOfWater extends Product {

    /**
     * Объем бутылки с водой
     */
    private double volume;

    public double getVolume() {

        return volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой]\n%s - %s - %.2f;\nОбъем: %.1f",
                brand, name, price, volume);
    }
}
