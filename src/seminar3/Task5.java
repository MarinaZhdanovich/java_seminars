package seminar3;

import java.util.ArrayList;
import java.util.Random;

/*
Создать два целочисленных списка. Первый заполнить случайным числом, второй
заполнить четными элементами первого
 */
public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(10));
        }
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        list2.removeIf(n -> n % 2 == 1);
        System.out.println(list2);
        }
    }

