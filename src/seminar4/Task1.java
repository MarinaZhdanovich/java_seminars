package seminar4;
/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        long startTime = System.currentTimeMillis(); //получение текущего времени в миллисекундах
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);

        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time arrayList: " + (endTime - startTime));
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(i);

        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time linkedList: " + (endTime1 - startTime1));

        int count = 0;  // количество элементов, добавленных в связанный список. Linked List список, где каждый элемент связан с предыдущим и следующим элементами.
        long starttime3 = System.currentTimeMillis();
        while (count != 1000) { // добавление 1000 элементов
            linkedList.add(4000, random.nextInt()); //добавляем случайное целое число в позицию с индексом 4000, элементы добавляем в середину списка
            count++; //cвязанный список эффективно вставляет элементы в середину, так как просто изменяет связи между узлами списка, не требует перемещения множества данных.
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Time linkedList + 1000 elements:" + (end3 - starttime3));

        int count1 = 0; //динамический массив, список, который хранит элементы в виде массива.
        long starttime4 = System.currentTimeMillis();
        while (count1 != 1000) {
            arrayList.add(4000, random.nextInt());
            count1++; //вставка элементов в середину массива, все элементы после этой позиции должны быть сдвинуты, чтобы освободить место для нового элемента
        }
        long end4 = System.currentTimeMillis();
        System.out.println("Time arrayList + 1000 elements:" + (end4 - starttime4));

    }
}

