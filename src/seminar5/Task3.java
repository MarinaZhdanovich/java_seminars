package seminar5;
/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task3 {
    public static boolean checkBrackets(String expression) {
        Map<Character, Character> bracketPairs = new HashMap<>(); //Класс Character содержит дополнительные методы и функциональность для работы с символами,
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');
        bracketPairs.put('<', '>');

        Stack<Character> stack = new Stack<>(); //последний элемент, добавленный в стек, будет первым, который будет извлечен из него.
        for (char item : expression.toCharArray()) { //строка разбивается на отдельные символы, и каждый символ добавляется в массив
            if (bracketPairs.containsKey(item)) { //проверяем, является ли текущий символ открывающей скобкой
                stack.push(item); //добавляет элемент символ в вершину стека
            } else if (bracketPairs.containsValue(item)) { //является ли текущий символ закрывающей скобкой
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != item) { //метод get получение значения из Map по заданному ключу (открывающей скобке).
                    return false;    //stack.pop удаление из вершины стека открывающей скобки и возврат этого элемента, удалили из стека и сравнивнили, вернул true или false
                }
            }
        }

        return stack.isEmpty(); //если стек пуст, все скобки были правильно закрыты
    }

    public static void main(String[] args) {
        String[] expressions = {
                "a+(d*3)",
                "[a+(1*3)",
                "[6+(3*3)]",
                "{a}[+]{(d*3)}",
                "<{a}+{(d*3)}>",
                "{a+]}{(d*3)}"
        };

        for (String expression : expressions) {
            boolean result = checkBrackets(expression);
            System.out.println(expression + " - " + (result ? "истина" : "ложь"));
        }
    }
}
