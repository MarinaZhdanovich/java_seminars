package oop_seminar6.DIP;

public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}