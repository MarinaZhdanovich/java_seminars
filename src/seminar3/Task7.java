package seminar3;

import java.util.*;

/*
Создать целочисленный список, найти средний по значению элемент.
 */
public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }
        System.out.println("Исходный список: " + list1);

        double sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i); // get получает элемента из списков
        }
        double average = sum / list1.size();

        System.out.println("Среднее значение: " + average);

        // Сортируем список по близости к среднему значению, лямбда-выражение o1 и o2 два элемента списка, которые нужно сравнить.
        Collections.sort(list1, (o1, o2) -> Double.compare(Math.abs(o1 - average), Math.abs(o2 - average))); //сравнение двух значений типа double
        System.out.println("Отсортированный список: " + list1);

        int firstIndex = list1.get(0); // Получаем первый элемент после сортировки

        System.out.println("Первый элемент после сортировки: " + firstIndex);
    }
}
