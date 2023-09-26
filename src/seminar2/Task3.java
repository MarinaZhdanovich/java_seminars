package seminar2;
/*
Напишите метод, который принимает на вход строку (String) и определяет является
ли строка палиндромом (возвращает boolean значение).

 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abb"));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str); //инициализируется строкой str, начальное значение
        String result = stringBuilder.reverse().toString(); // обратный порядок, тип StringBuilder преобразуем в String
        return str.equals(result); // исходную str сравниваем с result
    }
}
