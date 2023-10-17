package oop_seminar2.task1;

public class Dog extends Animal{

    private double weight;

    public double getWeight() {
        return weight;
    }

    public Dog(double weight) {
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Собака подает голос");
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает");
    }
}
