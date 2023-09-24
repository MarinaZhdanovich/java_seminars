package seminar1;
/*
Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /)
над двумя числами и возвращать результат. В классе должен быть метод calculate, который принимает оператор
и значения аргументов и возвращает результат вычислений.

При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
 */

import java.nio.channels.ScatteringByteChannel;

class Calculator {
    public int calculate(char op, int a, int b) {
        try {
            if (op == '+') return a + b;
            else if (op == '-') return a - b;
            else if (op == '*') return a * b;
            else if (op == '/') {
                if (b != 0) return a / b;
                else throw new ArithmeticException("Деление на ноль");
            } else {
                throw new IllegalArgumentException("Некорректный оператор: '" + op + "'");
            }
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}

public class Task12 {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '/';
            b = 0;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}