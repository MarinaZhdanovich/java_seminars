package oop_homework1;

public class HotDrink {
    private String name;
    private double volume;
    private double cost;

    public HotDrink(String name, double volume, double cost) {
        this.name = name;
        this.volume = volume;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        checkVolume(volume);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        checkCost(cost);
    }

    private void checkName(String name){
        if (name == null || name.length() < 2){
            this.name = "<name>";
        } else {
            this.name = name;
        }
    }

    private void checkVolume (double volume){
        if (volume < 50){
            this.volume = 50;
        } else {
            this.volume = volume;
        }
    }

    private void checkCost(double cost){
        if (cost < 200) {
            this.cost = 200;
        } else {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", cost=" + cost +
                '}';
    }
}




