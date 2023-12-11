package exceptions_seminar3;
/*
Напишите метод,на вход которогоподаётся двумерный строковый массив
размером 4х4. При подаче массива другого размера необходимо бросить
исключение MyArraySizeException.
2. Далееметод долженпройтисьпо всем элементам массива,преобразоватьв
int и просуммировать. Если в каком-то элементе массива преобразование
не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в
какой именно ячейкележат неверныеданные.
3. В методе main() вызвать полученный метод, обработать возможные
исключения MyArraySizeException и MyArrayDataException и вывести
результатрасчета (сумму элементов,при условиичто подали на вход
корректныймассив).
 */
public class Task4 {
    public static int checkArray(String[][] array) {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "4", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = checkArray(correctArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Массив должен быть 4х4");
    }
}

class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        super("Преобразование не удалось, индексы -> " + i + ":" + j);
    }
}