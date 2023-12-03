package exceptions_seminar1;
/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

Метод divisionByZero - Деление на 0

Метод numberFormatException - Ошибка преобразования строки в число

Важно: они не должны принимать никаких аргументов
 */

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[5];
        int value = array[14];
//        System.out.println(array[11]); или

    }

    public static void divisionByZero() {
        int a = 4;
        int b = 0;
        int result = a / b;

    }

    public static void numberFormatException() {
        String text = "Marina";
        int number = Integer.parseInt(text);

    }
}

public class Task4 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
