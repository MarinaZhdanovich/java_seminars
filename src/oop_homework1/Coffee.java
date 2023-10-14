package oop_homework1;

public class Coffee extends HotDrink{
    /**
     * Температура кофе
     */
    private double temperature;

    public Coffee(String name, double volume, double cost, double temperature) {
        super(name, volume, cost);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    private void checkTemperature(double temperature){
        if (temperature < 30) {
            this.temperature = 50;
        } else {
            this.temperature = temperature;
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + super.getName() + '\'' +
                ", volume=" + super.getVolume() +
                ", cost=" + super.getCost() +
                ", temperature=" + temperature +
                '}';
    }
}

