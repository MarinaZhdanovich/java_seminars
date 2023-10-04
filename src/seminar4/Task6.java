package seminar4;
/*
В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.

Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.


calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)

// 10
// 11
// 10

calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)

// 6
// 3
// 6
 */
import java.util.ArrayDeque; //не имеет фиксированного размера и может расти или уменьшаться по мере необходимости.


class Calculator {
    private ArrayDeque<Integer> deque; //двусторонняя очередь, которая позволяет добавлять и удалять элементы как с начала, так и с конца.
    private int currentResult; //в очереди первый элемент, который добавлен, является первым элементом, который удаляется

    public Calculator() {
        deque = new ArrayDeque<>();
        currentResult = 0;
    }

    public int calculate(char op, int a, int b) {
        int result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Деление на ноль");
            }
        } else if (op == '<') {  //отмена последней операции
            if (!deque.isEmpty()) {
                currentResult = deque.pop(); //если очередь не пуста, то удаляется верхний элемент из очереди, сохраняется результат предыдущей операции.
            } else {
                System.out.println("Очередь пустая");
            }
            return currentResult; // возвращаем предпоследний результат
        } else {
            System.out.println("Неверный символ");
        }
        deque.push(currentResult);  //текущий результат currentResult добавляется в вершину очереди.
        currentResult = result; //переменная currentResult обновляется новым результатом result
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task6 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}