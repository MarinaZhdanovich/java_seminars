package oop_seminar7.fabricMethod;

public class GoldGen implements ItemGen{

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}