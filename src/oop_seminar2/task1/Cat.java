package oop_seminar2.task1;

public class Cat extends Animal{

    private String color;

    public String getColor() {
        return color;
    }

    public Cat(String color) {
        this.color = color;
    }


    @Override
    public void voice() {
        System.out.println("Котик мяукает");
    }

    @Override
    public void jump() {
        System.out.println("Котик прыгает");
    }
}
