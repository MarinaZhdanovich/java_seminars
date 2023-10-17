package oop_seminar2.task2;

public class Cat extends BaseCat implements Runnable {
    @Override
    public void run() {
        System.out.println("Котик бежит");
    }
}
