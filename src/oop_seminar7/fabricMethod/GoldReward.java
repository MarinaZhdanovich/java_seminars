package oop_seminar7.fabricMethod;

public class GoldReward implements IGameItem{
    @Override
    public void open() {
        System.out.println("Открыли сундук с золотом");
    }
}