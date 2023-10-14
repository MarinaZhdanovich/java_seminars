package oop_homework1;

public class Coffee extends HotDrink {
    /**
     * Температура кофе
     */
    private int temperature;

    public Coffee(String name, double volume, double cost, int temperature) {
        super(name, volume, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private void checkTemperature(int temperature) {
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

