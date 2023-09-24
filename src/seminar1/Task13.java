package seminar1;
/*
Дан массив nums = [3,2,2,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int val = 3;
        int[] array = new int[]{3, 2, 2, 3};

        int start = 0; //начало массива
        int end = array.length - 1; // конец массива

        while (start < end) {
            if (array[start] == val) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                end--;
            } else {
                start++; // элемент в начале не равен val
            }
        }
        System.out.println(Arrays.toString(array));
    }
}