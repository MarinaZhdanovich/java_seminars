package exceptions_seminar2;
/*
Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
Если преобразование не удалось, программа выдаёт сообщение об ошибке и возвращает специальное значение Float.NaN,
чтобы обозначить ошибку.

На входе:
'3.14'
'Ivan'

На выходе:
3.14
 */
class IsFloat {
    public static float isFloat(String input) {
        try {
            float floatValue = Float.parseFloat(input);
            return floatValue;
        } catch (NumberFormatException e) { //ошибка при попытке преобразовать строку в числовой формат(при использовании parseInt() или parseFloat())
            // Если возникла ошибка при преобразовании, вывести сообщение об ошибке и вернуть Float.NaN
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN; //особое значение типа данных float, которое обозначает "не число" (Not-a-Number).
        } //используется для обозначения ошибочной или неопределенной операции с плавающей точкой.

        //Когда в операции возникают математически недопустимые значения
        //(например, деление на ноль или попытка выполнить математическую операцию,
        //которая не имеет определенного значения, такую как корень отрицательного числа)
    }
}
//    public static float isFloat(String input) {
//        try {
//            // Попробуйте преобразовать введенный текст в float
//            return Float.parseFloat(input);
//        } catch (NumberFormatException e) {
//            // Если не удалось преобразовать введенный текст в float, выведите сообщение об ошибке
//            System.out.println("Your input is not a float number. Please, try again.");
//            // Затем верните специальное значение, например, Float.NaN, чтобы обозначить ошибку
//            return Float.NaN;
//        }
//    }
//}

public class Task1 {
    public static void main(String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
        }
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}