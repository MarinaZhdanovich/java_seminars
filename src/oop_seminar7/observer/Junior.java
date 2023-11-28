package oop_seminar7.observer;

import java.util.Random;

public class Junior implements Observer {
    String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()){
            System.out.println(String.format("Junior %s: I accept the offer! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else{
            System.out.println(String.format("Junior %s: Ok. I don't accept the offer! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
