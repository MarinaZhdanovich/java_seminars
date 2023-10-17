package oop_seminar2.task2;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        BaseCat cat1 = new Cat();
        cat1.setName("Персик");

        Dog dog1 = new Dog();
        dog1.setName("Шарик");

        List<Runnable> list = new ArrayList<>();
        list.add((Cat)cat1);
        list.add(dog1);

        processRun(list);
    }

    static void processRun(List<Runnable> animals){
        for (Runnable animal: animals) {
            animal.run();
        }
    }


}
