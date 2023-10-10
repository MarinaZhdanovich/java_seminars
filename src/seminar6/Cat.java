package seminar6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Продумайте структуру класса Кот. Какие поля и методы
будут актуальны для приложения, которое является:
a. информационной системой ветеринарной клиники
б. архивом выставки котов
в. информационной системой театра кошек
 */
public class Cat {
    String name;
    double weight;
    double age;
    String breed;
    String role;
    String character;
    int box;
    String food;
    public Cat(String name, double age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String toString(){
        return "name = " + name + " age = " + age + " weight = " + weight;
    }

    public boolean equals(Object cat){
        Cat newcat = (Cat) cat;
        return this.name.equals(newcat.name) && this.age == newcat.age && this.weight == newcat.weight;
    }

    public int hashCode(){
        return (int) (this.name.hashCode() + this.age + this.weight);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 3, 5.2);
        Cat cat2 = new Cat("Барсик", 3, 5.2);
        Cat cat3 = new Cat("Барс", 1, 3.2);
        Cat cat4 = new Cat("Арсик", 4, 5.7);

        Set<Cat> data = new HashSet<>(List.of(cat, cat2, cat3, cat4));
        System.out.println(data);
    }
}
