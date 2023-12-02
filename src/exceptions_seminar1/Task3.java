package exceptions_seminar1;

/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить”
 */

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Integer[] array = {1, null, 3, null, 5, 6, 7};
        findElemMessage(array);
    }



    public static List<Integer> findNull(Integer[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                result.add(i);
            }
        }
        return result;
    }

    public static void findElemMessage(Integer[] array) {
        List<Integer> result = findNull(array);
        if (result.size() == 0) {
            System.out.println("Nullов нет");
            return;
        }
        for (Integer i : result) {
            System.out.println(i + " ");
        }
    }
}
