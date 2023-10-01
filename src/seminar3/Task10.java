package seminar3;

import java.util.Arrays;

/*
Внутри класса MergeSort напишите метод mergeSort,
который принимает массив целых чисел a и реализует алгоритм
сортировки слиянием. Метод должен возвращать отсортированный массив.
 */
public class Task10 {
    public static int[] mergeSort(int[] array) { //разбивает исходный массив на две половины
        if (array.length <= 1) {   //массивы с одним элементом или пустые отсортированы, условие выхода рекурсии
            return array;
        }

        int mid = array.length / 2; //индекс середины массива
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[array.length - mid];

//System.arraycopy(исходный массив, начальный индекс исходного массива, целевой массив, начальный индекс целевого массива, количество элементов для копирования);
        System.arraycopy(array, 0, leftHalf, 0, mid); //копируем первую половину элементов
        System.arraycopy(array, mid, rightHalf, 0, array.length - mid);

        leftHalf = mergeSort(leftHalf); //вызываем рекурсивно метод mergeSort
        rightHalf = mergeSort(rightHalf);

        return merge(leftHalf, rightHalf); //объединяем в отсортированный массив
    }

    public static int[] merge(int[] left, int[] right) {   //слияние двух отсортированных массивов
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;  //создаем индексы для массивов left, right и result
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {  //пока есть элементы в обоих массивах
            if (left[leftIndex] < right[rightIndex]) { //обращение к элементу
                result[resultIndex++] = left[leftIndex++]; //после присваивания индексы увеличиваются
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {   //после того как один из массивов left или right будут полностью скопирован в result
            result[resultIndex++] = left[leftIndex++]; //оставшиеся элементы из другого массива копируются в result
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int[] sortedArray = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArray));

//        for (int num : sortedArr) {
//            System.out.print(num + " ");
        }
    }
