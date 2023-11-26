package oop_seminar6.DIP;

public class PetrolEngine implements Engine {
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }
}