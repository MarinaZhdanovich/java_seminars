package oop_seminar2.task1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Рыжий");
        cat1.setName("Персик");
        //cat1.voice();
        Dog dog2 = new Dog(12);
        dog2.setName("Шарик");
        //dog2.voice();
        //Animal animal = new Animal();

        List<Animal> animals = new ArrayList<>();
        animals.add( cat1);
        animals.add( dog2);

        processVoice(animals);

    }

    static void processVoice(List<Animal> animals){
        for (Animal animal: animals) {

            if (animal instanceof Cat){
                Cat cat = (Cat)animal;
                Animal a1 = cat;
                a1.voice();
                a1.jump();
                System.out.println("Цвет котика: " + cat.getColor());
            }
            if (animal instanceof Dog){
                Dog dog = (Dog)animal;
                System.out.println("Вес собаки: " + dog.getWeight());
            }


            animal.voice();
        }
    }

}
