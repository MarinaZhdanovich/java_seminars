package seminar6;

import javax.xml.crypto.NodeSetData;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
Напишите метод, который заполнит массив из 1000
элементов случайными цифрами от 0 до 24.

Создайте метод, в который передайте заполненный выше
массив и с помощью Set вычислите процент уникальных
значений в данном массиве и верните его в виде числа с
плавающей запятой.

Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел *
100 / общее количество чисел в массиве.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] dataArray = addArray();
        System.out.println(Arrays.toString(dataArray));

        Set<Integer> dataSet = createSet(dataArray);
        System.out.println(dataSet);

        double percentage = calculatePercentage(dataSet, dataArray);
        System.out.println("Процент уникальных чисел: " + percentage + "%");
    }

    public static int[] addArray() {
        Random random = new Random();
        int[] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(24);
        }
        return data;
    }

    public static Set<Integer> createSet(int[] data) {
        Set<Integer> dataSet = new HashSet<>();
        for (int i = 0; i < data.length; i++) {
            dataSet.add(data[i]);
        }
        return dataSet;
    }

    public static double calculatePercentage(Set<Integer> dataSet, int[] data) {
        double percentage = (double) (dataSet.size() * 100) / data.length;  //(double) - это приведение результата к типу double.
        return percentage;
    }
}
