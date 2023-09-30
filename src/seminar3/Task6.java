package seminar3;

import java.util.ArrayList;
import java.util.Random;

/*
Создать два списка, один int второй string. Заполнить первый случайным числом.
Второй строковыми значениями первого.
 */
public class Task6 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }
        //элементы добавляются в начало list2 с индексом 0, что приводит к обратному порядку элементов.
        list1.forEach(n -> list2.add(0, String.valueOf(n))); // перевернутый массив, добавили индекс 0, String.valueOf(n) преобразует целочисленное значение n в строку.
//        for (int i = 0; i < 10; i++) {
//            list2.add(String.valueOf(list1.get(i)));
//        }
        System.out.println(list1);
        System.out.println(list2);
    }
}