package seminar1;
/*
Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */
public class Task14 {
    public static void main(String[] args) {
        Power power = new Power();
        double result1 = power.powerNum(3, 2);
        double result2 = power.powerNum(2, -2);
        double result3 = power.powerNum(3, 0);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        }
    }


class Power{
    public double powerNum (int a, int b) {
        if (b == 0) return 1;
        else if (b > 0) return a * powerNum(a, b - 1);
        else return 1 / powerNum(a, -b); //(-(-2) = 2 (b становится положительным) -> if (b > 0) = 1 /  a * powerNum(a, b - 1)
    }
}
